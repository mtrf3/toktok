package X;

import android.animation.Animator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJ4 implements Animator.AnimatorListener {
    public final /* synthetic */ RssIntroAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

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
        o.LJIIIZ(animator, "animator");
        RssIntroAssem rssIntroAssem = this.LJLIL;
        TuxTextView tuxTextView = rssIntroAssem.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setText(C86V.LJFF(rssIntroAssem.LJLJJLL[this.LJLILLLLZI].intValue()));
        }
        RssIntroAssem rssIntroAssem2 = this.LJLIL;
        TuxTextView tuxTextView2 = rssIntroAssem2.LJLLI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(C86V.LJFF(rssIntroAssem2.LJLJL[this.LJLILLLLZI].intValue()));
    }

    public AJ4(RssIntroAssem rssIntroAssem, int i) {
        this.LJLIL = rssIntroAssem;
        this.LJLILLLLZI = i;
    }
}
