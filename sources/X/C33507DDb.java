package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33507DDb extends AbstractC39455Fe7 {
    public C33507DDb() {
        this.LIZJ.LJIILIIL(14.09f, 7.9f);
        this.LIZJ.LJIIL(4.28f, 4.62f);
        this.LIZJ.LJIIJJI(-7.72f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, -3.9f, 3.9f);
        this.LIZJ.LJIILL(22.07f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, 3.9f, 3.9f);
        this.LIZJ.LJIIJJI(26.7f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, 3.9f, -3.9f);
        this.LIZJ.LJIJ(16.42f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, -3.9f, -3.9f);
        this.LIZJ.LJIIJJI(-8.43f);
        this.LIZJ.LJII(33.2f, 7.9f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.1f, -1.47f);
        this.LIZJ.LJII(31.5f, 5.06f);
        this.LIZJ.LJIIIZ(1.12f, 1.12f, false, false, -1.53f, 0.08f);
        this.LIZJ.LJIIL(-6.32f, 6.81f);
        this.LIZJ.LJIIL(-6.33f, -6.8f);
        this.LIZJ.LJIIIZ(1.12f, 1.12f, false, false, -1.53f, -0.1f);
        this.LIZJ.LJIIL(-1.61f, 1.38f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.1f, 1.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(17.57f, 20.58f);
        this.LIZJ.LJII(20.9f, 35.06f);
        this.LIZJ.LJIIJ(-0.8f, 0.48f, -1.8f, -0.09f, -1.8f, -1.01f);
        this.LIZJ.LJIJ(20.89f);
        this.LIZJ.LJIIJ(0.0f, -0.92f, 1.0f, -1.5f, 1.8f, -1.01f);
        this.LIZJ.LJIIL(10.76f, 6.58f);
        this.LIZJ.LJIIJ(0.76f, 0.46f, 0.76f, 1.56f, 0.0f, 2.02f);
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
