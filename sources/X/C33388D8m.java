package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33388D8m extends AbstractC39455Fe7 {
    public C33388D8m() {
        this.LIZJ.LJIILIIL(35.96f, 13.5f);
        this.LIZJ.LJIIL(-9.02f, -9.03f);
        C32856Cuy.G8(this.LIZJ);
        this.LIZJ.LJII(29.06f, 0.93f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.0f);
        p.LJIIL(13.3f, 13.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, 3.53f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-13.3f, 13.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.4f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-2.13f, -2.13f);
        C32856Cuy.vk(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(9.02f, -9.03f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(25.2f);
        this.LIZJ.LJIIJ(-3.4f, 0.0f, -5.8f, 0.0f, -7.68f, 0.16f);
        this.LIZJ.LJIIJ(-1.84f, 0.15f, -2.96f, 0.43f, -3.83f, 0.88f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, false, -4.15f, 4.15f);
        this.LIZJ.LJIIJ(-0.45f, 0.87f, -0.73f, 1.99f, -0.88f, 3.83f);
        this.LIZJ.LJIIJ(-0.16f, 1.88f, -0.16f, 4.28f, -0.16f, 7.68f);
        C32856Cuy.LLLF(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-7.9f);
        this.LIZJ.LJIIJ(0.0f, -3.28f, 0.0f, -5.88f, 0.17f, -7.99f);
        this.LIZJ.LJIIJ(0.18f, -2.15f, 0.55f, -4.0f, 1.41f, -5.7f);
        this.LIZJ.LJIIIZ(14.5f, 14.5f, false, true, 6.34f, -6.33f);
        this.LIZJ.LJIIJ(1.7f, -0.86f, 3.54f, -1.23f, 5.7f, -1.4f);
        this.LIZJ.LJIIJ(2.1f, -0.18f, 4.7f, -0.18f, 7.97f, -0.18f);
        this.LIZJ.LJIIJJI(10.87f);
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
