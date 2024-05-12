package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C197387os;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS0S2001000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS0S2001000_3 aqS0S2001000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("enter_from", aqS0S2001000_3.s0);
        sendEventTracking.put("enter_method", aqS0S2001000_3.s1);
        sendEventTracking.put("number_cnt", C197387os.LJLJJLL);
        sendEventTracking.put("is_new_page", aqS0S2001000_3.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2001000_3 aqS0S2001000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("trigger_type", aqS0S2001000_3.s0);
        sendEventTracking.put("page", aqS0S2001000_3.i2);
        sendEventTracking.put("click_type", aqS0S2001000_3.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2001000_3(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.i2 = 0;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2001000_3(String str, String str2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i2 = i;
    }
}
