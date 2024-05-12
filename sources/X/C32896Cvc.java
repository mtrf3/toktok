package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32896Cvc extends AbstractC39455Fe7 {
    public C32896Cvc() {
        this.LIZJ.LJIILIIL(22.87f, 2.3f);
        this.LIZJ.LJIIL(-9.15f, 9.15f);
        this.LIZJ.LJIIJ(-0.4f, 0.4f, -0.6f, 0.6f, -0.67f, 0.83f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 0.61f);
        this.LIZJ.LJIIJ(0.07f, 0.23f, 0.27f, 0.43f, 0.67f, 0.83f);
        this.LIZJ.LJIIL(0.56f, 0.56f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.4f, 0.4f, 0.6f, 0.6f, 0.83f, 0.67f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.61f, 0.0f);
        p.LJIIJ(0.23f, -0.07f, 0.43f, -0.27f, 0.83f, -0.67f);
        this.LIZJ.LJII(22.0f, 8.83f);
        this.LIZJ.LJIJ(29.4f);
        C32856Cuy.r3(this.LIZJ);
        this.LIZJ.LJIJ(8.83f);
        this.LIZJ.LJIIL(5.45f, 5.45f);
        C32856Cuy.Sj(this.LIZJ);
        this.LIZJ.LJII(25.13f, 2.3f);
        this.LIZJ.LJIIJ(-0.4f, -0.4f, -0.6f, -0.6f, -0.82f, -0.67f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.62f, 0.0f);
        this.LIZJ.LJIIJ(-0.23f, 0.08f, -0.43f, 0.28f, -0.82f, 0.67f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(14.92f, 18.0f);
        this.LIZJ.LJIIJ(0.32f, 0.0f, 0.58f, 0.26f, 0.58f, 0.58f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(2.92f);
        C32856Cuy.C5(this.LIZJ);
        C32856Cuy.Ff(this.LIZJ);
        this.LIZJ.LJ(9.0f, 25.6f, 9.0f, 26.57f, 9.0f, 28.0f);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.U8(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -1.43f, 0.0f, -2.39f, -0.06f, -3.12f);
        this.LIZJ.LJIIIZ(3.29f, 3.29f, false, false, -0.27f, -1.24f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -1.3f, -1.31f);
        this.LIZJ.LJIIJ(-0.21f, -0.1f, -0.54f, -0.21f, -1.25f, -0.27f);
        this.LIZJ.LJ(35.4f, 22.0f, 34.43f, 22.0f, 33.0f, 22.0f);
        C32856Cuy.LLJJJ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-2.92f);
        this.LIZJ.LJIIJ(0.0f, -0.32f, 0.26f, -0.58f, 0.58f, -0.58f);
        this.LIZJ.LJIIJ(1.33f, 0.0f, 2.45f, 0.0f, 3.37f, 0.07f);
        this.LIZJ.LJIIJ(0.95f, 0.08f, 1.86f, 0.25f, 2.73f, 0.7f);
        C32856Cuy.d6(this.LIZJ);
        this.LIZJ.LJIILL(7.16f);
        C32856Cuy.Zd(this.LIZJ);
        this.LIZJ.LIZJ(44.6f, 44.6f, false, true, 5.0f, 35.08f);
        this.LIZJ.LJIILL(-7.16f);
        C32856Cuy.Me(this.LIZJ);
        this.LIZJ.LJIIJ(0.92f, -0.07f, 2.04f, -0.07f, 3.37f, -0.07f);
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
