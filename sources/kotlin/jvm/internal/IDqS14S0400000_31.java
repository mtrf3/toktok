package kotlin.jvm.internal;

import X.APL;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.SAK;
import com.ss.android.ugc.aweme.bnpl.BNPLServiceImpl;

/* loaded from: classes20.dex */
public class IDqS14S0400000_31 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS14S0400000_31 iDqS14S0400000_31, Object obj, Object obj2, Object obj3) {
        String verifyStatus = (String) obj;
        String pageId = (String) obj2;
        o.LJIIIZ(verifyStatus, "verifyStatus");
        o.LJIIIZ(pageId, "pageId");
        ((BNPLServiceImpl) iDqS14S0400000_31.l0).LIZLLL((ActivityC45651qj) iDqS14S0400000_31.l1, verifyStatus, (String) obj3, pageId, (APL) iDqS14S0400000_31.l2, (InterfaceC88472Yns) iDqS14S0400000_31.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS14S0400000_31 iDqS14S0400000_31, Object obj, Object obj2, Object obj3) {
        String status = (String) obj;
        String pageId = (String) obj2;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(pageId, "pageId");
        ((BNPLServiceImpl) iDqS14S0400000_31.l0).LIZLLL((ActivityC45651qj) iDqS14S0400000_31.l1, status, (String) obj3, pageId, (APL) iDqS14S0400000_31.l2, (InterfaceC88472Yns) iDqS14S0400000_31.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS14S0400000_31(BNPLServiceImpl bNPLServiceImpl, BNPLServiceImpl bNPLServiceImpl2, ActivityC45651qj activityC45651qj, APL apl, InterfaceC88472Yns<? super SAK, C76800UCe> interfaceC88472Yns) {
        super(3);
        this.$t = interfaceC88472Yns;
        this.l0 = bNPLServiceImpl;
        this.l1 = bNPLServiceImpl2;
        this.l2 = activityC45651qj;
        this.l3 = apl;
    }
}
