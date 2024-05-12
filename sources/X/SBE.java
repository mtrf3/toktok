package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SBE implements C33Q {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final Object LJLJI;
    public final String LJLJJI;
    public final List<InterfaceC57784Mm4> LJLJJL;
    public final Object LJLJJLL;
    public final Object LJLJL;

    public SBE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SBE)) {
            return false;
        }
        SBE sbe = (SBE) obj;
        return o.LJ(this.LJLIL, sbe.LJLIL) && this.LJLILLLLZI == sbe.LJLILLLLZI && o.LJ(this.LJLJI, sbe.LJLJI) && o.LJ(this.LJLJJI, sbe.LJLJJI) && o.LJ(this.LJLJJL, sbe.LJLJJL) && o.LJ(this.LJLJJLL, sbe.LJLJJLL) && o.LJ(this.LJLJL, sbe.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Object obj = this.LJLJI;
        int hashCode2 = (i2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InterfaceC57784Mm4> list = this.LJLJJL;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj2 = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.LJLJL;
        return hashCode5 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillingAddressState(systemError=");
        LIZ.append(this.LJLIL);
        LIZ.append(", needSave=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", dismissDialogFragment=");
        LIZ.append(this.LJLJI);
        LIZ.append(", openRegionPicker=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", powerItemList=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", forceRefreshList=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", disMiss=");
        return U26.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ SBE(int i) {
        this(null, false, null, null, null, null, null);
    }

    public static SBE LIZ(SBE sbe, Object obj, List list, Object obj2, int i) {
        String str;
        boolean z;
        String str2;
        Object obj3 = obj2;
        Object obj4 = obj;
        List list2 = list;
        Object obj5 = null;
        if ((i & 1) != 0) {
            str = sbe.LJLIL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z = sbe.LJLILLLLZI;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            obj4 = sbe.LJLJI;
        }
        if ((i & 8) != 0) {
            str2 = sbe.LJLJJI;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            list2 = sbe.LJLJJL;
        }
        if ((i & 32) != 0) {
            obj3 = sbe.LJLJJLL;
        }
        if ((i & 64) != 0) {
            obj5 = sbe.LJLJL;
        }
        sbe.getClass();
        return new SBE(str, z, obj4, str2, list2, obj3, obj5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SBE(String str, boolean z, Object obj, String str2, List<? extends InterfaceC57784Mm4> list, Object obj2, Object obj3) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = obj;
        this.LJLJJI = str2;
        this.LJLJJL = list;
        this.LJLJJLL = obj2;
        this.LJLJL = obj3;
    }
}
