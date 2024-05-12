package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33389D8n extends AbstractC39455Fe7 {
    public C33389D8n() {
        this.LIZJ.LJIIIIZZ(16.13f, 13.0f);
        this.LIZJ.LJIIJ(1.65f, 0.0f, 3.21f, 0.38f, 4.6f, 1.03f);
        this.LIZJ.LJIIIZ(15.66f, 15.66f, false, false, -3.98f, 10.47f);
        this.LIZJ.LJIIJ(0.0f, 4.03f, 1.5f, 7.71f, 3.98f, 10.47f);
        this.LIZJ.LJIIJ(-1.4f, 0.66f, -2.96f, 1.03f, -4.6f, 1.03f);
        this.LIZJ.LJ(10.03f, 36.0f, 5.0f, 30.9f, 5.0f, 24.5f);
        this.LIZJ.LJIILLIIL(10.03f, 13.0f, 16.13f, 13.0f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 11.27f);
        this.LIZJ.LIZJ(14.9f, 14.9f, false, false, 16.12f, 9.0f);
        this.LIZJ.LJ(7.72f, 9.0f, 1.0f, 16.0f, 1.0f, 24.5f);
        this.LIZJ.LJIILLIIL(7.72f, 40.0f, 16.13f, 40.0f, true);
        this.LIZJ.LJIIJ(2.88f, 0.0f, 5.58f, -0.83f, 7.87f, -2.26f);
        this.LIZJ.LIZJ(14.8f, 14.8f, false, false, 31.88f, 40.0f);
        this.LIZJ.LJ(40.27f, 40.0f, 47.0f, 33.0f, 47.0f, 24.5f);
        this.LIZJ.LJIILLIIL(40.28f, 9.0f, 31.87f, 9.0f, true);
        this.LIZJ.LJ(29.0f, 9.0f, 26.3f, 9.83f, 24.0f, 11.27f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(31.88f, 13.0f);
        this.LIZJ.LJ(37.97f, 13.0f, 43.0f, 18.1f, 43.0f, 24.5f);
        this.LIZJ.LJIILLIIL(37.97f, 36.0f, 31.87f, 36.0f, true);
        this.LIZJ.LJIIJ(-2.49f, 0.0f, -4.79f, -0.84f, -6.65f, -2.28f);
        this.LIZJ.LJIIIZ(11.61f, 11.61f, false, true, -4.47f, -9.22f);
        this.LIZJ.LJIIJ(0.0f, -3.78f, 1.76f, -7.13f, 4.47f, -9.22f);
        this.LIZJ.LIZJ(10.83f, 10.83f, false, true, 31.88f, 13.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.0f, 20.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, true, 4.0f, 0.0f);
        C32856Cuy.C1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, true, true, -4.0f, 0.0f);
        C32856Cuy.f1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(9.0f, -2.0f);
        C32856Cuy.eo(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, false, 4.0f, 0.0f);
        C32856Cuy.Bj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
