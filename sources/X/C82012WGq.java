package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* renamed from: X.WGq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82012WGq implements InterfaceC82018WGw {
    public final /* synthetic */ C82011WGp LIZ;

    public C82012WGq(C82011WGp c82011WGp) {
        this.LIZ = c82011WGp;
    }

    @Override // X.InterfaceC82018WGw
    public final boolean LIZ(C82013WGr c82013WGr) {
        boolean z = false;
        this.LIZ.getParent().requestDisallowInterceptTouchEvent(false);
        C82011WGp c82011WGp = this.LIZ;
        if (c82011WGp.LLFII >= 1.0f) {
            z = true;
            InterfaceC82009WGn interfaceC82009WGn = c82011WGp.LLIFFJFJJ;
            if (interfaceC82009WGn != null) {
                interfaceC82009WGn.onScaleBegin();
            }
        }
        return z;
    }

    @Override // X.InterfaceC82018WGw
    public final void LIZIZ(C82013WGr detector) {
        o.LJIIIZ(detector, "detector");
        C82011WGp c82011WGp = this.LIZ;
        c82011WGp.LJLLLLLL = true;
        InterfaceC82009WGn interfaceC82009WGn = c82011WGp.LLIFFJFJJ;
        if (interfaceC82009WGn != null) {
            interfaceC82009WGn.LJLJI(c82011WGp.LLFII);
        }
        this.LIZ.LJIIL();
    }

    @Override // X.InterfaceC82018WGw
    public final boolean LIZJ(C82013WGr c82013WGr) {
        float min;
        if (c82013WGr.LJIILIIL == -1.0f) {
            if (c82013WGr.LJIIJJI == -1.0f) {
                float f = c82013WGr.LJIIIZ;
                float f2 = c82013WGr.LJIIJ;
                c82013WGr.LJIIJJI = (float) Math.sqrt((f2 * f2) + (f * f));
            }
            float f3 = c82013WGr.LJIIJJI;
            if (c82013WGr.LJIIL == -1.0f) {
                float f4 = c82013WGr.LJII;
                float f5 = c82013WGr.LJIIIIZZ;
                c82013WGr.LJIIL = (float) Math.sqrt((f5 * f5) + (f4 * f4));
            }
            c82013WGr.LJIILIIL = f3 / c82013WGr.LJIIL;
        }
        float f6 = c82013WGr.LJIILIIL;
        float f7 = c82013WGr.LJFF;
        float f8 = c82013WGr.LJI;
        if (Float.isNaN(f6) || Float.isInfinite(f6)) {
            return false;
        }
        C82011WGp c82011WGp = this.LIZ;
        c82011WGp.getClass();
        if (f6 != 1.0f) {
            float LIZ = C81199Vtr.LIZ(c82011WGp.LJLLJ);
            if (f6 < 1.0f) {
                min = Math.max(0.7f / LIZ, f6);
            } else {
                min = Math.min(10.0f / LIZ, f6);
            }
            OSZ<Float, Float> LJI = c82011WGp.LJI(f7, f8);
            c82011WGp.LJLLJ.postScale(min, min, LJI.getFirst().floatValue(), LJI.getSecond().floatValue());
            c82011WGp.LLFII = C81199Vtr.LIZ(c82011WGp.LJLLJ);
            c82011WGp.invalidate();
        }
        return true;
    }

    @Override // X.InterfaceC82018WGw
    public final void LJLJJI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        C82011WGp c82011WGp = this.LIZ;
        if (c82011WGp.LJLLLLLL) {
            c82011WGp.LJLLLLLL = false;
            return;
        }
        if (c82011WGp.LLFII > 1.0f) {
            return;
        }
        float f = c82011WGp.LLFFF;
        if (f > 0.0f && Math.abs(f) > c82011WGp.getHeight() * 0.2f) {
            InterfaceC82009WGn interfaceC82009WGn = c82011WGp.LLIFFJFJJ;
            if (interfaceC82009WGn != null) {
                interfaceC82009WGn.onExit();
            }
            c82011WGp.LJIIJJI();
            return;
        }
        Animator animator = c82011WGp.LL;
        if (animator != null && animator.isRunning()) {
            return;
        }
        Animator LJIIIIZZ = c82011WGp.LJIIIIZZ(new Matrix(c82011WGp.LJLLJ), new Matrix());
        LJIIIIZZ.addListener(new ALAdapterS11S0100000_14(c82011WGp, 47));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(LJIIIIZZ, c82011WGp.LJII(1.0f));
        animatorSet.start();
        c82011WGp.LL = animatorSet;
    }

    @Override // X.InterfaceC82018WGw
    public final void onDoubleTap(MotionEvent e) {
        Matrix matrix;
        Animator animator;
        o.LJIIIZ(e, "e");
        C82011WGp c82011WGp = this.LIZ;
        float x = e.getX();
        float y = e.getY();
        AnimatorSet animatorSet = c82011WGp.LLD;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        Animator animator2 = c82011WGp.LJZL;
        if (animator2 != null && animator2.isRunning()) {
            return;
        }
        Animator animator3 = c82011WGp.LL;
        if (animator3 != null && animator3.isRunning() && (animator = c82011WGp.LL) != null) {
            animator.cancel();
        }
        float f = 3.0f;
        if (C82014WGs.LIZJ(c82011WGp.LLFII, 3.0f)) {
            matrix = new Matrix();
        } else {
            float f2 = c82011WGp.LLFII;
            if (f2 * 3.0f > 3.0f) {
                f = 3.0f / f2;
            }
            matrix = new Matrix(c82011WGp.LJLLJ);
            OSZ<Float, Float> LJI = c82011WGp.LJI(x, y);
            matrix.postScale(f, f, LJI.getFirst().floatValue(), LJI.getSecond().floatValue());
            RectF rectF = new RectF(c82011WGp.LJLLL);
            matrix.mapRect(rectF);
            OSZ<Float, Float> LJ = c82011WGp.LJ(rectF);
            if (LJ != null) {
                matrix.postTranslate(LJ.getFirst().floatValue(), LJ.getSecond().floatValue());
            }
        }
        Animator LJIIIIZZ = c82011WGp.LJIIIIZZ(new Matrix(c82011WGp.LJLLJ), matrix);
        LJIIIIZZ.start();
        c82011WGp.LL = LJIIIIZZ;
    }

    @Override // X.InterfaceC82018WGw
    public final boolean onDown(MotionEvent e) {
        ViewParent parent;
        o.LJIIIZ(e, "e");
        if (e.getPointerCount() > 2) {
            this.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
        }
        AnimatorSet animatorSet = this.LIZ.LLD;
        if (animatorSet != null && animatorSet.isRunning()) {
            return false;
        }
        C82011WGp c82011WGp = this.LIZ;
        if (c82011WGp.LLFII > 1.0f && (parent = c82011WGp.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.LIZ.LJLZ.forceFinished(true);
        return true;
    }

    @Override // X.InterfaceC82018WGw
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        InterfaceC82009WGn interfaceC82009WGn = this.LIZ.LLIFFJFJJ;
        if (interfaceC82009WGn != null) {
            interfaceC82009WGn.LJIIJ();
        }
    }

    @Override // X.InterfaceC82018WGw
    public final void onSingleTapConfirmed(MotionEvent event) {
        o.LJIIIZ(event, "event");
        InterfaceC82009WGn interfaceC82009WGn = this.LIZ.LLIFFJFJJ;
        if (interfaceC82009WGn != null) {
            interfaceC82009WGn.LIZIZ();
        }
    }

    @Override // X.InterfaceC82018WGw
    public final void onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        this.LIZ.LJIIIZ(f, f2);
    }

    @Override // X.InterfaceC82018WGw
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        boolean z;
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        if (this.LIZ.LJLLLLLL || e2.getPointerCount() >= 3) {
            return false;
        }
        C82011WGp c82011WGp = this.LIZ;
        if (e2.getPointerCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        c82011WGp.LJZ = z;
        C82011WGp c82011WGp2 = this.LIZ;
        if (c82011WGp2.LJZ) {
            c82011WGp2.LJIILIIL(-f, -f2);
        } else {
            float f3 = c82011WGp2.LLFII;
            if (f3 > 1.0f) {
                c82011WGp2.LJIIJ(-f, -f2);
            } else if (f3 == 1.0f) {
                float f4 = -f;
                float f5 = -f2;
                float f6 = c82011WGp2.LLFF + f4;
                c82011WGp2.LLFF = f6;
                float f7 = c82011WGp2.LLFFF + f5;
                c82011WGp2.LLFFF = f7;
                if (!c82011WGp2.LJZI && f7 > Math.abs(f6)) {
                    c82011WGp2.LJZI = true;
                    c82011WGp2.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (c82011WGp2.LJZI) {
                    RectF rectF = new RectF(0.0f, 0.0f, c82011WGp2.getWidth(), c82011WGp2.getHeight());
                    float min = 1.0f - Math.min(1.0f, Math.abs(c82011WGp2.LLFFF) / (rectF.height() * 1.0f));
                    c82011WGp2.LLFZ = min;
                    InterfaceC82009WGn interfaceC82009WGn = c82011WGp2.LLIFFJFJJ;
                    if (interfaceC82009WGn != null) {
                        interfaceC82009WGn.LIZ(min);
                    }
                    RectF rectF2 = new RectF(0.0f, 0.0f, c82011WGp2.getWidth(), c82011WGp2.getHeight());
                    float min2 = ((Math.min(1.0f, Math.abs(c82011WGp2.LLFFF) / (rectF2.height() * 1.0f)) * (-0.5f)) + 1.0f) / C81199Vtr.LIZ(c82011WGp2.LJLLJ);
                    Matrix matrix = c82011WGp2.LJLLJ;
                    matrix.postTranslate(f4, f5);
                    matrix.postScale(min2, min2, e2.getX(), e2.getY());
                    c82011WGp2.invalidate();
                }
            }
        }
        return true;
    }
}
