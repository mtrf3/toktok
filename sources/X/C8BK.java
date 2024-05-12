package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS42S0001000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8BK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BK extends Drawable {
    public final C89V LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 13));

    public final Paint LIZ() {
        return (Paint) this.LIZIZ.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return LIZ().getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float f = width;
            float f2 = height;
            float min = Math.min(f, f2) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            C89V c89v = this.LIZ;
            if (c89v != null) {
                float abs = Math.abs(c89v.LJLJJI) + c89v.LJLIL;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(c89v.LJLJI, c89v.LJLJJI);
                canvas.drawRoundRect(rectF, min, min, (Paint) this.LIZJ.getValue());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, min, min, LIZ());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        o.LJIIIZ(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (LIZ().getAlpha() != i) {
            LIZ().setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        LIZ().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C8BK(int i, C89V c89v) {
        this.LIZ = c89v;
        this.LIZIZ = C221108m2.LIZIZ(new AqS42S0001000_3(i, 0));
    }
}
