package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2B extends AbstractC39455Fe7 {
    public D2B() {
        this.LIZJ.LJIIIIZZ(11.5f, 6.0f);
        C32856Cuy.LLFFF(this.LIZJ);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.Dc(this.LIZJ);
        C32856Cuy.sb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.46f, 11.6f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.92f, 0.0f);
        this.LIZJ.LJII(9.84f, 25.12f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.47f, 3.37f);
        C32856Cuy.t6(this.LIZJ);
        C32856Cuy.LJLIIL(this.LIZJ);
        C32856Cuy.cf(this.LIZJ);
        C32856Cuy.Z0(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.7f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.45f, -3.37f);
        this.LIZJ.LJII(25.45f, 11.6f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.3f, 26.5f);
        this.LIZJ.LJII(24.0f, 12.96f);
        this.LIZJ.LJII(36.7f, 26.5f);
        C32856Cuy.F6(this.LIZJ);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        C32856Cuy.v6(this.LIZJ);
        C32856Cuy.a1(this.LIZJ);
        this.LIZJ.LJIIJJI(-7.7f);
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
