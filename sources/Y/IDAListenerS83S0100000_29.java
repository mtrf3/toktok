package Y;

import X.C16880lQ;
import X.C17N;
import X.C76800UCe;
import X.C91071Zoh;
import X.C91197Zqj;
import X.C91234ZrK;
import X.InterfaceC55112Lk4;
import X.InterfaceC65784Pro;
import X.InterfaceC91194Zqg;
import X.X1D;
import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipPreviewCTAAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipTipsAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes22.dex */
public class IDAListenerS83S0100000_29 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                onAnimationCancel$6(this, animator);
                return;
            case 7:
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
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
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
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animation");
                return;
            case 7:
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
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                onAnimationStart$6(this, animator);
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS83S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$1(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((SongClipPreviewCTAAssem) iDAListenerS83S0100000_29.l0).LLFZ;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
            View view2 = ((SongClipPreviewCTAAssem) iDAListenerS83S0100000_29.l0).LLFZ;
            if (view2 != null) {
                view2.setAlpha(1.0f);
                return;
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
        o.LJIJI("contentView");
        throw null;
    }

    public static final void onAnimationCancel$6(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnimationCancel, ");
        LIZ.append(((C91234ZrK) iDAListenerS83S0100000_29.l0).hashCode());
        X1D.LIZIZ(LIZ);
    }

    public static final void onAnimationEnd$0(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C91071Zoh c91071Zoh = (C91071Zoh) iDAListenerS83S0100000_29.l0;
        InterfaceC55112Lk4 interfaceC55112Lk4 = c91071Zoh.LJLJLLL;
        if (interfaceC55112Lk4 != null && c91071Zoh.LJLL == -1) {
            interfaceC55112Lk4.LJJIJIL();
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = ((SongClipPreviewCTAAssem) iDAListenerS83S0100000_29.l0).LLFZ;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
            View view2 = ((SongClipPreviewCTAAssem) iDAListenerS83S0100000_29.l0).LLFZ;
            if (view2 != null) {
                view2.setAlpha(1.0f);
                return;
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
        o.LJIJI("contentView");
        throw null;
    }

    public static final void onAnimationEnd$5(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C91197Zqj) iDAListenerS83S0100000_29.l0).LIZ.setVisibility(4);
        C91197Zqj c91197Zqj = (C91197Zqj) iDAListenerS83S0100000_29.l0;
        c91197Zqj.LJIILL = 2;
        InterfaceC91194Zqg interfaceC91194Zqg = c91197Zqj.LJI;
        if (interfaceC91194Zqg != null) {
            interfaceC91194Zqg.LIZ(2, c91197Zqj.LJIILLIIL);
        }
    }

    public static final void onAnimationEnd$6(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C91234ZrK c91234ZrK = (C91234ZrK) iDAListenerS83S0100000_29.l0;
        if (c91234ZrK.LJLLJ == 0 && c91234ZrK.LJLJL) {
            int ceil = ((int) Math.ceil((c91234ZrK.LJLIL.length() * ((C91234ZrK) iDAListenerS83S0100000_29.l0).getWidth()) / ((C91234ZrK) iDAListenerS83S0100000_29.l0).LJLLLLLL)) - 3;
            if (ceil < 0) {
                ceil = 0;
            }
            if (((C91234ZrK) iDAListenerS83S0100000_29.l0).LJLIL.length() >= ceil) {
                C91234ZrK c91234ZrK2 = (C91234ZrK) iDAListenerS83S0100000_29.l0;
                String str = c91234ZrK2.LJLIL;
                c91234ZrK2.LJLIL = s.LJLIL(str, ceil, str.length(), "...").toString();
            }
            C91234ZrK c91234ZrK3 = (C91234ZrK) iDAListenerS83S0100000_29.l0;
            c91234ZrK3.LJLJJI = false;
            c91234ZrK3.invalidate();
        }
    }

    public static final void onAnimationEnd$7(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        Iterator<InterfaceC65784Pro<C76800UCe>> it = ((MusicDspUGCButtonAssem) iDAListenerS83S0100000_29.l0).LLIIIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        Animator animator = ((MusicDspUGCButtonAssem) iDAListenerS83S0100000_29.l0).LLIIIL;
        if (animator != null) {
            C16880lQ.LJLJLJ(iDAListenerS83S0100000_29, animator);
        }
    }

    public static final void onAnimationStart$2(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJLIIIJJI(((SongClipTipsAssem) iDAListenerS83S0100000_29.l0).LLI);
    }

    public static final void onAnimationStart$3(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJLIIIJJI(((AudioSeekBarAssem) iDAListenerS83S0100000_29.l0).LLIIIJ);
    }

    public static final void onAnimationStart$4(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C91197Zqj) iDAListenerS83S0100000_29.l0).LIZ.setVisibility(0);
        C91197Zqj c91197Zqj = (C91197Zqj) iDAListenerS83S0100000_29.l0;
        c91197Zqj.LJIILL = 1;
        InterfaceC91194Zqg interfaceC91194Zqg = c91197Zqj.LJI;
        if (interfaceC91194Zqg != null) {
            interfaceC91194Zqg.LIZ(1, c91197Zqj.LJIILLIIL);
        }
    }

    public static final void onAnimationStart$6(IDAListenerS83S0100000_29 iDAListenerS83S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnimationStart, ");
        LIZ.append(((C91234ZrK) iDAListenerS83S0100000_29.l0).hashCode());
        X1D.LIZIZ(LIZ);
    }
}
