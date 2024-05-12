package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33276D4e extends AbstractC39455Fe7 {
    public C33276D4e() {
        this.LIZJ.LJIIIIZZ(2.0f, 12.0f);
        this.LIZJ.LIZJ(10.0f, 10.0f, false, true, 12.0f, 2.0f);
        C32856Cuy.LJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, true, 10.0f, 10.0f);
        C32856Cuy.LJLLI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(10.0f, 10.0f, false, true, -10.0f, 10.0f);
        C32856Cuy.n6(this.LIZJ);
        this.LIZJ.LIZJ(10.0f, 10.0f, false, true, 2.0f, 36.0f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(10.0f, -6.0f);
        C32856Cuy.U1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(24.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(12.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(12.0f);
        p4.LIZLLL();
        p4.LJIILIIL(10.2f, 9.0f);
        this.LIZJ.LJIIIZ(7.2f, 7.2f, true, false, 0.0f, 14.4f);
        this.LIZJ.LJIIIZ(7.2f, 7.2f, false, false, 0.0f, -14.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(11.0f, 22.2f);
        this.LIZJ.LJIIIZ(11.2f, 11.2f, true, true, 20.4f, 6.38f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(5.3f, 5.3f);
        C32856Cuy.xk(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-1.4f, 1.42f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.42f, 0.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(-5.3f, -5.3f);
        this.LIZJ.LIZJ(11.2f, 11.2f, false, true, 11.0f, 22.2f);
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
