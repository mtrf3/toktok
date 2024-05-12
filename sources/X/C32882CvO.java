package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32882CvO extends AbstractC39455Fe7 {
    public C32882CvO() {
        this.LIZJ.LJIIIIZZ(17.5f, 4.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p.LJIJ(8.0f);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.Pl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p2.LJIJ(8.0f);
        C32856Cuy.C0(this.LIZJ);
        C32856Cuy.Zg(this.LIZJ);
        C32856Cuy.LJLJLLL(this.LIZJ);
        C32856Cuy.ph(this.LIZJ);
        C32856Cuy.l9(this.LIZJ);
        C32856Cuy.Yg(this.LIZJ);
        C32856Cuy.C0(this.LIZJ);
        C32856Cuy.Pl(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 12.0f);
        C32856Cuy.u6(this.LIZJ);
        C32856Cuy.nf(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-4.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.LJJIIJZLJL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-5.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LJFF(this.LIZJ);
        C32856Cuy.nf(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 23.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(13.0f);
        p5.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        C32856Cuy.LJJII(this.LIZJ);
        C32856Cuy.zm(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
