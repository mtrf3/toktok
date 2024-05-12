package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33336D6m extends AbstractC39455Fe7 {
    public C33336D6m() {
        this.LIZJ.LJIIIIZZ(8.25f, 5.0f);
        this.LIZJ.LIZJ(4.25f, 4.25f, false, false, 4.0f, 9.25f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(43.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.41f, 1.41f);
        this.LIZJ.LJIIL(7.3f, -7.28f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(25.04f);
        this.LIZJ.LJIIJ(2.35f, 0.0f, 4.25f, -1.9f, 4.25f, -4.26f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(9.25f);
        this.LIZJ.LJ(44.0f, 6.9f, 42.1f, 5.0f, 39.75f, 5.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(8.25f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(15.87f, 11.06f);
        this.LIZJ.LJIIJ(-0.85f, 0.0f, -1.64f, 0.52f, -2.19f, 1.63f);
        this.LIZJ.LJIIJ(-0.18f, 0.38f, -0.6f, 0.6f, -1.0f, 0.46f);
        this.LIZJ.LJIIL(-2.36f, -0.79f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.45f, -0.94f);
        this.LIZJ.LJIIJ(0.94f, -2.2f, 2.88f, -4.36f, 6.0f, -4.36f);
        this.LIZJ.LJIIJ(3.32f, 0.0f, 6.02f, 2.7f, 6.02f, 6.03f);
        this.LIZJ.LJIIJ(0.0f, 1.94f, -1.18f, 3.54f, -2.4f, 4.56f);
        this.LIZJ.LJIIIZ(7.86f, 7.86f, false, true, -3.88f, 1.76f);
        this.LIZJ.LJIIJ(-0.41f, 0.05f, -0.75f, -0.3f, -0.75f, -0.7f);
        C32856Cuy.LJJJLZIJ(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.42f, 0.34f, -0.76f, 0.73f, -0.89f);
        this.LIZJ.LJIIJ(0.43f, -0.14f, 0.9f, -0.39f, 1.34f, -0.75f);
        this.LIZJ.LJIIJ(0.74f, -0.61f, 0.96f, -1.2f, 0.96f, -1.48f);
        this.LIZJ.LJIIJ(0.0f, -1.12f, -0.9f, -2.03f, -2.02f, -2.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.38f, 12.25f);
        C32856Cuy.fj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
