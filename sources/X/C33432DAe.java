package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33432DAe extends AbstractC39455Fe7 {
    public C33432DAe() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(18.5f, 14.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, true, 10.4f, 2.5f);
        this.LIZJ.LJIIJJI(-9.8f);
        this.LIZJ.LJIIJ(-0.38f, -0.75f, -0.6f, -1.6f, -0.6f, -2.5f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LJJIJLIJ(this.LIZJ);
        this.LIZJ.LJIIIZ(8.5f, 8.5f, true, false, -16.63f, 2.5f);
        this.LIZJ.LJI(11.2f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, -3.49f, 3.82f);
        this.LIZJ.LJIIL(1.64f, 18.0f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 3.49f, 3.18f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(22.34f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 3.49f, -3.18f);
        this.LIZJ.LJIIL(1.64f, -18.0f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, -3.49f, -3.82f);
        this.LIZJ.LJIIJJI(-4.68f);
        this.LIZJ.LJIIJ(0.24f, -0.8f, 0.37f, -1.63f, 0.37f, -2.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-21.8f, 6.05f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.49f, -0.55f);
        this.LIZJ.LJIIJJI(25.62f);
        this.LIZJ.LJIIJ(0.3f, 0.0f, 0.52f, 0.25f, 0.5f, 0.55f);
        this.LIZJ.LJIIL(-1.64f, 18.0f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.45f);
        this.LIZJ.LJI(12.83f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.45f);
        this.LIZJ.LJIIL(-1.64f, -18.0f);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(21.0f, 24.5f);
        C32856Cuy.Q3(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(12.0f, 0.0f);
        C32856Cuy.Q3(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
