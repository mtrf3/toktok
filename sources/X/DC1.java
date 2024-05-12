package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC1 extends AbstractC39455Fe7 {
    public DC1() {
        this.LIZJ.LJIIIIZZ(25.19f, 4.43f);
        this.LIZJ.LJIIIZ(1.85f, 1.85f, false, false, -2.38f, 0.0f);
        this.LIZJ.LJII(2.7f, 21.2f);
        this.LIZJ.LJIIIZ(1.92f, 1.92f, false, false, -0.58f, 2.12f);
        this.LIZJ.LJIIJ(0.27f, 0.76f, 0.97f, 1.26f, 1.77f, 1.26f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.9f);
        this.LIZJ.LJIIL(1.5f, 16.54f);
        this.LIZJ.LIZJ(3.14f, 3.14f, false, false, 11.39f, 44.0f);
        this.LIZJ.LJIIJJI(25.22f);
        this.LIZJ.LJIIIZ(3.14f, 3.14f, false, false, 3.11f, -2.89f);
        this.LIZJ.LJIIL(1.5f, -16.54f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.9f);
        this.LIZJ.LJIIJ(0.8f, 0.0f, 1.5f, -0.5f, 1.77f, -1.26f);
        this.LIZJ.LJIILJJIL(0.04f, -1.6f, -0.58f, -2.12f, true);
        this.LIZJ.LJII(25.2f, 4.43f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.2f, 17.22f);
        this.LIZJ.LJIIIZ(4.88f, 4.88f, false, true, 6.6f, 0.34f);
        this.LIZJ.LJIIIZ(5.16f, 5.16f, false, true, 0.0f, 7.3f);
        this.LIZJ.LJIIL(-5.55f, 5.55f);
        this.LIZJ.LJIIJ(-0.58f, 0.57f, -1.51f, 0.57f, -2.09f, 0.0f);
        this.LIZJ.LJIIL(-5.55f, -5.55f);
        this.LIZJ.LJIIIZ(5.16f, 5.16f, false, true, 0.0f, -7.3f);
        this.LIZJ.LJIIIZ(4.88f, 4.88f, false, true, 6.6f, -0.34f);
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
