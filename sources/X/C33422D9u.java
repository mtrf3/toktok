package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33422D9u extends AbstractC39455Fe7 {
    public C33422D9u() {
        C32856Cuy.ad(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.95f, 6.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.21f, -0.1f, -0.49f, -0.1f, -1.05f, -0.1f);
        p.LJIIJJI(-0.8f);
        p.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.05f, 0.1f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -0.44f, 0.44f);
        p2.LJIIJ(-0.11f, 0.22f, -0.11f, 0.5f, -0.11f, 1.06f);
        p2.LJIILL(4.03f);
        p2.LJIIJ(0.0f, 0.86f, 0.0f, 1.37f, 0.02f, 1.82f);
        p2.LIZJ(17.0f, 17.0f, false, false, 22.0f, 40.53f);
        p2.LJIILL(3.87f);
        p2.LJIIJ(0.0f, 0.56f, 0.0f, 0.84f, 0.1f, 1.05f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 0.45f, 0.44f);
        p2.LJIIJ(0.21f, 0.1f, 0.49f, 0.1f, 1.05f, 0.1f);
        p2.LJIIJJI(0.8f);
        p2.LJIIJ(0.56f, 0.0f, 0.84f, 0.0f, 1.05f, -0.1f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 0.44f, -0.44f);
        p2.LJIIJ(0.11f, -0.21f, 0.11f, -0.5f, 0.11f, -1.05f);
        p2.LJIILL(-3.87f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(17.0f, 17.0f, false, false, 15.98f, -16.08f);
        p3.LJIIJ(0.02f, -0.45f, 0.02f, -0.96f, 0.02f, -1.82f);
        p3.LJIJ(18.6f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.56f, 0.0f, -0.84f, -0.1f, -1.06f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -0.45f, -0.43f);
        p4.LJIIJ(-0.21f, -0.11f, -0.49f, -0.11f, -1.05f, -0.11f);
        p4.LJIIJJI(-0.8f);
        p4.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.05f, 0.1f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, -0.44f, 0.44f);
        p4.LJIIJ(-0.11f, 0.22f, -0.11f, 0.5f, -0.11f, 1.06f);
        p4.LJIILL(3.96f);
        p4.LJIIJ(0.0f, 0.95f, 0.0f, 1.35f, -0.02f, 1.68f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(13.0f, 13.0f, false, true, -12.3f, 12.3f);
        p5.LJIIJ(-0.33f, 0.02f, -0.73f, 0.02f, -1.68f, 0.02f);
        p5.LJIILJJIL(-1.35f, 0.0f, -1.68f, -0.02f, true);
        p5.LJIIIZ(13.0f, 13.0f, false, true, -12.3f, -12.3f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJ(10.0f, 23.9f, 10.0f, 23.5f, 10.0f, 22.56f);
        p6.LJIJ(18.6f);
        p6.LJIIJ(0.0f, -0.56f, 0.0f, -0.84f, -0.1f, -1.06f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -0.45f, -0.43f);
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
