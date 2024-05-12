package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33495DCp extends AbstractC39455Fe7 {
    public C33495DCp() {
        C32856Cuy.T1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.86f, 19.56f);
        this.LIZJ.LJIIIZ(2.56f, 2.56f, true, true, -5.12f, 0.0f);
        this.LIZJ.LJIIIZ(2.56f, 2.56f, false, true, 5.12f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.44f, 28.7f);
        this.LIZJ.LJIIL(4.8f, -6.72f);
        this.LIZJ.LJIIJ(0.23f, -0.31f, 0.34f, -0.47f, 0.48f, -0.52f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, true, 0.38f, 0.0f);
        this.LIZJ.LJIIJ(0.14f, 0.05f, 0.25f, 0.2f, 0.48f, 0.52f);
        this.LIZJ.LJII(26.16f, 27.0f);
        this.LIZJ.LJIIL(1.51f, -1.85f);
        this.LIZJ.LJIIJ(0.22f, -0.27f, 0.33f, -0.4f, 0.46f, -0.45f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, true, 0.35f, 0.0f);
        this.LIZJ.LJIIJ(0.13f, 0.05f, 0.24f, 0.18f, 0.46f, 0.45f);
        this.LIZJ.LJIIL(2.87f, 3.51f);
        this.LIZJ.LJIIJ(0.35f, 0.43f, 0.53f, 0.64f, 0.53f, 0.82f);
        this.LIZJ.LJIIJ(0.0f, 0.16f, -0.07f, 0.3f, -0.2f, 0.4f);
        this.LIZJ.LJIIJ(-0.13f, 0.12f, -0.4f, 0.12f, -0.96f, 0.12f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(17.1f);
        this.LIZJ.LJIIJ(-0.52f, 0.0f, -0.77f, 0.0f, -0.91f, -0.1f);
        this.LIZJ.LJIIIZ(0.51f, 0.51f, false, true, -0.2f, -0.4f);
        this.LIZJ.LJIIJ(0.0f, -0.17f, 0.14f, -0.38f, 0.44f, -0.8f);
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
