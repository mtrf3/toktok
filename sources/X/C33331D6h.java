package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33331D6h extends AbstractC39455Fe7 {
    public C33331D6h() {
        this.LIZJ.LJIIIIZZ(16.63f, 7.47f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, false, -1.23f, 1.48f);
        this.LIZJ.LJIILL(1.55f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.18f, 0.98f);
        this.LIZJ.LJIIL(22.6f, -4.13f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.82f, -0.98f);
        this.LIZJ.LJIJ(4.4f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.18f, -0.98f);
        this.LIZJ.LJII(16.63f, 7.47f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 8.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.5f, 1.5f, false, false, -1.23f, 1.48f);
        this.LIZJ.LJIJ(30.2f);
        C32856Cuy.n6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(7.4f, 7.4f, true, false, 7.4f, 7.4f);
        this.LIZJ.LJIJ(18.97f);
        this.LIZJ.LJII(36.0f, 15.93f);
        C32856Cuy.z9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-3.4f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(7.4f, 7.4f, true, false, 7.4f, 7.4f);
        this.LIZJ.LJIILL(-22.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.18f, -0.99f);
        this.LIZJ.LJIIL(-22.19f, 4.06f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.6f, 31.0f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.Jd(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-17.2f, 3.2f);
        C32856Cuy.Jd(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(3.4f);
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
