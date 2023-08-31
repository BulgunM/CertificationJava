public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        boolean flag = true;
        while (flag) {
            String inputData = InOut.Input("Введите:\n" +
                    "add - Добавление игрушки в магазин\n" +
                    "get - Розыгрыш игрушек\n" +
                    "shop - Показать ассортимент\n" +
                    "exit - Выход\n" + ": ");
            System.out.println();
            inputData.toLowerCase();
            switch (inputData) {
                case "add":
                    s.AddToy(new Toy(InOut.Input("Введите название игрушки и вероятность: ")));
                    break;
                case "get":
                    s.GetResult(Integer.parseInt(InOut.Input("Введите количество попыток: ")));
                    System.out.println(s.resultToString());
                    InOut.Save("result.txt", s.resultToString());
                    break;
                case "shop":
                    s.ShowToys();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
            System.out.println();
        }

    }
}
