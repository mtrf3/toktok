package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33286D4o extends AbstractC39455Fe7 {
    public C33286D4o() {
        this.LIZJ.LJIILIIL(13.22f, 11.45f);
        this.LIZJ.LJIIL(9.37f, -8.97f);
        this.LIZJ.LJIIIZ(1.99f, 1.99f, false, true, 2.82f, 0.0f);
        this.LIZJ.LJIIL(9.36f, 8.97f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(6.05f);
        this.LIZJ.LJIIJ(2.2f, 0.0f, 3.98f, 1.78f, 3.98f, 3.98f);
        this.LIZJ.LJIILL(24.59f);
        this.LIZJ.LJIIJ(0.0f, 2.2f, -1.78f, 3.98f, -3.98f, 3.98f);
        this.LIZJ.LJI(7.18f);
        this.LIZJ.LJIIIZ(3.98f, 3.98f, false, true, -3.98f, -3.98f);
        this.LIZJ.LJIJ(15.43f);
        this.LIZJ.LJIIJ(0.0f, -2.2f, 1.78f, -3.98f, 3.98f, -3.98f);
        this.LIZJ.LJIIJJI(6.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.63f, 0.0f);
        this.LIZJ.LJIIJJI(10.3f);
        this.LIZJ.LJII(24.0f, 6.71f);
        this.LIZJ.LJIIL(-5.15f, 4.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.8f, 9.75f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.99f);
        C32856Cuy.En(this.LIZJ);
        this.LIZJ.LJIIJJI(17.9f);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(22.2f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJIIJJI(-17.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.0f, 10.06f);
        C32856Cuy.A1(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 0.99f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(11.93f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIILL(-1.99f);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJI(15.04f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
