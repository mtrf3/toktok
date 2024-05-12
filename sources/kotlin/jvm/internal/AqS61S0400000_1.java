package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C109544Rq;
import X.C112874br;
import X.C48841JEv;
import X.C67342kc;
import X.C73305Spp;
import X.C76800UCe;
import X.EnumC112954bz;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.OSZ;
import X.XJL;
import X.XKS;
import X.XKX;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class AqS61S0400000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AqS61S0400000_1 aqS61S0400000_1) {
        ((C73305Spp) aqS61S0400000_1.l0).setVisibility(8);
        if (!((XJL) aqS61S0400000_1.l1).isCompleted()) {
            XKX.LIZLLL(C48841JEv.LIZ(((XJL) aqS61S0400000_1.l1).getContext()), null, null, new C67342kc((XJL) aqS61S0400000_1.l1, (InterfaceC88473Ynt) aqS61S0400000_1.l2, (C73305Spp) aqS61S0400000_1.l0, (InterfaceC88472Yns) aqS61S0400000_1.l3, null), 3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS61S0400000_1 aqS61S0400000_1) {
        ((C112874br) aqS61S0400000_1.l0).LJFF((C109544Rq) aqS61S0400000_1.l1, (UrlModel) aqS61S0400000_1.l2, (EnumC112954bz) aqS61S0400000_1.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS61S0400000_1 aqS61S0400000_1) {
        o.LJII((Set) aqS61S0400000_1.l1, "null cannot be cast to non-null type java.util.Set<kotlin.String>");
        Object obj = aqS61S0400000_1.l0;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        ((List) aqS61S0400000_1.l3).add(new OSZ(obj, ((InterfaceC88472Yns) aqS61S0400000_1.l2).invoke(obj)));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0400000_1(C109544Rq c109544Rq, UrlModel urlModel, EnumC112954bz enumC112954bz, C112874br c112874br, int i) {
        super(0);
        this.$t = i;
        this.l0 = c112874br;
        this.l1 = c109544Rq;
        this.l2 = urlModel;
        this.l3 = enumC112954bz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0400000_1(C73305Spp c73305Spp, XKS xks, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = c73305Spp;
        this.l1 = xks;
        this.l2 = interfaceC88473Ynt;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0400000_1(Object obj, Set set, AqS49S1200000_7 aqS49S1200000_7, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = obj;
        this.l1 = set;
        this.l2 = aqS49S1200000_7;
        this.l3 = list;
    }
}
