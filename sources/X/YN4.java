package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YN4 implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC87257YMj LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    @Override // X.KK7
    public final boolean isLog() {
        return false;
    }

    static {
        C17N.LJJJJLI().fE().LIZIZ(C65352Pkq.LIZ(YN4.class), C87268YMu.LJLIL);
    }

    public YN4(int i, EnumC87257YMj actType, String str, String str2, String str3, String str4, String str5, String str6) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        o.LJIIIZ(actType, "actType");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = actType;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
    }
}
