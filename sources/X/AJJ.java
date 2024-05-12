package X;

/* loaded from: classes5.dex */
public enum AJJ {
    BACK("back"),
    DONE("done"),
    UNLINK("unlink");

    public final String LJLIL;

    public static AJJ valueOf(String str) {
        return (AJJ) V0N.LJJJ(AJJ.class, str);
    }

    public final String getReason() {
        return this.LJLIL;
    }

    AJJ(String str) {
        this.LJLIL = str;
    }
}
