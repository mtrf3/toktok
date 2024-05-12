package X;

/* loaded from: classes15.dex */
public enum WH5 {
    LEFT(1),
    TOP(2),
    RIGHT(4),
    BOTTOM(8);

    public static final WHE Companion = new WHE();
    public final int LJLIL;

    public static WH5 valueOf(String str) {
        return (WH5) V0N.LJJJ(WH5.class, str);
    }

    public final int getGravity() {
        return this.LJLIL;
    }

    WH5(int i) {
        this.LJLIL = i;
    }
}
