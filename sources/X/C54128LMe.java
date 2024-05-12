package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LMe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54128LMe implements LMQ {
    public final LNP LJLIL;
    public View LJLILLLLZI;
    public final DmNoticeProxy LJLJI;
    public final String LJLJJI;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388613;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final boolean enabled() {
        return false;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final View LJII() {
        LNP lnp = this.LJLIL;
        o.LJI(lnp);
        if (lnp.getActivity() == null) {
            return null;
        }
        if (C35056DpM.LIZ == 2) {
            HomePageUIFrameService LIZ = HomePageUIFrameServiceImpl.LIZ();
            ActivityC45651qj activity = this.LJLIL.getActivity();
            o.LJI(activity);
            View dmEntranceView = LIZ.dmEntranceView(activity);
            this.LJLILLLLZI = dmEntranceView;
            if (dmEntranceView == null) {
                return null;
            }
            ViewParent parent = dmEntranceView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(this.LJLILLLLZI, (ViewGroup) parent);
        } else {
            HomePageUIFrameService LIZ2 = HomePageUIFrameServiceImpl.LIZ();
            ActivityC45651qj activity2 = this.LJLIL.getActivity();
            o.LJI(activity2);
            this.LJLILLLLZI = LIZ2.buildNoticeIcon(activity2);
        }
        return this.LJLILLLLZI;
    }

    @Override // X.LMQ, X.LM4
    public final void onResume() {
        LNP lnp;
        if (this.LJLILLLLZI != null && (lnp = this.LJLIL) != null) {
            this.LJLJI.LJ(lnp.LLLLLZ());
        }
    }

    @Override // X.LMQ, X.LM4
    public final void onDestroyView() {
        EventBus.LIZJ().LJIJ(this);
        if (this.LJLILLLLZI != null) {
            this.LJLJI.LIZLLL("homepage_hot");
        }
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJJI;
    }

    public C54128LMe(LNP lnp) {
        this.LJLIL = lnp;
        DmNoticeProxy LJI = DmNoticeProxyImpl.LJI();
        o.LJIIIIZZ(LJI, "get().getService(DmNoticeProxy::class.java)");
        this.LJLJI = LJI;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJJI = LMF.DM_NOTICE.getTag();
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        Bundle bundle = new Bundle();
        LNP lnp = this.LJLIL;
        o.LJI(lnp);
        bundle.putString("enter_from", lnp.LLLLLZ());
        bundle.putString("enter_method", "button");
        bundle.putString("notice_type", this.LJLJI.LLIIJI());
        bundle.putInt("message_cnt", this.LJLJI.LIZJ());
        HomePageUIFrameService LIZ = HomePageUIFrameServiceImpl.LIZ();
        ActivityC45651qj activity = this.LJLIL.getActivity();
        o.LJI(activity);
        LIZ.openSessionListActivity(activity, bundle);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(C3K2 c3k2) {
        if (this.LJLILLLLZI != null && this.LJLJI.LIZIZ()) {
            View view = this.LJLILLLLZI;
            o.LJI(view);
            view.setVisibility(8);
        }
    }
}
