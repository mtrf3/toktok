package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C68972R5c;
import X.C68985R5p;
import X.C76800UCe;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC65784Pro;
import X.InterfaceC69056R8i;
import X.PYQ;
import X.QTX;
import X.R40;
import X.R9Y;
import X.RBV;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.ruler.base.models.RuleModel;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;

/* loaded from: classes12.dex */
public class AqS8S2300000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS8S2300000_11 aqS8S2300000_11) {
        if (!o.LJ(aqS8S2300000_11.s0, "phone")) {
            RBV.LJIIJJI((Fragment) aqS8S2300000_11.l2, aqS8S2300000_11.s1);
        }
        if (o.LJ(aqS8S2300000_11.s0, "handle")) {
            PrevLoginPlatformService.LJIIL().LJIIJJI(((R9Y) ((R40) aqS8S2300000_11.l3).LJIIIZ).LJI.LIZ, "username");
            PrevLoginPlatformService.LJIIL().LJIIIIZZ("username");
        }
        C68972R5c.LJIIIZ(false, aqS8S2300000_11.s0, ((InterfaceC69056R8i) aqS8S2300000_11.l4).q9(), ((R9Y) ((R40) aqS8S2300000_11.l3).LJIIIZ).LJI, null);
        Fragment fragment = (Fragment) aqS8S2300000_11.l2;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) aqS8S2300000_11.l4;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = ((R9Y) ((R40) aqS8S2300000_11.l3).LJIIIZ).LJI;
        o.LJIIIIZZ(qtx, "it.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S2300000_11 aqS8S2300000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuleEngineManger id:");
        LIZ.append(((PYQ) aqS8S2300000_11.l3).LJJJJL().LJLIL.LIZ);
        LIZ.append(" uuid:");
        LIZ.append(((PYQ) aqS8S2300000_11.l3).LJJJJL().LL);
        LIZ.append(" checkHitRuleModel(");
        LIZ.append(aqS8S2300000_11.s0);
        LIZ.append(") target: ");
        LIZ.append(((OperateHistory) aqS8S2300000_11.l4).getTarget());
        LIZ.append(" operator: ");
        LIZ.append(((OperateHistory) aqS8S2300000_11.l4).getOperator());
        LIZ.append(" key: ");
        LIZ.append(aqS8S2300000_11.s1);
        LIZ.append('\n');
        LIZ.append((RuleModel) aqS8S2300000_11.l2);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS8S2300000_11(String str, String str2, Fragment fragment, String str3, R40<R9Y> r40, InterfaceC69056R8i interfaceC69056R8i) {
        super(0);
        this.$t = interfaceC69056R8i;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = fragment;
        this.l3 = str3;
        this.l4 = r40;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S2300000_11(String str, RuleModel ruleModel, PYQ pyq, OperateHistory operateHistory, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = ruleModel;
        this.l3 = pyq;
        this.l4 = operateHistory;
        this.s1 = str2;
    }
}
