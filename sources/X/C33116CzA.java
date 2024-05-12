package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33116CzA extends AbstractC39455Fe7 {
    public C33116CzA() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 5.0f);
        C32856Cuy.mi(this.LIZJ);
        this.LIZJ.LJIILL(32.58f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.98f, 1.75f);
        this.LIZJ.LJIIL(7.48f, -4.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.5f, -0.13f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.ni(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(18.4f);
        C32856Cuy.ol(this.LIZJ);
        this.LIZJ.LJIILL(-2.8f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJIIJJI(-4.0f);
        C32856Cuy.h9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        p4.LJI(8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(33.0f, 9.0f);
        C32856Cuy.C1(this.LIZJ);
        C32856Cuy.Pb(this.LIZJ);
        C32856Cuy.S6(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-22.0f, 9.0f);
        C32856Cuy.LJIIJJI(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, 0.54f, 1.0f, 1.21f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(1.58f);
        this.LIZJ.LJIIJ(0.0f, 0.67f, -0.45f, 1.21f, -1.0f, 1.21f);
        C32856Cuy.v6(this.LIZJ);
        C32856Cuy.Y9(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
