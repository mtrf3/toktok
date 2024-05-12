package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DIR extends DIU {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ = C63044Ooi.LJLJL;
    public final Paint LIZLLL = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int i = this.LIZJ;
        float f = i / 2.0f;
        float f2 = i / 16.0f;
        this.LIZLLL.setAntiAlias(true);
        this.LIZLLL.setStyle(Paint.Style.FILL);
        this.LIZLLL.setColor(this.LIZIZ);
        canvas.drawCircle(f, f, f - f2, this.LIZLLL);
        this.LIZLLL.setStyle(Paint.Style.STROKE);
        this.LIZLLL.setStrokeWidth(f2);
        this.LIZLLL.setColor(this.LIZ);
        canvas.drawCircle(f, f, f - (f2 / 2), this.LIZLLL);
    }

    public DIR(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
