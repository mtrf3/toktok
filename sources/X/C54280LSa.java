package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.LSa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54280LSa extends AnimatorListenerAdapter {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ SocialFriendsFeedFragment LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        ActivityC45651qj mo49getActivity;
        Window window;
        ColorDrawable colorDrawable;
        Integer LJI;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (this.LJLIL > this.LJLILLLLZI && e1.LIZ(31744, "is_release_window_background", true, true) && (mo49getActivity = this.LJLJI.mo49getActivity()) != null && (window = mo49getActivity.getWindow()) != null) {
            Context context = this.LJLJI.getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.d4, context)) != null) {
                colorDrawable = new ColorDrawable(LJI.intValue());
            } else {
                colorDrawable = null;
            }
            window.setBackgroundDrawable(colorDrawable);
        }
    }

    public C54280LSa(float f, float f2, SocialFriendsFeedFragment socialFriendsFeedFragment) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = socialFriendsFeedFragment;
    }
}
