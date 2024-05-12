package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DIQ extends DIU {
    public final int LIZ;
    public final int LIZIZ = C63044Ooi.LJLJL;
    public final Paint LIZJ = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZIZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZIZ;
    }

    public DIQ(int i) {
        this.LIZ = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int i = this.LIZIZ;
        float f = i / 2.0f;
        float f2 = i / 12.0f;
        this.LIZJ.setAntiAlias(true);
        this.LIZJ.setStyle(Paint.Style.STROKE);
        this.LIZJ.setStrokeWidth(f2);
        this.LIZJ.setColor(this.LIZ);
        canvas.drawCircle(f, f, f - (f2 / 2), this.LIZJ);
        this.LIZJ.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f, i / 3.0f, this.LIZJ);
    }
}
