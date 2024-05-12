package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS0S0000002_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS1S0200002_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6SD, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6SD extends C6P6 {
    public final C1NS<BaseStickerModel> LIZ;
    public final ArrayList<C6SE> LIZIZ;
    public final ArrayList<C6SJ> LIZJ;
    public MotionEvent LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;

    public final void LJJIFFI() {
        int i = this.LJFF;
        if (i < 1) {
            return;
        }
        this.LJFF = i - 1;
        RectF targetRect = LJJII().LJ.getVisibleRectWithoutRotationInContainer();
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C6SJ next = it.next();
            if (next instanceof C87214YKs) {
                C87214YKs c87214YKs = (C87214YKs) next;
                if (c87214YKs != null) {
                    int id = LJJII().LJ.getId();
                    float rotation = LJJII().LJ.getRotation();
                    o.LJIIIZ(targetRect, "targetRect");
                    C6QO LJJJ = C30581Hy.LJJJ(id, c87214YKs.LJJIIZI());
                    if (LJJJ != null && LJJJ.LIZJ()) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(rotation, targetRect.centerX(), targetRect.centerY());
                        matrix.mapRect(targetRect);
                        if (new RectF(c87214YKs.LJJII() + c87214YKs.LJJIFFI(), c87214YKs.LJJIJ() + c87214YKs.LJJIFFI(), c87214YKs.LJJIIJ() - c87214YKs.LJJIFFI(), c87214YKs.LJIJJ() - c87214YKs.LJJIFFI()).contains(targetRect)) {
                            LJJII().LJ(C6SG.LJLIL);
                            if (this.LJFF == 0) {
                                LJJII().LJ(C6SF.LJLIL);
                            }
                            LJJIFFI();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void LJJIIZ() {
        if (this.LJ) {
            Iterator<C6SJ> it = this.LIZJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6SJ next = it.next();
                if (next instanceof C87214YKs) {
                    C87214YKs c87214YKs = (C87214YKs) next;
                    if (c87214YKs != null) {
                        final BaseStickerModel LJIIIIZZ = c87214YKs.LJIIIIZZ(LJJII().LJ);
                        final float translateX = LJJII().LJ.getTranslateX() - LJIIIIZZ.getTranslateX();
                        final float translateY = LJJII().LJ.getTranslateY() - LJIIIIZZ.getTranslateY();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6SH
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator animation) {
                                o.LJIIIZ(animation, "animation");
                                C6SD.this.LJJII().LJ(new AqS1S0200002_2(LJIIIIZZ, translateX, animation, translateY, 1));
                            }
                        });
                        ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.6SI
                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
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
                            public final void onAnimationCancel(Animator animator) {
                                o.LJIIIZ(animator, "animator");
                                C6SD.this.LJJII().LJ(new AqS168S0100000_2(LJIIIIZZ, 575));
                            }
                        });
                        ofFloat.start();
                    }
                }
            }
        }
        this.LJ = false;
    }

    public boolean LJJIII() {
        return LJJII().LJ.getVisible();
    }

    public final int LJJIIJ() {
        return LJJII().LJ.getZIndex();
    }

    public C1NS<BaseStickerModel> LJJII() {
        return this.LIZ;
    }

    public C6SD(C1NS<BaseStickerModel> stateContainer) {
        o.LJIIIZ(stateContainer, "stateContainer");
        this.LIZ = stateContainer;
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = new ArrayList<>();
        this.LJFF = 10;
    }

    public final boolean LJJIIJZLJL(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (!LJJIII()) {
            return false;
        }
        if (!C77119UOl.LJIILL(e.getX(), e.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation())) {
            return false;
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public boolean LJJIIZI(MotionEvent motionEvent) {
        if (motionEvent == null || !LJJIII()) {
            return false;
        }
        this.LIZLLL = null;
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(LJJII().LJ.getId(), LJJII().LJ.getType(), motionEvent.getX(), motionEvent.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
        }
        LJJIIZ();
        return false;
    }

    public final void LJJIJ(int i) {
        LJJII().LJ(new AqS27S0001000_2(i, 27));
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        if (!LJJIII()) {
            return false;
        }
        float rotation = LJJII().LJ.getRotation() - ((float) Math.toDegrees(f));
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C6SJ next = it.next();
            boolean LJI = next.LJI(rotation, LJJII().LJ.getId(), LJJII().LJ.getVisibleRectWithoutRotationInContainer());
            if (!next.LJIJ()) {
                this.LJ = LJI;
            } else if (LJI) {
                return true;
            }
        }
        LJJII().LJ(new AqS0S0000001_2(rotation, 11));
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILL(LJJII().LJ.getRotation(), LJJII().LJ.getId(), LJJII().LJ.getVisibleRectWithoutRotation());
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJJ(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (!LJJIII()) {
            return false;
        }
        RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
        if (!C77119UOl.LJIILL(e.getX(), e.getY(), visibleRectWithoutRotation, LJJII().LJ.getRotation())) {
            return false;
        }
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            if (it.next().LIZJ(e.getX(), e.getY(), LJJII().LJ.getId(), visibleRectWithoutRotation, LJJII().LJ.getType())) {
                return true;
            }
        }
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIL(LJJII().LJ.getId(), LJJII().LJ.getType(), e.getX(), e.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        if (!LJJIII()) {
            return false;
        }
        this.LJI = true;
        this.LJFF = 10;
        float translateX = LJJII().LJ.getTranslateX() + detector.LJIIIZ.x;
        float translateY = LJJII().LJ.getTranslateY() + detector.LJIIIZ.y;
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C6SJ next = it.next();
            RectF visibleRectWithoutRotationInContainer = BaseStickerModel.copy$default(LJJII().LJ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, translateX, translateY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null).getVisibleRectWithoutRotationInContainer();
            boolean LJII = next.LJII(LJJII().LJ.getRotation(), LJJII().LJ.getId(), visibleRectWithoutRotationInContainer);
            if (!next.LJIJ()) {
                this.LJ = LJII;
            } else if (LJII) {
                return true;
            }
        }
        LJJII().LJ(new AqS0S0000002_2(translateX, translateY, 3));
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C6SE next2 = it2.next();
            int id = LJJII().LJ.getId();
            float LJI = detector.LJI();
            float LJII2 = detector.LJII();
            RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
            LJJII().LJ.getRotation();
            next2.LJ(id, LJI, LJII2, visibleRectWithoutRotation);
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLJI(float f) {
        if (!LJJIII()) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJI(LJJII().LJ.getId());
        }
        LJJIIZ();
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final void LJLJJI(C82537WaL c82537WaL) {
        if (!LJJIII()) {
            return;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(LJJII().LJ.getId());
        }
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        if (!LJJIII()) {
            return false;
        }
        if (!C77119UOl.LJIILL(detector.LJIILIIL, detector.LJIILJJIL, LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation())) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            C6SE next = it.next();
            LJJII().LJ.getId();
            next.LJIIL();
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLZ(float f) {
        if (!LJJIII()) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJJI(LJJII().LJ.getId());
        }
        LJJIIZ();
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null || !LJJIII()) {
            return false;
        }
        this.LJ = false;
        this.LJI = false;
        this.LIZLLL = motionEvent;
        if (C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation())) {
            Iterator<C6SE> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJJ(LJJII().LJ.getId(), LJJII().LJ.getType(), motionEvent.getX(), motionEvent.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!LJJIII()) {
            return false;
        }
        float scaleFactor2 = scaleFactor.getScaleFactor() * LJJII().LJ.getScale();
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C6SJ next = it.next();
            RectF visibleRectWithoutRotationInContainer = BaseStickerModel.copy$default(LJJII().LJ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, scaleFactor2, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -8388609, null).getVisibleRectWithoutRotationInContainer();
            boolean LJIJJLI = next.LJIJJLI(scaleFactor2, LJJII().LJ.getRotation(), LJJII().LJ.getId(), visibleRectWithoutRotationInContainer, LJJII().LJ.getType());
            if (!next.LJIJ()) {
                this.LJ = LJIJJLI;
            } else if (LJIJJLI) {
                return true;
            }
        }
        LJJII().LJ(new AqS0S0000001_2(scaleFactor2, 12));
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C6SE next2 = it2.next();
            int id = LJJII().LJ.getId();
            RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
            LJJII().LJ.getRotation();
            next2.LJIILIIL(id, visibleRectWithoutRotation);
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        boolean z;
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!LJJIII()) {
            return false;
        }
        RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
        MotionEvent motionEvent = this.LIZLLL;
        if (motionEvent != null) {
            z = C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), visibleRectWithoutRotation, LJJII().LJ.getRotation());
        } else {
            z = false;
        }
        if (!C77119UOl.LJIILL(scaleFactor.getFocusX(), scaleFactor.getFocusY(), visibleRectWithoutRotation, LJJII().LJ.getRotation()) && !z) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            C6SE next = it.next();
            LJJII().LJ.getId();
            next.LIZLLL();
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (!LJJIII()) {
            return false;
        }
        RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
        if (!C77119UOl.LJIILL(e.getX(), e.getY(), visibleRectWithoutRotation, LJJII().LJ.getRotation())) {
            return false;
        }
        Iterator<C6SJ> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILJJIL(e.getX(), e.getY(), LJJII().LJ.getId(), visibleRectWithoutRotation, LJJII().LJ.getType())) {
                return true;
            }
        }
        Iterator<C6SE> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL(LJJII().LJ.getId(), LJJII().LJ.getType(), e.getX(), e.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        if (!LJJIII() || !C77119UOl.LJIILL(f, f2, LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation())) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(LJJII().LJ.getId());
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!LJJIII() || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        RectF visibleRectWithoutRotation = LJJII().LJ.getVisibleRectWithoutRotation();
        if (C77119UOl.LJIILL(motionEvent2.getX(), motionEvent2.getY(), visibleRectWithoutRotation, LJJII().LJ.getRotation())) {
            Iterator<C6SE> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJIJI(LJJII().LJ.getId(), LJJII().LJ.getType(), motionEvent, motionEvent2, f, f2, LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
            }
            return true;
        }
        if (C77119UOl.LJIILL(motionEvent.getX(), motionEvent.getY(), visibleRectWithoutRotation, LJJII().LJ.getRotation()) || this.LJI) {
            return true;
        }
        this.LJI = false;
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!LJJIII() || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        if (!C77119UOl.LJIILL(motionEvent2.getX(), motionEvent2.getY(), LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation())) {
            return false;
        }
        Iterator<C6SE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(LJJII().LJ.getId(), LJJII().LJ.getType(), motionEvent, motionEvent2, f, f2, LJJII().LJ.getVisibleRectWithoutRotation(), LJJII().LJ.getRotation());
        }
        return true;
    }
}
