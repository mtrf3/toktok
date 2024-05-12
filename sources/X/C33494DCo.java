package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33494DCo extends AbstractC39455Fe7 {
    public C33494DCo() {
        this.LIZJ.LJIIIIZZ(24.19f, 2.42f);
        this.LIZJ.LJIIJ(1.01f, 0.5f, 1.42f, 1.74f, 0.91f, 2.75f);
        this.LIZJ.LJIIL(-1.43f, 2.88f);
        this.LIZJ.LJIIJJI(3.98f);
        this.LIZJ.LJIIIZ(2.05f, 2.05f, false, true, 1.8f, 3.03f);
        this.LIZJ.LJIIL(-1.83f, 3.37f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.2f);
        this.LIZJ.LJIIIZ(13.19f, 13.19f, false, true, 0.0f, 26.38f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(18.18f);
        this.LIZJ.LJIIIZ(13.19f, 13.19f, false, true, 0.0f, -26.38f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(4.75f);
        this.LIZJ.LJIIL(1.26f, -2.3f);
        this.LIZJ.LJIIJJI(-3.85f);
        this.LIZJ.LJIIIZ(2.05f, 2.05f, false, true, -1.84f, -2.97f);
        this.LIZJ.LJIIL(2.92f, -5.85f);
        this.LIZJ.LJIIIZ(2.05f, 2.05f, false, true, 2.76f, -0.91f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.54f, 26.28f);
        this.LIZJ.LJIIJ(0.8f, -0.47f, 0.8f, -1.64f, 0.0f, -2.1f);
        this.LIZJ.LJIIL(-6.61f, -3.83f);
        this.LIZJ.LJIIIZ(1.22f, 1.22f, false, false, -1.83f, 1.06f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(7.63f);
        this.LIZJ.LJIIJ(0.0f, 0.94f, 1.01f, 1.52f, 1.83f, 1.06f);
        this.LIZJ.LJIIL(6.6f, -3.82f);
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
