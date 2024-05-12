package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3K5;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* loaded from: classes2.dex */
public class AqS3S0011000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
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

    public static final Object invoke$0(AqS3S0011000_1 aqS3S0011000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[moveViewPagerToIndex] ");
        LIZ.append(aqS3S0011000_1.i1);
        LIZ.append(' ');
        LIZ.append(aqS3S0011000_1.z0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS3S0011000_1 aqS3S0011000_1) {
        String str;
        if (aqS3S0011000_1.i1 > 0) {
            str = "count";
        } else if (aqS3S0011000_1.z0) {
            str = "dot";
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        C3K5.LJLLJ = str;
        C3K5.LJFF();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS3S0011000_1 aqS3S0011000_1) {
        String str;
        if (aqS3S0011000_1.i1 > 0) {
            str = "count";
        } else if (aqS3S0011000_1.z0) {
            str = "dot";
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        C3K5.LJLLL = str;
        C3K5.LJFF();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0011000_1(int i, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
