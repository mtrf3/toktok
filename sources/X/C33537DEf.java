package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33537DEf extends AbstractC39455Fe7 {
    public C33537DEf() {
        this.LIZJ.LJIIIIZZ(24.0f, 10.02f);
        this.LIZJ.LJIIJ(5.0f, -5.28f, 12.53f, -5.28f, 17.33f, -0.46f);
        this.LIZJ.LJIIIZ(12.67f, 12.67f, false, true, 0.0f, 17.84f);
        this.LIZJ.LJII(25.42f, 43.41f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.84f, 0.0f);
        this.LIZJ.LJIIL(-15.9f, -16.0f);
        this.LIZJ.LJIIIZ(12.67f, 12.67f, false, true, 0.0f, -17.85f);
        this.LIZJ.LJ(11.46f, 4.74f, 19.0f, 4.74f, 24.0f, 10.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.49f, 2.36f);
        this.LIZJ.LJIIJ(-3.27f, -3.3f, -8.47f, -3.3f, -11.98f, 0.83f);
        this.LIZJ.LJIIL(-0.06f, 0.06f);
        this.LIZJ.LJII(24.0f, 15.74f);
        this.LIZJ.LJIIL(-2.45f, -2.47f);
        this.LIZJ.LJIIL(-0.06f, -0.06f);
        this.LIZJ.LJ(18.0f, 9.07f, 12.8f, 9.1f, 9.51f, 12.38f);
        this.LIZJ.LJIIIZ(8.67f, 8.67f, false, false, 0.0f, 12.2f);
        this.LIZJ.LJII(24.0f, 39.16f);
        this.LIZJ.LJIIL(14.49f, -14.58f);
        this.LIZJ.LJIIIZ(8.67f, 8.67f, false, false, 0.0f, -12.2f);
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
