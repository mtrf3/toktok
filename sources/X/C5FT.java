package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5FT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FT extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
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
        return (int) (this.LIZJ * this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.LIZJ * this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJFF.setColor(this.LIZLLL);
        float f = this.LIZIZ / 2;
        float centerY = getBounds().centerY() - f;
        float centerY2 = getBounds().centerY() + f;
        if (this.LJII.isEmpty()) {
            Rect bounds = getBounds();
            o.LJIIIIZZ(bounds, "bounds");
            this.LJII = bounds;
        }
        float f2 = getBounds().left;
        float f3 = getBounds().right;
        float f4 = this.LIZ;
        if (f2 <= f4 / 2.0f) {
            f2 = f4 / 2.0f;
            f3 = 1.5f * f4;
        } else if (f2 >= this.LJII.width() - (this.LIZ / 2.0f)) {
            f2 = this.LJII.width() - (this.LIZ / 2.0f);
            f3 = this.LJII.width() + (this.LIZ / 2.0f);
        }
        this.LJI.set(f2, centerY, f3, centerY2);
        RectF rectF = this.LJI;
        float f5 = this.LJ;
        canvas.drawRoundRect(rectF, f5, f5, this.LJFF);
    }

    public C5FT(Context context, AttributeSet attributeSet, float f, float f2) {
        o.LJIIIZ(context, "context");
        this.LIZ = f;
        this.LIZIZ = f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b2c, R.attr.b2d, R.attr.b2e, R.attr.b2f, R.attr.b2g, R.attr.b2h, R.attr.b2i, R.attr.b2j, R.attr.b2k, R.attr.b2l, R.attr.b2m, R.attr.b2n, R.attr.b2o, R.attr.b2p, R.attr.b2q});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.NewProgressSeekBar)");
        this.LIZJ = 1.0f;
        this.LIZLLL = obtainStyledAttributes.getColor(6, -1);
        this.LJ = obtainStyledAttributes.getDimension(9, C7MY.LIZIZ(8));
        int color = obtainStyledAttributes.getColor(11, -16777216);
        Paint paint = new Paint();
        this.LJFF = paint;
        this.LJI = new RectF();
        this.LJII = new Rect();
        paint.setAntiAlias(true);
        paint.setShadowLayer(8.0f, -2.0f, 0.0f, color);
    }
}
