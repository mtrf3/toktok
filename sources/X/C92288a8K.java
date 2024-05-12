package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8K, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92288a8K implements C33Q {
    public final C92068a4m LJLIL;
    public final C92074a4s LJLILLLLZI;
    public final C92290a8M LJLJI;
    public final EnumC91916a2K LJLJJI;
    public final String LJLJJL;
    public final EnumC91916a2K LJLJJLL;
    public final String LJLJL;
    public final long LJLJLJ;

    public C92288a8K() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92288a8K)) {
            return false;
        }
        C92288a8K c92288a8K = (C92288a8K) obj;
        return o.LJ(this.LJLIL, c92288a8K.LJLIL) && o.LJ(this.LJLILLLLZI, c92288a8K.LJLILLLLZI) && o.LJ(this.LJLJI, c92288a8K.LJLJI) && this.LJLJJI == c92288a8K.LJLJJI && o.LJ(this.LJLJJL, c92288a8K.LJLJJL) && this.LJLJJLL == c92288a8K.LJLJJLL && o.LJ(this.LJLJL, c92288a8K.LJLJL) && this.LJLJLJ == c92288a8K.LJLJLJ;
    }

    public final int hashCode() {
        C92068a4m c92068a4m = this.LJLIL;
        int hashCode = (c92068a4m == null ? 0 : c92068a4m.hashCode()) * 31;
        C92074a4s c92074a4s = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c92074a4s == null ? 0 : c92074a4s.hashCode())) * 31;
        C92290a8M c92290a8M = this.LJLJI;
        int hashCode3 = (hashCode2 + (c92290a8M == null ? 0 : c92290a8M.hashCode())) * 31;
        EnumC91916a2K enumC91916a2K = this.LJLJJI;
        int hashCode4 = (hashCode3 + (enumC91916a2K == null ? 0 : enumC91916a2K.hashCode())) * 31;
        String str = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC91916a2K enumC91916a2K2 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (enumC91916a2K2 == null ? 0 : enumC91916a2K2.hashCode())) * 31;
        String str2 = this.LJLJL;
        return ((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + C16880lQ.LLJIJIL(this.LJLJLJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinChangeViewState(pinChangeConsultInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", verifyResult=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", alertInfo=");
        LIZ.append(this.LJLJI);
        LIZ.append(", consultStatus=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", consultErrorContent=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", verifyStatus=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", verifyErrorContent=");
        LIZ.append(this.LJLJL);
        LIZ.append(", interfaceReturnCost=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C92288a8K(int i) {
        this(null, null, null, null, null, null, null, 0L);
    }

    public C92288a8K(C92068a4m c92068a4m, C92074a4s c92074a4s, C92290a8M c92290a8M, EnumC91916a2K enumC91916a2K, String str, EnumC91916a2K enumC91916a2K2, String str2, long j) {
        this.LJLIL = c92068a4m;
        this.LJLILLLLZI = c92074a4s;
        this.LJLJI = c92290a8M;
        this.LJLJJI = enumC91916a2K;
        this.LJLJJL = str;
        this.LJLJJLL = enumC91916a2K2;
        this.LJLJL = str2;
        this.LJLJLJ = j;
    }

    public static C92288a8K LIZ(C92288a8K c92288a8K, C92068a4m c92068a4m, C92074a4s c92074a4s, C92290a8M c92290a8M, EnumC91916a2K enumC91916a2K, String str, EnumC91916a2K enumC91916a2K2, String str2, long j, int i) {
        long j2 = j;
        String str3 = str2;
        C92074a4s c92074a4s2 = c92074a4s;
        C92068a4m c92068a4m2 = c92068a4m;
        C92290a8M c92290a8M2 = c92290a8M;
        EnumC91916a2K enumC91916a2K3 = enumC91916a2K;
        String str4 = str;
        EnumC91916a2K enumC91916a2K4 = enumC91916a2K2;
        if ((i & 1) != 0) {
            c92068a4m2 = c92288a8K.LJLIL;
        }
        if ((i & 2) != 0) {
            c92074a4s2 = c92288a8K.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c92290a8M2 = c92288a8K.LJLJI;
        }
        if ((i & 8) != 0) {
            enumC91916a2K3 = c92288a8K.LJLJJI;
        }
        if ((i & 16) != 0) {
            str4 = c92288a8K.LJLJJL;
        }
        if ((i & 32) != 0) {
            enumC91916a2K4 = c92288a8K.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str3 = c92288a8K.LJLJL;
        }
        if ((i & 128) != 0) {
            j2 = c92288a8K.LJLJLJ;
        }
        c92288a8K.getClass();
        return new C92288a8K(c92068a4m2, c92074a4s2, c92290a8M2, enumC91916a2K3, str4, enumC91916a2K4, str3, j2);
    }
}
