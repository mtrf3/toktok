package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.Mca, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57196Mca extends AnimatorListenerAdapter {
    public final /* synthetic */ VideoMusicCoverAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C57208Mcm LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Context context = this.LJLIL.getContext();
        if (context != null) {
            VideoMusicCoverAssem videoMusicCoverAssem = this.LJLIL;
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            C57208Mcm c57208Mcm = this.LJLJJI;
            FrameLayout frameLayout = videoMusicCoverAssem.LLILLL;
            if (frameLayout != null) {
                frameLayout.setBackground(context.getDrawable(R.drawable.aj4));
                if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicCoverAssem)).getAweme())) {
                    g0.LJJIJIIJI(C47959Irz.LIZJ(8, i), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) + i, frameLayout);
                } else {
                    g0.LJJIJIIJI(i2, i2, frameLayout);
                }
            }
            FrameLayout frameLayout2 = videoMusicCoverAssem.LLIIJI;
            if (frameLayout2 != null) {
                C26338AVi.LJIIIZ(frameLayout2, 0, null, 0, null, 26);
                if (c57208Mcm.LJLJJLL == 0) {
                    C26338AVi.LJI(frameLayout2, null, null, AnonymousClass391.LIZJ(c57208Mcm.LJLIL), null, false, 27);
                }
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        FrameLayout frameLayout;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (C202677xP.LIZ() && (frameLayout = this.LJLIL.LLIIJI) != null) {
            C57208Mcm c57208Mcm = this.LJLJJI;
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c57208Mcm.LJLJJL + c57208Mcm.LJLIL + c57208Mcm.LJLILLLLZI))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c57208Mcm.LJLJJL + c57208Mcm.LJLJJI + c57208Mcm.LJLJI))), frameLayout);
        }
    }

    public C57196Mca(VideoMusicCoverAssem videoMusicCoverAssem, int i, int i2, C57208Mcm c57208Mcm) {
        this.LJLIL = videoMusicCoverAssem;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c57208Mcm;
    }
}
