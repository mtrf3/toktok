package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33412D9k extends AbstractC39455Fe7 {
    public C33412D9k() {
        this.LIZJ.LJIIIIZZ(31.38f, 16.18f);
        this.LIZJ.LJ(30.18f, 9.02f, 27.32f, 4.0f, 24.01f, 4.0f);
        this.LIZJ.LJIIJ(-3.32f, 0.0f, -6.17f, 5.02f, -7.38f, 12.18f);
        this.LIZJ.LJIIJJI(14.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 23.87f);
        this.LIZJ.LJIIJ(0.0f, 1.78f, 0.1f, 3.49f, 0.28f, 5.13f);
        this.LIZJ.LJIIJJI(15.44f);
        this.LIZJ.LJIIIZ(48.34f, 48.34f, false, false, 0.0f, -10.25f);
        this.LIZJ.LJI(16.28f);
        this.LIZJ.LJIIIZ(48.26f, 48.26f, false, false, -0.28f, 5.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(42.0f, 16.0f);
        this.LIZJ.LIZJ(19.02f, 19.02f, false, false, 30.0f, 5.0f);
        this.LIZJ.LJIIJ(1.85f, 2.63f, 3.13f, 6.58f, 3.8f, 11.0f);
        C32856Cuy.T6(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.0f, 16.0f);
        this.LIZJ.LIZJ(19.02f, 19.02f, false, true, 18.0f, 5.0f);
        this.LIZJ.LJIIJ(-1.85f, 2.63f, -3.13f, 6.58f, -3.8f, 11.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.0f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(43.3f, 19.0f);
        C32856Cuy.L6(this.LIZJ);
        this.LIZJ.LJIIIZ(48.55f, 48.55f, false, true, 0.0f, 10.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.3f);
        this.LIZJ.LJIIIZ(18.6f, 18.6f, false, false, 0.0f, -10.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.9f, 19.0f);
        this.LIZJ.LJIIIZ(51.5f, 51.5f, false, false, -0.02f, 10.25f);
        this.LIZJ.LJI(4.7f);
        this.LIZJ.LJ(4.26f, 27.61f, 4.0f, 25.9f, 4.0f, 24.13f);
        this.LIZJ.LJIIJ(0.0f, -1.78f, 0.26f, -3.48f, 0.7f, -5.13f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.9f, 44.0f);
        this.LIZJ.LJIIJ(-3.2f, 0.0f, -5.94f, -5.02f, -7.1f, -12.18f);
        C32856Cuy.I6(this.LIZJ);
        this.LIZJ.LJ(29.84f, 38.98f, 27.1f, 44.0f, 23.9f, 44.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 43.0f);
        this.LIZJ.LJIIIZ(19.05f, 19.05f, false, false, 12.0f, -11.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-8.2f);
        this.LIZJ.LJIIJ(-0.68f, 4.43f, -1.95f, 8.38f, -3.8f, 11.0f);
        this.LIZJ.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(18.0f, 43.0f);
        this.LIZJ.LIZJ(19.02f, 19.02f, false, true, 6.0f, 32.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(8.2f);
        this.LIZJ.LJIIJ(0.67f, 4.42f, 1.95f, 8.37f, 3.8f, 11.0f);
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
