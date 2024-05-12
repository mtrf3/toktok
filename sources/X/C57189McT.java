package X;

import Y.ARunnableS15S0110000_9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Handler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.McT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57189McT extends AnimatorListenerAdapter {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ ObjectAnimator LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ VideoMusicCoverAssem LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        TuxTextView tuxTextView = this.LJLJJI.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        this.LJLJJI.LLILZ = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C26338AVi.LJI(this.LJLIL, Integer.valueOf(this.LJLJI), 0, 0, 0, false, 16);
        this.LJLILLLLZI.start();
        Handler handler = new Handler();
        ARunnableS15S0110000_9 aRunnableS15S0110000_9 = new ARunnableS15S0110000_9(this.LJLJJI, this.LJLJJL, 2);
        long j = C57188McS.LIZ.duration;
        if (j == 0) {
            j = 3;
        }
        handler.postDelayed(aRunnableS15S0110000_9, j * 1000);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        this.LJLJJI.LLILZ = true;
    }

    public C57189McT(TuxTextView tuxTextView, ObjectAnimator objectAnimator, int i, VideoMusicCoverAssem videoMusicCoverAssem, boolean z) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = objectAnimator;
        this.LJLJI = i;
        this.LJLJJI = videoMusicCoverAssem;
        this.LJLJJL = z;
    }
}
