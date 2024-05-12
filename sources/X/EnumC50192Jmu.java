package X;

/* renamed from: X.Jmu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC50192Jmu {
    WIKI("wiki", "Wikipedia"),
    IMDB("imdb_card", "imdb");

    public final String LJLIL;
    public final String LJLILLLLZI;

    public static EnumC50192Jmu valueOf(String str) {
        return (EnumC50192Jmu) V0N.LJJJ(EnumC50192Jmu.class, str);
    }

    public final String getPageType() {
        return this.LJLILLLLZI;
    }

    public final String getTokenType() {
        return this.LJLIL;
    }

    EnumC50192Jmu(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
