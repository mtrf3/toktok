package Y;

import X.C29701Eo;
import X.C93803aWl;
import android.animation.Animator;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionLottieAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDAListenerS84S0100000_42 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
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
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
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
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS84S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(IDAListenerS84S0100000_42 iDAListenerS84S0100000_42, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C93803aWl c93803aWl = (C93803aWl) iDAListenerS84S0100000_42.l0;
        c93803aWl.LIZLLL = false;
        c93803aWl.invalidateSelf();
    }

    public static final void onAnimationEnd$0(IDAListenerS84S0100000_42 iDAListenerS84S0100000_42, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C93803aWl c93803aWl = (C93803aWl) iDAListenerS84S0100000_42.l0;
        c93803aWl.LIZLLL = false;
        c93803aWl.invalidateSelf();
    }

    public static final void onAnimationEnd$1(IDAListenerS84S0100000_42 iDAListenerS84S0100000_42, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((MusicRecognitionLottieAssem) iDAListenerS84S0100000_42.l0).LJLJI;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo2 = ((MusicRecognitionLottieAssem) iDAListenerS84S0100000_42.l0).LJLJI;
        if (c29701Eo2 != null) {
            c29701Eo2.setMinAndMaxFrame(81, 215);
        }
        C29701Eo c29701Eo3 = ((MusicRecognitionLottieAssem) iDAListenerS84S0100000_42.l0).LJLJI;
        if (c29701Eo3 != null) {
            c29701Eo3.setRepeatCount(-1);
        }
        C29701Eo c29701Eo4 = ((MusicRecognitionLottieAssem) iDAListenerS84S0100000_42.l0).LJLJI;
        if (c29701Eo4 != null) {
            c29701Eo4.playAnimation();
        }
    }
}
