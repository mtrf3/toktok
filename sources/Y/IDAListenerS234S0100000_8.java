package Y;

import X.C27740Aue;
import X.C63057Oov;
import X.KIK;
import X.KIY;
import X.UYG;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDAListenerS234S0100000_8 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$2(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
    }

    public static final void onAnimationStart$2(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                o.LJIIIZ(animation, "animation");
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS234S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$1(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        o.LJIIIZ(animation, "animation");
        KIY kiy = ((ChooseSearchMusicFragment) iDAListenerS234S0100000_8.l0).LJLJL;
        if (kiy != null) {
            KIK kik = (KIK) kiy;
            C27740Aue.LJIIIZ(8, kik.LIZ.LLIIL);
            C27740Aue.LJIIIZ(0, kik.LIZ.LLIILII);
            kik.LIZ.vl(0);
            kik.LIZ.LJLJJLL = false;
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        UYG uyg = (UYG) iDAListenerS234S0100000_8.l0;
        uyg.LJLJLJ = true;
        ConstraintLayout constraintLayout = uyg.LJLJJL;
        if (constraintLayout != null) {
            constraintLayout.postDelayed(uyg.LJLLI, 3000L);
        }
    }

    public static final void onAnimationEnd$3(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        ((UYG) iDAListenerS234S0100000_8.l0).LJJLIIIJL(true);
    }

    public static final void onAnimationStart$0(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        o.LJIIIZ(animation, "animation");
        KIY kiy = ((ChooseSearchMusicFragment) iDAListenerS234S0100000_8.l0).LJLJL;
        if (kiy != null) {
            KIK kik = (KIK) kiy;
            if (C63057Oov.LIZ()) {
                kik.LIZ.Hl(Boolean.TRUE);
            }
        }
    }

    public static final void onAnimationStart$1(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        o.LJIIIZ(animation, "animation");
        KIY kiy = ((ChooseSearchMusicFragment) iDAListenerS234S0100000_8.l0).LJLJL;
        if (kiy != null) {
            KIK kik = (KIK) kiy;
            if (C63057Oov.LIZ()) {
                kik.LIZ.Hl(Boolean.FALSE);
            }
        }
    }

    public static final void onAnimationStart$3(IDAListenerS234S0100000_8 iDAListenerS234S0100000_8, Animation animation) {
        ((UYG) iDAListenerS234S0100000_8.l0).LJLJLJ = false;
    }
}
