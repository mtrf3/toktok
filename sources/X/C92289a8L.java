package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8L, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92289a8L implements C33Q {
    public final String LJLIL;
    public final C92290a8M LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final EnumC91916a2K LJLJJL;
    public final long LJLJJLL;

    public C92289a8L() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92289a8L)) {
            return false;
        }
        C92289a8L c92289a8L = (C92289a8L) obj;
        return o.LJ(this.LJLIL, c92289a8L.LJLIL) && o.LJ(this.LJLILLLLZI, c92289a8L.LJLILLLLZI) && o.LJ(this.LJLJI, c92289a8L.LJLJI) && o.LJ(this.LJLJJI, c92289a8L.LJLJJI) && this.LJLJJL == c92289a8L.LJLJJL && this.LJLJJLL == c92289a8L.LJLJJLL;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C92290a8M c92290a8M = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c92290a8M == null ? 0 : c92290a8M.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC91916a2K enumC91916a2K = this.LJLJJL;
        return ((hashCode4 + (enumC91916a2K != null ? enumC91916a2K.hashCode() : 0)) * 31) + C16880lQ.LLJIJIL(this.LJLJJLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinForgotViewState(verifyDetail=");
        LIZ.append(this.LJLIL);
        LIZ.append(", alertInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJLJI);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", consultStatus=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", interfaceReturnCost=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C92289a8L(int i) {
        this(null, null, null, null, null, 0L);
    }

    public C92289a8L(String str, C92290a8M c92290a8M, String str2, String str3, EnumC91916a2K enumC91916a2K, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = c92290a8M;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = enumC91916a2K;
        this.LJLJJLL = j;
    }

    public static C92289a8L LIZ(C92289a8L c92289a8L, String str, C92290a8M c92290a8M, String str2, String str3, EnumC91916a2K enumC91916a2K, long j, int i) {
        long j2 = j;
        EnumC91916a2K enumC91916a2K2 = enumC91916a2K;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        C92290a8M c92290a8M2 = c92290a8M;
        if ((i & 1) != 0) {
            str6 = c92289a8L.LJLIL;
        }
        if ((i & 2) != 0) {
            c92290a8M2 = c92289a8L.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str5 = c92289a8L.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c92289a8L.LJLJJI;
        }
        if ((i & 16) != 0) {
            enumC91916a2K2 = c92289a8L.LJLJJL;
        }
        if ((i & 32) != 0) {
            j2 = c92289a8L.LJLJJLL;
        }
        c92289a8L.getClass();
        return new C92289a8L(str6, c92290a8M2, str5, str4, enumC91916a2K2, j2);
    }
}
