package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3K5;
import X.C70922qO;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* loaded from: classes2.dex */
public class AqS20S0010000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AqS20S0010000_1 aqS20S0010000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changePlayMode Success: repeat: ");
        LIZ.append(aqS20S0010000_1.z0);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS20S0010000_1 aqS20S0010000_1) {
        String str;
        if (aqS20S0010000_1.z0) {
            str = "count";
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        C3K5.LJLLLL = str;
        C3K5.LJFF();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS20S0010000_1 aqS20S0010000_1) {
        C3K5.LJLLI = aqS20S0010000_1.z0;
        C3K5.LJFF();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0010000_1(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
