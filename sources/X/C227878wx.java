package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227878wx implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;

    public C227878wx() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227878wx)) {
            return false;
        }
        C227878wx c227878wx = (C227878wx) obj;
        return o.LJ(this.LJLIL, c227878wx.LJLIL) && o.LJ(this.LJLILLLLZI, c227878wx.LJLILLLLZI) && o.LJ(this.LJLJI, c227878wx.LJLJI);
    }

    public final int hashCode() {
        C43I<C76800UCe> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJI;
        return hashCode2 + (c43i3 != null ? c43i3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdPlayFunState(showEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", setCleanModeEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onViewResumeEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C227878wx(C43I<C76800UCe> c43i, C43I<Boolean> c43i2, C43I<C76800UCe> c43i3) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
    }

    public static C227878wx LIZ(C227878wx c227878wx, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        if ((i & 1) != 0) {
            c43i = c227878wx.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i2 = c227878wx.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i3 = c227878wx.LJLJI;
        }
        c227878wx.getClass();
        return new C227878wx(c43i, c43i2, c43i3);
    }
}
