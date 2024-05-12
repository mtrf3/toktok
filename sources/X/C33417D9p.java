package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33417D9p extends AbstractC39455Fe7 {
    public C33417D9p() {
        this.LIZJ.LJIIIIZZ(8.0f, 39.0f);
        C32856Cuy.A7(this.LIZJ);
        C32856Cuy.L9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(29.5f);
        C32856Cuy.N5(this.LIZJ);
        C32856Cuy.l7(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(30.79f, -25.02f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.23f, 0.15f, 0.3f, 0.46f, 0.15f, 0.7f);
        this.LIZJ.LJIIL(-8.7f, 13.44f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.43f, 0.27f);
        this.LIZJ.LJIIL(-8.1f, -5.89f);
        this.LIZJ.LJIIL(-6.52f, 10.88f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.68f, 0.17f);
        this.LIZJ.LJIIL(-0.86f, -0.52f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.17f, -0.68f);
        this.LIZJ.LJIIL(7.08f, -11.81f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.45f, -0.3f);
        this.LIZJ.LJIIL(8.12f, 5.9f);
        this.LIZJ.LJIIL(8.13f, -12.55f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.69f, -0.15f);
        this.LIZJ.LJIIL(0.84f, 0.54f);
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
