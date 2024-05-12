package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33406D9e extends AbstractC39455Fe7 {
    public C33406D9e() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 17.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(11.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLIIII(this.LIZJ);
        C32856Cuy.LLLZZIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.0f, 17.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p3.LJIILL(11.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.F4(this.LIZJ);
        C32856Cuy.LLLZZIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(26.0f, 14.0f);
        C32856Cuy.P7(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(20.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p5.LJIJ(14.0f);
        this.LIZJ.LIZLLL();
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(17.0f, 11.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p7.LJIILL(24.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLIIII(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(12.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.LJJIJ(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIIZZ(34.0f, 8.0f);
        C32856Cuy.P7(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(32.0f);
        p11.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(2.0f);
        p12.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p12.LJIJ(8.0f);
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
