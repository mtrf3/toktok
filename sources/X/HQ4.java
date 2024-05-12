package X;

/* loaded from: classes8.dex */
public final class HQ4 extends Exception {
    public int LJLIL;

    public final int getStatusCode() {
        return this.LJLIL;
    }

    public final void setStatusCode(int i) {
        this.LJLIL = i;
    }

    public HQ4(int i, String str) {
        super(str);
        this.LJLIL = i;
    }
}
