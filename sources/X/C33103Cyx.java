package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33103Cyx extends AbstractC39455Fe7 {
    public C33103Cyx() {
        this.LIZJ.LJIIIIZZ(28.3f, 13.88f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJIIL(1.4f, 1.42f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJIIL(8.59f, -8.59f);
        C32856Cuy.mc(this.LIZJ);
        this.LIZJ.LJIIL(-8.59f, 8.59f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 6.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p.LJIILL(28.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p.LJIIJJI(24.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        C32856Cuy.v0(this.LIZJ);
        C32856Cuy.LLII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(18.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.Q5(this.LIZJ);
        C32856Cuy.Sc(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(13.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(7.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 13.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p5.LJIILL(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p5.LJIIJJI(11.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p5.LJIILL(-2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIL.LIZ(this.LIZJ, "p", 18.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILIIL(-1.0f, 9.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.ic(this.LIZJ);
        C32856Cuy.u6(this.LIZJ);
        C32856Cuy.ck(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
