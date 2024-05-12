package X;

/* loaded from: classes9.dex */
public enum K1T {
    TRY_PRELOAD(0),
    PRELOAD(1),
    PRELOAD_SUCCESS(2),
    PRELOAD_FAIL(3);

    public final int LJLIL;

    public static K1T valueOf(String str) {
        return (K1T) V0N.LJJJ(K1T.class, str);
    }

    public final int getStage() {
        return this.LJLIL;
    }

    K1T(int i) {
        this.LJLIL = i;
    }
}
