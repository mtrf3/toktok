package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DI0 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 24;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 24;
    }

    public DI0() {
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(10.25f, 15.06f);
        dij.LJIIL(7.88f, -8.12f);
        dij.LJIIJ(0.2f, -0.2f, 0.51f, -0.2f, 0.7f, 0.0f);
        dij.LJIIL(0.73f, 0.7f);
        dij.LJIIJ(0.2f, 0.18f, 0.2f, 0.5f, 0.0f, 0.7f);
        dij.LJIIL(-8.6f, 8.86f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.43f, 0.0f);
        dij.LJIIL(-4.1f, -4.23f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.01f, -0.7f);
        dij.LJIIL(0.72f, -0.7f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.7f, 0.01f);
        dij.LJIIL(3.39f, 3.48f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(24.0f, 24.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        int i = 0;
        do {
            canvas.drawPath(this.LJFF.LIZ, this.LJ);
            i++;
        } while (i < 5);
    }
}
