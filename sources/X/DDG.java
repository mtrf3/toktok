package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDG extends AbstractC39455Fe7 {
    public DDG() {
        this.LIZJ.LJIIIIZZ(19.8f, 12.4f);
        this.LIZJ.LJIIIZ(8.4f, 8.4f, true, true, -16.8f, 0.0f);
        this.LIZJ.LJIIIZ(8.4f, 8.4f, false, true, 16.8f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.65f, 9.82f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, false, 0.3f, 0.23f);
        this.LIZJ.LJIIIZ(13.9f, 13.9f, false, true, 13.73f, 11.8f);
        this.LIZJ.LJIIJ(0.03f, 0.23f, 0.13f, 0.43f, 0.29f, 0.6f);
        this.LIZJ.LJIIL(3.23f, 3.23f);
        this.LIZJ.LJIIJ(0.58f, 0.57f, 1.55f, 0.25f, 1.6f, -0.56f);
        this.LIZJ.LIZJ(18.9f, 18.9f, false, false, 22.2f, 5.06f);
        this.LIZJ.LJIIJ(-0.78f, 0.03f, -1.16f, 0.94f, -0.77f, 1.61f);
        this.LIZJ.LJIIJ(0.55f, 0.97f, 0.97f, 2.03f, 1.22f, 3.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.22f, 42.7f);
        this.LIZJ.LJIIJ(0.78f, -0.1f, 1.06f, -1.04f, 0.5f, -1.6f);
        C32856Cuy.LIZIZ(this.LIZJ);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, false, -0.67f, -0.3f);
        this.LIZJ.LJIIIZ(13.9f, 13.9f, false, true, -13.0f, -13.86f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, false, -0.23f, -0.29f);
        this.LIZJ.LJIIIZ(11.47f, 11.47f, false, true, -3.15f, -1.22f);
        this.LIZJ.LJIIJ(-0.67f, -0.39f, -1.58f, -0.01f, -1.6f, 0.76f);
        this.LIZJ.LJIIJ(-0.02f, 0.25f, -0.02f, 0.5f, -0.02f, 0.75f);
        this.LIZJ.LIZJ(18.9f, 18.9f, false, false, 25.22f, 42.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.56f, 33.25f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, 0.0f, 1.23f);
        this.LIZJ.LJIIL(9.26f, 9.26f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.34f, 0.35f, 0.9f, 0.35f, 1.24f, 0.0f);
        this.LIZJ.LJIIL(9.26f, -9.26f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, 0.0f, -1.23f);
        this.LIZJ.LJIIL(-9.26f, -9.27f);
        C32856Cuy.Ge(this.LIZJ);
        this.LIZJ.LJIIL(-9.26f, 9.27f);
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
