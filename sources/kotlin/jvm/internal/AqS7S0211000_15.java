package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C85114Xao;
import X.C85119Xat;
import X.C85144XbI;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS7S0211000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AqS7S0211000_15 aqS7S0211000_15, Object obj) {
        C85114Xao verifiedWay = (C85114Xao) obj;
        o.LJIIIZ(verifiedWay, "verifiedWay");
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) aqS7S0211000_15.l0;
        boolean z = aqS7S0211000_15.z2;
        twoStepVerificationManageActivity.LLFZ((List) aqS7S0211000_15.l1, C85144XbI.LJI(verifiedWay.LIZIZ), verifiedWay.LIZ, aqS7S0211000_15.i3, z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S0211000_15 aqS7S0211000_15, Object obj) {
        C85119Xat verifiedWay = (C85119Xat) obj;
        o.LJIIIZ(verifiedWay, "verifiedWay");
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS7S0211000_15.l0;
        boolean z = aqS7S0211000_15.z2;
        twoStepVerificationActivityViewModel.gv0((List) aqS7S0211000_15.l1, C85144XbI.LJI(verifiedWay.LJLILLLLZI), verifiedWay.LJLIL, aqS7S0211000_15.i3, z);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0211000_15(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = twoStepVerificationManageActivity;
        this.z2 = z;
        this.l1 = list;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0211000_15(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2, boolean z, List<String> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = twoStepVerificationActivityViewModel;
        this.z2 = twoStepVerificationActivityViewModel2;
        this.l1 = z;
        this.i3 = list;
    }
}
