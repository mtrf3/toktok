package X;

/* loaded from: classes9.dex */
public enum K05 {
    RECREATE_SEARCH_SQUARE("1"),
    RECREATE_SEARCH_SUG("2"),
    RECREATE_SEARCH_RESULT("3");

    public final String LJLIL;

    public static K05 valueOf(String str) {
        return (K05) V0N.LJJJ(K05.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    K05(String str) {
        this.LJLIL = str;
    }
}
