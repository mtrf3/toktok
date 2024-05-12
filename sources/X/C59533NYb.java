package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NYb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59533NYb implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<C76800UCe> LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;

    public C59533NYb() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59533NYb)) {
            return false;
        }
        C59533NYb c59533NYb = (C59533NYb) obj;
        return o.LJ(this.LJLIL, c59533NYb.LJLIL) && o.LJ(this.LJLILLLLZI, c59533NYb.LJLILLLLZI) && o.LJ(this.LJLJI, c59533NYb.LJLJI) && o.LJ(this.LJLJJI, c59533NYb.LJLJJI) && o.LJ(this.LJLJJL, c59533NYb.LJLJJL) && o.LJ(this.LJLJJLL, c59533NYb.LJLJJLL);
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
        LIZ.append("AdLightWebPageState(onPopUpWebPageShowEvent=");
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

    public C59533NYb(Object obj) {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
    }
}
