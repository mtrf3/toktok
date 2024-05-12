package Y;

import X.InterfaceC65784Pro;
import X.KUP;
import android.animation.Animator;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDAListenerS75S0100000_7 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animator) {
    }

    public static final void onAnimationRepeat$0(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animator) {
    }

    public static final void onAnimationStart$0(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS75S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animator) {
        ((KUP) iDAListenerS75S0100000_7.l0).setBackground(null);
    }

    public static final void onAnimationEnd$1(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) iDAListenerS75S0100000_7.l0).LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.Sv0(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE);
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS75S0100000_7 iDAListenerS75S0100000_7, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS75S0100000_7.l0).invoke();
    }
}
