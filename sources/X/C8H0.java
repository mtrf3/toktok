package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.8H0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8H0 extends Drawable {
    public float LIZIZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C8H1.LJLIL);
    public final RectF LIZJ = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LIZJ.set(getBounds());
        RectF rectF = this.LIZJ;
        float f = this.LIZIZ;
        canvas.drawRoundRect(rectF, f, f, (Paint) this.LIZ.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.LIZ.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.LIZ.getValue()).setColorFilter(colorFilter);
    }
}
