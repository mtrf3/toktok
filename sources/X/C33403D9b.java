package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33403D9b extends AbstractC39455Fe7 {
    public C33403D9b() {
        this.LIZJ.LJIIIIZZ(35.14f, 19.93f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(3.0f, 3.0f, false, false, 0.0f, -4.24f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-2.83f, -2.83f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.0f, 3.0f, false, false, -4.24f, 0.0f);
        this.LIZJ.LJIIL(-19.8f, 19.8f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, true, false, 7.07f, 7.07f);
        this.LIZJ.LJIIL(19.8f, -19.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-4.36f, 1.54f);
        this.LIZJ.LJIIJJI(-8.49f);
        this.LIZJ.LJIIL(7.2f, -7.2f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(2.83f, 2.83f);
        C32856Cuy.wk(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-2.95f, 2.95f);
        this.LIZJ.LIZLLL();
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(16.0f, 6.0f);
        this.LIZJ.LJIIJ(0.33f, 0.0f, 0.47f, 0.55f, 0.64f, 1.24f);
        this.LIZJ.LJIIJ(0.2f, 0.74f, 0.42f, 1.63f, 0.95f, 2.17f);
        this.LIZJ.LJIIJ(0.54f, 0.54f, 1.43f, 0.76f, 2.17f, 0.95f);
        this.LIZJ.LJIIJ(0.69f, 0.17f, 1.24f, 0.31f, 1.24f, 0.64f);
        C32856Cuy.oc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(37.0f, 28.0f);
        this.LIZJ.LJIIJ(0.33f, 0.0f, 0.47f, 0.55f, 0.65f, 1.24f);
        this.LIZJ.LJIIJ(0.18f, 0.74f, 0.4f, 1.63f, 0.94f, 2.17f);
        this.LIZJ.LJIIJ(0.54f, 0.54f, 1.43f, 0.76f, 2.17f, 0.95f);
        this.LIZJ.LJIIJ(0.69f, 0.17f, 1.24f, 0.31f, 1.24f, 0.64f);
        C32856Cuy.oc(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIIZZ(39.0f, 5.0f);
        this.LIZJ.LJIIJ(0.27f, 0.0f, 0.38f, 0.44f, 0.52f, 1.0f);
        this.LIZJ.LJIIJ(0.14f, 0.58f, 0.32f, 1.3f, 0.75f, 1.73f);
        this.LIZJ.LJIIJ(0.44f, 0.43f, 1.15f, 0.6f, 1.74f, 0.76f);
        this.LIZJ.LJIIJ(0.55f, 0.14f, 1.0f, 0.25f, 1.0f, 0.51f);
        this.LIZJ.LJIILJJIL(-0.45f, 0.38f, -1.0f, 0.51f, true);
        this.LIZJ.LJIIJ(-0.59f, 0.15f, -1.3f, 0.33f, -1.74f, 0.76f);
        this.LIZJ.LJIIJ(-0.43f, 0.44f, -0.6f, 1.15f, -0.75f, 1.74f);
        this.LIZJ.LJIIJ(-0.14f, 0.55f, -0.25f, 1.0f, -0.52f, 1.0f);
        this.LIZJ.LJIIJ(-0.26f, 0.0f, -0.37f, -0.45f, -0.51f, -1.0f);
        this.LIZJ.LJIIJ(-0.15f, -0.6f, -0.33f, -1.3f, -0.76f, -1.74f);
        this.LIZJ.LJIIJ(-0.43f, -0.43f, -1.15f, -0.6f, -1.73f, -0.76f);
        this.LIZJ.LJIIJ(-0.56f, -0.13f, -1.0f, -0.25f, -1.0f, -0.51f);
        this.LIZJ.LJIILJJIL(0.44f, -0.37f, 1.0f, -0.51f, true);
        this.LIZJ.LJIIJ(0.58f, -0.15f, 1.3f, -0.33f, 1.73f, -0.76f);
        this.LIZJ.LJIIJ(0.43f, -0.43f, 0.6f, -1.15f, 0.76f, -1.74f);
        this.LIZJ.LJIIJ(0.14f, -0.55f, 0.25f, -0.99f, 0.51f, -0.99f);
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
