package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.VuX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81241VuX extends Drawable {
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public boolean LJII;
    public final Paint LJIIIIZZ;
    public float LIZ = 1.0f;
    public float LIZIZ = 20.0f;
    public int LIZJ = -1;
    public int LJI = -16777216;

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
        return (int) (this.LIZ * this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.LIZ * this.LIZIZ);
    }

    public C81241VuX() {
        Paint paint = new Paint();
        this.LJIIIIZZ = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        o.LJIIIZ(canvas, "canvas");
        this.LJIIIIZZ.setColor(this.LIZJ);
        this.LJIIIIZZ.setShadowLayer(this.LJFF, this.LIZLLL, this.LJ, this.LJI);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        if (this.LJII) {
            f = this.LIZIZ * this.LIZ;
        } else {
            f = this.LIZIZ;
        }
        canvas.drawCircle(centerX, centerY, f / 2, this.LJIIIIZZ);
    }
}
