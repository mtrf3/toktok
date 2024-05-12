package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LY4 extends AnimatorListenerAdapter {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ FollowSkyLightHelper LJLJI;
    public final /* synthetic */ View LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        WeakReference<ActivityC45651qj> weakReference;
        ActivityC45651qj activityC45651qj;
        Window window;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (this.LJLIL > this.LJLILLLLZI && e1.LIZ(31744, "is_release_window_background", true, true) && (weakReference = this.LJLJI.LJII) != null && (activityC45651qj = weakReference.get()) != null && (window = activityC45651qj.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(C1EU.LIZ(this.LJLJJI, "container.context", R.attr.d4)));
        }
    }

    public LY4(float f, float f2, FollowSkyLightHelper followSkyLightHelper, C110544Vm c110544Vm) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = followSkyLightHelper;
        this.LJLJJI = c110544Vm;
    }
}
