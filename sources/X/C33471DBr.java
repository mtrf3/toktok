package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33471DBr extends AbstractC39455Fe7 {
    public C33471DBr() {
        this.LIZJ.LJIIIIZZ(9.88f, 9.24f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, true, 12.78f, 7.0f);
        this.LIZJ.LJIIJJI(32.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, 1.96f, 2.41f);
        this.LIZJ.LJIIL(-4.8f, 22.81f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -2.94f, 2.38f);
        this.LIZJ.LJI(11.7f);
        this.LIZJ.LJIIL(-9.35f, 8.93f);
        this.LIZJ.LJIIJ(-0.58f, 0.56f, -1.53f, 0.0f, -1.32f, -0.78f);
        this.LIZJ.LJIIL(3.7f, -13.96f);
        this.LIZJ.LJII(9.89f, 9.24f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(21.78f, 2.38f);
        this.LIZJ.LJIIJ(0.42f, -0.28f, 0.94f, 0.18f, 0.72f, 0.63f);
        this.LIZJ.LJIIL(-3.88f, 8.17f);
        this.LIZJ.LJIIL(3.26f, 1.8f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.04f, 0.85f);
        this.LIZJ.LJIIL(-9.65f, 6.43f);
        this.LIZJ.LJIIJ(-0.43f, 0.3f, -0.96f, -0.19f, -0.72f, -0.64f);
        this.LIZJ.LJIIL(2.73f, -5.2f);
        this.LIZJ.LJIIL(-5.5f, -2.65f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.06f, -0.87f);
        this.LIZJ.LJIIL(13.06f, -8.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
