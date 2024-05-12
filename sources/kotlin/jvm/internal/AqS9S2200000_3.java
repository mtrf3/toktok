package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C181847Bs;
import X.C219608jc;
import X.C220168kW;
import X.C76800UCe;
import X.C7MK;
import X.InterfaceC194547kI;
import X.InterfaceC88472Yns;
import X.Z89;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS9S2200000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS9S2200000_3 aqS9S2200000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("action_type", aqS9S2200000_3.s0);
        sendEventTracking.put("button_type", aqS9S2200000_3.s1);
        sendEventTracking.put("page", C7MK.LIZLLL(((C181847Bs) aqS9S2200000_3.l2).LJLILLLLZI, (InterfaceC194547kI) aqS9S2200000_3.l3));
        sendEventTracking.put("friend_type", C7MK.LIZ(((InterfaceC194547kI) aqS9S2200000_3.l3).getAweme().getAuthor()));
        sendEventTracking.put("is_to_ttn", 0);
        sendEventTracking.put("is_aggregate", 0);
        sendEventTracking.put("now_card_type", Z89.LIZIZ.LJIIZILJ(((InterfaceC194547kI) aqS9S2200000_3.l3).getAweme()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S2200000_3 aqS9S2200000_3, Object obj) {
        String str;
        C219608jc mB;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) ((AddYoursMultiHubAssem) aqS9S2200000_3.l2).LJLL.getValue();
        if (addYoursHubAbility != null && (mB = addYoursHubAbility.mB()) != null) {
            str = mB.LIZJ;
        } else {
            str = null;
        }
        sendEventTrackingAsync.put("enter_from", str);
        sendEventTrackingAsync.put("enter_method", aqS9S2200000_3.s0);
        sendEventTrackingAsync.put("category_name", aqS9S2200000_3.s1);
        sendEventTrackingAsync.put("added_topic_cnt", ((AddYoursMultiHubAssem) aqS9S2200000_3.l2).H3(0));
        if (((C220168kW) aqS9S2200000_3.l3).LJLIL) {
            sendEventTrackingAsync.put("to_add_topic_cnt", ((AddYoursMultiHubAssem) aqS9S2200000_3.l2).H3(1));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S2200000_3(InterfaceC194547kI interfaceC194547kI, C181847Bs c181847Bs, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c181847Bs;
        this.l3 = interfaceC194547kI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S2200000_3(AddYoursMultiHubAssem addYoursMultiHubAssem, String str, String str2, C220168kW c220168kW, int i) {
        super(1);
        this.$t = i;
        this.l2 = addYoursMultiHubAssem;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c220168kW;
    }
}
