package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33371D7v extends AbstractC39455Fe7 {
    public C33371D7v() {
        this.LIZJ.LJIIIIZZ(14.83f, 14.33f);
        this.LIZJ.LJIIIZ(9.22f, 9.22f, false, true, 18.34f, 0.0f);
        C32856Cuy.l3(this.LIZJ);
        this.LIZJ.LJI(10.24f);
        this.LIZJ.LJIIJ(1.7f, -2.16f, 3.28f, -4.23f, 3.56f, -7.08f);
        this.LIZJ.LJIIL(1.03f, -10.6f);
        this.LIZJ.LIZLLL();
        C32856Cuy.p7(this.LIZJ);
        this.LIZJ.LJIIJ(-6.8f, 0.0f, -12.5f, 5.17f, -13.16f, 11.94f);
        this.LIZJ.LJII(9.82f, 24.53f);
        this.LIZJ.LJIIJ(-0.3f, 3.19f, -3.4f, 5.86f, -5.27f, 8.23f);
        C32856Cuy.nm(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-1.87f, -2.37f, -4.96f, -5.04f, -5.27f, -8.23f);
        p.LJIIL(-1.02f, -10.59f);
        this.LIZJ.LIZJ(13.22f, 13.22f, false, false, 24.0f, 2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.9f, 39.0f);
        this.LIZJ.LJIIJ(0.11f, -0.55f, -0.35f, -1.0f, -0.9f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(18.0f);
        p2.LJIIJ(-0.55f, 0.0f, -1.01f, 0.45f, -0.9f, 1.0f);
        p2.LJIIJ(1.28f, 6.61f, 12.52f, 6.61f, 13.8f, 0.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
