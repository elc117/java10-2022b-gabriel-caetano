class Conta {
    private float saldo;

    public Conta() {
        saldo = 0f;
    }

    public Conta(float inicial) {
        saldo = inicial;
    }

    public float getSaldo() {
        return saldo;
    }

    // public void deposita(float valor) { // errado  
    public void deposita(float valor) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saldo = saldo + valor;
    }

    // public void retira(float valor) { // errado
    public void retira(float valor) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saldo = saldo - valor;
    }
}