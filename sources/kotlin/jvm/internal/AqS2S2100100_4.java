package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes5.dex */
public class AqS2S2100100_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS2S2100100_4 aqS2S2100100_4, Object obj) {
        boolean z;
        Object obj2;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("stay_time", Long.valueOf(aqS2S2100100_4.j3));
        logView.plusAssign("input_method", aqS2S2100100_4.s0);
        String str = aqS2S2100100_4.s1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_normal_input", obj2);
        logView.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) aqS2S2100100_4.l2).LLD) {
            str2 = "1";
        }
        logView.plusAssign("has_sug_input", str2);
        logView.plusAssign("is_valid", "1");
        logView.plusAssign("previous_page", ((DistrictFragment) aqS2S2100100_4.l2).Al().LJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S2100100_4 aqS2S2100100_4, Object obj) {
        boolean z;
        Object obj2;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("stay_time", Long.valueOf(aqS2S2100100_4.j3));
        logView.plusAssign("input_method", aqS2S2100100_4.s0);
        String str = aqS2S2100100_4.s1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_normal_input", obj2);
        logView.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) aqS2S2100100_4.l2).LLD) {
            str2 = "1";
        }
        logView.plusAssign("has_sug_input", str2);
        logView.plusAssign("is_valid", "1");
        logView.plusAssign("previous_page", ((DistrictFragment) aqS2S2100100_4.l2).Al().LJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS2S2100100_4 aqS2S2100100_4, Object obj) {
        boolean z;
        Object obj2;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("stay_time", Long.valueOf(aqS2S2100100_4.j3));
        logView.plusAssign("input_method", aqS2S2100100_4.s0);
        String str = aqS2S2100100_4.s1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("has_normal_input", obj2);
        logView.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) aqS2S2100100_4.l2).LLD) {
            str2 = "1";
        }
        logView.plusAssign("has_sug_input", str2);
        logView.plusAssign("is_valid", "1");
        logView.plusAssign("previous_page", ((DistrictFragment) aqS2S2100100_4.l2).Al().LJLLL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S2100100_4(long j, String str, String str2, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.j3 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = districtFragment;
    }
}
