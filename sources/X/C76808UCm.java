package X;

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.MatchSpeedChallengeAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.UCm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76808UCm implements Animator.AnimatorListener {
    public final /* synthetic */ MatchSpeedChallengeAssem LJLIL;
    public final /* synthetic */ C76811UCp LJLILLLLZI;
    public final /* synthetic */ SpannableStringBuilder LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
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
    public final void onAnimationEnd(Animator animator) {
        int measuredWidth;
        o.LJIIIZ(animator, "animator");
        if (this.LJLIL.LJLL) {
            U5I.LIZIZ(this.LJLILLLLZI.LIZ, this.LJLJI);
            this.LJLIL.N3(this.LJLILLLLZI.LIZJ);
            if (this.LJLIL.LJLL) {
                ViewGroup viewGroup = this.LJLILLLLZI.LIZJ;
                if (this.LJLJJI) {
                    measuredWidth = this.LJLJJL;
                } else {
                    measuredWidth = viewGroup.getMeasuredWidth();
                }
                C78866UxK.LJJLJ(measuredWidth, viewGroup);
            }
        }
    }

    public C76808UCm(MatchSpeedChallengeAssem matchSpeedChallengeAssem, C76811UCp c76811UCp, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
        this.LJLIL = matchSpeedChallengeAssem;
        this.LJLILLLLZI = c76811UCp;
        this.LJLJI = spannableStringBuilder;
        this.LJLJJI = z;
        this.LJLJJL = i;
    }
}
