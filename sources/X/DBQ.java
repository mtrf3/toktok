package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBQ extends AbstractC39455Fe7 {
    public DBQ() {
        this.LIZJ.LJIIIIZZ(4.74f, 10.87f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, true, 7.08f, 6.0f);
        this.LIZJ.LJI(40.7f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 2.2f, 5.05f);
        this.LIZJ.LJII(31.0f, 23.79f);
        this.LIZJ.LJIILL(17.47f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -4.51f, 2.59f);
        this.LIZJ.LJIIL(-10.0f, -5.83f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -1.49f, -2.6f);
        this.LIZJ.LJIJ(23.7f);
        this.LIZJ.LJII(4.74f, 10.87f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.16f, 10.0f);
        this.LIZJ.LJIIL(9.18f, 11.48f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.66f, 1.87f);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        this.LIZJ.LJIIL(8.0f, 4.67f);
        this.LIZJ.LJIJ(23.39f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.8f, -2.04f);
        this.LIZJ.LJII(38.4f, 10.0f);
        this.LIZJ.LJI(9.16f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
