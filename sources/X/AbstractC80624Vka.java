package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.Vka, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80624Vka extends Drawable implements V95, InterfaceC80604VkG {
    public final Drawable LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public float LJLJJI;
    public float[] LJLLI;
    public RectF LJLLLLLL;
    public Matrix LLD;
    public Matrix LLF;
    public InterfaceC80626Vkc LLI;
    public final Path LJLJJL = new Path();
    public boolean LJLJJLL = true;
    public int LJLJL = 0;
    public final Path LJLJLJ = new Path();
    public final float[] LJLJLLL = new float[8];
    public final float[] LJLL = new float[8];
    public final RectF LJLLILLLL = new RectF();
    public final RectF LJLLJ = new RectF();
    public final RectF LJLLL = new RectF();
    public final RectF LJLLLL = new RectF();
    public final Matrix LJLZ = new Matrix();
    public final Matrix LJZ = new Matrix();
    public final Matrix LJZI = new Matrix();
    public final Matrix LJZL = new Matrix();
    public final Matrix LL = new Matrix();
    public final Matrix LLFF = new Matrix();
    public float LLFFF = 0.0f;
    public boolean LLFII = false;
    public boolean LLFZ = true;

    public final void LIZLLL() {
        float[] fArr;
        float f;
        if (this.LLFZ) {
            this.LJLJLJ.reset();
            RectF rectF = this.LJLLILLLL;
            float f2 = this.LJLJJI;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.LJLILLLLZI) {
                this.LJLJLJ.addCircle(this.LJLLILLLL.centerX(), this.LJLLILLLL.centerY(), Math.min(this.LJLLILLLL.width(), this.LJLLILLLL.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.LJLL;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.LJLJLLL[i] + this.LLFFF) - (this.LJLJJI / 2.0f);
                    i++;
                }
                this.LJLJLJ.addRoundRect(this.LJLLILLLL, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.LJLLILLLL;
            float f3 = this.LJLJJI;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.LJLJJL.reset();
            float f4 = this.LLFFF;
            if (this.LLFII) {
                f = this.LJLJJI;
            } else {
                f = 0.0f;
            }
            float f5 = f4 + f;
            this.LJLLILLLL.inset(f5, f5);
            if (this.LJLILLLLZI) {
                this.LJLJJL.addCircle(this.LJLLILLLL.centerX(), this.LJLLILLLL.centerY(), Math.min(this.LJLLILLLL.width(), this.LJLLILLLL.height()) / 2.0f, Path.Direction.CW);
            } else if (this.LLFII) {
                if (this.LJLLI == null) {
                    this.LJLLI = new float[8];
                }
                for (int i2 = 0; i2 < this.LJLL.length; i2++) {
                    this.LJLLI[i2] = this.LJLJLLL[i2] - this.LJLJJI;
                }
                this.LJLJJL.addRoundRect(this.LJLLILLLL, this.LJLLI, Path.Direction.CW);
            } else {
                this.LJLJJL.addRoundRect(this.LJLLILLLL, this.LJLJLLL, Path.Direction.CW);
            }
            float f6 = -f5;
            this.LJLLILLLL.inset(f6, f6);
            this.LJLJJL.setFillType(Path.FillType.WINDING);
            this.LLFZ = false;
        }
    }

    public final void LJ() {
        Matrix matrix;
        InterfaceC80626Vkc interfaceC80626Vkc = this.LLI;
        if (interfaceC80626Vkc != null) {
            interfaceC80626Vkc.LJIIIZ(this.LJZI);
            this.LLI.LIZLLL(this.LJLLILLLL);
        } else {
            this.LJZI.reset();
            this.LJLLILLLL.set(getBounds());
        }
        Drawable drawable = this.LJLIL;
        if (drawable instanceof BitmapDrawable) {
            this.LJLLL.set(0.0f, 0.0f, r4.getBitmap().getWidth(), r4.getBitmap().getHeight());
            this.LJLLLL.set(((BitmapDrawable) drawable).getBounds());
        } else {
            this.LJLLL.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            this.LJLLLL.set(this.LJLIL.getBounds());
        }
        this.LJLZ.setRectToRect(this.LJLLL, this.LJLLLL, Matrix.ScaleToFit.FILL);
        if (this.LLFII) {
            RectF rectF = this.LJLLLLLL;
            if (rectF == null) {
                this.LJLLLLLL = new RectF(this.LJLLILLLL);
            } else {
                rectF.set(this.LJLLILLLL);
            }
            RectF rectF2 = this.LJLLLLLL;
            float f = this.LJLJJI;
            rectF2.inset(f, f);
            if (this.LLD == null) {
                this.LLD = new Matrix();
            }
            this.LLD.setRectToRect(this.LJLLILLLL, this.LJLLLLLL, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.LLD;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.LJZI.equals(this.LJZL) || !this.LJLZ.equals(this.LJZ) || ((matrix = this.LLD) != null && !matrix.equals(this.LLF))) {
            this.LJLJJLL = true;
            this.LJZI.invert(this.LL);
            this.LLFF.set(this.LJZI);
            if (this.LLFII) {
                this.LLFF.postConcat(this.LLD);
            }
            this.LLFF.preConcat(this.LJLZ);
            this.LJZL.set(this.LJZI);
            this.LJZ.set(this.LJLZ);
            if (this.LLFII) {
                Matrix matrix3 = this.LLF;
                if (matrix3 == null) {
                    this.LLF = new Matrix(this.LLD);
                } else {
                    matrix3.set(this.LLD);
                }
            } else {
                Matrix matrix4 = this.LLF;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.LJLLILLLL.equals(this.LJLLJ)) {
            this.LLFZ = true;
            this.LJLLJ.set(this.LJLLILLLL);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.LJLIL.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLIL.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LJLIL.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.LJLIL.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.LJLIL.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.LJLIL.getOpacity();
    }

    public AbstractC80624Vka(Drawable drawable) {
        this.LJLIL = drawable;
    }

    @Override // X.V95
    public final void LIZ(boolean z) {
        this.LJLILLLLZI = z;
        this.LLFZ = true;
        invalidateSelf();
    }

    @Override // X.V95
    public final void LIZJ(float f) {
        if (this.LLFFF != f) {
            this.LLFFF = f;
            this.LLFZ = true;
            invalidateSelf();
        }
    }

    @Override // X.V95
    public final void LJFF(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.LJLJLLL, 0.0f);
            this.LJLJI = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C32151Nz.LJFF("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LJLJLLL, 0, 8);
            this.LJLJI = false;
            int i = 0;
            do {
                boolean z3 = this.LJLJI;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJLJI = z3 | z2;
                i++;
            } while (i < 8);
        }
        this.LLFZ = true;
        invalidateSelf();
    }

    @Override // X.V95
    public final void LJII(float f) {
        boolean z;
        boolean z2 = false;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        Arrays.fill(this.LJLJLLL, f);
        if (f != 0.0f) {
            z2 = true;
        }
        this.LJLJI = z2;
        this.LLFZ = true;
        invalidateSelf();
    }

    @Override // X.InterfaceC80604VkG
    public final void LJIIJ(InterfaceC80626Vkc interfaceC80626Vkc) {
        this.LLI = interfaceC80626Vkc;
    }

    @Override // X.V95
    public final void LJIIJJI(boolean z) {
        if (this.LLFII != z) {
            this.LLFII = z;
            this.LLFZ = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C81939WDv.LIZIZ();
        this.LJLIL.draw(canvas);
        C81939WDv.LIZIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.LJLIL.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.LJLIL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.LJLIL.setColorFilter(colorFilter);
    }

    @Override // X.V95
    public final void LIZIZ(float f, int i) {
        if (this.LJLJL != i || this.LJLJJI != f) {
            this.LJLJL = i;
            this.LJLJJI = f;
            this.LLFZ = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.LJLIL.setColorFilter(i, mode);
    }
}
