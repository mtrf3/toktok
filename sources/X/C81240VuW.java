package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.VuW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81240VuW extends Drawable {
    public float LJ;
    public float LJFF;
    public float LJI;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final Paint LJIIL;
    public final RectF LJIILIIL;
    public boolean LJIILJJIL;
    public final float LIZ = 1.0f;
    public int LIZIZ = -1;
    public float LIZJ = -1.0f;
    public int LIZLLL = -16777216;
    public final float LJII = 0.5f;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.LJFF * this.LIZ);
    }

    public final String toString() {
        return "ThumbDrawable(maxSizeScale=" + this.LIZ + ", thumbColor=" + this.LIZIZ + ", shadowOffsetX=0.0, shadowOffsetY=0.0, shadowRadius=" + this.LIZJ + ", shadowColor=" + this.LIZLLL + ", thumbWidth=" + this.LJ + ", thumbHeight=" + this.LJFF + ", thumbRadius=" + this.LJI + ", offsetThumbToProgress=" + this.LJII + ", drawProgressScale=" + this.LJIIIZ + ", trackerWidth=" + this.LJIIJ + ", offsetY=" + this.LJIIJJI + ", paint=" + this.LJIIL + ", rectF=" + this.LJIILIIL + ", isRTL=" + this.LJIILJJIL + ", exactCenterY(): " + getBounds().exactCenterY() + ')';
    }

    public C81240VuW() {
        Paint paint = new Paint();
        this.LJIIL = paint;
        this.LJIILIIL = new RectF();
        this.LJIILJJIL = C251659uD.LIZ();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJIIL.setColor(this.LIZIZ);
        float f = this.LIZJ;
        if (f >= 0.0f) {
            this.LJIIL.setShadowLayer(f, 0.0f, 0.0f + this.LJIIJJI, this.LIZLLL);
        }
        float f2 = this.LJIIJ;
        float f3 = this.LJIIIZ;
        float f4 = f2 * f3;
        int i = this.LJIIIIZZ / 2;
        float f5 = this.LJ;
        float f6 = f4 - (f5 * f3);
        float LIZIZ = C06420Na.LIZIZ(1, f3, f5, f4);
        float f7 = i;
        float f8 = this.LJFF;
        float f9 = 2;
        float f10 = this.LJIIJJI;
        getBounds().left = Math.max(0, (int) f6);
        getBounds().right = (int) LIZIZ;
        this.LJIILIIL.set(f6, (f7 - (f8 / f9)) + f10, LIZIZ, (f8 / f9) + f7 + f10);
        RectF rectF = this.LJIILIIL;
        float f11 = this.LJI;
        canvas.drawRoundRect(rectF, f11, f11, this.LJIIL);
    }
}
