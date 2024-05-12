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

/* renamed from: X.VsE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81098VsE extends AppCompatImageView {
    public boolean LJLIL;
    public Rect LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public View.OnLongClickListener LJLJJI;
    public final Matrix LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final PointF LJLJLJ;
    public final PointF LJLJLLL;
    public float LJLL;
    public C78879UxX LJLLI;
    public C77089UNh LJLLILLLL;
    public final GestureDetector LJLLJ;

    public final void LIZIZ() {
    }

    public RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C78879UxX c78879UxX = this.LJLLI;
        if (c78879UxX != null) {
            c78879UxX.cancel();
            this.LJLLI = null;
        }
        C77089UNh c77089UNh = this.LJLLILLLL;
        if (c77089UNh != null) {
            c77089UNh.cancel();
            this.LJLLILLLL = null;
        }
    }

    private float getMinScale() {
        if (!LJFF() || this.LJLILLLLZI == null) {
            return 1.0f;
        }
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        float width = getWidth() / getHeight();
        if (intrinsicWidth < this.LJLILLLLZI.width() / this.LJLILLLLZI.height() || intrinsicWidth < width) {
            return (this.LJLILLLLZI.width() / getWidth()) * (getWidth() / (C81100VsG.LIZ(LJ(null))[0] * getDrawable().getIntrinsicWidth()));
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
        return this.LJLJJLL;
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
        Matrix LIZJ = C81100VsG.LIZJ();
        LJ(LIZJ).postConcat(this.LJLJJL);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        LIZJ.mapRect(rectF);
        C81100VsG.LIZIZ(LIZJ);
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
            C81103VsJ c81103VsJ = C81100VsG.LIZIZ;
            RectF LIZJ = c81103VsJ.LIZJ();
            LIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF LIZJ2 = c81103VsJ.LIZJ();
            LIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(LIZJ, LIZJ2, Matrix.ScaleToFit.CENTER);
            if (((LinkedList) c81103VsJ.LIZIZ).size() < c81103VsJ.LIZ) {
                ((LinkedList) c81103VsJ.LIZIZ).offer(LIZJ2);
            }
            if (((LinkedList) c81103VsJ.LIZIZ).size() < c81103VsJ.LIZ) {
                ((LinkedList) c81103VsJ.LIZIZ).offer(LIZJ);
            }
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLJJLL == 2) {
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
        if (this.LJLJJLL == 2) {
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
            Matrix LIZJ = C81100VsG.LIZJ();
            Matrix LJ = LJ(LIZJ);
            LJ.postConcat(this.LJLJJL);
            setImageMatrix(LJ);
            C81100VsG.LIZIZ(LIZJ);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        boolean z;
        float f4;
        float f5;
        C78879UxX c78879UxX;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.LJLJJLL == 2 && LJFF()) {
                Matrix LIZJ = C81100VsG.LIZJ();
                LJ(LIZJ).postConcat(this.LJLJJL);
                float f6 = C81100VsG.LIZ(LIZJ)[0];
                float f7 = C81100VsG.LIZ(this.LJLJJL)[0];
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
                } else {
                    z = false;
                }
                Matrix LIZLLL = C81100VsG.LIZLLL(LIZJ);
                PointF pointF = this.LJLJLJ;
                LIZLLL.postScale(f3, f3, pointF.x, pointF.y);
                float intrinsicWidth = getDrawable().getIntrinsicWidth();
                float intrinsicHeight = getDrawable().getIntrinsicHeight();
                C81103VsJ c81103VsJ = C81100VsG.LIZIZ;
                RectF LIZJ2 = c81103VsJ.LIZJ();
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
                    Matrix LIZLLL2 = C81100VsG.LIZLLL(this.LJLJJL);
                    PointF pointF2 = this.LJLJLJ;
                    LIZLLL2.postScale(f3, f3, pointF2.x, pointF2.y);
                    LIZLLL2.postTranslate(f4, f5);
                    LIZ();
                    C78879UxX c78879UxX2 = new C78879UxX(this, this.LJLJJL, LIZLLL2);
                    this.LJLLI = c78879UxX2;
                    c78879UxX2.start();
                    C81100VsG.LIZIZ(LIZLLL2);
                }
                if (((LinkedList) c81103VsJ.LIZIZ).size() < c81103VsJ.LIZ) {
                    ((LinkedList) c81103VsJ.LIZIZ).offer(LIZJ2);
                }
                C81100VsG.LIZIZ(LIZLLL);
                C81100VsG.LIZIZ(LIZJ);
            }
            this.LJLJJLL = 0;
        } else if (action == 6) {
            if (this.LJLJJLL == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    LJI(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    LJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            C78879UxX c78879UxX3 = this.LJLLI;
            if (c78879UxX3 == null || !c78879UxX3.isRunning()) {
                LIZ();
                this.LJLJJLL = 1;
                this.LJLJLJ.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            LIZ();
            this.LJLJJLL = 2;
            LJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && ((c78879UxX = this.LJLLI) == null || !c78879UxX.isRunning())) {
            int i = this.LJLJJLL;
            if (i == 1) {
                LJII(motionEvent.getX() - this.LJLJLJ.x, motionEvent.getY() - this.LJLJLJ.y);
                this.LJLJLJ.set(motionEvent.getX(), motionEvent.getY());
            } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float x2 = x - motionEvent.getX(1);
                float y2 = y - motionEvent.getY(1);
                float sqrt = (float) Math.sqrt((y2 * y2) + (x2 * x2));
                float x3 = motionEvent.getX(0);
                float y3 = motionEvent.getY(0);
                this.LJLJLJ.set((x3 + motionEvent.getX(1)) / 2.0f, (y3 + motionEvent.getY(1)) / 2.0f);
                PointF pointF3 = this.LJLJLLL;
                float f16 = this.LJLL;
                PointF pointF4 = this.LJLJLJ;
                if (LJFF()) {
                    float f17 = f16 * sqrt;
                    Matrix LIZJ3 = C81100VsG.LIZJ();
                    LIZJ3.postScale(f17, f17, pointF3.x, pointF3.y);
                    LIZJ3.postTranslate(pointF4.x - pointF3.x, pointF4.y - pointF3.y);
                    this.LJLJJL.set(LIZJ3);
                    C81100VsG.LIZIZ(LIZJ3);
                    LIZIZ();
                    invalidate();
                }
            }
        }
        this.LJLLJ.onTouchEvent(motionEvent);
        return true;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.LJLILLLLZI = rect;
        if (rect != null) {
            this.LJLIL = true;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJI = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LJLJJI = onLongClickListener;
    }

    public C81098VsE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = new Matrix();
        this.LJLJJLL = 0;
        this.LJLJLJ = new PointF();
        this.LJLJLLL = new PointF();
        this.LJLL = 0.0f;
        this.LJLLJ = new GestureDetector(getContext(), new C81099VsF(this));
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(float r14, float r15) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81098VsE.LJII(float, float):boolean");
    }

    public final void LJI(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LJLL = C81100VsG.LIZ(this.LJLJJL)[0] / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LJLJJL;
        if (matrix != null) {
            fArr = new float[2];
            Matrix LIZJ = C81100VsG.LIZJ();
            matrix.invert(LIZJ);
            LIZJ.mapPoints(fArr, fArr2);
            C81100VsG.LIZIZ(LIZJ);
        } else {
            fArr = new float[2];
        }
        this.LJLJLLL.set(fArr[0], fArr[1]);
    }
}
