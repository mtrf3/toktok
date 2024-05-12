package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDX extends AbstractC39455Fe7 {
    public DDX() {
        this.LIZJ.LJIIIIZZ(45.73f, 7.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 44.0f, 6.0f);
        C32856Cuy.LLLLLLLLLL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.48f, 3.35f);
        this.LIZJ.LJIIL(10.44f, 11.47f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.2f, 0.52f);
        this.LIZJ.LJIIL(14.49f, -5.5f);
        this.LIZJ.LJIIJ(0.17f, -0.07f, 0.25f, -0.04f, 0.28f, -0.03f);
        this.LIZJ.LJIIJ(0.06f, 0.02f, 0.14f, 0.08f, 0.2f, 0.2f);
        this.LIZJ.LJIIJ(0.07f, 0.1f, 0.08f, 0.2f, 0.08f, 0.27f);
        this.LIZJ.LJIIJ(0.0f, 0.04f, -0.02f, 0.12f, -0.16f, 0.23f);
        this.LIZJ.LJIIL(-11.9f, 10.1f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -0.62f, 2.12f);
        this.LIZJ.LJIIL(4.56f, 14.51f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.64f, 0.4f);
        this.LIZJ.LJII(45.73f, 9.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -2.0f);
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
