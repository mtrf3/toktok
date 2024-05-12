package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D00 extends AbstractC39455Fe7 {
    public D00() {
        this.LIZJ.LJIIIIZZ(31.0f, 2.0f);
        C32856Cuy.zg(this.LIZJ);
        C32856Cuy.L6(this.LIZJ);
        C32856Cuy.Qe(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.0f, 30.0f);
        C32856Cuy.LLLII(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(11.0f);
        p.LJIILL(11.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(2.0f);
        C32856Cuy.Dn(this.LIZJ);
        C32856Cuy.F9(this.LIZJ);
        C32856Cuy.sc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.0f, 18.0f);
        C32856Cuy.af(this.LIZJ);
        C32856Cuy.LJIIL(this.LIZJ);
        C32856Cuy.kh(this.LIZJ);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 32.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(13.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.H9(this.LIZJ);
        C32856Cuy.Cm(this.LIZJ);
        C32856Cuy.J6(this.LIZJ);
        C32856Cuy.tc(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
