package X;

/* loaded from: classes9.dex */
public enum IQE {
    INITIALIZED("Initialized"),
    ORIGINAL("Original"),
    TRANSLATING("Translating"),
    TRANSLATED("Translated");

    public final String LJLIL;

    public static IQE valueOf(String str) {
        return (IQE) V0N.LJJJ(IQE.class, str);
    }

    public final String getId() {
        return this.LJLIL;
    }

    IQE(String str) {
        this.LJLIL = str;
    }
}
