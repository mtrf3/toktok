package X;

import kotlin.jvm.internal.o;

/* renamed from: X.94s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2309894s implements C33Q {
    public final C43I<NOJ> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<NOJ> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<String> LJLJJLL;

    public C2309894s() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2309894s)) {
            return false;
        }
        C2309894s c2309894s = (C2309894s) obj;
        return o.LJ(this.LJLIL, c2309894s.LJLIL) && o.LJ(this.LJLILLLLZI, c2309894s.LJLILLLLZI) && o.LJ(this.LJLJI, c2309894s.LJLJI) && o.LJ(this.LJLJJI, c2309894s.LJLJJI) && o.LJ(this.LJLJJL, c2309894s.LJLJJL) && o.LJ(this.LJLJJLL, c2309894s.LJLJJLL);
    }

    public final int hashCode() {
        C43I<NOJ> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<NOJ> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<Boolean> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<String> c43i6 = this.LJLJJLL;
        return hashCode5 + (c43i6 != null ? c43i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedAdEventState(showAdPopUpWebPageEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", setClickFromButtonEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showAdFakePopUpWebPageEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showAdProfilePopUpWebPageEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", dismissAdProfilePopUpWebPageEvent=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", showAdLightWebPageEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C2309894s(int i) {
        this(null, null, null, null, null, null);
    }

    public static C2309894s LIZ(C2309894s c2309894s, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        C43I<C76800UCe> c43i4;
        C43I<NOJ> c43i5;
        C43I c43i6 = c43i3;
        C43I c43i7 = c43i;
        C43I c43i8 = c43i2;
        if ((i & 1) != 0) {
            c43i7 = c2309894s.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i8 = c2309894s.LJLILLLLZI;
        }
        C43I<Boolean> c43i9 = null;
        if ((i & 4) != 0) {
            c43i4 = c2309894s.LJLJI;
        } else {
            c43i4 = null;
        }
        if ((i & 8) != 0) {
            c43i5 = c2309894s.LJLJJI;
        } else {
            c43i5 = null;
        }
        if ((i & 16) != 0) {
            c43i9 = c2309894s.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i6 = c2309894s.LJLJJLL;
        }
        c2309894s.getClass();
        return new C2309894s(c43i7, c43i8, c43i4, c43i5, c43i9, c43i6);
    }

    public C2309894s(C43I<NOJ> c43i, C43I<Boolean> c43i2, C43I<C76800UCe> c43i3, C43I<NOJ> c43i4, C43I<Boolean> c43i5, C43I<String> c43i6) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
    }
}
