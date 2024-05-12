package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.5FS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FS extends Drawable {
    public final float LIZ = 1.0f;
    public final int LIZIZ = C7MY.LIZIZ(16);
    public final int LIZJ = -1;
    public final float LIZLLL = C7MY.LIZIZ(24);
    public final float LJ = C7MY.LIZIZ(6);
    public final Paint LJFF;
    public final RectF LJI;
    public Rect LJII;

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

    public C5FS() {
        Paint paint = new Paint();
        this.LJFF = paint;
        this.LJI = new RectF();
        this.LJII = new Rect();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJFF.setColor(this.LIZJ);
        float f = this.LIZLLL / 2;
        float centerY = getBounds().centerY() - f;
        float centerY2 = getBounds().centerY() + f;
        if (this.LJII.isEmpty()) {
            Rect bounds = getBounds();
            o.LJIIIIZZ(bounds, "bounds");
            this.LJII = bounds;
        }
        float f2 = getBounds().left;
        float f3 = getBounds().right;
        int i = this.LIZIZ;
        if (f2 <= i / 2.0f) {
            f2 = i / 2.0f;
            f3 = i * 1.5f;
        } else if (f2 >= this.LJII.width() - (this.LIZIZ / 2.0f)) {
            f2 = this.LJII.width() - (this.LIZIZ / 2.0f);
            f3 = this.LJII.width() + (this.LIZIZ / 2.0f);
        }
        this.LJI.set(f2, centerY, f3, centerY2);
        RectF rectF = this.LJI;
        float f4 = this.LJ;
        canvas.drawRoundRect(rectF, f4, f4, this.LJFF);
    }
}
