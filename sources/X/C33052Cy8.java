package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33052Cy8 extends AbstractC39455Fe7 {
    public C33052Cy8() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(23.0f, 2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(8.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.Qe(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.3f, 31.3f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(13.29f, -13.3f);
        C32856Cuy.LLLILZLLLI(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(13.3f, 13.3f);
        C32856Cuy.De(this.LIZJ);
        this.LIZJ.LJII(26.0f, 22.83f);
        C32856Cuy.Lm(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(22.83f);
        this.LIZJ.LJIIL(-9.88f, 9.88f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p5.LJIIL(-1.42f, -1.42f);
        p5.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.78f, 14.8f);
        C32856Cuy.G8(this.LIZJ);
        this.LIZJ.LJIIL(5.66f, -5.66f);
        C32856Cuy.G6(this.LIZJ);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJIIL(-5.65f, 5.66f);
        C32856Cuy.mk(this.LIZJ);
        Q7L.LIZLLL(this.LIZJ, "p", -1.41f, -1.41f);
        C32856Cuy.S3(this.LIZJ);
        this.LIZJ.LJIIL(5.65f, 5.66f);
        C32856Cuy.xd(this.LIZJ);
        this.LIZJ.LJIIL(-5.66f, -5.65f);
        C32856Cuy.kn(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
