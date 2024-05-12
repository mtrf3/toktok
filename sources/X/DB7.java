package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB7 extends AbstractC39455Fe7 {
    public DB7() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(2.4f, 24.0f);
        this.LIZJ.LJIIIZ(21.6f, 21.6f, false, true, 43.18f, -1.0f);
        this.LIZJ.LJIIJ(0.02f, 0.55f, -0.43f, 1.0f, -0.98f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(43.0f);
        this.LIZJ.LJIIJ(-10.84f, 0.0f, -19.0f, 8.16f, -19.0f, 19.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.6f);
        this.LIZJ.LJIIJ(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 0.98f);
        this.LIZJ.LIZJ(21.6f, 21.6f, false, true, 2.4f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.0f, 44.96f);
        this.LIZJ.LJIIIZ(10.7f, 10.7f, false, false, 3.39f, -2.35f);
        this.LIZJ.LJII(42.6f, 31.4f);
        this.LIZJ.LIZJ(10.7f, 10.7f, false, false, 44.96f, 28.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(43.0f);
        this.LIZJ.LJIIJ(-8.63f, 0.0f, -15.0f, 6.37f, -15.0f, 15.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(1.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.5f, 22.0f);
        C32856Cuy.c8(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILIIL(15.0f, 0.0f);
        C32856Cuy.c8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
