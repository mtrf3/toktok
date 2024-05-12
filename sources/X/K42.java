package X;

import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K42 implements C33Q {
    public SubFilterOptionStruct LJLIL;
    public SubFilterOptionStruct LJLILLLLZI;
    public SubFilterOptionStruct LJLJI;
    public SubFilterOptionStruct LJLJJI;
    public SubFilterOptionStruct LJLJJL;
    public SubFilterOptionStruct LJLJJLL;
    public boolean LJLJL;

    public K42() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K42)) {
            return false;
        }
        K42 k42 = (K42) obj;
        return o.LJ(this.LJLIL, k42.LJLIL) && o.LJ(this.LJLILLLLZI, k42.LJLILLLLZI) && o.LJ(this.LJLJI, k42.LJLJI) && o.LJ(this.LJLJJI, k42.LJLJJI) && o.LJ(this.LJLJJL, k42.LJLJJL) && o.LJ(this.LJLJJLL, k42.LJLJJLL) && this.LJLJL == k42.LJLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        SubFilterOptionStruct subFilterOptionStruct = this.LJLIL;
        int hashCode = (subFilterOptionStruct == null ? 0 : subFilterOptionStruct.hashCode()) * 31;
        SubFilterOptionStruct subFilterOptionStruct2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (subFilterOptionStruct2 == null ? 0 : subFilterOptionStruct2.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (subFilterOptionStruct3 == null ? 0 : subFilterOptionStruct3.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (subFilterOptionStruct4 == null ? 0 : subFilterOptionStruct4.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (subFilterOptionStruct5 == null ? 0 : subFilterOptionStruct5.hashCode())) * 31;
        SubFilterOptionStruct subFilterOptionStruct6 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (subFilterOptionStruct6 != null ? subFilterOptionStruct6.hashCode() : 0)) * 31;
        boolean z = this.LJLJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchFilterState(selectCategoryStruct=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectSortStruct=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectFilterStruct=");
        LIZ.append(this.LJLJI);
        LIZ.append(", selectFollowerNumberStruct=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", selectProfilesTypesStruct=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", selectOtherPreferencesStruct=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isApply=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ K42(int i) {
        this(null, null, null, null, null, null, false);
    }

    public K42(SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6, boolean z) {
        this.LJLIL = subFilterOptionStruct;
        this.LJLILLLLZI = subFilterOptionStruct2;
        this.LJLJI = subFilterOptionStruct3;
        this.LJLJJI = subFilterOptionStruct4;
        this.LJLJJL = subFilterOptionStruct5;
        this.LJLJJLL = subFilterOptionStruct6;
        this.LJLJL = z;
    }

    public static K42 LIZ(K42 k42, SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6, boolean z, int i) {
        boolean z2 = z;
        SubFilterOptionStruct subFilterOptionStruct7 = subFilterOptionStruct2;
        SubFilterOptionStruct subFilterOptionStruct8 = subFilterOptionStruct;
        SubFilterOptionStruct subFilterOptionStruct9 = subFilterOptionStruct3;
        SubFilterOptionStruct subFilterOptionStruct10 = subFilterOptionStruct4;
        SubFilterOptionStruct subFilterOptionStruct11 = subFilterOptionStruct5;
        SubFilterOptionStruct subFilterOptionStruct12 = subFilterOptionStruct6;
        if ((i & 1) != 0) {
            subFilterOptionStruct8 = k42.LJLIL;
        }
        if ((i & 2) != 0) {
            subFilterOptionStruct7 = k42.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            subFilterOptionStruct9 = k42.LJLJI;
        }
        if ((i & 8) != 0) {
            subFilterOptionStruct10 = k42.LJLJJI;
        }
        if ((i & 16) != 0) {
            subFilterOptionStruct11 = k42.LJLJJL;
        }
        if ((i & 32) != 0) {
            subFilterOptionStruct12 = k42.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z2 = k42.LJLJL;
        }
        k42.getClass();
        return new K42(subFilterOptionStruct8, subFilterOptionStruct7, subFilterOptionStruct9, subFilterOptionStruct10, subFilterOptionStruct11, subFilterOptionStruct12, z2);
    }
}
