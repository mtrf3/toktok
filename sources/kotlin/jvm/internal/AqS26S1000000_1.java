package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.C100973xl;
import X.C105044Ai;
import X.C105934Dt;
import X.C105964Dw;
import X.C3IU;
import X.C43I;
import X.C4E2;
import X.C76800UCe;
import X.C95293ob;
import X.C97863sk;
import X.FMX;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AqS26S1000000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S1000000_1(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C95293ob setState = (C95293ob) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C95293ob.LIZ(setState, null, false, false, false, null, null, new C43I(aqS26S1000000_1.s0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087);
    }

    public static final Object invoke$1(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C100973xl setState = (C100973xl) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C100973xl.LIZ(setState, false, null, aqS26S1000000_1.s0, null, 0, false, 59);
    }

    public static final Object invoke$2(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", aqS26S1000000_1.s0);
        linkedHashMap.put("action", "cancel");
        FMX.LJIIL("claim_store_popup_result", linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C105934Dt setState = (C105934Dt) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C105934Dt.LIZ(setState, false, new C105964Dw(aqS26S1000000_1.s0, true), null, null, C4E2.LOW_VOLUME, 4);
    }

    public static final Object invoke$4(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C105934Dt setState = (C105934Dt) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C105934Dt.LIZ(setState, false, new C105964Dw(aqS26S1000000_1.s0, false), null, null, null, 29);
    }

    public static final Object invoke$5(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C3IU setState = (C3IU) obj;
        o.LJIIIZ(setState, "$this$setState");
        String lastHintText = aqS26S1000000_1.s0;
        IMUser iMUser = setState.LJLIL;
        o.LJIIIZ(lastHintText, "lastHintText");
        return new C3IU(iMUser, lastHintText);
    }

    public static final Object invoke$6(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C105044Ai setState = (C105044Ai) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C105044Ai.LIZ(setState, null, aqS26S1000000_1.s0, null, false, false, 29);
    }

    public static final Object invoke$7(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        C105044Ai setState = (C105044Ai) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C105044Ai.LIZ(setState, null, null, new C43I(aqS26S1000000_1.s0), false, false, 27);
    }

    public static final Object invoke$8(AqS26S1000000_1 aqS26S1000000_1, Object it) {
        o.LJIIIZ(it, "it");
        C97863sk.LIZIZ(aqS26S1000000_1.s0, "cancel");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS26S1000000_1 aqS26S1000000_1, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", aqS26S1000000_1.s0);
        sendEventTrackingAsync.put("action_type", "show");
        return C76800UCe.LIZ;
    }
}
