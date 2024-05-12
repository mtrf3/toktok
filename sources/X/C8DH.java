package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.explore.ui.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.ui.Explore2TabFeedFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;

/* renamed from: X.8DH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DH implements View.OnClickListener, InterfaceC56322M8o {
    public final ActivityC45651qj LJLIL;

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "explore";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null && (lifecycle = activityC45651qj.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null) {
            return currentState.isAtLeast(Lifecycle.State.RESUMED);
        }
        return false;
    }

    public C8DH(Context context) {
        this.LJLIL = C45804HyK.LJJIFFI(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseExploreFeedFragment baseExploreFeedFragment;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj == null) {
            return;
        }
        if (o.LJ(C116694i1.LIZ(activityC45651qj).nv0(), "homepage_explore")) {
            Fragment Ja = C116694i1.LIZ(this.LJLIL).Ja("homepage_explore");
            if (!(Ja instanceof Explore2TabFeedFragment) || (baseExploreFeedFragment = (BaseExploreFeedFragment) Ja) == null) {
                return;
            }
            C8AS c8as = (C8AS) baseExploreFeedFragment.Gl().getState();
            c8as.getClass();
            if (c8as.getListState().LJLIL instanceof C72922tc) {
                return;
            }
            LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0();
            if (Xm0 != null) {
                Xm0.LJJ("homepage_explore");
            }
            baseExploreFeedFragment.ub(true);
            return;
        }
        C206978Aj.LIZJ("click_button_icon", MainPageFragmentImpl.LJI().LJJLIIIJJI(), null, 8);
        TabChangeManager LIZ = C116694i1.LIZ(this.LJLIL);
        if (!o.LJ("homepage_explore", LIZ.nv0())) {
            TabChangeManager.jv0(LIZ, "homepage_explore", false, 30);
        }
        ActivityC45651qj activityC45651qj2 = this.LJLIL;
        if (activityC45651qj2 != null) {
            C84193Sd.LIZ(activityC45651qj2).tv0(false);
        }
    }
}
