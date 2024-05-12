package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92311a8h implements C33Q {
    public final C92069a4n LJLIL;
    public final EnumC91916a2K LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public C92311a8h() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92311a8h)) {
            return false;
        }
        C92311a8h c92311a8h = (C92311a8h) obj;
        return o.LJ(this.LJLIL, c92311a8h.LJLIL) && this.LJLILLLLZI == c92311a8h.LJLILLLLZI && o.LJ(this.LJLJI, c92311a8h.LJLJI) && o.LJ(this.LJLJJI, c92311a8h.LJLJJI);
    }

    public final int hashCode() {
        C92069a4n c92069a4n = this.LJLIL;
        int hashCode = (c92069a4n == null ? 0 : c92069a4n.hashCode()) * 31;
        EnumC91916a2K enumC91916a2K = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (enumC91916a2K == null ? 0 : enumC91916a2K.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJI;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinConfirmViewState(pinConfirmResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", interfaceStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJLJI);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92311a8h(C92069a4n c92069a4n, EnumC91916a2K enumC91916a2K, String str, String str2) {
        this.LJLIL = c92069a4n;
        this.LJLILLLLZI = enumC91916a2K;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    public static C92311a8h LIZ(C92311a8h c92311a8h, C92069a4n c92069a4n, EnumC91916a2K enumC91916a2K, String str, String str2, int i) {
        if ((i & 1) != 0) {
            c92069a4n = c92311a8h.LJLIL;
        }
        if ((i & 2) != 0) {
            enumC91916a2K = c92311a8h.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str = c92311a8h.LJLJI;
        }
        if ((i & 8) != 0) {
            str2 = c92311a8h.LJLJJI;
        }
        c92311a8h.getClass();
        return new C92311a8h(c92069a4n, enumC91916a2K, str, str2);
    }
}
