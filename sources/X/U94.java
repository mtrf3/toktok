package X;

/* loaded from: classes14.dex */
public enum U94 {
    MULTI_GUEST("multi_guest"),
    MULTI_HOST("multi_host");

    public final String LJLIL;

    public static U94 valueOf(String str) {
        return (U94) V0N.LJJJ(U94.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    U94(String str) {
        this.LJLIL = str;
    }
}
