package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32880CvM extends AbstractC39455Fe7 {
    public C32880CvM() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(11.5f, 16.5f);
        C32856Cuy.LJJI(this.LIZJ);
        C32856Cuy.Gm(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.5f);
        C32856Cuy.wb(this.LIZJ);
        C32856Cuy.Fe(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        C32856Cuy.K9(this.LIZJ);
        C32856Cuy.X3(this.LIZJ);
        this.LIZJ.LJIJ(16.24f);
        this.LIZJ.LJIIJ(0.47f, 0.17f, 0.97f, 0.26f, 1.5f, 0.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, -3.0f);
        C32856Cuy.Nl(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(21.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p4.LJIILL(2.5f);
        DIL.LIZ(this.LIZJ, "p", 11.5f);
        this.LIZJ.LJIILIIL(24.5f, 0.0f);
        C32856Cuy.i9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(3.5f, 3.5f, false, false, -3.5f, -3.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-21.0f);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, false, 7.0f, 12.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(25.5f);
        C32856Cuy.jl(this.LIZJ);
        C32856Cuy.LJJII(this.LIZJ);
        C32856Cuy.il(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-21.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        p10.LJIIJJI(-2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.0f, 11.0f);
        C32856Cuy.zj(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
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
