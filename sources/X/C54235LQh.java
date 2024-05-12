package X;

import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* renamed from: X.LQh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54235LQh implements LRI {
    public final /* synthetic */ C54234LQg LIZ;
    public final /* synthetic */ ScrollSwitchStateManager LIZIZ;
    public final /* synthetic */ MainAnimViewModel LIZJ;
    public final /* synthetic */ ActivityC45651qj LIZLLL;

    @Override // X.LRI
    public final void LIZIZ() {
        if (C54239LQl.LIZIZ.LIZ() > 0) {
            IMService.createIIMServicebyMonsterPlugin(false).getImShareAnalytics().LIZ("inbox_pop_up", "click");
        }
        this.LIZ.LJII(true);
        C54234LQg c54234LQg = this.LIZ;
        ScrollSwitchStateManager stateManager = this.LIZIZ;
        MainAnimViewModel mAnimViewModel = this.LIZJ;
        c54234LQg.getClass();
        o.LJIIIZ(stateManager, "stateManager");
        o.LJIIIZ(mAnimViewModel, "mAnimViewModel");
        if (!o.LJ("NOTIFICATION", c54234LQg.LJ.nv0())) {
            TabChangeManager.jv0(c54234LQg.LJ, "NOTIFICATION", true, 26);
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            O5Y.LJJIZ(c54234LQg.LIZJ.mo49getActivity());
            stateManager.tv0(false);
            AbsFragment absFragment = c54234LQg.LIZJ;
            o.LJII(absFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
            ((MainPageFragment) absFragment).qQ(true);
            C38987FRv.LJI(LSC.NOTICE);
        }
        c54234LQg.LIZLLL.LIZIZ();
    }

    @Override // X.LRI
    public final void onDismiss() {
        C54234LQg c54234LQg = this.LIZ;
        c54234LQg.LJIIJ = false;
        c54234LQg.LJIIL(EnumC54238LQk.POPUP_DISMISS);
    }

    @Override // X.LRI
    public final void onShow() {
        PublishTabAbility LJJJJJ;
        this.LIZ.LJIIJ = true;
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(this.LIZLLL);
        if (LJJLIIIJJI != null && (LJJJJJ = C77357UXp.LJJJJJ(LJJLIIIJJI)) != null) {
            LJJJJJ.OR();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnReadCountMonitor isShowNotifyPop: ");
        HH1.LIZIZ(LIZ, this.LIZ.LIZLLL.LJIIIZ, LIZ, "MainPageFragment");
    }

    @Override // X.LRI
    public final void onCancel() {
        if (L0W.LIZ()) {
            C54234LQg c54234LQg = this.LIZ;
            c54234LQg.LJIIJ = false;
            c54234LQg.LJIIL(EnumC54238LQk.POPUP_DISMISS);
        }
    }

    public C54235LQh(C54234LQg c54234LQg, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel, ActivityC45651qj activityC45651qj) {
        this.LIZ = c54234LQg;
        this.LIZIZ = scrollSwitchStateManager;
        this.LIZJ = mainAnimViewModel;
        this.LIZLLL = activityC45651qj;
    }
}
