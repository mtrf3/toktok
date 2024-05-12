package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1HQ;
import X.C240369c0;
import X.C248559pD;
import X.C248629pK;
import X.C254969zY;
import X.C27943Axv;
import X.C28143B2t;
import X.C76800UCe;
import X.C772831o;
import X.C9PM;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;

/* loaded from: classes5.dex */
public class AqS9S2000000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S2000000_4 aqS9S2000000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ(C28143B2t.LIZ);
        String str = aqS9S2000000_4.s0;
        if (str != null) {
            sendLog.LIZLLL("popup_name", str);
        }
        String str2 = aqS9S2000000_4.s1;
        if (str2 != null) {
            sendLog.LIZLLL("action_type", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S2000000_4 aqS9S2000000_4, Object obj) {
        C248629pK setState = (C248629pK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248629pK.LIZ(setState, null, null, null, null, null, false, new C248559pD(aqS9S2000000_4.s0, aqS9S2000000_4.s1), null, null, null, null, null, false, false, null, null, null, null, null, null, null, 2097087);
    }

    public static final Object invoke$2(AqS9S2000000_4 aqS9S2000000_4, Object obj) {
        String str;
        C254969zY it = (C254969zY) obj;
        o.LJIIIZ(it, "it");
        String result = aqS9S2000000_4.s0;
        String from = aqS9S2000000_4.s1;
        GroupInfo groupInfo = it.LJLIL;
        if (groupInfo == null || (str = groupInfo.getConversationId()) == null) {
            str = "";
        }
        o.LJIIIZ(result, "result");
        o.LJIIIZ(from, "from");
        C1HQ c1hq = new C1HQ();
        c1hq.put("from_type", from);
        c1hq.put("result", result);
        c1hq.put("conversation_id", str);
        C772831o.LIZ().LIZIZ("click_share_pop", c1hq);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS9S2000000_4 aqS9S2000000_4, Object obj) {
        C240369c0 c240369c0 = (C240369c0) obj;
        if (c240369c0 == null) {
            return null;
        }
        return C240369c0.LIZ(c240369c0, aqS9S2000000_4.s0, aqS9S2000000_4.s1, null, 508);
    }

    public static final Object invoke$4(AqS9S2000000_4 aqS9S2000000_4, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, false, aqS9S2000000_4.s0, aqS9S2000000_4.s1, null, null, null, null, null, null, null, null, -196609, 511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S2000000_4(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
