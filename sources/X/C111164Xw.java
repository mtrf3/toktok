package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.vcloud.vctrace.BuildConfig;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111164Xw {
    public final C111154Xv LIZ;
    public C4EQ LIZIZ;
    public Animator LIZJ;
    public Animator LIZLLL;
    public AnimatorSet LJ;

    public final void LIZ() {
        boolean z;
        Animator animator = this.LIZJ;
        if (animator != null && animator.isRunning()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Animator animator2 = this.LIZJ;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = this.LIZJ;
            if (animator3 != null) {
                C16880lQ.LJLJJI(animator3);
            }
            this.LIZJ = null;
        }
        Animator animator4 = this.LIZLLL;
        if (animator4 != null && animator4.isRunning()) {
            Animator animator5 = this.LIZLLL;
            if (animator5 != null) {
                animator5.cancel();
            }
            Animator animator6 = this.LIZLLL;
            if (animator6 != null) {
                C16880lQ.LJLJJI(animator6);
            }
            this.LIZLLL = null;
        }
        AnimatorSet animatorSet = this.LJ;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJ;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
            this.LJ = null;
        }
    }

    public final void LIZLLL() {
        if (!C4Y9.LIZIZ()) {
            return;
        }
        C111174Xx.LJLIL.invoke(this.LIZ);
    }

    public C111164Xw(C111154Xv c111154Xv) {
        C4EQ c4eq;
        this.LIZ = c111154Xv;
        if (((Boolean) C4Y9.LIZJ.getValue()).booleanValue()) {
            c4eq = C4EQ.HOLD_TO_TALK;
        } else if (((Boolean) C4Y9.LIZLLL.getValue()).booleanValue()) {
            c4eq = C4EQ.DEFAULT_INPUT;
        } else if (((Boolean) C4Y9.LJI.getValue()).booleanValue()) {
            c4eq = C4EQ.DEFAULT_MIC;
        } else {
            c4eq = C4EQ.DEFAULT_INPUT;
        }
        this.LIZIZ = c4eq;
        LIZIZ(c4eq, false);
    }

    public final void LIZJ(C4EQ c4eq) {
        new AqS167S0100000_1(c4eq, 288).invoke(this.LIZ);
    }

    public final void LIZIZ(C4EQ c4eq, boolean z) {
        int i = C4ER.LIZ[c4eq.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    if (!z) {
                        LIZJ(C4EQ.HOLD_TO_TALK);
                    } else {
                        new AqS167S0100000_1(this, 289).invoke(this.LIZ);
                    }
                    this.LIZIZ = C4EQ.HOLD_TO_TALK;
                    return;
                }
                LIZ();
                if (z) {
                    new AqS167S0100000_1(this, BuildConfig.VERSION_CODE).invoke(this.LIZ);
                } else {
                    LIZJ(C4EQ.INPUTTING);
                    LIZLLL();
                    C4Y5.LJLIL.invoke(this.LIZ);
                }
                this.LIZIZ = C4EQ.INPUTTING;
                return;
            }
            if (!C4Y9.LIZIZ()) {
                return;
            }
            new AqS167S0100000_1(this, 291).invoke(this.LIZ);
            this.LIZIZ = C4EQ.DEFAULT_MIC;
            return;
        }
        LIZ();
        new AqS44S0110000_1(z, this, 2).invoke(this.LIZ);
        this.LIZIZ = C4EQ.DEFAULT_INPUT;
    }

    public final void LJ(C4EQ variant, boolean z) {
        o.LJIIIZ(variant, "variant");
        if (variant != this.LIZIZ) {
            LIZIZ(variant, z);
        }
    }
}
