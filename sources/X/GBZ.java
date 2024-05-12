package X;

/* loaded from: classes8.dex */
public enum GBZ {
    PRIVACY_DIALOG(2),
    POST_FREQUENCY_LIMIT_DIALOG(2),
    SENSITIVE_TITLE_DIALOG(1);

    public final int LJLIL;

    public static GBZ valueOf(String str) {
        return (GBZ) V0N.LJJJ(GBZ.class, str);
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    GBZ(int i) {
        this.LJLIL = i;
    }
}
