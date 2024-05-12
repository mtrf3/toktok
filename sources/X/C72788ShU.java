package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS47S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ShU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72788ShU extends Drawable {
    public final C72789ShV LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1251));

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
            C72789ShV c72789ShV = this.LIZ;
            if (c72789ShV != null) {
                float abs = Math.abs(c72789ShV.LJLJJI) + c72789ShV.LJLIL;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(c72789ShV.LJLJI, c72789ShV.LJLJJI);
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

    public C72788ShU(int i, C72789ShV c72789ShV) {
        this.LIZ = c72789ShV;
        this.LIZIZ = C221108m2.LIZIZ(new AqS47S0001000_12(i, 1));
    }
}
