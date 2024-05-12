package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33485DCf extends AbstractC39455Fe7 {
    public C33485DCf() {
        this.LIZJ.LJIIIIZZ(22.0f, 3.2f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.0f, 10.0f, true, true, 0.0f, 20.0f);
        p.LJIIIZ(10.0f, 10.0f, false, true, 0.0f, -20.0f);
        p.LIZLLL();
        p.LJIILIIL(0.0f, 4.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, true, false, 0.01f, 12.01f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, false, 22.0f, 7.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.15f, 32.09f);
        this.LIZJ.LJIIL(1.23f, -1.24f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, 1.23f, 0.0f);
        this.LIZJ.LJIIL(4.29f, 4.3f);
        this.LIZJ.LJIIL(4.3f, -4.3f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, true, 1.22f, 0.0f);
        this.LIZJ.LJIIL(1.23f, 1.24f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.33f, 0.33f, 0.33f, 0.88f, 0.0f, 1.22f);
        this.LIZJ.LJIIL(-4.3f, 4.29f);
        this.LIZJ.LJIIL(4.3f, 4.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.33f, 0.33f, 0.33f, 0.88f, 0.0f, 1.22f);
        this.LIZJ.LJIIL(-1.23f, 1.23f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, true, -1.23f, 0.0f);
        this.LIZJ.LJIIL(-4.29f, -4.3f);
        this.LIZJ.LJIIL(-4.3f, 4.3f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, -1.22f, 0.0f);
        this.LIZJ.LJIIL(-1.23f, -1.23f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, true, 0.0f, -1.23f);
        this.LIZJ.LJIIL(4.3f, -4.29f);
        this.LIZJ.LJIIL(-4.3f, -4.3f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, 0.0f, -1.21f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.75f, 36.95f);
        this.LIZJ.LJIIJ(0.0f, -6.5f, 5.04f, -11.8f, 11.3f, -11.8f);
        this.LIZJ.LJIIJJI(8.45f);
        this.LIZJ.LJIIJ(0.64f, 0.0f, 1.15f, 0.51f, 1.15f, 1.15f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(1.67f);
        this.LIZJ.LJIIJ(0.0f, 0.64f, -0.51f, 1.15f, -1.15f, 1.15f);
        this.LIZJ.LJIIJJI(-8.45f);
        this.LIZJ.LJIIJ(-4.11f, 0.0f, -7.47f, 3.5f, -7.47f, 7.83f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(2.93f);
        this.LIZJ.LJIIJJI(11.99f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.3f, 0.58f, 1.3f, 1.3f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(1.52f);
        this.LIZJ.LJIIJ(0.0f, 0.63f, -0.51f, 1.15f, -1.15f, 1.15f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-12.5f);
        this.LIZJ.LJIIIZ(3.55f, 3.55f, false, true, -3.47f, -3.62f);
        this.LIZJ.LJIILL(-3.28f);
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
