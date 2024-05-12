package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C74216TAu;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes7.dex */
public class AqS24S0000100_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS24S0000100_6 aqS24S0000100_6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HybridKit Config Finish by LegoTask, cost: ");
        LIZ.append(aqS24S0000100_6.j0);
        LIZ.append(" ms");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("HybridKit", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS24S0000100_6 aqS24S0000100_6) {
        long LIZLLL = C74216TAu.LIZIZ.LIZLLL() - (System.currentTimeMillis() - aqS24S0000100_6.j0);
        if (LIZLLL > 0) {
            Thread.sleep(LIZLLL);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS24S0000100_6(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
