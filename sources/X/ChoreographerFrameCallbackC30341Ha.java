package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC30341Ha extends AbstractC06200Me implements Choreographer.FrameCallback {
    public boolean LJLJJI;
    public long LJLJJL;
    public float LJLJJLL;
    public int LJLJL;
    public C0GY LJLL;
    public boolean LJLLI;
    public C03960Do LJLLILLLL;
    public float LJLJI = 1.0f;
    public float LJLJLJ = -2.1474836E9f;
    public float LJLJLLL = 2.1474836E9f;

    static {
        new Object() { // from class: X.0Mh
        };
    }

    public final float LIZIZ() {
        C0GY c0gy = this.LJLL;
        if (c0gy == null) {
            return 0.0f;
        }
        float f = this.LJLJJLL;
        float f2 = c0gy.LJIIIZ;
        return (f - f2) / (c0gy.LJIIJ - f2);
    }

    public final float LIZJ() {
        C0GY c0gy = this.LJLL;
        if (c0gy == null) {
            return 0.0f;
        }
        float f = this.LJLJLLL;
        if (f == 2.1474836E9f) {
            return c0gy.LJIIJ;
        }
        return f;
    }

    public final float LIZLLL() {
        C0GY c0gy = this.LJLL;
        if (c0gy == null) {
            return 0.0f;
        }
        float f = this.LJLJLJ;
        if (f == -2.1474836E9f) {
            return c0gy.LJIIIZ;
        }
        return f;
    }

    public final boolean LJ() {
        if (this.LJLJI < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = ((CopyOnWriteArraySet) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        LJFF(true);
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float LIZLLL;
        float LIZJ;
        float LIZLLL2;
        if (this.LJLL == null) {
            return 0.0f;
        }
        if (LJ()) {
            LIZLLL = LIZJ() - this.LJLJJLL;
            LIZJ = LIZJ();
            LIZLLL2 = LIZLLL();
        } else {
            LIZLLL = this.LJLJJLL - LIZLLL();
            LIZJ = LIZJ();
            LIZLLL2 = LIZLLL();
        }
        return LIZLLL / (LIZJ - LIZLLL2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.LJLL == null) {
            return 0L;
        }
        return r0.LIZIZ();
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(LIZIZ());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.LJLLI;
    }

    public final void LJFF(boolean z) {
        C16880lQ.LLIIIJ().removeFrameCallback(this);
        if (z) {
            this.LJLLI = false;
        }
    }

    public final void LJI(int i) {
        float f = i;
        if (this.LJLJJLL == f) {
            return;
        }
        this.LJLJJLL = C06260Mk.LIZIZ(f, LIZLLL(), LIZJ());
        if (C03970Dp.LIZ) {
            this.LJLJJL = 0L;
        } else {
            this.LJLJJL = System.nanoTime();
        }
        Iterator it = ((CopyOnWriteArraySet) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        float abs;
        boolean z;
        float LIZLLL;
        float LIZJ;
        C62822Ol8 c62822Ol8 = C52374Kh0.LIZ;
        if (((Number) c62822Ol8.getValue()).longValue() != 0) {
            long longValue = Long.valueOf(this.LJLJJL).longValue();
            if (longValue != 0 && System.nanoTime() - longValue <= ((Number) c62822Ol8.getValue()).longValue()) {
                C16880lQ.LLIIIJ().removeFrameCallback(this);
                C16880lQ.LLIIIJ().postFrameCallback(this);
                return;
            }
        }
        if (this.LJLLI) {
            LJFF(false);
            C16880lQ.LLIIIJ().postFrameCallback(this);
        }
        C0GY c0gy = this.LJLL;
        if (c0gy == null || !this.LJLLI) {
            return;
        }
        if (C03970Dp.LIZ) {
            long j3 = this.LJLJJL;
            if (j3 == 0) {
                j2 = 0;
            } else {
                j2 = j - j3;
            }
            if (C03970Dp.LIZJ) {
                if (this.LJLLILLLL == null) {
                    this.LJLLILLLL = new C03960Do();
                }
                C03960Do c03960Do = this.LJLLILLLL;
                if (c03960Do != null) {
                    float f = c0gy.LJIIJJI;
                    if (c03960Do.LIZ != f) {
                        c03960Do.LIZ = f;
                        if (f >= 24.0f) {
                            if (C04010Dt.LIZ) {
                                c03960Do.LIZJ = 32000000L;
                            } else {
                                c03960Do.LIZJ = 16000000L;
                            }
                        } else if (C04010Dt.LIZ) {
                            c03960Do.LIZJ = 48000000L;
                        } else {
                            c03960Do.LIZJ = 32000000L;
                        }
                    }
                    long j4 = c03960Do.LIZIZ;
                    if (j4 > 0 && j - j4 < c03960Do.LIZJ) {
                        return;
                    } else {
                        c03960Do.LIZIZ = j;
                    }
                }
            }
        } else {
            j = System.nanoTime();
            j2 = j - this.LJLJJL;
        }
        C0GY c0gy2 = this.LJLL;
        if (c0gy2 == null) {
            abs = Float.MAX_VALUE;
        } else {
            abs = (1.0E9f / c0gy2.LJIIJJI) / Math.abs(this.LJLJI);
        }
        float f2 = ((float) j2) / abs;
        float f3 = this.LJLJJLL;
        if (LJ()) {
            f2 = -f2;
        }
        float f4 = f3 + f2;
        this.LJLJJLL = f4;
        float LIZLLL2 = LIZLLL();
        float LIZJ2 = LIZJ();
        if (f4 >= LIZLLL2 && f4 <= LIZJ2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        this.LJLJJLL = C06260Mk.LIZIZ(this.LJLJJLL, LIZLLL(), LIZJ());
        this.LJLJJL = j;
        Iterator it = ((CopyOnWriteArraySet) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
        if (z2) {
            if (getRepeatCount() != -1 && this.LJLJL >= getRepeatCount()) {
                if (C03970Dp.LIZ) {
                    if (this.LJLJI < 0.0f) {
                        LIZJ = LIZLLL();
                    } else {
                        LIZJ = LIZJ();
                    }
                    this.LJLJJLL = LIZJ;
                } else {
                    this.LJLJJLL = LIZJ();
                }
                LJFF(true);
                LIZ(LJ());
            } else {
                Iterator it2 = ((CopyOnWriteArraySet) this.LJLILLLLZI).iterator();
                while (it2.hasNext()) {
                    ((Animator.AnimatorListener) it2.next()).onAnimationRepeat(this);
                }
                this.LJLJL++;
                if (getRepeatMode() == 2) {
                    this.LJLJJI = !this.LJLJJI;
                    this.LJLJI = -this.LJLJI;
                } else {
                    if (LJ()) {
                        LIZLLL = LIZJ();
                    } else {
                        LIZLLL = LIZLLL();
                    }
                    this.LJLJJLL = LIZLLL;
                }
                this.LJLJJL = j;
            }
        }
        if (this.LJLL == null) {
            return;
        }
        float f5 = this.LJLJJLL;
        if (f5 >= this.LJLJLJ && f5 <= this.LJLJLLL) {
            return;
        }
        C0GK LIZ = C0GH.LIZ();
        IllegalStateException illegalStateException = new IllegalStateException(C16880lQ.LLLZ("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.LJLJLJ), Float.valueOf(this.LJLJLLL), Float.valueOf(this.LJLJJLL)}));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resId=");
        LIZ2.append(this.LJLL.LJIILJJIL);
        LIZ.LIZ(illegalStateException, X1D.LIZIZ(LIZ2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.LJLJJI) {
            this.LJLJJI = false;
            this.LJLJI = -this.LJLJI;
        }
    }

    public final void LJII(int i, int i2) {
        float f;
        float f2;
        C0GY c0gy = this.LJLL;
        if (c0gy == null) {
            f = -3.4028235E38f;
            f2 = Float.MAX_VALUE;
        } else {
            f = c0gy.LJIIIZ;
            f2 = c0gy.LJIIJ;
        }
        float f3 = i;
        this.LJLJLJ = C06260Mk.LIZIZ(f3, f, f2);
        float f4 = i2;
        this.LJLJLLL = C06260Mk.LIZIZ(f4, f, f2);
        LJI((int) C06260Mk.LIZIZ(this.LJLJJLL, f3, f4));
    }
}
