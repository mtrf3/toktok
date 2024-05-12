package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CE6 extends CEA {
    public final String LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    @Override // X.CEA
    public final int LIZIZ() {
        return R.string.odf;
    }

    @Override // X.CEA
    public final int LIZJ() {
        return R.string.odg;
    }

    @Override // X.CEA
    public final int LIZLLL() {
        return R.string.odh;
    }

    @Override // X.CEA
    public final boolean LJFF() {
        return true;
    }

    @Override // X.CEA
    public final boolean LJ() {
        return C29306Beo.LJIL(InterfaceC30442Bx8.LJL.LIZ());
    }

    @Override // X.CEA
    public final void LIZ(CE3 ce3) {
        ce3.LJLIL.setVisibility(0);
        C16880lQ.LJIJ(ce3.LJLJJL, new ACListenerS40S0200000_5(this, ce3, 69));
        C16880lQ.LJJIIZ(ce3.LJLJJLL, new ACListenerS25S0100000_5(this, 374));
        C28770BQw.LIZIZ(this.LIZ, this.LIZLLL, this.LIZJ);
    }

    public CE6(GetSubInfoResponse getSubInfoResponse, String enterFrom, AqS155S0100000_5 aqS155S0100000_5) {
        Boolean bool;
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = enterFrom;
        this.LIZIZ = aqS155S0100000_5;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.qualification);
        } else {
            bool = null;
        }
        this.LIZJ = C29306Beo.LJJIFFI(bool);
        this.LIZLLL = "about_me";
    }
}
