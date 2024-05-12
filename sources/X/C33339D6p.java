package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33339D6p extends AbstractC39455Fe7 {
    public C33339D6p() {
        this.LIZJ.LJIIIIZZ(44.0f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, 9.11f, -8.95f, 16.5f, -20.0f, 16.5f);
        this.LIZJ.LJIIL(-0.85f, 0.02f);
        this.LIZJ.LJIIL(-0.41f, 0.01f);
        this.LIZJ.LJIIJ(-0.8f, 0.02f, -1.58f, 0.26f, -2.26f, 0.67f);
        this.LIZJ.LJIIIZ(33.24f, 33.24f, false, true, -8.82f, 3.22f);
        this.LIZJ.LJIIJ(-3.11f, 0.6f, -0.9f, -2.3f, -0.9f, -2.3f);
        this.LIZJ.LJIILJJIL(1.39f, -1.87f, 2.17f, -3.37f, true);
        this.LIZJ.LJIIJ(0.24f, -0.45f, 0.03f, -0.98f, -0.4f, -1.23f);
        this.LIZJ.LJ(7.37f, 32.53f, 4.0f, 27.59f, 4.0f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, -9.11f, 8.95f, -16.5f, 20.0f, -16.5f);
        this.LIZJ.LJIILLIIL(44.0f, 12.89f, 44.0f, 22.0f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-19.0f, -9.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(15.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIJ(14.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.0f, 5.0f);
        C32856Cuy.LLZILL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(16.0f, 0.0f);
        C32856Cuy.LLZILL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
