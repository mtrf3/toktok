package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2R extends AbstractC39455Fe7 {
    public D2R() {
        C32856Cuy.LJZL(this.LIZJ);
        this.LIZJ.LJIIJ(0.81f, 0.0f, 1.6f, 0.04f, 2.35f, 0.13f);
        this.LIZJ.LJIIIZ(6.96f, 6.96f, false, false, -1.16f, 4.28f);
        this.LIZJ.LJIIL(0.65f, 11.0f);
        this.LIZJ.LJIIJ(0.06f, 0.93f, 0.29f, 1.8f, 0.66f, 2.59f);
        C32856Cuy.Ok(this.LIZJ);
        this.LIZJ.LJIIIIZZ(29.0f, 26.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 12.0f, 0.0f);
        C32856Cuy.A1(this.LIZJ);
        this.LIZJ.LJIIJJI(1.82f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.18f);
        this.LIZJ.LJIIL(-0.65f, 11.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 2.82f);
        this.LIZJ.LJI(27.83f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -2.82f);
        this.LIZJ.LJIIL(-0.64f, -11.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.18f);
        C32856Cuy.F6(this.LIZJ);
        C32856Cuy.d1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(6.0f, -2.0f);
        p.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        C32856Cuy.A1(this.LIZJ);
        C32856Cuy.C0(this.LIZJ);
        C32856Cuy.LJJLIL(this.LIZJ);
        C32856Cuy.sc(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(-4.0f, 8.0f);
        C32856Cuy.Sm(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 2.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, false, 4.0f, 0.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -4.0f, 0.0f);
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
