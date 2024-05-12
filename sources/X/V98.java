package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes14.dex */
public final class V98 extends C80627Vkd implements V95 {
    public final V99 LJLJJL;
    public final RectF LJLJJLL;
    public RectF LJLJL;
    public Matrix LJLJLJ;
    public final float[] LJLJLLL;
    public final float[] LJLL;
    public final Paint LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public boolean LJLZ;
    public final Path LJZ;
    public final Path LJZI;
    public final RectF LJZL;

    public final void LJIILJJIL() {
        float[] fArr;
        this.LJZ.reset();
        this.LJZI.reset();
        this.LJZL.set(getBounds());
        RectF rectF = this.LJZL;
        float f = this.LJLLLLLL;
        rectF.inset(f, f);
        this.LJZ.addRect(this.LJZL, Path.Direction.CW);
        if (this.LJLLILLLL) {
            this.LJZ.addCircle(this.LJZL.centerX(), this.LJZL.centerY(), Math.min(this.LJZL.width(), this.LJZL.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.LJZ.addRoundRect(this.LJZL, this.LJLJLLL, Path.Direction.CW);
        }
        RectF rectF2 = this.LJZL;
        float f2 = this.LJLLLLLL;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.LJZL;
        float f3 = this.LJLLJ;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.LJLLILLLL) {
            this.LJZI.addCircle(this.LJZL.centerX(), this.LJZL.centerY(), Math.min(this.LJZL.width(), this.LJZL.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.LJLL;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.LJLJLLL[i] + this.LJLLLLLL) - (this.LJLLJ / 2.0f);
                i++;
            }
            this.LJZI.addRoundRect(this.LJZL, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.LJZL;
        float f4 = this.LJLLJ;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V98(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.LJLJJL = V99.OVERLAY_COLOR;
        this.LJLJJLL = new RectF();
        this.LJLJLLL = new float[8];
        this.LJLL = new float[8];
        this.LJLLI = new Paint(1);
        this.LJLLILLLL = false;
        this.LJLLJ = 0.0f;
        this.LJLLL = 0;
        this.LJLLLL = 0;
        this.LJLLLLLL = 0.0f;
        this.LJLZ = false;
        this.LJZ = new Path();
        this.LJZI = new Path();
        this.LJZL = new RectF();
    }

    @Override // X.V95
    public final void LIZ(boolean z) {
        this.LJLLILLLL = z;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LIZJ(float f) {
        this.LJLLLLLL = f;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJFF(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.LJLJLLL, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C32151Nz.LJFF("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LJLJLLL, 0, 8);
        }
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJII(float f) {
        Arrays.fill(this.LJLJLLL, 0.0f);
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJIIJJI(boolean z) {
        this.LJLZ = z;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJLJJLL.set(getBounds());
        int i = V9A.LIZ[this.LJLJJL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LJLZ) {
                    RectF rectF = this.LJLJL;
                    if (rectF == null) {
                        this.LJLJL = new RectF(this.LJLJJLL);
                        this.LJLJLJ = new Matrix();
                    } else {
                        rectF.set(this.LJLJJLL);
                    }
                    RectF rectF2 = this.LJLJL;
                    float f = this.LJLLJ;
                    rectF2.inset(f, f);
                    this.LJLJLJ.setRectToRect(this.LJLJJLL, this.LJLJL, Matrix.ScaleToFit.FILL);
                    int save = canvas.save();
                    canvas.clipRect(this.LJLJJLL);
                    canvas.concat(this.LJLJLJ);
                    super.draw(canvas);
                    canvas.restoreToCount(save);
                } else {
                    super.draw(canvas);
                }
                this.LJLLI.setStyle(Paint.Style.FILL);
                this.LJLLI.setColor(this.LJLLLL);
                this.LJLLI.setStrokeWidth(0.0f);
                this.LJZ.setFillType(Path.FillType.EVEN_ODD);
                canvas.drawPath(this.LJZ, this.LJLLI);
                if (this.LJLLILLLL) {
                    float width = ((this.LJLJJLL.width() - this.LJLJJLL.height()) + this.LJLLJ) / 2.0f;
                    float height = ((this.LJLJJLL.height() - this.LJLJJLL.width()) + this.LJLLJ) / 2.0f;
                    if (width > 0.0f) {
                        RectF rectF3 = this.LJLJJLL;
                        float f2 = rectF3.left;
                        canvas.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.LJLLI);
                        RectF rectF4 = this.LJLJJLL;
                        float f3 = rectF4.right;
                        canvas.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.LJLLI);
                    }
                    if (height > 0.0f) {
                        RectF rectF5 = this.LJLJJLL;
                        float f4 = rectF5.left;
                        float f5 = rectF5.top;
                        canvas.drawRect(f4, f5, rectF5.right, f5 + height, this.LJLLI);
                        RectF rectF6 = this.LJLJJLL;
                        float f6 = rectF6.left;
                        float f7 = rectF6.bottom;
                        canvas.drawRect(f6, f7 - height, rectF6.right, f7, this.LJLLI);
                    }
                }
            }
        } else {
            int save2 = canvas.save();
            this.LJZ.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.LJZ);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.LJLLL != 0) {
            this.LJLLI.setStyle(Paint.Style.STROKE);
            this.LJLLI.setColor(this.LJLLL);
            this.LJLLI.setStrokeWidth(this.LJLLJ);
            this.LJZ.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.LJZI, this.LJLLI);
        }
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LJIILJJIL();
    }

    @Override // X.V95
    public final void LIZIZ(float f, int i) {
        this.LJLLL = i;
        this.LJLLJ = f;
        LJIILJJIL();
        invalidateSelf();
    }
}
