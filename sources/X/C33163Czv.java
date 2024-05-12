package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33163Czv extends AbstractC39455Fe7 {
    public C33163Czv() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 11.0f);
        C32856Cuy.zn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(11.97f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.93f, 0.63f);
        this.LIZJ.LJII(22.65f, 15.0f);
        C32856Cuy.R6(this.LIZJ);
        C32856Cuy.An(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p3.LJI(8.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIJ(11.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, -5.0f);
        C32856Cuy.Um(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(32.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(16.0f);
        p5.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        this.LIZJ.LJI(25.35f);
        this.LIZJ.LJIIL(-0.74f, -1.86f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, false, 19.97f, 6.0f);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIILIIL(7.0f, 16.0f);
        C32856Cuy.Zj(this.LIZJ);
        C32856Cuy.Ua(this.LIZJ);
        C32856Cuy.Oi(this.LIZJ);
        C32856Cuy.LLLLILI(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
