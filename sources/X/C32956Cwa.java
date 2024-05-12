package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32956Cwa extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32956Cwa() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        C32856Cuy.Vb(dij);
        dij.LJIIJJI(-4.0f);
        dij.LJIILL(4.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        dij.LJI(11.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        dij.LJIJ(19.0f);
        C32856Cuy.oj(dij);
        dij.LJIIJJI(4.0f);
        dij.LJIILL(-4.0f);
        dij.LIZLLL();
        dij.LJIILIIL(18.0f, 8.0f);
        C32856Cuy.LJLIIIL(dij);
        C32856Cuy.rd(dij);
        dij.LIZLLL();
        dij.LJIIIIZZ(21.48f, 36.0f);
        dij.LJIIIZ(7.4f, 7.4f, false, false, 6.44f, -3.34f);
        dij.LJIIIZ(0.47f, 0.47f, false, false, -0.21f, -0.7f);
        dij.LJIIL(-2.02f, -0.93f);
        dij.LJIIIZ(0.56f, 0.56f, false, false, -0.68f, 0.2f);
        dij.LJIIIZ(4.4f, 4.4f, false, true, -3.53f, 1.85f);
        dij.LJIIIZ(4.95f, 4.95f, false, true, -4.03f, -1.88f);
        dij.LJIIJ(-0.23f, -0.3f, 0.0f, -0.7f, 0.39f, -0.7f);
        dij.LJIIJJI(4.59f);
        C32856Cuy.Qf(dij);
        dij.LJIIJJI(-5.55f);
        dij.LJIIJ(-0.26f, 0.0f, -0.47f, -0.19f, -0.48f, -0.44f);
        dij.LJIILL(-0.56f);
        dij.LJIIJ(0.02f, -0.24f, 0.23f, -0.41f, 0.47f, -0.41f);
        dij.LJIIJJI(5.56f);
        C32856Cuy.Qf(dij);
        dij.LJIIJJI(-4.54f);
        dij.LJIIJ(-0.39f, 0.0f, -0.63f, -0.4f, -0.39f, -0.7f);
        dij.LJIIIZ(5.02f, 5.02f, false, true, 3.98f, -1.8f);
        dij.LIZJ(4.4f, 4.4f, false, true, 25.0f, 24.75f);
        dij.LJIIJ(0.16f, 0.22f, 0.45f, 0.32f, 0.7f, 0.2f);
        dij.LJIIL(2.02f, -0.95f);
        dij.LJIIIZ(0.47f, 0.47f, false, false, 0.2f, -0.69f);
        dij.LIZJ(7.35f, 7.35f, false, false, 21.48f, 20.0f);
        dij.LJIIJ(-3.8f, 0.0f, -6.9f, 1.97f, -8.1f, 5.08f);
        dij.LJIIIZ(0.53f, 0.53f, false, true, -0.49f, 0.35f);
        dij.LJIIJJI(-0.38f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.51f, 0.5f);
        dij.LJIILL(0.83f);
        dij.LJIIJ(0.0f, 0.27f, 0.23f, 0.5f, 0.5f, 0.5f);
        dij.LJIIJ(0.21f, 0.0f, 0.38f, 0.18f, 0.37f, 0.38f);
        dij.LJIILL(0.65f);
        dij.LJIIJ(0.0f, 0.2f, -0.16f, 0.38f, -0.36f, 0.38f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.51f, 0.5f);
        C32856Cuy.D9(dij);
        C32856Cuy.a5(dij);
        dij.LJIIJJI(0.36f);
        dij.LJIIJ(0.22f, 0.0f, 0.42f, 0.15f, 0.5f, 0.35f);
        dij.LJIIJ(1.16f, 3.16f, 4.3f, 5.15f, 8.12f, 5.15f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        this.LIZ.add(LIZIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
