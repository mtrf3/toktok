package X;

/* loaded from: classes16.dex */
public enum Y57 {
    OFF("off"),
    TORCH("torch"),
    AUTO("auto");

    public final String LJLIL;

    public static Y57 valueOf(String str) {
        return (Y57) V0N.LJJJ(Y57.class, str);
    }

    public final String getMode() {
        return this.LJLIL;
    }

    Y57(String str) {
        this.LJLIL = str;
    }
}
