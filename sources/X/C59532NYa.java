package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NYa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59532NYa implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<C76800UCe> LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;

    public C59532NYa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59532NYa)) {
            return false;
        }
        C59532NYa c59532NYa = (C59532NYa) obj;
        return o.LJ(this.LJLIL, c59532NYa.LJLIL) && o.LJ(this.LJLILLLLZI, c59532NYa.LJLILLLLZI) && o.LJ(this.LJLJI, c59532NYa.LJLJI) && o.LJ(this.LJLJJI, c59532NYa.LJLJJI) && o.LJ(this.LJLJJL, c59532NYa.LJLJJL) && o.LJ(this.LJLJJLL, c59532NYa.LJLJJLL);
    }

    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<Boolean> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<C76800UCe> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<C76800UCe> c43i6 = this.LJLJJLL;
        return hashCode5 + (c43i6 != null ? c43i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdPopUpWebPageState(onPopUpWebPageShowEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", popUpShowPauseEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", popUpDismissResumeEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isPopUpShow=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", showView=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", sendStatusEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C59532NYa(int i) {
        this(null, null, null, null, null, null);
    }

    public static C59532NYa LIZ(C59532NYa c59532NYa, C43I c43i, C43I c43i2, C43I c43i3, int i) {
        C43I<Boolean> c43i4;
        C43I<C76800UCe> c43i5;
        C43I c43i6 = c43i3;
        C43I c43i7 = c43i;
        C43I c43i8 = c43i2;
        if ((i & 1) != 0) {
            c43i7 = c59532NYa.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i8 = c59532NYa.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i6 = c59532NYa.LJLJI;
        }
        C43I<C76800UCe> c43i9 = null;
        if ((i & 8) != 0) {
            c43i4 = c59532NYa.LJLJJI;
        } else {
            c43i4 = null;
        }
        if ((i & 16) != 0) {
            c43i5 = c59532NYa.LJLJJL;
        } else {
            c43i5 = null;
        }
        if ((i & 32) != 0) {
            c43i9 = c59532NYa.LJLJJLL;
        }
        c59532NYa.getClass();
        return new C59532NYa(c43i7, c43i8, c43i6, c43i4, c43i5, c43i9);
    }

    public C59532NYa(C43I<Boolean> c43i, C43I<C76800UCe> c43i2, C43I<C76800UCe> c43i3, C43I<Boolean> c43i4, C43I<C76800UCe> c43i5, C43I<C76800UCe> c43i6) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
    }
}
