package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27356AoS;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS3S0101100_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S0101100_4 aqS3S0101100_4, Object obj) {
        int i;
        District district;
        List<District> list;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(aqS3S0101100_4.i1));
        logView.plusAssign("stay_time", Long.valueOf(aqS3S0101100_4.j2));
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS3S0101100_4.l0).Al().LJLLLL);
        C27356AoS<District> c27356AoS = ((DistrictFragment) aqS3S0101100_4.l0).LLF;
        if (c27356AoS != null && (district = c27356AoS.LIZ) != null && (list = district.parRegions) != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S0101100_4 aqS3S0101100_4, Object obj) {
        int i;
        District district;
        List<District> list;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(aqS3S0101100_4.i1));
        logView.plusAssign("stay_time", Long.valueOf(aqS3S0101100_4.j2));
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS3S0101100_4.l0).Al().LJLLLL);
        C27356AoS<District> c27356AoS = ((DistrictFragment) aqS3S0101100_4.l0).LLF;
        if (c27356AoS != null && (district = c27356AoS.LIZ) != null && (list = district.parRegions) != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0101100_4(int i, long j, DistrictFragment districtFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.j2 = j;
        this.l0 = districtFragment;
    }
}
