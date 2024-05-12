package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33512DDg extends AbstractC39455Fe7 {
    public C33512DDg() {
        this.LIZJ.LJIIIIZZ(31.85f, 23.37f);
        this.LIZJ.LJIIJ(0.3f, 0.37f, 0.74f, 0.56f, 1.19f, 0.56f);
        this.LIZJ.LJIIJ(0.34f, 0.0f, 0.68f, -0.11f, 0.97f, -0.35f);
        this.LIZJ.LJII(44.6f, 14.9f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, false, 0.5f, -2.4f);
        this.LIZJ.LJII(36.05f, 1.58f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, false, -2.35f, 1.95f);
        this.LIZJ.LJII(40.0f, 11.14f);
        this.LIZJ.LJIIIZ(29.8f, 29.8f, false, false, -18.46f, 3.6f);
        this.LIZJ.LIZJ(29.8f, 29.8f, false, false, 7.32f, 32.77f);
        this.LIZJ.LIZJ(29.82f, 29.82f, false, false, 10.0f, 55.6f);
        this.LIZJ.LJIIIZ(30.06f, 30.06f, false, false, 26.2f, 15.37f);
        this.LIZJ.LJIIIZ(30.1f, 30.1f, false, false, 30.04f, -30.83f);
        this.LIZJ.LJIIIZ(1.53f, 1.53f, false, false, -1.53f, -1.49f);
        C32856Cuy.qb(this.LIZJ);
        this.LIZJ.LJIIJ(-0.85f, 0.03f, -1.5f, 0.73f, -1.49f, 1.58f);
        this.LIZJ.LIZJ(27.0f, 27.0f, false, true, 28.9f, 66.9f);
        this.LIZJ.LJIIIZ(26.8f, 26.8f, false, true, -16.2f, -12.8f);
        this.LIZJ.LJIIIZ(26.78f, 26.78f, false, true, -2.43f, -20.5f);
        this.LIZJ.LJIIIZ(26.8f, 26.8f, false, true, 12.79f, -16.2f);
        this.LIZJ.LJIIJ(5.37f, -3.01f, 11.46f, -4.08f, 17.45f, -3.1f);
        this.LIZJ.LJIIL(-8.43f, 6.9f);
        this.LIZJ.LJIIJ(-0.65f, 0.54f, -0.75f, 1.5f, -0.22f, 2.16f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
