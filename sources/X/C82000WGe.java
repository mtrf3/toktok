package X;

import Y.ALAdapterS11S0100000_14;
import Y.ALAdapterS11S0200000_14;
import Y.ALAdapterS3S0100000_4;
import Y.ARunnableS0S0600001_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeConverter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WGe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82000WGe extends AbstractC80957Vpx implements WGR {
    public static final C82005WGj LLFII = new C82005WGj();
    public static final C82004WGi LLFZ = new C82004WGi(PointF.class);
    public C82002WGg LJLLJ;
    public InterfaceC82009WGn LJLLL;
    public RectF LJLLLL;
    public float LJLLLLLL;
    public boolean LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public Matrix LL;
    public AnimatorSet LLD;
    public ARunnableS0S0600001_14 LLF;
    public C82003WGh LLFF;
    public TimeInterpolator LLFFF;

    private Animator getAlphaToFullTransparentAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJZL, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 47));
        return ofFloat;
    }

    public ValueAnimator getDefaultDisappearFallbackAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 14));
        return ofFloat;
    }

    @Override // X.WGR
    public final void reset() {
    }

    public void setGestureCallback(InterfaceC82010WGo interfaceC82010WGo) {
    }

    public RectF getBaseOriginDisplayRect() {
        if (this.LJLLLL != null) {
            return new RectF(this.LJLLLL);
        }
        return null;
    }

    public TimeInterpolator getInterpolator() {
        return this.LLFFF;
    }

    public final void LJI(float f) {
        InterfaceC82009WGn interfaceC82009WGn;
        if (f > 0.0f) {
            if (Math.abs(f) > getHeight() * 0.2f && (interfaceC82009WGn = this.LJLLL) != null) {
                interfaceC82009WGn.onExit();
                return;
            }
        } else if (f == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofObject = ValueAnimator.ofObject(new C78875UxT(), new Matrix(this.LL), new Matrix(new Matrix()));
        ofObject.addUpdateListener(new AUListenerS101S0100000_14(this, 48));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJZL, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 47));
        animatorSet.playTogether(ofObject, ofFloat);
        animatorSet.addListener(new ALAdapterS11S0100000_14(this, 15));
        animatorSet.start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C82002WGg c82002WGg = this.LJLLJ;
        if (c82002WGg == null) {
            return false;
        }
        o.LJIIIZ(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            c82002WGg.LIZLLL = false;
            c82002WGg.LJ = false;
        }
        if (c82002WGg.LIZLLL) {
            if (c82002WGg.LJ) {
                return false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            GestureDetector gestureDetector = c82002WGg.LIZIZ;
            o.LJI(gestureDetector);
            gestureDetector.onTouchEvent(obtain);
            ScaleGestureDetector scaleGestureDetector = c82002WGg.LIZ;
            o.LJI(scaleGestureDetector);
            scaleGestureDetector.onTouchEvent(obtain);
            c82002WGg.LJ = true;
            return false;
        }
        GestureDetector gestureDetector2 = c82002WGg.LIZIZ;
        o.LJI(gestureDetector2);
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        c82002WGg.LJFF = MotionEvent.obtain(motionEvent);
        ScaleGestureDetector scaleGestureDetector2 = c82002WGg.LIZ;
        o.LJI(scaleGestureDetector2);
        scaleGestureDetector2.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            GestureDetectorOnGestureListenerC82008WGm gestureDetectorOnGestureListenerC82008WGm = c82002WGg.LIZJ;
            o.LJI(gestureDetectorOnGestureListenerC82008WGm);
            C82000WGe c82000WGe = ((C82001WGf) gestureDetectorOnGestureListenerC82008WGm).LJLIL;
            int i = (int) c82000WGe.LJLLLLLL;
            c82000WGe.LJLLLLLL = 0.0f;
            c82000WGe.LJLZ = false;
            c82000WGe.LJZ = 0.0f;
            c82000WGe.LJZI = 0.0f;
            c82000WGe.LJI(i);
        }
        if (motionEvent.getActionMasked() == 6) {
            GestureDetectorOnGestureListenerC82008WGm gestureDetectorOnGestureListenerC82008WGm2 = c82002WGg.LIZJ;
            o.LJI(gestureDetectorOnGestureListenerC82008WGm2);
            motionEvent.getPointerId(0);
            C82000WGe c82000WGe2 = ((C82001WGf) gestureDetectorOnGestureListenerC82008WGm2).LJLIL;
            int i2 = (int) c82000WGe2.LJLLLLLL;
            c82000WGe2.LJLLLLLL = 0.0f;
            c82000WGe2.LJLZ = false;
            c82000WGe2.LJZ = 0.0f;
            c82000WGe2.LJZI = 0.0f;
            C82002WGg c82002WGg2 = c82000WGe2.LJLLJ;
            if (c82002WGg2 != null) {
                c82002WGg2.LIZLLL = true;
            }
            c82000WGe2.LJI(i2);
        }
        return onTouchEvent;
    }

    @Override // X.WGR
    public void setGestureListener(InterfaceC82009WGn interfaceC82009WGn) {
        this.LJLLL = interfaceC82009WGn;
    }

    public void setImageMatrix(Matrix matrix) {
        this.LL = matrix;
        invalidate();
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.LLFFF = timeInterpolator;
    }

    public C82000WGe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJZL = 1.0f;
        this.LL = new Matrix();
        this.LLFFF = new C30901Je();
        this.LJLLJ = new C82002WGg(getContext(), new C82001WGf(this));
    }

    public final Matrix LJ(Rect rect, InterfaceC77358UXq interfaceC77358UXq) {
        float f;
        float f2;
        int width = getWidth();
        int height = getHeight();
        int width2 = (int) this.LJLLLL.width();
        int height2 = (int) this.LJLLLL.height();
        if (width2 == 0 || height2 == 0 || height2 / width2 >= height / width) {
            f = height;
            f2 = height2;
        } else {
            f = width;
            f2 = width2;
        }
        float f3 = f / f2;
        int i = height2 / 2;
        float f4 = (height / 2) - i;
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, width2 / 2, i);
        matrix.postTranslate((width / 2) - r5, f4);
        RectF rectF = new RectF(0.0f, 0.0f, width2, height2);
        matrix.mapRect(rectF, rectF);
        if (interfaceC77358UXq != null) {
            return interfaceC77358UXq.LIZ(rect, rectF);
        }
        return new C77357UXp().LIZ(rect, rectF);
    }

    @Override // X.WGR
    public final void setVideoSize(int i, int i2) {
        ARunnableS0S0600001_14 aRunnableS0S0600001_14;
        this.LJLLLL = new RectF(0.0f, 0.0f, i, i2);
        if (getWidth() > 0 && getHeight() > 0 && (aRunnableS0S0600001_14 = this.LLF) != null) {
            aRunnableS0S0600001_14.run();
        }
    }

    @Override // X.AbstractC80957Vpx
    public final boolean LIZJ(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.LL);
        boolean LIZJ = super.LIZJ(canvas, view, j);
        canvas.restore();
        return LIZJ;
    }

    public final Animator LJFF(Matrix matrix, Matrix matrix2, WGQ wgq) {
        V8D v8d;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        this.LLFF = new C82003WGh(this, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LLFF, PropertyValuesHolder.ofObject(LLFII, new C78874UxS(new float[9]), fArr, fArr2));
        if (wgq != null) {
            ofPropertyValuesHolder.setDuration(wgq.LJFF);
            ofPropertyValuesHolder.setInterpolator(wgq.LIZIZ);
        }
        if (wgq == null || (v8d = wgq.LJIIIIZZ) == null) {
            v8d = WGQ.LJIIIZ;
        }
        RectF rectF = new RectF(getBaseOriginDisplayRect());
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix2.mapRect(rectF3, rectF);
        float centerX = rectF2.centerX();
        float centerY = rectF2.centerY();
        float centerX2 = rectF3.centerX();
        float centerY2 = rectF3.centerY();
        v8d.getClass();
        Path path = new Path();
        path.moveTo(centerX, centerY);
        path.lineTo(centerX2, centerY2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.LLFF, PropertyValuesHolder.ofObject(LLFZ, (TypeConverter) null, path));
        if (wgq != null) {
            ofPropertyValuesHolder2.setDuration(wgq.LJ);
            ofPropertyValuesHolder2.setInterpolator(wgq.LIZ);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
        animatorSet.addListener(new ALAdapterS11S0100000_14(this, 16));
        return animatorSet;
    }

    @Override // X.WGR
    public final void LIZIZ(Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq) {
        this.LLF = new ARunnableS0S0600001_14(this, rect, rect2, c77357UXp, wgq, 0);
        if (this.LJLLLL != null && getWidth() > 0 && getHeight() > 0) {
            this.LLF.run();
        }
    }

    @Override // X.AbstractC80957Vpx, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ARunnableS0S0600001_14 aRunnableS0S0600001_14;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLLLL != null && getWidth() > 0 && getHeight() > 0 && (aRunnableS0S0600001_14 = this.LLF) != null) {
            aRunnableS0S0600001_14.run();
        }
    }

    @Override // X.WGR
    public final void LIZ(Rect rect, Rect rect2, C77357UXp c77357UXp, WGQ wgq, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!C16330kX.LIZIZ(this)) {
            interfaceC65784Pro.invoke();
            return;
        }
        RectF rectF = this.LJLLLL;
        if (rectF == null || rectF.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (rect == null || rect.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rect2 == null || rect2.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.offset(-iArr[0], -iArr[1]);
            rect2.offset(-iArr[0], -iArr[1]);
            Animator LJFF = LJFF(new Matrix(this.LL), new Matrix(LJ(rect, c77357UXp)), wgq);
            Animator LIZLLL = LIZLLL(new Rect(rect), rect2, 0.0f, true);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(LIZLLL);
            animatorSet.setDuration(wgq.LJI);
            animatorSet.setInterpolator(wgq.LIZJ);
            Animator alphaToFullTransparentAnimator = getAlphaToFullTransparentAnimator();
            alphaToFullTransparentAnimator.setDuration(wgq.LJII);
            alphaToFullTransparentAnimator.setInterpolator(wgq.LIZLLL);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LLD = animatorSet2;
            animatorSet2.playTogether(LJFF, animatorSet, alphaToFullTransparentAnimator);
            this.LLD.setInterpolator(getInterpolator());
            this.LLD.addListener(new ALAdapterS11S0200000_14(interfaceC65784Pro, this, 9));
            this.LLD.start();
            return;
        }
        ValueAnimator defaultDisappearFallbackAnimator = getDefaultDisappearFallbackAnimator();
        defaultDisappearFallbackAnimator.addListener(new ALAdapterS3S0100000_4(interfaceC65784Pro, 19));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.LLD = animatorSet3;
        animatorSet3.addListener(new ALAdapterS11S0100000_14(this, 42));
        this.LLD.playTogether(defaultDisappearFallbackAnimator, getAlphaToFullTransparentAnimator());
        this.LLD.setInterpolator(getInterpolator());
        this.LLD.setDuration(200L);
        this.LLD.start();
    }
}
