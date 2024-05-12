package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.VuS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81236VuS extends Drawable {
    public final C81240VuW LIZ;
    public int LIZJ;
    public float LJ;
    public float LJFF;
    public float LJI;
    public final Paint LJII;
    public final RectF LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LIZIZ = -16777216;
    public int LIZLLL = -16777216;

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

    public C81236VuS(C81240VuW c81240VuW) {
        this.LIZ = c81240VuW;
        Paint paint = new Paint();
        this.LJII = paint;
        this.LJIIIIZZ = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float width = getBounds().width();
        float f = this.LJ / 2;
        float centerY = (getBounds().centerY() - f) + this.LJI;
        float centerY2 = getBounds().centerY() + f + this.LJI;
        this.LJII.setColor(this.LIZLLL);
        this.LJIIIIZZ.set(0.0f, centerY, width, centerY2);
        RectF rectF = this.LJIIIIZZ;
        float f2 = this.LJFF;
        canvas.drawRoundRect(rectF, f2, f2, this.LJII);
        if (this.LJIIJ > this.LJIIIZ) {
            this.LJII.setColor(this.LIZJ);
            this.LJIIIIZZ.set(this.LJIIIZ * width, centerY, this.LJIIJ * width, centerY2);
            RectF rectF2 = this.LJIIIIZZ;
            float f3 = this.LJFF;
            canvas.drawRoundRect(rectF2, f3, f3, this.LJII);
        }
        this.LJII.setColor(this.LIZIZ);
        this.LJIIIIZZ.set(0.0f, centerY, width * this.LJIIIZ, centerY2);
        this.LIZ.draw(canvas);
        float f4 = this.LJFF;
        Path path = new Path();
        path.addRoundRect(this.LJIIIIZZ, new float[]{f4, f4, 0.0f, 0.0f, 0.0f, 0.0f, f4, f4}, Path.Direction.CW);
        canvas.drawPath(path, this.LJII);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }
}
