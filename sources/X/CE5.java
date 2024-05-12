package X;

import Y.ACListenerS25S0100000_5;
import com.bytedance.android.livesdk.chatroom.api.AnchorEmailInfo;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CE5 extends CEA {
    public final GetSubInfoResponse LIZ;
    public final Boolean LIZIZ;
    public final String LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.CEA
    public final boolean LJFF() {
        return false;
    }

    @Override // X.CEA
    public final int LIZIZ() {
        if (o.LJ(this.LIZIZ, Boolean.FALSE)) {
            return R.string.mc2;
        }
        return R.string.mc0;
    }

    @Override // X.CEA
    public final int LIZJ() {
        if (o.LJ(this.LIZIZ, Boolean.FALSE)) {
            return R.string.mc3;
        }
        return R.string.mbz;
    }

    @Override // X.CEA
    public final int LIZLLL() {
        if (o.LJ(this.LIZIZ, Boolean.FALSE)) {
            return R.string.mc4;
        }
        return R.string.mc1;
    }

    @Override // X.CEA
    public final boolean LJ() {
        Boolean bool;
        AnchorEmailInfo anchorEmailInfo;
        boolean LJIL = C29306Beo.LJIL(InterfaceC30442Bx8.LJLIIIL.LIZ());
        GetSubInfoResponse getSubInfoResponse = this.LIZ;
        if (getSubInfoResponse != null && (anchorEmailInfo = getSubInfoResponse.anchorEmailInfo) != null) {
            bool = Boolean.valueOf(anchorEmailInfo.isAuthorizationEnabled);
        } else {
            bool = null;
        }
        boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool);
        if (LJIL && (LJIILLIIL || C29306Beo.LJIILLIIL(this.LIZIZ))) {
            return true;
        }
        return false;
    }

    @Override // X.CEA
    public final void LIZ(CE3 ce3) {
        String str;
        Boolean bool;
        C16880lQ.LJIJ(ce3.LJLJJL, new ACListenerS25S0100000_5(ce3, 375));
        C16880lQ.LJJIIZ(ce3.LJLJJLL, new ACListenerS25S0100000_5(this, 376));
        ce3.LJLIL.setVisibility(0);
        if (o.LJ(this.LIZIZ, Boolean.FALSE)) {
            str = "set_up";
        } else {
            str = "verify";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_email_banner_show");
        LIZ.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        GetSubInfoResponse getSubInfoResponse = this.LIZ;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.qualification);
        } else {
            bool = null;
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJJIFFI(bool))) ? 1 : 0), "is_opt_in");
        C06490Nh.LIZLLL(LIZ, this.LIZJ, "show_entrance", str, "status");
    }

    public CE5(GetSubInfoResponse getSubInfoResponse, Boolean bool, String enterFrom, AqS155S0100000_5 aqS155S0100000_5) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = getSubInfoResponse;
        this.LIZIZ = bool;
        this.LIZJ = enterFrom;
        this.LIZLLL = aqS155S0100000_5;
    }
}
