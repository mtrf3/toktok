package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.EnumC55898Lwk;
import X.InterfaceC65784Pro;
import X.M4Q;
import X.X1D;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;

/* loaded from: classes10.dex */
public class AqS45S0001000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

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

    public static final Object invoke$0(AqS45S0001000_9 aqS45S0001000_9) {
        M4Q LIZIZ = NoticePerfManager.LIZ.LIZIZ(true);
        if (LIZIZ != null) {
            int i = LIZIZ.LIZJ;
            int i2 = aqS45S0001000_9.i0;
            if (i != i2) {
                LIZIZ.LIZJ = i2;
                LIZIZ.LIZ(EnumC55898Lwk.POST_UNREAD);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS45S0001000_9 aqS45S0001000_9) {
        NoticePerfManager.LIZLLL(EnumC55898Lwk.POST_UNREAD, new AqS45S0001000_9(aqS45S0001000_9.i0, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS45S0001000_9 aqS45S0001000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[deleteItemInternal], ");
        LIZ.append(aqS45S0001000_9.i0);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0001000_9(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
