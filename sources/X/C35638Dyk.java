package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.FragmentDataInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dyk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35638Dyk implements C33Q {
    public final List<MallRacunTabInfo> LJLIL;
    public final FragmentDataInfo LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final Integer LJLJJLL;
    public final Integer LJLJL;

    public C35638Dyk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35638Dyk)) {
            return false;
        }
        C35638Dyk c35638Dyk = (C35638Dyk) obj;
        return o.LJ(this.LJLIL, c35638Dyk.LJLIL) && o.LJ(this.LJLILLLLZI, c35638Dyk.LJLILLLLZI) && this.LJLJI == c35638Dyk.LJLJI && this.LJLJJI == c35638Dyk.LJLJJI && this.LJLJJL == c35638Dyk.LJLJJL && o.LJ(this.LJLJJLL, c35638Dyk.LJLJJLL) && o.LJ(this.LJLJL, c35638Dyk.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        FragmentDataInfo fragmentDataInfo = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (fragmentDataInfo == null ? 0 : fragmentDataInfo.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LJLJJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJLJJL ? 1 : 0)) * 31;
        Integer num = this.LJLJJLL;
        int hashCode3 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJLJL;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunState(tabInfoList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pageFragmentData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSkyLightOpen=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isSwipeable=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", tryShowGuide=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", currentTabType=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", selectTabType=");
        return s0.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public C35638Dyk(int i) {
        this(C61878OQg.INSTANCE, null, true, false, false, null, null);
    }

    public C35638Dyk(List<MallRacunTabInfo> tabInfoList, FragmentDataInfo fragmentDataInfo, boolean z, boolean z2, boolean z3, Integer num, Integer num2) {
        o.LJIIIZ(tabInfoList, "tabInfoList");
        this.LJLIL = tabInfoList;
        this.LJLILLLLZI = fragmentDataInfo;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = num;
        this.LJLJL = num2;
    }

    public static C35638Dyk LIZ(C35638Dyk c35638Dyk, List list, FragmentDataInfo fragmentDataInfo, boolean z, boolean z2, boolean z3, Integer num, int i) {
        Integer num2;
        Integer num3 = num;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        List tabInfoList = list;
        FragmentDataInfo fragmentDataInfo2 = fragmentDataInfo;
        if ((i & 1) != 0) {
            tabInfoList = c35638Dyk.LJLIL;
        }
        if ((i & 2) != 0) {
            fragmentDataInfo2 = c35638Dyk.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z6 = c35638Dyk.LJLJI;
        }
        if ((i & 8) != 0) {
            z5 = c35638Dyk.LJLJJI;
        }
        if ((i & 16) != 0) {
            z4 = c35638Dyk.LJLJJL;
        }
        if ((i & 32) != 0) {
            num3 = c35638Dyk.LJLJJLL;
        }
        if ((i & 64) != 0) {
            num2 = c35638Dyk.LJLJL;
        } else {
            num2 = null;
        }
        c35638Dyk.getClass();
        o.LJIIIZ(tabInfoList, "tabInfoList");
        return new C35638Dyk(tabInfoList, fragmentDataInfo2, z6, z5, z4, num3, num2);
    }
}
