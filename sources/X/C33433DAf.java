package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33433DAf extends AbstractC39455Fe7 {
    public C33433DAf() {
        this.LIZJ.LJIIIIZZ(28.08f, 3.3f);
        this.LIZJ.LJII(10.67f, 26.15f);
        this.LIZJ.LJIIIZ(0.89f, 0.89f, false, false, 0.63f, 1.4f);
        this.LIZJ.LJIIL(9.29f, 1.62f);
        this.LIZJ.LJIIL(-2.04f, 15.02f);
        this.LIZJ.LJIIJ(-0.1f, 0.73f, 0.85f, 1.1f, 1.28f, 0.5f);
        this.LIZJ.LJIIL(17.41f, -22.85f);
        this.LIZJ.LJIIIZ(0.89f, 0.89f, false, false, -0.63f, -1.4f);
        C32856Cuy.W5(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.86f, 44.64f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.47f, 0.36f);
        C32856Cuy.tb(this.LIZJ);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.48f, -0.66f);
        this.LIZJ.LJIIL(4.47f, -13.54f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.48f, -0.35f);
        this.LIZJ.LJIIJJI(4.67f);
        this.LIZJ.LJIIJ(0.22f, 0.0f, 0.41f, 0.14f, 0.48f, 0.35f);
        this.LIZJ.LJIIL(4.47f, 13.54f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.48f, 0.66f);
        C32856Cuy.tb(this.LIZJ);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.47f, -0.36f);
        this.LIZJ.LJIIL(-0.73f, -2.42f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-4.8f);
        this.LIZJ.LJIIL(-0.74f, 2.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.08f, -10.18f);
        this.LIZJ.LJIIL(-1.45f, 4.8f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(3.01f);
        this.LIZJ.LJIIL(-1.45f, -4.8f);
        this.LIZJ.LJIIJJI(-0.11f);
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
