package Y;

import X.C202677xP;
import X.C204257zx;
import X.C220938ll;
import X.C26338AVi;
import X.C32151Nz;
import X.C51029K0z;
import X.C53882LCs;
import X.C53883LCt;
import X.C53884LCu;
import X.C53888LCy;
import X.C57186McQ;
import X.C57197Mcb;
import X.C57208Mcm;
import X.C7MY;
import X.C8D3;
import X.InterfaceC64592gB;
import X.O6R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import defpackage.g0;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ALAdapterS0S0101000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationRepeat$0(this, animator);
                return;
            case 3:
                onAnimationRepeat$1(this, animator);
                return;
            case 4:
                onAnimationRepeat$2(this, animator);
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS0S0101000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aLAdapterS0S0101000_9.l0).LLILLL;
        if (frameLayout != null) {
            int i = aLAdapterS0S0101000_9.i1;
            frameLayout.setBackground(null);
            g0.LJJIJIIJI(i, i, frameLayout);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C57197Mcb c57197Mcb = ((VideoMusicCoverAssem) aLAdapterS0S0101000_9.l0).LLIILII;
        if (c57197Mcb != null) {
            if (C8D3.LIZJ()) {
                c57197Mcb.LIZ();
                return;
            }
            C57208Mcm LIZIZ = C204257zx.LIZIZ();
            View view = c57197Mcb.LJIIJ;
            if (view != null) {
                C26338AVi.LJI(view, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(35 - LIZIZ.LJLJJI)))), 0, null, false, 25);
            }
            View view2 = c57197Mcb.LIZLLL;
            if (view2 == null || C202677xP.LIZ()) {
                return;
            }
            g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c57197Mcb.LIZJ() + LIZIZ.LJLJJL + LIZIZ.LJLIL + LIZIZ.LJLILLLLZI))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LIZIZ.LJLJJL + LIZIZ.LJLJJI + LIZIZ.LJLJI))), view2);
            int LIZIZ2 = C7MY.LIZIZ(LIZIZ.LJLILLLLZI);
            int LIZIZ3 = C7MY.LIZIZ(LIZIZ.LJLIL);
            C26338AVi.LJIIIZ(view2, Integer.valueOf(LIZIZ2), Integer.valueOf(C7MY.LIZIZ(LIZIZ.LJLJJI)), Integer.valueOf(LIZIZ3), Integer.valueOf(C7MY.LIZIZ(LIZIZ.LJLJI)), 16);
            return;
        }
        o.LJIJI("musicCoverViewScaleHelper");
        throw null;
    }

    public static final void onAnimationRepeat$0(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        int i = aLAdapterS0S0101000_9.i1 + 1;
        aLAdapterS0S0101000_9.i1 = i;
        if (i >= 10) {
            aLAdapterS0S0101000_9.i1 = 0;
            Set<C53884LCu> proxies = ((C53882LCs) aLAdapterS0S0101000_9.l0).LIZ;
            o.LJIIIIZZ(proxies, "proxies");
            C53882LCs c53882LCs = (C53882LCs) aLAdapterS0S0101000_9.l0;
            for (C53884LCu c53884LCu : proxies) {
                String scene = c53882LCs.LJI;
                c53884LCu.getClass();
                o.LJIIIZ(scene, "scene");
                InterfaceC64592gB<C220938ll> interfaceC64592gB = c53884LCu.LJIIIZ;
                if (interfaceC64592gB != null) {
                    c53884LCu.LJIIJ(c53884LCu.LJIIIIZZ, interfaceC64592gB, scene);
                }
            }
        }
    }

    public static final void onAnimationRepeat$1(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        int i = aLAdapterS0S0101000_9.i1 + 1;
        aLAdapterS0S0101000_9.i1 = i;
        if (i >= 10) {
            aLAdapterS0S0101000_9.i1 = 0;
            C53883LCt c53883LCt = (C53883LCt) aLAdapterS0S0101000_9.l0;
            InterfaceC64592gB<C220938ll> interfaceC64592gB = c53883LCt.LJIILJJIL;
            if (interfaceC64592gB != null) {
                c53883LCt.LJIIJ(c53883LCt.LJIILIIL, interfaceC64592gB, "tiktok_video_head");
            }
        }
    }

    public static final void onAnimationRepeat$2(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animator) {
        int i = aLAdapterS0S0101000_9.i1 + 1;
        aLAdapterS0S0101000_9.i1 = i;
        C53888LCy c53888LCy = (C53888LCy) aLAdapterS0S0101000_9.l0;
        InterfaceC64592gB<C220938ll> interfaceC64592gB = c53888LCy.LJIILIIL;
        if (interfaceC64592gB != null && i >= 10) {
            aLAdapterS0S0101000_9.i1 = 0;
            c53888LCy.LJFF(c53888LCy.LJI, interfaceC64592gB);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0101000_9 aLAdapterS0S0101000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS0S0101000_9.l0;
        FrameLayout frameLayout = videoMusicCoverAssem.LLILLL;
        if (frameLayout != null) {
            int i = aLAdapterS0S0101000_9.i1;
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicCoverAssem)).getAweme())) {
                frameLayout.setBackground(null);
                C26338AVi.LJIIIZ(frameLayout, 0, null, null, null, 30);
                g0.LJJIJIIJI(i, i, frameLayout);
            }
        }
    }

    public ALAdapterS0S0101000_9(VideoMusicCoverAssem videoMusicCoverAssem, int i, int i2) {
        this.$t = i2;
        this.l0 = videoMusicCoverAssem;
        this.i1 = i;
    }
}
