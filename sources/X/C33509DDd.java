package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33509DDd extends AbstractC39455Fe7 {
    public C33509DDd() {
        this.LIZJ.LJIIIIZZ(4.0f, 23.4f);
        this.LIZJ.LJ(4.0f, 12.25f, 12.73f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LJIILJJIL(20.0f, 8.26f, 20.0f, 19.4f, true);
        this.LIZJ.LJIIJ(0.0f, 11.15f, -8.73f, 19.4f, -20.0f, 19.4f);
        this.LIZJ.LJIIJ(-2.02f, 0.0f, -3.96f, -0.27f, -5.79f, -0.77f);
        this.LIZJ.LJIIIZ(1.6f, 1.6f, false, false, -1.07f, 0.08f);
        this.LIZJ.LJIIL(-3.97f, 1.75f);
        this.LIZJ.LJIIIZ(1.6f, 1.6f, false, true, -2.24f, -1.41f);
        this.LIZJ.LJIIL(-0.12f, -3.56f);
        this.LIZJ.LJIIIZ(1.58f, 1.58f, false, false, -0.53f, -1.14f);
        this.LIZJ.LIZJ(18.98f, 18.98f, false, true, 4.0f, 23.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.47f, -3.22f);
        this.LIZJ.LJIIL(-6.25f, 8.39f);
        this.LIZJ.LJIIJ(-0.6f, 0.8f, 0.57f, 1.7f, 1.47f, 1.13f);
        this.LIZJ.LJIIL(6.7f, -4.31f);
        this.LIZJ.LJIIJ(0.46f, -0.3f, 1.09f, -0.3f, 1.55f, 0.0f);
        this.LIZJ.LJIIL(4.97f, 3.15f);
        this.LIZJ.LJIIJ(1.5f, 0.94f, 3.62f, 0.62f, 4.61f, -0.72f);
        this.LIZJ.LJIIL(6.26f, -8.38f);
        this.LIZJ.LJIIJ(0.6f, -0.8f, -0.58f, -1.72f, -1.47f, -1.14f);
        this.LIZJ.LJIIL(-6.71f, 4.3f);
        this.LIZJ.LJIIJ(-0.45f, 0.3f, -1.08f, 0.3f, -1.54f, 0.01f);
        this.LIZJ.LJIIL(-4.97f, -3.15f);
        this.LIZJ.LJIIJ(-1.5f, -0.95f, -3.62f, -0.62f, -4.62f, 0.72f);
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
