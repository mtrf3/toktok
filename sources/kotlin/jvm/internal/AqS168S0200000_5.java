package kotlin.jvm.internal;

import X.AbstractC31467CWp;
import X.AbstractC31476CWy;
import X.AbstractC65781Prl;
import X.C31472CWu;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.game.model.UserInfo;

/* loaded from: classes6.dex */
public class AqS168S0200000_5 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS168S0200000_5(C31472CWu c31472CWu, C31472CWu c31472CWu2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.$t = interfaceC65784Pro;
        this.l0 = c31472CWu;
        this.l1 = c31472CWu2;
    }

    public static final Object invoke$0(AqS168S0200000_5 aqS168S0200000_5, Object it, Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        o.LJIIIZ(it, "it");
        if (userInfo != null) {
            ((GamePartnershipService) aqS168S0200000_5.l1).LIZ().LIZLLL = userInfo;
        }
        ((InterfaceC88472Yns) aqS168S0200000_5.l0).invoke(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS168S0200000_5 aqS168S0200000_5, Object obj, Object obj2) {
        AbstractC31476CWy<? extends AbstractC31467CWp> pendingBadgeHolder = (AbstractC31476CWy) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(pendingBadgeHolder, "pendingBadgeHolder");
        ((C31472CWu) aqS168S0200000_5.l0).LJIILIIL(pendingBadgeHolder, (InterfaceC65784Pro) aqS168S0200000_5.l1, booleanValue, true);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS168S0200000_5(GamePartnershipService gamePartnershipService, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = gamePartnershipService;
    }
}
