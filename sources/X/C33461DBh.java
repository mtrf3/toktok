package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33461DBh extends AbstractC39455Fe7 {
    public C33461DBh() {
        this.LIZJ.LJIIIIZZ(19.5f, 9.0f);
        this.LIZJ.LJIIJ(1.78f, 0.0f, 0.61f, 5.38f, 2.86f, 7.64f);
        this.LIZJ.LJ(24.62f, 18.89f, 30.0f, 17.69f, 30.0f, 19.5f);
        this.LIZJ.LJIIJ(0.0f, 1.81f, -5.38f, 0.61f, -7.64f, 2.86f);
        this.LIZJ.LJ(20.11f, 24.62f, 21.22f, 30.0f, 19.5f, 30.0f);
        this.LIZJ.LJIILJJIL(-0.61f, -5.38f, -2.86f, -7.64f, true);
        this.LIZJ.LJ(14.38f, 20.11f, 9.0f, 21.27f, 9.0f, 19.5f);
        this.LIZJ.LJIIJ(0.0f, -1.77f, 5.38f, -0.61f, 7.64f, -2.86f);
        this.LIZJ.LJ(18.89f, 14.38f, 17.72f, 9.0f, 19.5f, 9.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.0f, 25.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(1.11f, 0.0f, 0.69f, 3.31f, 2.19f, 4.81f);
        this.LIZJ.LJ(35.69f, 31.31f, 39.0f, 30.89f, 39.0f, 32.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, 1.11f, -3.31f, 0.69f, -4.81f, 2.19f);
        this.LIZJ.LJ(32.69f, 35.69f, 33.12f, 39.0f, 32.0f, 39.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(-1.12f, 0.0f, -0.69f, -3.31f, -2.19f, -4.81f);
        this.LIZJ.LJ(28.31f, 32.69f, 25.0f, 33.12f, 25.0f, 32.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -1.12f, 3.31f, -0.69f, 4.81f, -2.19f);
        this.LIZJ.LJ(31.31f, 28.31f, 30.89f, 25.0f, 32.0f, 25.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.8f, 4.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(-4.48f, 0.0f, -6.72f, 0.0f, -8.43f, 0.87f);
        p5.LJIIIZ(8.0f, 8.0f, false, false, -3.5f, 3.5f);
        this.LIZJ.LJ(4.0f, 10.08f, 4.0f, 12.32f, 4.0f, 16.8f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(14.4f);
        p6.LJIIJ(0.0f, 4.48f, 0.0f, 6.72f, 0.87f, 8.43f);
        p6.LJIIIZ(8.0f, 8.0f, false, false, 3.5f, 3.5f);
        this.LIZJ.LJIIJ(1.71f, 0.87f, 3.95f, 0.87f, 8.43f, 0.87f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(14.4f);
        p7.LJIIJ(4.48f, 0.0f, 6.72f, 0.0f, 8.43f, -0.87f);
        p7.LJIIIZ(8.0f, 8.0f, false, false, 3.5f, -3.5f);
        this.LIZJ.LJIIJ(0.87f, -1.71f, 0.87f, -3.95f, 0.87f, -8.43f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(16.8f);
        p9.LJIIJ(0.0f, -4.48f, 0.0f, -6.72f, -0.87f, -8.43f);
        p9.LJIIIZ(8.0f, 8.0f, false, false, -3.5f, -3.5f);
        this.LIZJ.LJ(37.92f, 4.0f, 35.68f, 4.0f, 31.2f, 4.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJI(16.8f);
        p10.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
