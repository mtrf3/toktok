package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A0J implements C33Q {
    public final AbstractC72932td<C76800UCe> LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Boolean LJLJJI;

    public A0J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0J)) {
            return false;
        }
        A0J a0j = (A0J) obj;
        return o.LJ(this.LJLIL, a0j.LJLIL) && o.LJ(this.LJLILLLLZI, a0j.LJLILLLLZI) && o.LJ(this.LJLJI, a0j.LJLJI) && o.LJ(this.LJLJJI, a0j.LJLJJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJLJJI;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ManageSeriesOperationState(submitSeriesResponse=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", entryPoint=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isNewCollection=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public /* synthetic */ A0J(int i) {
        this(C33X.LIZ, "", "", Boolean.FALSE);
    }

    public A0J(AbstractC72932td<C76800UCe> submitSeriesResponse, String str, String str2, Boolean bool) {
        o.LJIIIZ(submitSeriesResponse, "submitSeriesResponse");
        this.LJLIL = submitSeriesResponse;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = bool;
    }

    public static A0J LIZ(A0J a0j, AbstractC72932td submitSeriesResponse, String str, String str2, Boolean bool, int i) {
        if ((i & 1) != 0) {
            submitSeriesResponse = a0j.LJLIL;
        }
        if ((i & 2) != 0) {
            str = a0j.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = a0j.LJLJI;
        }
        if ((i & 8) != 0) {
            bool = a0j.LJLJJI;
        }
        a0j.getClass();
        o.LJIIIZ(submitSeriesResponse, "submitSeriesResponse");
        return new A0J(submitSeriesResponse, str, str2, bool);
    }
}
