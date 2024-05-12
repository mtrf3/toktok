package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.ShR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72785ShR extends Drawable {
    public final float LIZ;
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public final Path LIZLLL;
    public final RectF LJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.LIZIZ.getAlpha();
        if (alpha != 0) {
            if (alpha != 255) {
                return -3;
            }
            return -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.drawPath(this.LIZLLL, this.LIZJ);
        canvas.drawPath(this.LIZLLL, this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        o.LJIIIZ(bounds, "bounds");
        Path path = this.LIZLLL;
        path.rewind();
        RectF rectF = this.LJ;
        int i = bounds.left;
        float f = this.LIZ;
        int i2 = bounds.top;
        int i3 = bounds.bottom;
        rectF.set(i - f, ((i2 + i3) / 2.0f) - f, i + f, ((i2 + i3) / 2.0f) + f);
        path.arcTo(this.LJ, 90.0f, 180.0f, false);
        this.LJ.set(bounds.right - (bounds.height() / 2.0f), bounds.top, (bounds.height() / 2.0f) + bounds.right, bounds.bottom);
        path.arcTo(this.LJ, -90.0f, 180.0f, false);
        path.close();
        path.setFillType(Path.FillType.WINDING);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZIZ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C72785ShR(float f, int i) {
        this.LIZ = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.LIZIZ = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(1073741824);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setMaskFilter(new BlurMaskFilter(2.236068f, BlurMaskFilter.Blur.OUTER));
        this.LIZJ = paint2;
        this.LIZLLL = new Path();
        this.LJ = new RectF();
    }
}
