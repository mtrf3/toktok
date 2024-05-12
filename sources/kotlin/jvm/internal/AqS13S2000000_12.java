package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27919AxX;
import X.C27943Axv;
import X.C70691Rol;
import X.C71677SBd;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS13S2000000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S2000000_12 aqS13S2000000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZLLL("popup_name", aqS13S2000000_12.s0);
        sendLog.LIZLLL("action_type", aqS13S2000000_12.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S2000000_12 aqS13S2000000_12, Object obj) {
        C71677SBd setState = (C71677SBd) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C71677SBd.LIZ(setState, null, null, null, null, false, null, null, null, new C27919AxX(new OSZ(aqS13S2000000_12.s0, aqS13S2000000_12.s1)), null, null, null, 3839);
    }

    public static final Object invoke$2(AqS13S2000000_12 aqS13S2000000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("actionsheet_name", aqS13S2000000_12.s0);
        logNode.plusAssign("default_option", aqS13S2000000_12.s1);
        logNode.plusAssign("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S2000000_12(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
