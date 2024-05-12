package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.C78880UxY;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS4S2101000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S2101000_4 aqS4S2101000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C78880UxY.LJIJI(sendLog);
        sendLog.LIZLLL("error_code", Integer.valueOf(aqS4S2101000_4.i3));
        sendLog.LIZLLL("error_msg", aqS4S2101000_4.s0);
        sendLog.LIZLLL("page_name", aqS4S2101000_4.s1);
        Map map = (Map) aqS4S2101000_4.l2;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                sendLog.LIZLLL((String) entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S2101000_4 aqS4S2101000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS4S2101000_4.l2).LIZIZ);
        logNode.plusAssign("module_name", aqS4S2101000_4.s0);
        logNode.plusAssign("video_id", aqS4S2101000_4.s1);
        logNode.plusAssign("duration", Integer.valueOf(aqS4S2101000_4.i3));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2101000_4(C70414RkI c70414RkI, String str, String str2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c70414RkI;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S2101000_4(Map map, String str, int i, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = map;
    }
}
