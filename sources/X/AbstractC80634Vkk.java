package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.Vkk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80634Vkk extends ImageView {
    public final C73312Spw LJLIL;
    public final Matrix LJLILLLLZI;
    public Matrix LJLJI;
    public Matrix LJLJJI;
    public final Handler LJLJJL;
    public RunnableC80637Vkn LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final Matrix LJLLILLLL;
    public final float[] LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final PointF LJLLLLLL;
    public VIK LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final RectF LJZL;
    public final RectF LL;
    public final RectF LLD;

    public void LJII(float f) {
    }

    @Override // android.view.View
    public float getRotation() {
        return 0.0f;
    }

    public void setOnDrawableChangedListener(VIL vil) {
    }

    public void setOnLayoutChangeListener(VIM vim) {
    }

    public float getBaseScale() {
        return LJFF(this.LJLILLLLZI);
    }

    public RectF getBitmapRect() {
        return LIZJ(this.LJLJI);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.LJLJI);
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.LJLJI;
        this.LJLLILLLL.set(this.LJLILLLLZI);
        this.LJLLILLLL.postConcat(matrix);
        return this.LJLLILLLL;
    }

    public float getMaxScale() {
        float max;
        if (this.LJLJLJ == -1.0f) {
            if (getDrawable() == null) {
                max = 1.0f;
            } else {
                max = Math.max(r1.getIntrinsicWidth() / this.LJLLL, r1.getIntrinsicHeight() / this.LJLLLL) * 8.0f;
            }
            this.LJLJLJ = max;
        }
        return this.LJLJLJ;
    }

    public float getMinScale() {
        if (this.LJLJLLL == -1.0f) {
            float f = 1.0f;
            if (getDrawable() != null) {
                f = Math.min(1.0f, 1.0f / LJFF(this.LJLILLLLZI));
            }
            this.LJLJLLL = f;
        }
        return this.LJLJLLL;
    }

    public float getScale() {
        return LJFF(this.LJLJI);
    }

    public final void LIZIZ() {
        if (getDrawable() == null) {
            return;
        }
        RectF LIZLLL = LIZLLL(this.LJLJI);
        float f = LIZLLL.left;
        if (f != 0.0f || LIZLLL.top != 0.0f) {
            LJIIIZ(f, LIZLLL.top);
        }
    }

    public PointF getCenter() {
        return this.LJLLLLLL;
    }

    public VIK getDisplayType() {
        return this.LJLZ;
    }

    public final RectF LIZJ(Matrix matrix) {
        if (getDrawable() == null) {
            return null;
        }
        this.LJLLILLLL.set(this.LJLILLLLZI);
        this.LJLLILLLL.postConcat(matrix);
        Matrix matrix2 = this.LJLLILLLL;
        this.LJZL.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
        matrix2.mapRect(this.LJZL);
        return this.LJZL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.RectF LIZLLL(android.graphics.Matrix r9) {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            r3 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3, r3, r3, r3)
            return r0
        Ld:
            android.graphics.RectF r0 = r8.LL
            r0.set(r3, r3, r3, r3)
            android.graphics.RectF r6 = r8.LIZJ(r9)
            float r1 = r6.height()
            float r7 = r6.width()
            int r0 = r8.LJLLLL
            float r4 = (float) r0
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L51
            float r4 = r4 - r1
            float r4 = r4 / r5
            float r1 = r6.top
        L2b:
            float r4 = r4 - r1
        L2c:
            int r0 = r8.LJLLL
            float r2 = (float) r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L40
            float r2 = r2 - r7
            float r2 = r2 / r5
            float r1 = r6.left
        L37:
            float r2 = r2 - r1
        L38:
            android.graphics.RectF r0 = r8.LL
            r0.set(r2, r4, r3, r3)
            android.graphics.RectF r0 = r8.LL
            return r0
        L40:
            float r1 = r6.left
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L48
            float r2 = -r1
            goto L38
        L48:
            float r1 = r6.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L4f
            goto L37
        L4f:
            r2 = 0
            goto L38
        L51:
            float r1 = r6.top
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L59
            float r4 = -r1
            goto L2c
        L59:
            float r1 = r6.bottom
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L60
            goto L2b
        L60:
            r4 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80634Vkk.LIZLLL(android.graphics.Matrix):android.graphics.RectF");
    }

    public final float LJ(VIK vik) {
        if (vik == VIK.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (vik == VIK.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / LJFF(this.LJLILLLLZI));
        }
        return 1.0f / LJFF(this.LJLILLLLZI);
    }

    public final float LJFF(Matrix matrix) {
        matrix.getValues(this.LJLLJ);
        return this.LJLLJ[0];
    }

    public final void LJIIL(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        LJIILIIL(f, center.x, center.y);
    }

    public void setDisplayType(VIK vik) {
        if (vik != this.LJLZ) {
            this.LJLJL = false;
            this.LJLZ = vik;
            this.LJZ = true;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(final Bitmap bitmap) {
        if (bitmap != null) {
            LJIIJ(new Drawable(bitmap) { // from class: X.6cv
                public final Bitmap LIZ;
                public final Paint LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
                    return this.LIZLLL;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
                    return this.LIZJ;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumHeight() {
                    return this.LIZLLL;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumWidth() {
                    return this.LIZJ;
                }

                {
                    this.LIZ = bitmap;
                    if (bitmap != null) {
                        this.LIZJ = bitmap.getWidth();
                        this.LIZLLL = bitmap.getHeight();
                    } else {
                        this.LIZJ = 0;
                        this.LIZLLL = 0;
                    }
                    Paint paint = new Paint();
                    this.LIZIZ = paint;
                    paint.setDither(true);
                    paint.setFilterBitmap(true);
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Bitmap bitmap2 = this.LIZ;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        canvas.drawBitmap(this.LIZ, 0.0f, 0.0f, this.LIZIZ);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZIZ.setAlpha(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZIZ.setColorFilter(colorFilter);
                }
            }, null, -1.0f, -1.0f);
        } else {
            LJIIJ(null, null, -1.0f, -1.0f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        LJIIJ(drawable, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if (matrix == null) {
            imageMatrix.isIdentity();
        } else {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setMaxScale(float f) {
        this.LJLJLJ = f;
    }

    public void setMinScale(float f) {
        this.LJLJLLL = f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public AbstractC80634Vkk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LJI(Context context, AttributeSet attributeSet) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void LJIIIIZZ(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.LLD.set((float) d, (float) d2, 0.0f, 0.0f);
        LJIIJJI(bitmapRect, this.LLD);
        RectF rectF = this.LLD;
        LJIIIZ(rectF.left, rectF.top);
        LIZIZ();
    }

    public final void LJIIIZ(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.LJLJI.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public final void LJIIJJI(RectF rectF, RectF rectF2) {
        if (rectF == null) {
            return;
        }
        if (rectF.top >= 0.0f && rectF.bottom <= this.LJLLLL) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= this.LJLLL) {
            rectF2.left = 0.0f;
        }
        if (rectF2.top + rectF.top >= 0.0f && rectF.bottom > this.LJLLLL) {
            rectF2.top = (int) (0.0f - r2);
        }
        if (rectF2.top + rectF.bottom <= this.LJLLLL && rectF.top < 0.0f) {
            rectF2.top = (int) (r1 - r4);
        }
        if (rectF2.left + rectF.left >= 0.0f) {
            rectF2.left = (int) (0.0f - r1);
        }
        if (rectF2.left + rectF.right <= this.LJLLL) {
            rectF2.left = (int) (r1 - r3);
        }
    }

    public AbstractC80634Vkk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = new C73312Spw();
        this.LJLILLLLZI = new Matrix();
        this.LJLJI = new Matrix();
        this.LJLJJL = new Handler();
        this.LJLJJLL = null;
        this.LJLJL = false;
        this.LJLJLJ = -1.0f;
        this.LJLJLLL = -1.0f;
        this.LJLLILLLL = new Matrix();
        this.LJLLJ = new float[9];
        this.LJLLL = -1;
        this.LJLLLL = -1;
        this.LJLLLLLL = new PointF();
        this.LJLZ = VIK.NONE;
        this.LJZL = new RectF();
        this.LL = new RectF();
        this.LLD = new RectF();
        LJI(context, attributeSet);
    }

    public final void LJIILIIL(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float scale = f / getScale();
        this.LJLJI.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        getScale();
        LIZIZ();
    }

    public void LIZ(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.LJLILLLLZI.reset();
            super.setImageDrawable(null);
        }
        if (f != -1.0f && f2 != -1.0f) {
            float min = Math.min(f, f2);
            float max = Math.max(min, f2);
            this.LJLJLLL = min;
            this.LJLJLJ = max;
            this.LJLLI = true;
            this.LJLL = true;
            VIK vik = this.LJLZ;
            if (vik == VIK.FIT_TO_SCREEN || vik == VIK.FIT_IF_BIGGER) {
                if (min >= 1.0f) {
                    this.LJLLI = false;
                    this.LJLJLLL = -1.0f;
                }
                if (max <= 1.0f) {
                    this.LJLL = true;
                    this.LJLJLJ = -1.0f;
                }
            }
        } else {
            this.LJLJLLL = -1.0f;
            this.LJLJLJ = -1.0f;
            this.LJLLI = false;
            this.LJLL = false;
        }
        if (matrix != null) {
            this.LJLJJI = new Matrix(matrix);
        }
        this.LJZI = true;
        requestLayout();
    }

    public final void LJIIJ(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            this.LJLJJLL = new RunnableC80637Vkn(this, drawable, matrix, f, f2);
        } else {
            LIZ(drawable, matrix, f, f2);
        }
    }

    public final void LJIILJJIL(float f, float f2, float f3, float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        long currentTimeMillis = System.currentTimeMillis();
        float scale = getScale();
        Matrix matrix = new Matrix(this.LJLJI);
        matrix.postScale(f, f, f2, f3);
        RectF LIZLLL = LIZLLL(matrix);
        this.LJLJJL.post(new RunnableC80636Vkm(this, f4, currentTimeMillis, f - scale, scale, (LIZLLL.left * f) + f2, (LIZLLL.top * f) + f3));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float LJ;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i7 = this.LJLLL;
            int i8 = this.LJLLLL;
            int i9 = i3 - i;
            this.LJLLL = i9;
            int i10 = i4 - i2;
            this.LJLLLL = i10;
            i5 = i9 - i7;
            i6 = i10 - i8;
            PointF pointF = this.LJLLLLLL;
            pointF.x = i9 / 2.0f;
            pointF.y = i10 / 2.0f;
        } else {
            i5 = 0;
            i6 = 0;
        }
        RunnableC80637Vkn runnableC80637Vkn = this.LJLJJLL;
        if (runnableC80637Vkn != null) {
            this.LJLJJLL = null;
            runnableC80637Vkn.run();
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (z || this.LJZ || this.LJZI) {
                LJ(this.LJLZ);
                float LJFF = LJFF(this.LJLILLLLZI);
                float scale = getScale();
                float min = Math.min(1.0f, 1.0f / LJFF);
                Matrix matrix = this.LJLILLLLZI;
                float f = this.LJLLL;
                float f2 = this.LJLLLL;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                matrix.reset();
                if (intrinsicWidth > f || intrinsicHeight > f2) {
                    float min2 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
                    matrix.postScale(min2, min2);
                    matrix.postTranslate((f - (intrinsicWidth * min2)) / 2.0f, (f2 - (intrinsicHeight * min2)) / 2.0f);
                } else {
                    float min3 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
                    matrix.postScale(min3, min3);
                    matrix.postTranslate((f - (intrinsicWidth * min3)) / 2.0f, (f2 - (intrinsicHeight * min3)) / 2.0f);
                }
                float LJFF2 = LJFF(this.LJLILLLLZI);
                if (this.LJZI || this.LJZ) {
                    Matrix matrix2 = this.LJLJJI;
                    if (matrix2 != null) {
                        this.LJLJI.set(matrix2);
                        this.LJLJJI = null;
                        LJ = getScale();
                    } else {
                        this.LJLJI.reset();
                        LJ = LJ(this.LJLZ);
                    }
                    setImageMatrix(getImageViewMatrix());
                    if (LJ != getScale()) {
                        LJIIL(LJ);
                    }
                } else if (z) {
                    if (!this.LJLLI) {
                        this.LJLJLLL = -1.0f;
                    }
                    if (!this.LJLL) {
                        this.LJLJLJ = -1.0f;
                    }
                    setImageMatrix(getImageViewMatrix());
                    LJIIIZ(-i5, -i6);
                    if (!this.LJLJL) {
                        LJ = LJ(this.LJLZ);
                        LJIIL(LJ);
                    } else {
                        if (Math.abs(scale - min) > 0.001d) {
                            LJ = (LJFF / LJFF2) * scale;
                        } else {
                            LJ = 1.0f;
                        }
                        LJIIL(LJ);
                    }
                } else {
                    LJ = 1.0f;
                }
                this.LJLJL = false;
                if (LJ > getMaxScale() || LJ < getMinScale()) {
                    LJIIL(LJ);
                }
                LIZIZ();
                boolean z2 = this.LJZI;
                if (this.LJZ) {
                    this.LJZ = false;
                }
                if (z2) {
                    this.LJZI = false;
                    return;
                }
                return;
            }
            return;
        }
        if (this.LJZI) {
            this.LJZI = false;
        }
        if (!this.LJZ) {
            return;
        }
        this.LJZ = false;
    }
}
