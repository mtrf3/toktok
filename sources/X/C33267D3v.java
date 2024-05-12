package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33267D3v extends AbstractC39455Fe7 {
    public C33267D3v() {
        this.LIZJ.LJIIIIZZ(11.4f, 5.99f);
        C32856Cuy.hl(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.02f, 30.0f);
        C32856Cuy.jl(this.LIZJ);
        this.LIZJ.LJIIL(25.22f, 0.02f);
        C32856Cuy.il(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.02f, -30.0f);
        C32856Cuy.gl(this.LIZJ);
        this.LIZJ.LJII(11.4f, 5.99f);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(-1.0f, 3.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        this.LIZJ.LJII(36.62f, 8.0f);
        C32856Cuy.An(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-0.02f, 30.0f);
        C32856Cuy.yn(this.LIZJ);
        this.LIZJ.LJII(11.38f, 40.0f);
        C32856Cuy.xn(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(0.02f, -30.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.9f, 9.1f);
        this.LIZJ.LJIIL(2.52f, 7.64f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.78f);
        this.LIZJ.LJIIL(2.68f, -7.65f);
        C32856Cuy.P1(this.LIZJ);
        this.LIZJ.LJIIJJI(7.29f);
        this.LIZJ.LJIIL(1.65f, 5.06f);
        C32856Cuy.we(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
