package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33567DFj extends AbstractC39455Fe7 {
    public C33567DFj() {
        this.LIZJ.LJIIIIZZ(24.0f, 11.84f);
        this.LIZJ.LJIIJ(-4.42f, -4.17f, -10.84f, -4.07f, -14.97f, 0.0f);
        this.LIZJ.LJIIIZ(10.9f, 10.9f, false, false, 0.0f, 15.58f);
        this.LIZJ.LJIIL(13.4f, 13.18f);
        this.LIZJ.LJIIJ(0.87f, 0.87f, 2.27f, 0.87f, 3.15f, 0.0f);
        this.LIZJ.LJIIL(13.4f, -13.18f);
        this.LIZJ.LJIIIZ(10.9f, 10.9f, false, false, 0.0f, -15.58f);
        this.LIZJ.LJIIJ(-4.14f, -4.07f, -10.56f, -4.17f, -14.98f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.53f, 3.86f);
        this.LIZJ.LJIIL(0.06f, 0.07f);
        this.LIZJ.LJII(24.0f, 18.2f);
        this.LIZJ.LJIIL(2.47f, -2.43f);
        this.LIZJ.LJIIL(0.06f, -0.07f);
        this.LIZJ.LJIIJ(2.74f, -3.17f, 6.77f, -3.13f, 9.29f, -0.65f);
        this.LIZJ.LJIIIZ(6.4f, 6.4f, false, true, 0.0f, 9.16f);
        this.LIZJ.LJII(24.0f, 35.84f);
        this.LIZJ.LJII(12.18f, 24.21f);
        this.LIZJ.LJIIIZ(6.4f, 6.4f, false, true, 0.0f, -9.16f);
        this.LIZJ.LJIIJ(2.52f, -2.48f, 6.55f, -2.52f, 9.3f, 0.65f);
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
