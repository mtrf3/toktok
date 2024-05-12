package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33281D4j extends AbstractC39455Fe7 {
    public C33281D4j() {
        this.LIZJ.LJIILIIL(33.08f, 20.75f);
        this.LIZJ.LJIIL(-0.35f, -2.18f);
        this.LIZJ.LIZJ(9.0f, 9.0f, false, false, 14.84f, 20.0f);
        this.LIZJ.LJIILL(2.85f);
        this.LIZJ.LJIIL(-2.83f, 0.16f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 12.34f, 34.0f);
        C32856Cuy.zb(this.LIZJ);
        this.LIZJ.LJIILL(-8.38f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.73f, 1.73f);
        C32856Cuy.Pd(this.LIZJ);
        this.LIZJ.LJIIL(4.64f, -4.64f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJIIL(4.64f, 4.64f);
        C32856Cuy.L3(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.73f, -1.73f);
        C32856Cuy.H9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(8.5f);
        this.LIZJ.LJIIIZ(6.5f, 6.5f, false, false, 0.93f, -12.93f);
        this.LIZJ.LJIIL(-2.2f, -0.32f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.34f, 37.0f);
        C32856Cuy.LJIJJ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(9.5f, 9.5f, false, false, 1.35f, -18.9f);
        this.LIZJ.LIZJ(12.0f, 12.0f, false, false, 11.84f, 20.0f);
        C32856Cuy.i1(this.LIZJ);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, false, false, 0.5f, 16.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
