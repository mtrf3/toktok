package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6P extends AbstractC39455Fe7 {
    public D6P() {
        this.LIZJ.LJIIIIZZ(31.5f, 44.0f);
        C32856Cuy.Z9(this.LIZJ);
        C32856Cuy.hc(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(38.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.U(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.5f, 38.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIJ(11.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.hc(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(26.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.U(this.LIZJ);
        this.LIZJ.LJIIIIZZ(4.5f, 31.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p4.LJIJ(18.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.hc(this.LIZJ);
        C32856Cuy.Rc(this.LIZJ);
        C32856Cuy.U(this.LIZJ);
        this.LIZJ.LJIIIIZZ(21.5f, 31.0f);
        C32856Cuy.sa(this.LIZJ);
        C32856Cuy.LLLFF(this.LIZJ);
        C32856Cuy.LLLFZ(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 14.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(39.5f, 29.0f);
        C32856Cuy.sa(this.LIZJ);
        C32856Cuy.v0(this.LIZJ);
        C32856Cuy.LLLFZ(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 10.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
