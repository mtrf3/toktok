package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C232459Aj;
import X.C27943Axv;
import X.C4LX;
import X.C70307RiZ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class AqS2S1001000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
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

    public static final Object invoke$0(AqS2S1001000_4 aqS2S1001000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C70307RiZ.LIZ);
        linkedHashMap.put("entrance_zone", "add_on_layer");
        linkedHashMap.put("reason", aqS2S1001000_4.s0);
        linkedHashMap.put("action_cnt", Integer.valueOf(aqS2S1001000_4.i1));
        C27943Axv.LIZ(sendLog, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S1001000_4 aqS2S1001000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C232459Aj(aqS2S1001000_4.i1, new ProfileComponents());
        hierarchyData.LIZIZ = aqS2S1001000_4.s0;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1001000_4(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1001000_4(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
