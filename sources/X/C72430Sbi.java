package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.Sbi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72430Sbi extends Drawable implements V95 {
    public float[] LJLJI;
    public int LJLLILLLL;
    public final float[] LJLIL = new float[8];
    public final float[] LJLILLLLZI = new float[8];
    public final Paint LJLJJI = new Paint(1);
    public boolean LJLJJL = false;
    public float LJLJJLL = 0.0f;
    public float LJLJL = 0.0f;
    public int LJLJLJ = 0;
    public boolean LJLJLLL = false;
    public final Path LJLL = new Path();
    public final Path LJLLI = new Path();
    public final RectF LJLLJ = new RectF();
    public int LJLLL = 255;

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZLLL() {
        float[] fArr;
        float f;
        float[] fArr2;
        this.LJLL.reset();
        this.LJLLI.reset();
        this.LJLLJ.set(getBounds());
        RectF rectF = this.LJLLJ;
        float f2 = this.LJLJJLL;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.LJLJJL) {
            this.LJLLI.addCircle(this.LJLLJ.centerX(), this.LJLLJ.centerY(), Math.min(this.LJLLJ.width(), this.LJLLJ.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.LJLILLLLZI;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.LJLIL[i2] + this.LJLJL) - (this.LJLJJLL / 2.0f);
                i2++;
            }
            this.LJLLI.addRoundRect(this.LJLLJ, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.LJLLJ;
        float f3 = this.LJLJJLL;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.LJLJL;
        if (this.LJLJLLL) {
            f = this.LJLJJLL;
        } else {
            f = 0.0f;
        }
        float f5 = f4 + f;
        this.LJLLJ.inset(f5, f5);
        if (this.LJLJJL) {
            this.LJLL.addCircle(this.LJLLJ.centerX(), this.LJLLJ.centerY(), Math.min(this.LJLLJ.width(), this.LJLLJ.height()) / 2.0f, Path.Direction.CW);
        } else if (this.LJLJLLL) {
            if (this.LJLJI == null) {
                this.LJLJI = new float[8];
            }
            while (true) {
                fArr2 = this.LJLJI;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.LJLIL[i] - this.LJLJJLL;
                i++;
            }
            this.LJLL.addRoundRect(this.LJLLJ, fArr2, Path.Direction.CW);
        } else {
            this.LJLL.addRoundRect(this.LJLLJ, this.LJLIL, Path.Direction.CW);
        }
        float f6 = -f5;
        this.LJLLJ.inset(f6, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int LIZIZ = C80603VkF.LIZIZ(this.LJLLILLLL, this.LJLLL) >>> 24;
        if (LIZIZ == 255) {
            return -1;
        }
        if (LIZIZ == 0) {
            return -2;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLLL;
    }

    public C72430Sbi(int i) {
        this.LJLLILLLL = 0;
        if (this.LJLLILLLL != i) {
            this.LJLLILLLL = i;
            invalidateSelf();
        }
    }

    @Override // X.V95
    public final void LIZ(boolean z) {
        this.LJLJJL = z;
        LIZLLL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LIZJ(float f) {
        if (this.LJLJL != f) {
            this.LJLJL = f;
            LIZLLL();
            invalidateSelf();
        }
    }

    @Override // X.V95
    public final void LJFF(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.LJLIL, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C32151Nz.LJFF("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LJLIL, 0, 8);
        }
        LIZLLL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJII(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("radius should be non negative", z);
        Arrays.fill(this.LJLIL, f);
        LIZLLL();
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJIIJJI(boolean z) {
        if (this.LJLJLLL != z) {
            this.LJLJLLL = z;
            LIZLLL();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJLJJI.setColor(C80603VkF.LIZIZ(this.LJLLILLLL, this.LJLLL));
        this.LJLJJI.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.LJLL, this.LJLJJI);
        if (this.LJLJJLL != 0.0f) {
            this.LJLJJI.setColor(C80603VkF.LIZIZ(this.LJLJLJ, this.LJLLL));
            this.LJLJJI.setStyle(Paint.Style.STROKE);
            this.LJLJJI.setStrokeWidth(this.LJLJJLL);
            canvas.drawPath(this.LJLLI, this.LJLJJI);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZLLL();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJLLL) {
            this.LJLLL = i;
            invalidateSelf();
        }
    }

    @Override // X.V95
    public final void LIZIZ(float f, int i) {
        if (this.LJLJLJ != i) {
            this.LJLJLJ = i;
            invalidateSelf();
        }
        if (this.LJLJJLL != f) {
            this.LJLJJLL = f;
            LIZLLL();
            invalidateSelf();
        }
    }
}
