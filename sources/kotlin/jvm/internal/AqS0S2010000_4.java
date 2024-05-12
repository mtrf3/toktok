package kotlin.jvm.internal;

import X.A0J;
import X.AbstractC65781Prl;
import X.C25859ACx;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS0S2010000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;
    public boolean z2;

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

    public static final Object invoke$0(AqS0S2010000_4 aqS0S2010000_4, Object obj) {
        Map sendLog = (Map) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("button_name", "edit");
        sendLog.put("button_type", "payment_type");
        sendLog.put("is_pay_saved", 0);
        sendLog.put("payment_option", aqS0S2010000_4.s0);
        sendLog.put("is_option_discounted", Integer.valueOf(aqS0S2010000_4.z2 ? 1 : 0));
        String str = aqS0S2010000_4.s1;
        if (str != null && str.length() != 0) {
            sendLog.put("pay_bind_status", aqS0S2010000_4.s1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2010000_4 aqS0S2010000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        String str = aqS0S2010000_4.s0;
        if (str == null) {
            str = null;
        }
        return C25859ACx.LJIILJJIL(it, aqS0S2010000_4.s1, null, false, null, null, false, false, str, aqS0S2010000_4.z2, false, false, false, 8376318);
    }

    public static final Object invoke$2(AqS0S2010000_4 aqS0S2010000_4, Object obj) {
        A0J setState = (A0J) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A0J.LIZ(setState, null, aqS0S2010000_4.s0, aqS0S2010000_4.s1, Boolean.valueOf(aqS0S2010000_4.z2), 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2010000_4(String str, String str2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2010000_4(String str, boolean z, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.s1 = str2;
    }
}
