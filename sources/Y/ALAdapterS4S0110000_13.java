package Y;

import X.AbstractC76473Tzp;
import X.AbstractC77394UZa;
import X.C29701Eo;
import X.C76414Tys;
import X.CMV;
import X.LBL;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayDodgeEvent;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS4S0110000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                onAnimationEnd$2(this, animator);
                return;
            case 5:
                onAnimationEnd$3(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
            case 4:
                onAnimationStart$2(this, animator);
                return;
            case 5:
                onAnimationStart$3(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS4S0110000_13.z1) {
            ((CMV) ((C76414Tys) aLAdapterS4S0110000_13.l0).LIZ(R.id.mcp)).LJJIJLIJ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS4S0110000_13.z1) {
            CMV cmv = ((MatchCountDownAssem) aLAdapterS4S0110000_13.l0).LJLJL;
            if (cmv != null) {
                cmv.LJJIJLIJ();
            } else {
                o.LJIJI("tvPKOnlyGiftTip");
                throw null;
            }
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS4S0110000_13.z1) {
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LIZIZ();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS4S0110000_13.z1) {
            AbstractC77394UZa abstractC77394UZa = (AbstractC77394UZa) aLAdapterS4S0110000_13.l0;
            if (!abstractC77394UZa.LJLL) {
                abstractC77394UZa.LJLJJI.setVisibility(4);
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        FrameLayout frameLayout;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (!aLAdapterS4S0110000_13.z1 && (frameLayout = ((AbstractC76473Tzp) aLAdapterS4S0110000_13.l0).LLFZ) != null) {
            frameLayout.setVisibility(0);
        }
        DataChannel LJJIIZI = ((AbstractC76473Tzp) aLAdapterS4S0110000_13.l0).LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.rv0(MatchGiftTrayDodgeEvent.class, new LBL(200L, 0.3f, 1.0f));
        }
    }

    public static final void onAnimationStart$1(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS4S0110000_13.z1) {
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLILLLLZI.setVisibility(8);
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLJJL.setVisibility(8);
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLJI.setVisibility(0);
            View view = ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLJI;
            if (view instanceof C29701Eo) {
                ((C29701Eo) view).playAnimation();
            }
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LIZIZ();
        }
    }

    public static final void onAnimationStart$2(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS4S0110000_13.z1) {
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLILLLLZI.setVisibility(0);
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).getClass();
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLJI.setVisibility(8);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS4S0110000_13 aLAdapterS4S0110000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS4S0110000_13.z1) {
            ((AbstractC77394UZa) aLAdapterS4S0110000_13.l0).LJLJJI.setVisibility(0);
        }
    }

    public ALAdapterS4S0110000_13(boolean z, Object obj, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
