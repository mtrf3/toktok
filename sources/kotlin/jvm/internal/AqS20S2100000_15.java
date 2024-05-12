package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C85704XkK;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS20S2100000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS20S2100000_15 aqS20S2100000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        actionGroup.LJII(aqS20S2100000_15.s0, new AqS68S1100000_15((TwoStepVerificationDetailFragment) aqS20S2100000_15.l2, aqS20S2100000_15.s1, 2));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS20S2100000_15 aqS20S2100000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS20S2100000_15.s0, new AqS181S0100000_15((C85704XkK) aqS20S2100000_15.l2, 235));
        actionGroup.LJIIIZ(aqS20S2100000_15.s1, new AqS181S0100000_15((C85704XkK) aqS20S2100000_15.l2, 236));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S2100000_15(String str, String str2, C85704XkK c85704XkK, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c85704XkK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S2100000_15(String str, String str2, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = twoStepVerificationDetailFragment;
    }
}
