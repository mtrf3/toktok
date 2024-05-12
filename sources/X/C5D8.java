package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.5D8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D8 extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public boolean LIZJ;
    public final Paint LIZLLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LIZJ) {
            canvas.drawArc(new RectF(this.LIZIZ - (this.LIZ * 2), getBounds().centerY() - this.LIZ, this.LIZIZ, getBounds().centerY() + this.LIZ), 270.0f, 180.0f, true, this.LIZLLL);
            return;
        }
        float centerY = getBounds().centerY();
        float f = this.LIZ;
        canvas.drawArc(new RectF(0.0f, centerY - f, f * 2, getBounds().centerY() + this.LIZ), 90.0f, 180.0f, true, this.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
    }

    public C5D8(int i, float f, float f2, boolean z) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = z;
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(i);
        this.LIZLLL = LIZIZ;
    }
}
