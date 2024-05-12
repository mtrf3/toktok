package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33157Czp extends AbstractC39455Fe7 {
    public C33157Czp() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(5.0f, 10.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(50.0f);
        this.LIZJ.LJIIJ(0.0f, 0.25f, 0.1f, 0.48f, 0.25f, 0.66f);
        this.LIZJ.LJIIL(23.3f, -22.86f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, 4.9f, 0.0f);
        this.LIZJ.LJIIL(5.6f, 5.5f);
        this.LIZJ.LJIIL(15.41f, -15.84f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, true, 5.07f, 0.05f);
        this.LIZJ.LJII(68.0f, 38.66f);
        C32856Cuy.Tc(this.LIZJ);
        C32856Cuy.U6(this.LIZJ);
        this.LIZJ.LJIILIIL(51.1f, 52.0f);
        this.LIZJ.LJI(67.0f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIJ(43.06f);
        this.LIZJ.LJIIL(-11.66f, -12.5f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.73f, -0.01f);
        this.LIZJ.LJII(40.2f, 46.4f);
        this.LIZJ.LJII(56.1f, 62.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(67.0f, 65.0f);
        this.LIZJ.LJI(4.98f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, true, 1.0f, 61.0f);
        C32856Cuy.i9(this.LIZJ);
        C32856Cuy.oj(this.LIZJ);
        this.LIZJ.LJIIJJI(62.0f);
        C32856Cuy.pj(this.LIZJ);
        this.LIZJ.LJIILL(30.87f);
        this.LIZJ.LJIIL(0.1f, 0.1f);
        this.LIZJ.LJIIL(-0.1f, 0.1f);
        this.LIZJ.LJIJ(61.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.35f, 40.94f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LJII(8.18f, 62.0f);
        this.LIZJ.LJIIJJI(43.64f);
        this.LIZJ.LJII(30.35f, 40.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.5f, 30.0f);
        C32856Cuy.Ah(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
