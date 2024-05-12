package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C181847Bs;
import X.C196437nL;
import X.C4LX;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS8S2000000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS8S2000000_3 aqS8S2000000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C181847Bs(C196437nL.LIZ(aqS8S2000000_3.s0), aqS8S2000000_3.s0, aqS8S2000000_3.s1, 52);
        hierarchyData.LIZIZ = "now_feed_hierarchy_data_key";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S2000000_3 aqS8S2000000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", aqS8S2000000_3.s0);
        sendEventTrackingAsync.put("enter_method", aqS8S2000000_3.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS8S2000000_3 aqS8S2000000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", aqS8S2000000_3.s0);
        sendEventTrackingAsync.put("position", aqS8S2000000_3.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS8S2000000_3 aqS8S2000000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", aqS8S2000000_3.s0);
        sendEventTrackingAsync.put("position", aqS8S2000000_3.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S2000000_3(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
