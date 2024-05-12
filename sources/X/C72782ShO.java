package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS44S0001000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.ShO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72782ShO extends Drawable {
    public final int LIZ;
    public final C72783ShP LIZJ;
    public final C62822Ol8 LIZLLL;
    public int LIZIZ = -1;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1113));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(G3H.LJLIL);

    public final Paint LIZ() {
        return (Paint) this.LIZLLL.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return LIZ().getAlpha();
    }

    public final void LIZIZ(int i) {
        if (this.LIZIZ != i) {
            this.LIZIZ = i;
            ((Paint) this.LJFF.getValue()).setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            C72783ShP c72783ShP = this.LIZJ;
            o.LJI(c72783ShP);
            float f = c72783ShP.LJLJJLL;
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            C72783ShP c72783ShP2 = this.LIZJ;
            if (c72783ShP2 != null) {
                float f2 = c72783ShP2.LJLIL;
                rectF.top += f2;
                rectF.bottom -= f2;
                float f3 = f2 / 2;
                rectF.left += f3;
                rectF.right -= f3;
                canvas.save();
                canvas.translate(c72783ShP2.LJLJI, c72783ShP2.LJLJJI);
                canvas.drawRoundRect(rectF, f, f, (Paint) this.LJ.getValue());
                canvas.restore();
            }
            if (this.LIZ != 0) {
                canvas.drawRoundRect(rectF, f, f, LIZ());
            }
            if (this.LIZIZ != -1) {
                canvas.drawRoundRect(rectF, f, f, (Paint) this.LJFF.getValue());
            }
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

    public C72782ShO(int i, C72783ShP c72783ShP) {
        this.LIZ = i;
        this.LIZJ = c72783ShP;
        this.LIZLLL = C221108m2.LIZIZ(new AqS44S0001000_6(i, 1));
    }
}
