package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CE4 extends CEA {
    public final GetSubInfoResponse LIZ;
    public final String LIZIZ;
    public final InterfaceC88471Ynr<String, Long, SpannableStringBuilder> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    @Override // X.CEA
    public final int LIZIZ() {
        return R.string.o__;
    }

    @Override // X.CEA
    public final int LIZJ() {
        return R.string.o_a;
    }

    @Override // X.CEA
    public final int LIZLLL() {
        return R.string.o_b;
    }

    @Override // X.CEA
    public final boolean LJFF() {
        return true;
    }

    @Override // X.CEA
    public final boolean LJ() {
        Boolean bool;
        GetSubInfoResponse getSubInfoResponse = this.LIZ;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.showSubOnlyLiveBanner);
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        boolean LJIL = C29306Beo.LJIL(InterfaceC30442Bx8.LJLI.LIZ());
        boolean LJ = o.LJ(this.LIZIZ, "live_take_page");
        if (LJJIFFI && LJIL && LJ) {
            return true;
        }
        return false;
    }

    @Override // X.CEA
    public final void LIZ(CE3 ce3) {
        ce3.LJLIL.setVisibility(0);
        C47121t6 c47121t6 = ce3.LJLJJI;
        InterfaceC88471Ynr<String, Long, SpannableStringBuilder> interfaceC88471Ynr = this.LIZJ;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o_a);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_su…Settings_tipSection_desc)");
        c47121t6.setText(interfaceC88471Ynr.invoke(LJIILJJIL, 30L));
        C16880lQ.LJIJ(ce3.LJLJJL, new ACListenerS40S0200000_5(this, ce3, 70));
        C16880lQ.LJJIIZ(ce3.LJLJJLL, new ACListenerS25S0100000_5(this, 377));
        C28770BQw.LIZIZ(this.LIZIZ, this.LJFF, this.LJ);
    }

    public CE4(GetSubInfoResponse getSubInfoResponse, String enterFrom, C30980CDw c30980CDw, AqS152S0200000_5 aqS152S0200000_5) {
        Boolean bool;
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = getSubInfoResponse;
        this.LIZIZ = enterFrom;
        this.LIZJ = c30980CDw;
        this.LIZLLL = aqS152S0200000_5;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.qualification);
        } else {
            bool = null;
        }
        this.LJ = C29306Beo.LJJIFFI(bool);
        this.LJFF = "sub_only_live";
    }
}
