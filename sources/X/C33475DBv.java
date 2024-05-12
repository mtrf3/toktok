package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33475DBv extends AbstractC39455Fe7 {
    public C33475DBv() {
        this.LIZJ.LJIIIIZZ(45.7f, 24.05f);
        this.LIZJ.LJII(30.4f, 12.1f);
        this.LIZJ.LJIIJ(-0.36f, -0.28f, -0.86f, 0.0f, -0.86f, 0.46f);
        this.LIZJ.LJIILL(9.49f);
        this.LIZJ.LJIIJ(0.0f, 0.77f, -0.72f, 1.28f, -1.37f, 1.04f);
        this.LIZJ.LJIIJ(-0.06f, -0.03f, -11.07f, -8.52f, -14.26f, -10.98f);
        this.LIZJ.LJIIJ(-0.36f, -0.27f, -0.85f, 0.0f, -0.85f, 0.47f);
        this.LIZJ.LJIILL(10.76f);
        this.LIZJ.LJIIJ(0.0f, 0.6f, -0.46f, 1.1f, -1.04f, 1.1f);
        this.LIZJ.LJIIJJI(-9.3f);
        this.LIZJ.LJIIJ(-0.4f, 0.0f, -0.72f, 0.33f, -0.72f, 0.75f);
        this.LIZJ.LJIILL(10.94f);
        this.LIZJ.LJIIJ(0.0f, 0.55f, 0.43f, 1.0f, 0.95f, 1.0f);
        this.LIZJ.LJIIJJI(9.4f);
        this.LIZJ.LJIIJ(0.4f, 0.0f, 0.71f, -0.34f, 0.71f, -0.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-9.44f);
        this.LIZJ.LJIIJ(0.0f, -0.65f, 0.5f, -1.1f, 1.05f, -1.1f);
        this.LIZJ.LJIIJ(0.22f, 0.0f, 0.44f, 0.09f, 0.62f, 0.23f);
        this.LIZJ.LJIIL(13.3f, 10.32f);
        this.LIZJ.LJIIJ(0.61f, 0.48f, 1.47f, 0.02f, 1.47f, -0.79f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-8.76f);
        this.LIZJ.LJIIJ(0.0f, -0.6f, 0.4f, -1.03f, 0.89f, -1.09f);
        C32856Cuy.c0(this.LIZJ);
        this.LIZJ.LJIIJ(0.16f, 0.01f, 0.32f, 0.06f, 0.47f, 0.17f);
        this.LIZJ.LJII(44.54f, 36.4f);
        this.LIZJ.LJIIJ(0.6f, 0.47f, 1.47f, 0.01f, 1.47f, -0.8f);
        this.LIZJ.LJIJ(24.85f);
        this.LIZJ.LJIIJ(0.0f, -0.5f, -0.2f, -0.67f, -0.3f, -0.8f);
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
