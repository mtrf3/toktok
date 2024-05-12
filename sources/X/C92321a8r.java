package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8r, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92321a8r implements C33Q {
    public final C92074a4s LJLIL;
    public final EnumC91916a2K LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    public C92321a8r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92321a8r)) {
            return false;
        }
        C92321a8r c92321a8r = (C92321a8r) obj;
        return o.LJ(this.LJLIL, c92321a8r.LJLIL) && this.LJLILLLLZI == c92321a8r.LJLILLLLZI && o.LJ(this.LJLJI, c92321a8r.LJLJI) && this.LJLJJI == c92321a8r.LJLJJI;
    }

    public final int hashCode() {
        C92074a4s c92074a4s = this.LJLIL;
        int hashCode = (c92074a4s == null ? 0 : c92074a4s.hashCode()) * 31;
        EnumC91916a2K enumC91916a2K = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (enumC91916a2K == null ? 0 : enumC91916a2K.hashCode())) * 31;
        String str = this.LJLJI;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJLJJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinVerifyViewState(verifyResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", verifyStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", verifyErrorContent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", index=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C92321a8r(int i) {
        this(null, null, null, 0);
    }

    public C92321a8r(C92074a4s c92074a4s, EnumC91916a2K enumC91916a2K, String str, int i) {
        this.LJLIL = c92074a4s;
        this.LJLILLLLZI = enumC91916a2K;
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    public static C92321a8r LIZ(C92321a8r c92321a8r, C92074a4s c92074a4s, EnumC91916a2K enumC91916a2K, String str, int i) {
        int i2;
        if ((i & 1) != 0) {
            c92074a4s = c92321a8r.LJLIL;
        }
        if ((i & 2) != 0) {
            enumC91916a2K = c92321a8r.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str = c92321a8r.LJLJI;
        }
        if ((i & 8) != 0) {
            i2 = c92321a8r.LJLJJI;
        } else {
            i2 = 0;
        }
        c92321a8r.getClass();
        return new C92321a8r(c92074a4s, enumC91916a2K, str, i2);
    }
}
