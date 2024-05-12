package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33311D5n extends AbstractC39455Fe7 {
    public C33311D5n() {
        this.LIZJ.LJIIIIZZ(24.87f, 9.03f);
        this.LIZJ.LJIIJ(-3.26f, -2.32f, -7.13f, -2.26f, -9.98f, -1.73f);
        this.LIZJ.LJIIIZ(21.78f, 21.78f, false, false, -5.02f, 1.6f);
        C32856Cuy.ob(this.LIZJ);
        C32856Cuy.C(this.LIZJ);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, false, 9.0f, 10.26f);
        C32856Cuy.LL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        this.LIZJ.LJIJ(28.63f);
        this.LIZJ.LJIIIZ(18.42f, 18.42f, false, true, 3.44f, -1.0f);
        this.LIZJ.LJIIJ(2.5f, -0.46f, 5.4f, -0.4f, 7.7f, 1.24f);
        this.LIZJ.LJIIJ(3.25f, 2.32f, 7.12f, 2.26f, 9.97f, 1.73f);
        this.LIZJ.LJIIIZ(21.78f, 21.78f, false, false, 5.02f, -1.6f);
        C32856Cuy.a0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.01f, -0.01f);
        this.LIZJ.LJIIJ(0.52f, -0.26f, 0.84f, -0.78f, 0.84f, -1.35f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(10.26f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.17f, -1.35f);
        this.LIZJ.LJIIIZ(4.47f, 4.47f, false, true, -0.29f, 0.14f);
        this.LIZJ.LJIIL(-0.89f, 0.36f);
        this.LIZJ.LJIIJ(-0.77f, 0.28f, -1.85f, 0.63f, -3.09f, 0.85f);
        this.LIZJ.LJIIJ(-2.5f, 0.47f, -5.4f, 0.4f, -7.7f, -1.23f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-9.43f, 1.22f);
        this.LIZJ.LJIIJ(2.5f, -0.46f, 5.4f, -0.4f, 7.7f, 1.23f);
        this.LIZJ.LJIIJ(3.25f, 2.32f, 7.12f, 2.26f, 9.97f, 1.73f);
        this.LIZJ.LJIIJ(1.1f, -0.2f, 2.09f, -0.48f, 2.89f, -0.75f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(14.2f);
        this.LIZJ.LJIIIZ(17.77f, 17.77f, false, true, -3.44f, 1.0f);
        this.LIZJ.LJIIJ(-2.5f, 0.45f, -5.4f, 0.4f, -7.7f, -1.24f);
        this.LIZJ.LJIIJ(-3.25f, -2.32f, -7.12f, -2.26f, -9.97f, -1.73f);
        this.LIZJ.LJIIJ(-1.1f, 0.2f, -2.09f, 0.48f, -2.89f, 0.75f);
        this.LIZJ.LJIILL(-14.2f);
        this.LIZJ.LJIIIZ(17.74f, 17.74f, false, true, 3.44f, -1.0f);
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
