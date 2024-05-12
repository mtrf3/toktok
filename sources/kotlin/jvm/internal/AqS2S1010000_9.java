package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C76800UCe;
import X.C7B4;
import X.InterfaceC88472Yns;
import X.M38;

/* loaded from: classes10.dex */
public class AqS2S1010000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AqS2S1010000_9 aqS2S1010000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("tab_name", aqS2S1010000_9.s0);
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (!aqS2S1010000_9.z1) {
            sendLog.LIZLLL("mall_entrance", "homepage_mall");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S1010000_9 aqS2S1010000_9, Object obj) {
        M38 setState = (M38) obj;
        o.LJIIIZ(setState, "$this$setState");
        return M38.LIZ(setState, null, null, null, new C7B4(aqS2S1010000_9.s0, Boolean.valueOf(aqS2S1010000_9.z1)), 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1010000_9(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
