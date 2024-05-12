package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C187107Vy;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS1S1001000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public String s0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1001000_3(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.i1 = 0;
    }

    public static final Object invoke$0(AqS1S1001000_3 aqS1S1001000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("trigger_type", aqS1S1001000_3.s0);
        sendEventTracking.put("page", aqS1S1001000_3.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S1001000_3 aqS1S1001000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        int i = aqS1S1001000_3.i1;
        String contentDescription = aqS1S1001000_3.s0;
        o.LJIIIZ(contentDescription, "contentDescription");
        return new C187107Vy(i, contentDescription);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1001000_3(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
