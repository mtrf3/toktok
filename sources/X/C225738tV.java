package X;

import Y.ACallableS2S1000000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.feed.assem.friendstab.GoToFriendsGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225738tV extends AbstractC65781Prl implements InterfaceC88474Ynu<GoToFriendsGuideAssem, C43I<? extends C76800UCe>, C43I<? extends C76800UCe>, C43I<? extends C76800UCe>, C76800UCe> {
    public C225738tV() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(GoToFriendsGuideAssem goToFriendsGuideAssem, C43I<? extends C76800UCe> c43i, C43I<? extends C76800UCe> c43i2, C43I<? extends C76800UCe> c43i3) {
        final GoToFriendsGuideAssem selectSubscribe = goToFriendsGuideAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LLIFFJFJJ && !selectSubscribe.LLII && selectSubscribe.getContainerView().getVisibility() != 0 && C226068u2.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), EnumC61832bj.MASK_VIEW) && (!C53324KwK.LIZ() || c43i != null || c43i2 != null || c43i3 != null)) {
            selectSubscribe.LLII = true;
            final float alpha = selectSubscribe.getContainerView().getAlpha();
            selectSubscribe.getContainerView().setAlpha(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C55953Lxd.LJIIJ());
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 29));
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.8te
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    GoToFriendsGuideAssem.this.getContainerView().setAlpha(alpha);
                }
            });
            ofFloat.start();
            C17N.LJJLIIIJJI(selectSubscribe.getContainerView());
            LXS LIZ = LXU.LIZ();
            if (LIZ != null) {
                LIZ.LJFF(true);
            }
            C29701Eo c29701Eo = selectSubscribe.LLFZ;
            if (c29701Eo != null) {
                c29701Eo.playAnimation();
            }
            C10K.LIZJ(new ACallableS2S1000000_3("show", 1));
        }
        return C76800UCe.LIZ;
    }
}
