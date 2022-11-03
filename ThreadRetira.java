public class ThreadRetira extends Thread {
    private Conta c;
    private int n;
    private float val;
    
    ThreadRetira(Conta c, int n, float val) {
        this.c = c;
        this.n = n;
        this.val = val;
    }
    float getTotal() {
        return this.n * this.val;
    }
    public void run() {
        for (int i = 0; i < this.n; i++) { // faz n retiradas de val
            c.retira(this.val);
        }
    }
}
