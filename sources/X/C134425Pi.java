package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.5Pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134425Pi extends Drawable {
    public final Paint LIZ;
    public C5PL LIZIZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public C134425Pi() {
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.STROKE);
        LIZIZ.setColor(-1);
        this.LIZ = LIZIZ;
        this.LIZIZ = C5PL.FREE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float width = getBounds().width() / 24.0f;
        this.LIZ.setStrokeWidth(2 * width);
        switch (C5PO.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
                float f = 3.5f * width;
                canvas.drawRect(f, width, getBounds().width() - f, getBounds().height() - width, this.LIZ);
                float f2 = 4 * width;
                canvas.drawRect(f + f2, width + f2, (getBounds().width() - f) - f2, getBounds().height() - (5 * width), this.LIZ);
                return;
            case 2:
                float LIZ = C1I0.LIZ(getBounds().width(), (getBounds().height() * 9.0f) / 16.0f, 2.0f, width);
                canvas.drawRect(LIZ, width, getBounds().width() - LIZ, getBounds().height() - width, this.LIZ);
                return;
            case 3:
                float LIZ2 = C1I0.LIZ(getBounds().height(), (getBounds().width() * 9.0f) / 16.0f, 2.0f, width);
                canvas.drawRect(width, LIZ2, getBounds().width() - width, getBounds().height() - LIZ2, this.LIZ);
                return;
            case 4:
                float f3 = 3 * width;
                canvas.drawRect(f3, f3, getBounds().width() - f3, getBounds().height() - f3, this.LIZ);
                return;
            case 5:
                float LIZ3 = C1I0.LIZ(getBounds().width(), (getBounds().height() * 3.0f) / 4.0f, 2.0f, width);
                canvas.drawRect(LIZ3, width, getBounds().width() - LIZ3, getBounds().height() - width, this.LIZ);
                return;
            case 6:
                float LIZ4 = C1I0.LIZ(getBounds().height(), (getBounds().width() * 3.0f) / 4.0f, 2.0f, width);
                canvas.drawRect(width, LIZ4, getBounds().width() - width, getBounds().height() - LIZ4, this.LIZ);
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
    }
}
