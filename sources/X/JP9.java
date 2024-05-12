package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JP9 implements InterfaceC49871Jhj, InterfaceC49025JLx {
    public final JP4 LJLIL;
    public final JQA LJLILLLLZI;
    public final int LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JP9)) {
            return false;
        }
        JP9 jp9 = (JP9) obj;
        return o.LJ(this.LJLIL, jp9.LJLIL) && o.LJ(this.LJLILLLLZI, jp9.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        JQA jqa = this.LJLILLLLZI;
        return hashCode + (jqa == null ? 0 : jqa.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchCSCardRenderData(clickSearchData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", itemMobParam=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC49871Jhj
    public final int LIZ() {
        return this.LJLJI;
    }

    public JP9(JP4 clickSearchData, JQA jqa) {
        o.LJIIIZ(clickSearchData, "clickSearchData");
        this.LJLIL = clickSearchData;
        this.LJLILLLLZI = jqa;
        int i = JPA.LIZ;
        JPA.LIZ = i + 1;
        this.LJLJI = i;
    }
}
