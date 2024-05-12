package Y;

import X.AbstractC54111LLn;
import X.AnonymousClass391;
import X.C26338AVi;
import X.C32151Nz;
import X.C51029K0z;
import X.C57186McQ;
import X.C57208Mcm;
import X.C57596Mj2;
import X.EnumC57365MfJ;
import X.O6R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ALAdapterS7S0200000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationRepeat$0(this, animator);
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((MainPageBusinessAssem) aLAdapterS7S0200000_9.l0).LJLLL.remove((ValueAnimator) aLAdapterS7S0200000_9.l1);
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL((VideoMusicCoverAssem) aLAdapterS7S0200000_9.l0)).getAweme())) {
            ((ObjectAnimator) aLAdapterS7S0200000_9.l1).start();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aLAdapterS7S0200000_9.l0).LLIIJI;
        if (frameLayout != null) {
            C57208Mcm c57208Mcm = (C57208Mcm) aLAdapterS7S0200000_9.l1;
            C26338AVi.LJIIIZ(frameLayout, AnonymousClass391.LIZJ(c57208Mcm.LJLILLLLZI), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c57208Mcm.LJLIL)))), null, 26);
            if (c57208Mcm.LJLJJLL == 0) {
                C26338AVi.LJI(frameLayout, null, null, 0, null, false, 27);
            }
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C57596Mj2) aLAdapterS7S0200000_9.l0).LIZJ((RecUser) aLAdapterS7S0200000_9.l1);
        ((C57596Mj2) aLAdapterS7S0200000_9.l0).LJIIIIZZ(EnumC57365MfJ.SHOW);
    }

    public static final void onAnimationEnd$4(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC54111LLn abstractC54111LLn = (AbstractC54111LLn) aLAdapterS7S0200000_9.l0;
        if (!abstractC54111LLn.LJFF) {
            abstractC54111LLn.LIZ.setTabIconVisibility(0);
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!((AbstractC54111LLn) aLAdapterS7S0200000_9.l0).LJFF) {
            ((ValueAnimator) aLAdapterS7S0200000_9.l1).setRepeatCount(0);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS7S0200000_9 aLAdapterS7S0200000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
    }

    public ALAdapterS7S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
