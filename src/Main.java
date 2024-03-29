public class Main {
    public static void main(String[] args) {

         /* Домашнее задание - 1. Задание 1.
         Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
         С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
         Результат программы должен быть выведен в консоль в формате "Месяц …, сумма накоплений равна … рублей" с тем количеством месяцев, необходимым для накопления данной суммы.
         */
        System.out.println("Домашнее задание - 1. Задание 1.");
        int money = 0, month = 0;
        while (money < 2459000) {
            money = (int) (money * 1.01);
            money = money + 15000;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        // Вывод в консоль согласно заданию. Но, в "Критериях проверки" просят, что бы выводился каждый месяц. НОНСЕНС!

        /* Домашнее задание - 1. Задание 2.
        Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10

        10 9 8 7 6 5 4 3 2 1
         */
        System.out.println("\nДомашнее задание - 1. Задание 2.");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println("\n");
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }

        /* Домашнее задание - 1. Задание 3.
        В стране Y население равно 12 миллионам человек.
        За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
         */
        System.out.println("\n\nДомашнее задание - 1. Задание 3.");
        int Y = 12_000_000, year = 0;
        while (year < 10) {
            Y = Y + ((Y / 1000) * 9);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + Y);
        }

        /* Домашнее задание - 2. Задание 1.
        Напишите программу, которая выводит в консоль сумму накоплений.
        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        Задание 1.
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
         */
        System.out.println("\nДомашнее задание - 2. Задание 1.");
        money = 15000;
        month = 1;
        while (money < 13000000) {
            System.out.println("Месяц: " + month + ". Накопления: " + money);
            money = (int) (money * 1.07);
            month++;
        }

        /* Домашнее задание - 2. Задание 2.
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
         */
        System.out.println("\nДомашнее задание - 2. Задание 2.");
        money = 15000;
        for (month = 1; money <= 14000000; month++) {
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ". Накопления: " + money);
            }
            money = (int) (money * 1.07);
        }

        /*Домашнее задание - 2. Задание 3.
        Василий решил копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
         */
        System.out.println("\nДомашнее задание - 2. Задание 3.");
        money = 15000;
        for (month = 1; month <= 108; month++) {
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ". Накопления: " + money);
            }
            money = (int) (money * 1.07);
        }

        /* Домашнее задание - 2. Задание 4.
        В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        */
        System.out.println("\nДомашнее задание - 2. Задание 4.");
        int itFriday = 4;
        while (itFriday <= 31) {
            System.out.println("Сегодня пятница, " + itFriday + "-е число. Необходимо подготовить отчет.");
            itFriday += 7;
        }

        /* Домашнее задание - 3. Задание 1.
        Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет, и когда мы увидим ее в следующий раз.
        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
        */
        System.out.println("\nДомашнее задание - 3. Задание 1.");
        int currentYear = 2022;
        for (int x = 0; x < 2500; x += 79) {
            if (x > (currentYear - 200) && x < (currentYear + 100)) {
                System.out.println(x);
            }
        }

        /*Домашнее задание - 3. Задание 2.
         *Напишите программу, которая выводит в консоль таблицу умножения на 2.*/
        System.out.println("\nДомашнее задание - 3. Задание 2.");
        int variable = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(variable + " * " + i + " = " + variable * i);

        }
    }
}