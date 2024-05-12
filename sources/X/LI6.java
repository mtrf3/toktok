package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;

/* loaded from: classes10.dex */
public final class LI6 extends C95F {
    @Override // X.C95F
    public final View LIZIZ(ActivityC45651qj activityC45651qj) {
        LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0();
        if (Xm0 != null) {
            View LJIIJ = Xm0.LJIIJ("SOCIAL_NOWS");
            if (LJIIJ == null) {
                return Xm0.LJIIJ("FRIENDS_TAB");
            }
            return LJIIJ;
        }
        return null;
    }

    @Override // X.C95F
    public final boolean LIZJ(ActivityC45651qj activityC45651qj) {
        return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).hasSocialNow2Tab(activityC45651qj);
    }

    @Override // X.C95F
    public final boolean LIZLLL(ActivityC45651qj activityC45651qj) {
        LLQ Xm0;
        InterfaceC54132LMi homeTabViewModel = LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj);
        if (homeTabViewModel != null && (Xm0 = homeTabViewModel.Xm0()) != null && Xm0.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    @Override // X.C95F
    public final void LJ(Context context) {
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0()) != null) {
            Xm0.LJJIJL("FRIENDS_TAB");
        }
    }
}
