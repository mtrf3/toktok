package X;

import Y.ACListenerS29S0100000_9;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LQ3 extends C56766MPq {
    public View LJLJI;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(LQ4.LJLIL);
    public final C54072LKa LJLJJI = new C54072LKa();

    public final DmNoticeProxy LJIIL() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-dmNoticeProxy>(...)");
        return (DmNoticeProxy) value;
    }

    @Override // X.C56766MPq
    public final void LJ() {
        LJIIL().LIZLLL("notification_page");
    }

    @Override // X.C56766MPq
    public final void LJII() {
        LJIIL().LJ("notification_page");
    }

    public final void LJIILIIL() {
        if (C54362LVe.LJI().LIZIZ()) {
            View view = this.LJLJI;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.LJLJI;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    @Override // X.C56766MPq
    public final void LIZLLL() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.C56766MPq
    public final void LIZJ(Bundle bundle) {
        C42625Go9.LIZIZ(this);
        this.LJLJJI.LIZIZ(LIZ().getArguments(), LIZ().mo49getActivity());
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(C3K2 event) {
        o.LJIIIZ(event, "event");
        LJIILIIL();
    }

    @Override // X.C56766MPq
    public final void LJIIIZ(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        if (!C1DH.LJIJJLI() && !INB.LIZIZ()) {
            View dmEntranceView = IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().getDmEntranceView(LIZ().getContext(), "notification_page");
            this.LJLJI = dmEntranceView;
            if (dmEntranceView != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 150), dmEntranceView);
                ((ViewGroup) LJIIJJI(R.id.j5z)).addView(dmEntranceView);
                this.LJLJJI.getClass();
                if (C53765L8f.LJIILJJIL()) {
                    ViewGroup.LayoutParams layoutParams = dmEntranceView.getLayoutParams();
                    if (layoutParams != null) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        C221018lt.LJFF("InboxPageHelper", "adjustDMEntranceView");
                        layoutParams2.removeRule(21);
                        layoutParams2.addRule(20, -1);
                        layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                        layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                        dmEntranceView.setLayoutParams(layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                }
            }
        }
        LJIILIIL();
    }
}
