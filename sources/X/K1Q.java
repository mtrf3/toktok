package X;

/* loaded from: classes9.dex */
public enum K1Q {
    TRY_PRELOAD(0),
    PRELOAD(1),
    PRELOAD_SUCCESS(2),
    PRELOAD_FAIL(3);

    public final int LJLIL;

    public static K1Q valueOf(String str) {
        return (K1Q) V0N.LJJJ(K1Q.class, str);
    }

    public final int getStage() {
        return this.LJLIL;
    }

    K1Q(int i) {
        this.LJLIL = i;
    }
}
