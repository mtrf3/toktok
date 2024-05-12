package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class AqS1S4100000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AqS1S4100000_12 aqS1S4100000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS1S4100000_12.l4).LIZIZ);
        logNode.minus("activity_name", aqS1S4100000_12.s0);
        logNode.minus("promotion_name", aqS1S4100000_12.s1);
        if (o.LJ(aqS1S4100000_12.s0, "flashsale") || o.LJ(aqS1S4100000_12.s0, "platform_flashsale")) {
            ((C70414RkI) aqS1S4100000_12.l4).LIZJ(logNode);
            logNode.remove((Object) "flashsale_price");
        }
        String str = aqS1S4100000_12.s2;
        if (str != null) {
            logNode.minus("banner_type", str);
        }
        String str2 = aqS1S4100000_12.s3;
        if (str2 != null) {
            logNode.minus("banner_style", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S4100000_12 aqS1S4100000_12, Object obj) {
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS1S4100000_12.l4).LIZIZ);
        sendLogReturnParams.LIZIZ("activity_name", aqS1S4100000_12.s0);
        sendLogReturnParams.LIZIZ("promotion_name", aqS1S4100000_12.s1);
        if (o.LJ(aqS1S4100000_12.s0, "flashsale") || o.LJ(aqS1S4100000_12.s0, "platform_flashsale")) {
            ((C70414RkI) aqS1S4100000_12.l4).LIZLLL(sendLogReturnParams);
            ((HashMap) sendLogReturnParams.LIZ).remove("flashsale_price");
        }
        String str = aqS1S4100000_12.s2;
        if (str != null) {
            sendLogReturnParams.LIZIZ("banner_type", str);
        }
        String str2 = aqS1S4100000_12.s3;
        if (str2 != null) {
            sendLogReturnParams.LIZIZ("banner_style", str2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S4100000_12(C70414RkI c70414RkI, String str, String str2, String str3, String str4, int i) {
        super(1);
        this.$t = i;
        this.l4 = c70414RkI;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
