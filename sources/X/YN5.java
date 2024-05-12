package X;

/* loaded from: classes16.dex */
public final class YN5 implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final EnumC87257YMj LJLJL;

    @Override // X.KK7
    public final boolean isLog() {
        return false;
    }

    static {
        C17N.LJJJJLI().kO().LIZIZ(C65352Pkq.LIZ(YN5.class), C87270YMw.LJLIL);
    }

    public YN5(int i, EnumC87257YMj enumC87257YMj, String str, String str2, String str3, String str4, String str5, String str6) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = enumC87257YMj;
    }
}
