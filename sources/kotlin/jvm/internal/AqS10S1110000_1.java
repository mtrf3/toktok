package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C106844Hg;
import X.C4I1;
import X.C73434Sru;
import X.C73542Ste;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;

/* loaded from: classes2.dex */
public class AqS10S1110000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AqS10S1110000_1 aqS10S1110000_1, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C106844Hg.LIZJ(aqS10S1110000_1.s0, "fail", it, aqS10S1110000_1.z2);
        ((C73434Sru) ((C4I1) aqS10S1110000_1.l1)).onComplete();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S1110000_1 aqS10S1110000_1, Object obj) {
        if (((ActivityStatusViewModelImpl) aqS10S1110000_1.l1).LLD.LJII() || !aqS10S1110000_1.z2) {
            ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) aqS10S1110000_1.l1;
            activityStatusViewModelImpl.LJLLI = C73542Ste.LJI(activityStatusViewModelImpl.LJLIL.LIZIZ(aqS10S1110000_1.s0, aqS10S1110000_1.z2), new AqS167S0100000_1((ActivityStatusViewModelImpl) aqS10S1110000_1.l1, 57), C73542Ste.LIZJ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S1110000_1(ActivityStatusViewModelImpl activityStatusViewModelImpl, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityStatusViewModelImpl;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S1110000_1(String str, boolean z, C73434Sru c73434Sru, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = c73434Sru;
    }
}
