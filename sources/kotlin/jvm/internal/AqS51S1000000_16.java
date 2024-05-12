package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C5H3;
import X.C88207Yjb;
import X.CHK;
import X.CHL;
import X.InterfaceC65784Pro;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;
import java.util.LinkedHashMap;

/* loaded from: classes17.dex */
public class AqS51S1000000_16 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS51S1000000_16 aqS51S1000000_16) {
        return new CHK(aqS51S1000000_16.s0, LiveFluencySupportSampleSetting.INSTANCE.getLinkMicRolePeriodSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }

    public static final Object invoke$1(AqS51S1000000_16 aqS51S1000000_16) {
        CHK chk;
        Handler LIZIZ = C88207Yjb.LIZIZ();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get(aqS51S1000000_16.s0);
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LIZLLL = true;
        } else {
            chk = null;
        }
        return new CHL(LIZIZ, chk);
    }

    public static final Object invoke$2(AqS51S1000000_16 aqS51S1000000_16) {
        return new CHK(aqS51S1000000_16.s0, LiveFluencySupportSampleSetting.INSTANCE.getPannelMultiGuestSamplingRate(), C88207Yjb.LJIIIIZZ, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S1000000_16(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
