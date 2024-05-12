package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C66318Q1a;
import X.C66320Q1c;
import X.C66324Q1g;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.R5M;
import X.R5Q;
import X.R5T;
import X.X1D;
import android.app.Activity;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;

/* loaded from: classes12.dex */
public class AqS11S1201000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AqS11S1201000_11 aqS11S1201000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr hash:");
        LIZ.append(aqS11S1201000_11.s0.hashCode());
        LIZ.append(" response:");
        LIZ.append((C66318Q1a) aqS11S1201000_11.l1);
        LIZ.append(" cost:");
        long j = 1000;
        LIZ.append(((C66320Q1c) aqS11S1201000_11.l2).LIZJ / j);
        LIZ.append("  identity_cost:");
        LIZ.append(((C66320Q1c) aqS11S1201000_11.l2).LIZLLL / j);
        LIZ.append(" isFromCache:");
        LIZ.append(aqS11S1201000_11.i3);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS11S1201000_11 aqS11S1201000_11, Object it) {
        o.LJIIIZ(it, "it");
        R5Q.LJFF(aqS11S1201000_11.i3, aqS11S1201000_11.s0, true);
        CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).enableCloudTokenForOneClickLogin(false, (R5M) ((C68322mC) aqS11S1201000_11.l1).element, aqS11S1201000_11.s0, "popup", R5T.LJLIL, new AqS167S0100000_1((Activity) aqS11S1201000_11.l2, 443));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS11S1201000_11(String str, String str2, int i, C68322mC<R5M> c68322mC, Activity activity) {
        super(1);
        this.$t = activity;
        this.s0 = str;
        this.i3 = str2;
        this.l1 = i;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S1201000_11(String str, C66318Q1a c66318Q1a, C66320Q1c c66320Q1c, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c66318Q1a;
        this.l2 = c66320Q1c;
        this.i3 = i;
    }
}
