package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.LinkedList;

/* renamed from: X.Vs7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81091Vs7 extends AppCompatImageView {
    public boolean LJLIL;
    public Rect LJLILLLLZI;
    public UGI LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public View.OnClickListener LJLJJLL;
    public View.OnLongClickListener LJLJL;
    public final Matrix LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final PointF LJLLI;
    public final PointF LJLLILLLL;
    public float LJLLJ;
    public C78878UxW LJLLL;
    public C77088UNg LJLLLL;
    public final GestureDetector LJLLLLLL;

    public final void LIZIZ() {
    }

    public RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C78878UxW c78878UxW = this.LJLLL;
        if (c78878UxW != null) {
            c78878UxW.cancel();
            this.LJLLL = null;
        }
        C77088UNg c77088UNg = this.LJLLLL;
        if (c77088UNg != null) {
            c77088UNg.cancel();
            this.LJLLLL = null;
        }
    }

    public final void LJII() {
        this.LJLJLJ.reset();
        LIZIZ();
        this.LJLJLLL = 0;
        this.LJLLI.set(0.0f, 0.0f);
        this.LJLLILLLL.set(0.0f, 0.0f);
        this.LJLLJ = 0.0f;
        LIZ();
        invalidate();
    }

    private float getMinScale() {
        if (!LJFF() || this.LJLILLLLZI == null) {
            return 1.0f;
        }
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        float width = getWidth() / getHeight();
        if (intrinsicWidth < this.LJLILLLLZI.width() / this.LJLILLLLZI.height() || intrinsicWidth < width) {
            return (this.LJLILLLLZI.width() / getWidth()) * (getWidth() / (C81093Vs9.LIZ(LJ(null))[0] * getDrawable().getIntrinsicWidth()));
        }
        return this.LJLILLLLZI.height() / (getWidth() / intrinsicWidth);
    }

    public final boolean LJFF() {
        if (getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
            return true;
        }
        return false;
    }

    public float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (LJFF()) {
            if (getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight() < getWidth() / getHeight()) {
                height = getWidth();
                intrinsicHeight = getDrawable().getIntrinsicWidth();
            } else {
                height = getHeight();
                intrinsicHeight = getDrawable().getIntrinsicHeight();
            }
            f = height / intrinsicHeight;
        } else {
            f = 4.0f;
        }
        return Math.max(f, 4.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public int getPinchMode() {
        return this.LJLJLLL;
    }

    public final RectF LIZJ(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!LJFF()) {
            return rectF;
        }
        Matrix LIZJ = C81093Vs9.LIZJ();
        LJ(LIZJ).postConcat(this.LJLJLJ);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        LIZJ.mapRect(rectF);
        C81093Vs9.LIZIZ(LIZJ);
        return rectF;
    }

    public final Matrix LJ(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJFF()) {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            C81096VsC c81096VsC = C81093Vs9.LIZIZ;
            RectF LIZJ = c81096VsC.LIZJ();
            LIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF LIZJ2 = c81096VsC.LIZJ();
            LIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(LIZJ, LIZJ2, Matrix.ScaleToFit.CENTER);
            if (((LinkedList) c81096VsC.LIZIZ).size() < c81096VsC.LIZ) {
                ((LinkedList) c81096VsC.LIZIZ).offer(LIZJ2);
            }
            if (((LinkedList) c81096VsC.LIZIZ).size() < c81096VsC.LIZ) {
                ((LinkedList) c81096VsC.LIZIZ).offer(LIZJ);
            }
        }
        return matrix;
    }

    public final void LJI(Matrix matrix) {
        if (matrix == null) {
            return;
        }
        this.LJLJLLL = 0;
        LIZ();
        this.LJLJLJ.set(matrix);
        LIZIZ();
        invalidate();
    }

    public final void LJIIJ(Long l) {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        float f4;
        float f5;
        if (!LJFF()) {
            return;
        }
        Matrix LIZJ = C81093Vs9.LIZJ();
        LJ(LIZJ).postConcat(this.LJLJLJ);
        boolean z = false;
        float f6 = C81093Vs9.LIZ(LIZJ)[0];
        float f7 = C81093Vs9.LIZ(this.LJLJLJ)[0];
        if (this.LJLIL) {
            f = this.LJLILLLLZI.left;
            width = this.LJLILLLLZI.right;
        } else {
            f = 0.0f;
            width = getWidth();
        }
        float f8 = width;
        if (this.LJLIL) {
            f2 = this.LJLILLLLZI.top;
            height = this.LJLILLLLZI.bottom;
        } else {
            f2 = 0.0f;
            height = getHeight();
        }
        float f9 = height;
        if (this.LJLIL) {
            width2 = this.LJLILLLLZI.width();
        } else {
            width2 = getWidth();
        }
        float f10 = width2;
        if (this.LJLIL) {
            height2 = this.LJLILLLLZI.height();
        } else {
            height2 = getHeight();
        }
        float f11 = height2;
        float maxScale = getMaxScale();
        if (f6 > maxScale) {
            f3 = maxScale / f6;
        } else {
            f3 = 1.0f;
        }
        float minScale = getMinScale();
        if (f7 * f3 < minScale) {
            f3 = minScale / f7;
        }
        if (f3 != 1.0f) {
            z = true;
        }
        Matrix LIZLLL = C81093Vs9.LIZLLL(LIZJ);
        PointF pointF = this.LJLLI;
        LIZLLL.postScale(f3, f3, pointF.x, pointF.y);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        C81096VsC c81096VsC = C81093Vs9.LIZIZ;
        RectF LIZJ2 = c81096VsC.LIZJ();
        LIZJ2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        LIZLLL.mapRect(LIZJ2);
        float f12 = LIZJ2.right;
        float f13 = LIZJ2.left;
        if (f12 - f13 < f10) {
            f4 = ((f + f8) / 2.0f) - ((f12 + f13) / 2.0f);
        } else if (f13 > f) {
            f4 = f - f13;
        } else if (f12 < f8) {
            f4 = f8 - f12;
        } else {
            f4 = 0.0f;
        }
        float f14 = LIZJ2.bottom;
        float f15 = LIZJ2.top;
        if (f14 - f15 < f11) {
            f5 = ((f2 + f9) / 2.0f) - ((f14 + f15) / 2.0f);
        } else if (f15 > f2) {
            f5 = f2 - f15;
        } else if (f14 < f9) {
            f5 = f9 - f14;
        } else {
            f5 = 0.0f;
        }
        if (f4 != 0.0f || f5 != 0.0f || z) {
            Matrix LIZLLL2 = C81093Vs9.LIZLLL(this.LJLJLJ);
            PointF pointF2 = this.LJLLI;
            LIZLLL2.postScale(f3, f3, pointF2.x, pointF2.y);
            LIZLLL2.postTranslate(f4, f5);
            LIZ();
            if (l != null) {
                C78878UxW c78878UxW = new C78878UxW(this, this.LJLJLJ, LIZLLL2, l.longValue());
                this.LJLLL = c78878UxW;
                c78878UxW.start();
            } else {
                C78878UxW c78878UxW2 = new C78878UxW(this, this.LJLJLJ, LIZLLL2);
                this.LJLLL = c78878UxW2;
                c78878UxW2.start();
            }
            C81093Vs9.LIZIZ(LIZLLL2);
        }
        if (((LinkedList) c81096VsC.LIZIZ).size() < c81096VsC.LIZ) {
            ((LinkedList) c81096VsC.LIZIZ).offer(LIZJ2);
        }
        C81093Vs9.LIZIZ(LIZLLL);
        C81093Vs9.LIZIZ(LIZJ);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLJLLL == 2) {
            return true;
        }
        RectF LIZJ = LIZJ(null);
        if (LIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (LIZJ.right > getWidth()) {
                return true;
            }
            return false;
        }
        if (LIZJ.left < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LJLJLLL == 2) {
            return true;
        }
        RectF LIZJ = LIZJ(null);
        if (LIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (LIZJ.bottom > getHeight()) {
                return true;
            }
            return false;
        }
        if (LIZJ.top < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (LJFF()) {
            Matrix LIZJ = C81093Vs9.LIZJ();
            Matrix LJ = LJ(LIZJ);
            LJ.postConcat(this.LJLJLJ);
            setImageMatrix(LJ);
            C81093Vs9.LIZIZ(LIZJ);
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                UGI ugi = this.LJLJI;
                if (ugi != null) {
                    ugi.LIZ();
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C78878UxW c78878UxW;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.LJLJLLL == 2) {
                LJIIJ(null);
            }
            this.LJLJLLL = 0;
        } else if (action == 6) {
            if (this.LJLJLLL == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    LJIIIIZZ(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    LJIIIIZZ(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            C78878UxW c78878UxW2 = this.LJLLL;
            if (c78878UxW2 == null || !c78878UxW2.isRunning()) {
                LIZ();
                this.LJLJLLL = 1;
                this.LJLLI.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            LIZ();
            this.LJLJLLL = 2;
            LJIIIIZZ(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && ((c78878UxW = this.LJLLL) == null || !c78878UxW.isRunning())) {
            int i = this.LJLJLLL;
            if (i == 1) {
                LJIIJJI(motionEvent.getX() - this.LJLLI.x, motionEvent.getY() - this.LJLLI.y);
                this.LJLLI.set(motionEvent.getX(), motionEvent.getY());
            } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float x2 = x - motionEvent.getX(1);
                float y2 = y - motionEvent.getY(1);
                float sqrt = (float) Math.sqrt((y2 * y2) + (x2 * x2));
                this.LJLLI.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
                LJIIIZ(this.LJLLILLLL, this.LJLLJ, sqrt, this.LJLLI);
            }
        }
        this.LJLLLLLL.onTouchEvent(motionEvent);
        return true;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.LJLILLLLZI = rect;
        if (rect != null) {
            this.LJLIL = true;
        }
    }

    public void setEnableDoubleTap(boolean z) {
        this.LJLJJL = z;
    }

    public void setFirstReadyListener(UGI ugi) {
        this.LJLJI = ugi;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJJLL = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LJLJL = onLongClickListener;
    }

    public C81091Vs7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = true;
        this.LJLJLJ = new Matrix();
        this.LJLJLLL = 0;
        this.LJLLI = new PointF();
        this.LJLLILLLL = new PointF();
        this.LJLLJ = 0.0f;
        this.LJLLLLLL = new GestureDetector(getContext(), new C81092Vs8(this));
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81091Vs7.LJIIJJI(float, float):boolean");
    }

    public final void LJIIIIZZ(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LJLLJ = C81093Vs9.LIZ(this.LJLJLJ)[0] / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LJLJLJ;
        if (matrix != null) {
            fArr = new float[2];
            Matrix LIZJ = C81093Vs9.LIZJ();
            matrix.invert(LIZJ);
            LIZJ.mapPoints(fArr, fArr2);
            C81093Vs9.LIZIZ(LIZJ);
        } else {
            fArr = new float[2];
        }
        this.LJLLILLLL.set(fArr[0], fArr[1]);
    }

    public final void LJIIIZ(PointF pointF, float f, float f2, PointF pointF2) {
        if (!LJFF()) {
            return;
        }
        float f3 = f * f2;
        Matrix LIZJ = C81093Vs9.LIZJ();
        LIZJ.postScale(f3, f3, pointF.x, pointF.y);
        LIZJ.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
        this.LJLJLJ.set(LIZJ);
        C81093Vs9.LIZIZ(LIZJ);
        LIZIZ();
        invalidate();
    }
}
