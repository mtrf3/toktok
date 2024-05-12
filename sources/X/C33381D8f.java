package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33381D8f extends AbstractC39455Fe7 {
    public C33381D8f() {
        C32856Cuy.rg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(38.8f, 30.67f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.6f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        this.LIZJ.LJIILL(-2.15f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJIIJJI(-7.6f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(18.7f);
        C32856Cuy.Bn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.2f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(7.82f);
        C32856Cuy.D6(this.LIZJ);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(2.15f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p6.LJIIJJI(7.6f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(7.82f);
        C32856Cuy.En(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(2.2f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIILL(-7.82f);
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
