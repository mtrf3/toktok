package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C37090Eh4;
import X.C39489Fef;
import X.C70208Rgy;
import X.C76800UCe;
import X.C780334l;
import X.C82733WdV;
import X.ECR;
import X.ECT;
import X.InterfaceC39499Fep;
import X.InterfaceC88472Yns;
import X.XKX;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class AqS59S1100000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS59S1100000_6 aqS59S1100000_6, Object it) {
        o.LJIIIZ(it, "it");
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null) {
            localTestApi.copyContent(aqS59S1100000_6.s0, ((C82733WdV) aqS59S1100000_6.l1).itemView.getContext());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS59S1100000_6 aqS59S1100000_6, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.fn4, new AqS59S1100000_6(aqS59S1100000_6.s0, (C82733WdV) aqS59S1100000_6.l1, 0));
        actionGroup.LJ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS59S1100000_6 aqS59S1100000_6, Object it) {
        o.LJIIIZ(it, "it");
        ECT ect = ((C70208Rgy) aqS59S1100000_6.l1).LJLJJL;
        String str = aqS59S1100000_6.s0;
        if (str == null) {
            ect.getClass();
        } else if (!((ArrayList) ect.LIZIZ).contains(str)) {
            ((ArrayList) ect.LIZJ).add(str);
            if (ect.LIZLLL == null || (!r0.isActive())) {
                ect.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, null, null, new ECR(ect, null), 3);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS59S1100000_6 aqS59S1100000_6, Object obj) {
        InterfaceC39499Fep listener = (InterfaceC39499Fep) obj;
        o.LJIIIZ(listener, "listener");
        listener.LIZJ((C39489Fef) aqS59S1100000_6.l1, aqS59S1100000_6.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S1100000_6(C70208Rgy c70208Rgy, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70208Rgy;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S1100000_6(String str, C39489Fef c39489Fef, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c39489Fef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S1100000_6(String str, C82733WdV c82733WdV, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c82733WdV;
    }
}
