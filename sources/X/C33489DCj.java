package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33489DCj extends AbstractC39455Fe7 {
    public C33489DCj() {
        this.LIZJ.LJIIIIZZ(32.54f, 4.0f);
        this.LIZJ.LJIIJ(0.28f, 2.37f, -0.73f, 4.7f, -2.2f, 6.41f);
        this.LIZJ.LJIIJ(-1.54f, 1.69f, -4.0f, 2.98f, -6.4f, 2.81f);
        this.LIZJ.LJIIJ(-0.31f, -2.27f, 0.9f, -4.7f, 2.26f, -6.17f);
        this.LIZJ.LIZJ(10.07f, 10.07f, false, true, 32.54f, 4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.84f, 13.65f);
        this.LIZJ.LJIIJ(-0.27f, 0.15f, -4.7f, 2.61f, -4.65f, 7.62f);
        this.LIZJ.LJIIJ(0.06f, 6.06f, 5.7f, 8.06f, 5.77f, 8.08f);
        this.LIZJ.LJIIJ(-0.03f, 0.14f, -0.88f, 2.9f, -3.0f, 5.68f);
        this.LIZJ.LJIIJ(-1.77f, 2.46f, -3.62f, 4.86f, -6.56f, 4.9f);
        this.LIZJ.LJIIIZ(7.8f, 7.8f, false, true, -3.32f, -0.73f);
        this.LIZJ.LJIIIZ(9.25f, 9.25f, false, false, -7.74f, 0.03f);
        this.LIZJ.LJIIJ(-0.93f, 0.37f, -1.83f, 0.72f, -3.1f, 0.77f);
        this.LIZJ.LJIIJ(-2.8f, 0.1f, -4.95f, -2.63f, -6.78f, -5.06f);
        this.LIZJ.LJIIJ(-3.66f, -4.97f, -6.5f, -14.01f, -2.69f, -20.16f);
        this.LIZJ.LJIIIZ(10.63f, 10.63f, false, true, 8.84f, -5.01f);
        this.LIZJ.LJIIJ(1.59f, -0.03f, 3.11f, 0.54f, 4.45f, 1.04f);
        this.LIZJ.LJIIJ(1.02f, 0.38f, 1.93f, 0.72f, 2.68f, 0.72f);
        this.LIZJ.LJIIJ(0.66f, 0.0f, 1.54f, -0.33f, 2.58f, -0.71f);
        this.LIZJ.LJIIJ(1.62f, -0.6f, 3.61f, -1.34f, 5.64f, -1.14f);
        this.LIZJ.LJIIJ(1.39f, 0.04f, 5.34f, 0.51f, 7.89f, 3.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-15329245);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
