package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07850Sn extends Drawable {
    public final Bitmap LIZ;
    public final int LIZIZ;
    public final BitmapShader LJ;
    public float LJI;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final int LIZJ = 119;
    public final Paint LIZLLL = new Paint(3);
    public final Matrix LJFF = new Matrix();
    public final Rect LJII = new Rect();
    public final RectF LJIIIIZZ = new RectF();
    public boolean LJIIIZ = true;

    public abstract void LIZ(int i, int i2, int i3, Rect rect, Rect rect2);

    public final void LIZIZ() {
        this.LJIIJ = true;
        this.LJIIIZ = true;
        this.LJI = Math.min(this.LJIIL, this.LJIIJJI) / 2;
        this.LIZLLL.setShader(this.LJ);
        invalidateSelf();
    }

    public final void LIZLLL() {
        if (this.LJIIIZ) {
            if (this.LJIIJ) {
                int min = Math.min(this.LJIIJJI, this.LJIIL);
                LIZ(this.LIZJ, min, min, getBounds(), this.LJII);
                int min2 = Math.min(this.LJII.width(), this.LJII.height());
                this.LJII.inset(Math.max(0, (this.LJII.width() - min2) / 2), Math.max(0, (this.LJII.height() - min2) / 2));
                this.LJI = min2 * 0.5f;
            } else {
                LIZ(this.LIZJ, this.LJIIJJI, this.LJIIL, getBounds(), this.LJII);
            }
            this.LJIIIIZZ.set(this.LJII);
            if (this.LJ != null) {
                Matrix matrix = this.LJFF;
                RectF rectF = this.LJIIIIZZ;
                matrix.setTranslate(rectF.left, rectF.top);
                this.LJFF.preScale(this.LJIIIIZZ.width() / this.LIZ.getWidth(), this.LJIIIIZZ.height() / this.LIZ.getHeight());
                this.LJ.setLocalMatrix(this.LJFF);
                this.LIZLLL.setShader(this.LJ);
            }
            this.LJIIIZ = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LIZLLL.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LIZLLL.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.LIZJ != 119 || this.LJIIJ || (bitmap = this.LIZ) == null || bitmap.hasAlpha() || this.LIZLLL.getAlpha() < 255 || this.LJI > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJIIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJIIJJI;
    }

    public final void LIZJ(float f) {
        if (this.LJI == f) {
            return;
        }
        this.LJIIJ = false;
        if (f > 0.05f) {
            this.LIZLLL.setShader(this.LJ);
        } else {
            this.LIZLLL.setShader(null);
        }
        this.LJI = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.LIZ;
        if (bitmap == null) {
            return;
        }
        LIZLLL();
        if (this.LIZLLL.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.LJII, this.LIZLLL);
            return;
        }
        RectF rectF = this.LJIIIIZZ;
        float f = this.LJI;
        canvas.drawRoundRect(rectF, f, f, this.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.LJIIJ) {
            this.LJI = Math.min(this.LJIIL, this.LJIIJJI) / 2;
        }
        this.LJIIIZ = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LIZLLL.getAlpha()) {
            this.LIZLLL.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LIZLLL.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LIZLLL.setFilterBitmap(z);
        invalidateSelf();
    }

    public AbstractC07850Sn(Resources resources, Bitmap bitmap) {
        this.LIZIZ = 160;
        if (resources != null) {
            this.LIZIZ = resources.getDisplayMetrics().densityDpi;
        }
        this.LIZ = bitmap;
        if (bitmap != null) {
            this.LJIIJJI = bitmap.getScaledWidth(this.LIZIZ);
            this.LJIIL = bitmap.getScaledHeight(this.LIZIZ);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.LJ = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.LJIIL = -1;
        this.LJIIJJI = -1;
        this.LJ = null;
    }
}
