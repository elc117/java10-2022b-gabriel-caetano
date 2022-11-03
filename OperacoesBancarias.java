class OperacoesBancarias {
    public static void main(String[] args) {

        float saldoInicial = 100f;
        Conta c = new Conta(saldoInicial);

        ThreadDeposita td = new ThreadDeposita(c, 10, 100f);
        ThreadRetira tr = new ThreadRetira(c, 5, 50f);

        td.start();
        tr.start();
        try {
            td.join();
            tr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Saldo da conta: " + c.getSaldo());
        System.out.println("Saldo deveria ser: " + (saldoInicial + td.getTotal() - tr.getTotal()));
    }

}