package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C54652Lce;
import X.C55793Lv3;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS2S1000100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S1000100_9 aqS2S1000100_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C55793Lv3.LIZ(sendLog);
        sendLog.LIZLLL("stay_time", Long.valueOf(aqS2S1000100_9.j1));
        sendLog.LIZLLL("quit_type", aqS2S1000100_9.s0);
        sendLog.LIZLLL("is_load_data", Integer.valueOf(C55793Lv3.LJI));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S1000100_9 aqS2S1000100_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C55793Lv3.LIZ(sendLog);
        sendLog.LIZLLL("list_name", C55793Lv3.LIZLLL);
        sendLog.LIZLLL("list_num", Integer.valueOf(C55793Lv3.LJ));
        sendLog.LIZLLL("enter_method", C55793Lv3.LJFF);
        sendLog.LIZLLL("stay_time", Long.valueOf(aqS2S1000100_9.j1));
        sendLog.LIZLLL("quit_type", aqS2S1000100_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS2S1000100_9 aqS2S1000100_9, Object obj) {
        Map onEventV3 = (Map) obj;
        o.LJIIIZ(onEventV3, "$this$onEventV3");
        onEventV3.put("enter_from", "homepage_nearby");
        C54652Lce.LJ("group_id", onEventV3, aqS2S1000100_9.s0);
        C54652Lce.LJ("duration", onEventV3, Long.valueOf(aqS2S1000100_9.j1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1000100_9(long j, String str, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1000100_9(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
