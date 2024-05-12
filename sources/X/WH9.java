package X;

/* loaded from: classes15.dex */
public enum WH9 {
    VERTICAL(0),
    HORIZONTAL(1);

    public static final WHF Companion = new WHF();
    public final int LJLIL;

    public static WH9 valueOf(String str) {
        return (WH9) V0N.LJJJ(WH9.class, str);
    }

    public final int getOrientation() {
        return this.LJLIL;
    }

    WH9(int i) {
        this.LJLIL = i;
    }
}
