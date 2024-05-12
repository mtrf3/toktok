package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDH extends AbstractC39455Fe7 {
    public DDH() {
        this.LIZJ.LJIIIIZZ(22.0f, 33.87f);
        this.LIZJ.LJIIJ(0.0f, -1.72f, -0.55f, -3.32f, -1.47f, -4.63f);
        this.LIZJ.LJII(24.0f, 25.1f);
        this.LIZJ.LJIIL(3.47f, 4.14f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, true, false, 4.03f, -2.97f);
        this.LIZJ.LJIIL(-4.24f, -5.06f);
        this.LIZJ.LJIIL(8.41f, -10.02f);
        this.LIZJ.LJIIIZ(4.44f, 4.44f, false, false, -0.54f, -6.26f);
        this.LIZJ.LJIIIZ(0.56f, 0.56f, false, false, -0.79f, 0.07f);
        this.LIZJ.LJII(24.0f, 17.32f);
        this.LIZJ.LJII(13.66f, 5.0f);
        this.LIZJ.LJIIIZ(0.56f, 0.56f, false, false, -0.79f, -0.07f);
        this.LIZJ.LJIIIZ(4.44f, 4.44f, false, false, -0.54f, 6.26f);
        this.LIZJ.LJIIL(8.4f, 10.02f);
        this.LIZJ.LJIIL(-4.24f, 5.06f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, true, false, 5.51f, 7.6f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-5.0f, 0.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIILIIL(20.0f, 0.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
