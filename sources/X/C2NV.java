package X;

import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.share.ShareDependService;
import kotlin.jvm.internal.o;

/* renamed from: X.2NV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NV {
    public final IDR LIZ;
    public final C54258LRe LIZIZ;
    public final Handler LIZJ;
    public final ARunnableS37S0100000_1 LIZLLL;

    public final boolean LIZ() {
        ActivityC45651qj activityC45651qj;
        Aweme LIZIZ;
        if (this.LIZIZ.LJ() || this.LIZIZ.LIZLLL() || this.LIZIZ.LIZIZ() || this.LIZIZ.LIZ("login_panel") || !(!this.LIZIZ.LIZ("permission_dialog"))) {
            return false;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (!(LJIIIIZZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) == null || (LIZIZ = LNH.LIZIZ(activityC45651qj)) == null || LIZIZ.isAd() || C57122Ma.LIZ || !C2MZ.LIZIZ().getBoolean("shouldShowSwipeUpGuide1", true)) {
            return false;
        }
        IDR idr = this.LIZ;
        if ((!(idr instanceof BaseListFragmentPanel) || !((BaseListFragmentPanel) idr).isInMainPage()) && this.LIZ.getItemCount() - 1 == this.LIZ.getViewPager().getCurrentItem()) {
            return false;
        }
        ShareDependService.LIZ.getClass();
        if (!C44498HdG.LIZ().LJIILJJIL()) {
            return false;
        }
        if (((((RBX) HG3.LJIILL()).isNewUser() || ((Boolean) C2RE.LIZJ.getValue()).booleanValue()) && !((RBX) HG3.LJIILL()).isNewUser()) || C2NW.LIZ().LJIILLIIL(C100713xL.LJLIL)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        if (LIZ() && !C2MZ.LIZ()) {
            this.LIZ.showStrengthenGuideInternal();
            C2MZ.LIZIZ().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
        }
    }

    public C2NV(IDR panel, C54258LRe c54258LRe) {
        o.LJIIIZ(panel, "panel");
        this.LIZ = panel;
        this.LIZIZ = c54258LRe;
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
        this.LIZLLL = new ARunnableS37S0100000_1(this, 69);
    }
}
