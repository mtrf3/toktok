package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YN3 implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final EnumC87257YMj LJLJJLL;

    @Override // X.KK7
    public final boolean isLog() {
        return false;
    }

    static {
        C17N.LJJJJLI().fE().LIZIZ(C65352Pkq.LIZ(YN3.class), C87269YMv.LJLIL);
    }

    public /* synthetic */ YN3(String str, String str2, String str3, String str4, EnumC87257YMj enumC87257YMj, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (String) null, enumC87257YMj);
    }

    public YN3(String searchResultId, String str, String str2, String str3, String str4, EnumC87257YMj actType) {
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(actType, "actType");
        this.LJLIL = searchResultId;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = actType;
    }
}
