class ThreadDeposita extends Thread {

    private Conta c;
    private int n;
    private float val;

    ThreadDeposita(Conta c, int n, float val) {
      this.c = c;
      this.n = n;
      this.val = val;
    }

    float getTotal() {
      return this.n * this.val;
    }

    public void run() {
        for (int i = 0; i < this.n; i++) { // faz n depositos de val
            c.deposita(this.val);
        }
    }
}