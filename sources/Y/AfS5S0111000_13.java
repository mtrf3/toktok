package Y;

import X.C0NB;
import X.C28467BFf;
import X.C76258TwM;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76324TxQ;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS5S0111000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS5S0111000_13 afS5S0111000_13, Object obj) {
        C28467BFf<C76800UCe> it = (C28467BFf) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJJJ(it, afS5S0111000_13.z1);
        C76265TwT.LJII(afS5S0111000_13.i2, "cancel_success");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS5S0111000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$1(AfS5S0111000_13 afS5S0111000_13, Object obj) {
        C76272Twa.LJJJJL("other", (HashMap) afS5S0111000_13.l0, afS5S0111000_13.z1);
        C76265TwT.LJII(afS5S0111000_13.i2, "reject");
        C76324TxQ.LIZJ();
    }

    public static final void accept$2(AfS5S0111000_13 afS5S0111000_13, Object obj) {
        if (((C76258TwM) afS5S0111000_13.l0).LJLILLLLZI == 0) {
            return;
        }
        C76272Twa.LJJJJL("normal", null, afS5S0111000_13.z1);
        C0NB.LJIIIZ("InteractBattleTAG", "reject, success");
        C76265TwT.LJII(afS5S0111000_13.i2, "reject_success");
        C76324TxQ.LIZJ();
    }

    public static final void accept$3(AfS5S0111000_13 afS5S0111000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (((C76258TwM) afS5S0111000_13.l0).LJLILLLLZI == 0) {
            return;
        }
        C0NB.LJIIIZ("InteractBattleTAG", "reject, failed");
        C76272Twa.LJJJJJ(afS5S0111000_13.z1, "normal", th, null);
        C76265TwT.LJII(afS5S0111000_13.i2, "reject_failed");
        C76324TxQ.LIZJ();
        C76258TwM c76258TwM = (C76258TwM) afS5S0111000_13.l0;
        o.LJI(th);
        C0NB.LJIIJ(6, c76258TwM.LJLIL, th.getStackTrace());
        ((InteractPkBeInvitedContract$View) ((C76258TwM) afS5S0111000_13.l0).LJLILLLLZI).xl(th);
    }

    public AfS5S0111000_13(int i, Object obj, boolean z, int i2) {
        this.$t = i2;
        this.z1 = z;
        this.l0 = obj;
        this.i2 = i;
    }
}
