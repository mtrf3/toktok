package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33196D1c extends AbstractC39455Fe7 {
    public C33196D1c() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 8.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.5f, 5.5f, false, true, 5.5f, 5.5f);
        p2.LJIILL(4.5f);
        C32856Cuy.S(this.LIZJ);
        C32856Cuy.l9(this.LIZJ);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, true, 24.0f, 8.5f);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(8.5f, 10.0f);
        C32856Cuy.l9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(8.5f, 8.5f, false, false, -17.0f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(4.5f);
        C32856Cuy.m6(this.LIZJ);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 8.5f, 21.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(19.0f);
        C32856Cuy.jg(this.LIZJ);
        C32856Cuy.LJJI(this.LIZJ);
        C32856Cuy.ig(this.LIZJ);
        C32856Cuy.t9(this.LIZJ);
        C32856Cuy.hg(this.LIZJ);
        C32856Cuy.ub(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-21.0f, 3.0f);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.LJLJL(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-25.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-18.0f);
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
