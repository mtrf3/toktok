package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C27356AoS;
import X.C76800UCe;
import X.C9SZ;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS15S0202000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS15S0202000_4 aqS15S0202000_4, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(aqS15S0202000_4.i2));
        logView.plusAssign("rank", Integer.valueOf(aqS15S0202000_4.i3));
        logView.plusAssign("action_type", "click");
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS15S0202000_4.l0).Al().LJLLLL);
        List<District> list = ((District) ((C27356AoS) aqS15S0202000_4.l1).LIZ).parRegions;
        if (list != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S0202000_4 aqS15S0202000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((ActivityC45651qj) aqS15S0202000_4.l0).getString(aqS15S0202000_4.i2);
        o.LJIIIIZZ(string, "activity.getString(btn1)");
        actionGroup.LJII(string, new AqS170S0100000_4((C9SZ) aqS15S0202000_4.l1, 895));
        String string2 = ((ActivityC45651qj) aqS15S0202000_4.l0).getString(aqS15S0202000_4.i3);
        o.LJIIIIZZ(string2, "activity.getString(btn2)");
        actionGroup.LJIIIZ(string2, new AqS170S0100000_4((C9SZ) aqS15S0202000_4.l1, 896));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS15S0202000_4 aqS15S0202000_4, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(aqS15S0202000_4.i2));
        logView.plusAssign("rank", Integer.valueOf(aqS15S0202000_4.i3 + 1));
        logView.plusAssign("action_type", "click");
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS15S0202000_4.l0).Al().LJLLLL);
        List<District> list = ((District) ((C27356AoS) aqS15S0202000_4.l1).LIZ).parRegions;
        if (list != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS15S0202000_4(int i, int i2, int i3, DistrictFragment districtFragment, C27356AoS<District> c27356AoS) {
        super(1);
        this.$t = c27356AoS;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = i3;
        this.l1 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0202000_4(ActivityC45651qj activityC45651qj, int i, int i2, C9SZ c9sz, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = activityC45651qj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = c9sz;
    }
}
