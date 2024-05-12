package X;

import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OO4 implements Animator.AnimatorListener {
    public final boolean LJLIL;
    public final /* synthetic */ OO3 LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        View view;
        String str;
        View view2;
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL) {
            OO3 oo3 = this.LJLILLLLZI;
            oo3.LJIJ(oo3.LJIL, 1.0f);
            this.LJLILLLLZI.LJIILLIIL(1.0f);
            this.LJLILLLLZI.LJIIZILJ(1.0f);
            this.LJLILLLLZI.LJIIIZ(true);
            OO3 oo32 = this.LJLILLLLZI;
            oo32.LJIIJJI = true;
            OO8 oo8 = oo32.LJJJ;
            if (oo8 != null) {
                oo8.LJIILIIL();
            }
            View view3 = this.LJLILLLLZI.LJJIIJZLJL;
            if (view3 != null && view3.getVisibility() == 0 && (view2 = this.LJLILLLLZI.LJJIIJZLJL) != null) {
                view2.setVisibility(4);
            }
            View view4 = this.LJLILLLLZI.LJJIIZ;
            if (view4 != null) {
                view4.setClickable(true);
            }
            HomePageViewPagerAbility homePageViewPagerAbility = this.LJLILLLLZI.LJJJJIZL;
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.LJJJJZ(false);
            }
        } else {
            OO3 oo33 = this.LJLILLLLZI;
            oo33.LJIJ(oo33.LJIL, 0.0f);
            this.LJLILLLLZI.LJIILLIIL(0.0f);
            this.LJLILLLLZI.LJIIZILJ(0.0f);
            View view5 = this.LJLILLLLZI.LJJIIZ;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            OO3 oo34 = this.LJLILLLLZI;
            oo34.LJIIJJI = false;
            View view6 = oo34.LJJIIJZLJL;
            if (view6 != null && view6.getVisibility() == 4 && (view = this.LJLILLLLZI.LJJIIJZLJL) != null) {
                view.setVisibility(0);
            }
            View view7 = this.LJLILLLLZI.LJJIIZ;
            if (view7 != null) {
                view7.setClickable(false);
            }
            HomePageViewPagerAbility homePageViewPagerAbility2 = this.LJLILLLLZI.LJJJJIZL;
            if (homePageViewPagerAbility2 != null) {
                homePageViewPagerAbility2.LJJJJZ(true);
            }
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLILLLLZI.LJJIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.LJFF(str, new OMH(OBQ.BACKGROUND.getType(), this.LJLILLLLZI.LJIIJJI));
        Aweme aweme2 = this.LJLILLLLZI.LJJIL;
        if (aweme2 != null) {
            boolean z = this.LJLIL;
            String aid = aweme2.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            C2U8.LIZ(new C56458MDu(z, aid));
        }
    }

    public OO4(OO3 oo3, boolean z) {
        this.LJLILLLLZI = oo3;
        this.LJLIL = z;
    }
}
