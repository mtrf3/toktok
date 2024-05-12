package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBC extends AbstractC39455Fe7 {
    public DBC() {
        this.LIZJ.LJIIIIZZ(23.32f, 17.0f);
        this.LIZJ.LIZJ(12.6f, 12.6f, false, true, 36.0f, 4.5f);
        this.LIZJ.LIZJ(12.6f, 12.6f, false, true, 48.68f, 17.0f);
        this.LIZJ.LJIIJ(0.0f, 2.38f, -0.67f, 4.6f, -1.85f, 6.5f);
        this.LIZJ.LJI(25.17f);
        this.LIZJ.LJIIIZ(12.3f, 12.3f, false, true, -1.85f, -6.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(28.36f, 0.0f);
        this.LIZJ.LIZJ(15.6f, 15.6f, false, false, 36.0f, 1.5f);
        this.LIZJ.LIZJ(15.6f, 15.6f, false, false, 20.32f, 17.0f);
        this.LIZJ.LJIIJ(0.0f, 2.32f, 0.52f, 4.52f, 1.44f, 6.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-11.7f);
        this.LIZJ.LJIIIZ(5.52f, 5.52f, false, false, -5.54f, 6.0f);
        this.LIZJ.LJIIL(3.32f, 36.0f);
        this.LIZJ.LJIIJ(0.26f, 2.85f, 2.67f, 5.0f, 5.53f, 5.0f);
        this.LIZJ.LJIIJJI(45.26f);
        this.LIZJ.LJIIIZ(5.53f, 5.53f, false, false, 5.53f, -5.0f);
        this.LIZJ.LJIIL(3.32f, -36.0f);
        this.LIZJ.LJIIJ(0.3f, -3.24f, -2.29f, -6.0f, -5.53f, -6.0f);
        this.LIZJ.LJI(50.24f);
        this.LIZJ.LJIIIZ(15.3f, 15.3f, false, false, 1.44f, -6.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.5f, 29.22f);
        this.LIZJ.LJIIIZ(2.52f, 2.52f, false, true, 2.54f, -2.72f);
        this.LIZJ.LJIIJJI(51.9f);
        this.LIZJ.LJIIIZ(2.52f, 2.52f, false, true, 2.54f, 2.72f);
        this.LIZJ.LJIIL(-3.32f, 36.0f);
        this.LIZJ.LJIIIZ(2.53f, 2.53f, false, true, -2.54f, 2.28f);
        this.LIZJ.LJI(13.37f);
        this.LIZJ.LJIIJ(-1.34f, 0.0f, -2.43f, -1.0f, -2.54f, -2.28f);
        this.LIZJ.LJIIL(-3.32f, -36.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(24.36f, 7.28f);
        C32856Cuy.D2(this.LIZJ);
        this.LIZJ.LJIILIIL(16.1f, 0.0f);
        C32856Cuy.D2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
