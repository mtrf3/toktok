package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDC extends AbstractC39455Fe7 {
    public DDC() {
        this.LIZJ.LJIIIIZZ(8.7f, 11.56f);
        this.LIZJ.LJIIJ(4.25f, -4.2f, 10.94f, -4.15f, 15.3f, 0.63f);
        this.LIZJ.LJIIJ(4.36f, -4.78f, 11.05f, -4.84f, 15.29f, -0.63f);
        this.LIZJ.LJIIIZ(10.82f, 10.82f, false, true, 1.16f, 14.03f);
        this.LIZJ.LJI(37.5f);
        this.LIZJ.LJIIIZ(10.32f, 10.32f, false, false, -9.97f, 13.02f);
        this.LIZJ.LJIIL(-2.47f, 2.45f);
        C32856Cuy.LLJILJIL(this.LIZJ);
        this.LIZJ.LJII(8.71f, 26.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.82f, 10.82f, false, true, 0.0f, -15.38f);
        p.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
