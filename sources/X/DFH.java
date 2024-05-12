package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFH extends AbstractC39455Fe7 {
    public DFH() {
        this.LIZJ.LJIIIIZZ(16.14f, 4.0f);
        this.LIZJ.LJII(3.5f, 25.87f);
        this.LIZJ.LJIIL(-0.27f, 0.47f);
        this.LIZJ.LJIIL(-0.03f, 0.06f);
        this.LIZJ.LJIIIZ(10.24f, 10.24f, true, false, 10.9f, -5.26f);
        this.LIZJ.LJII(22.35f, 4.0f);
        C40084FoG.LJ(this.LIZJ, "p", -6.21f);
        this.LIZJ.LJIIIIZZ(39.34f, 4.0f);
        this.LIZJ.LJII(26.72f, 25.85f);
        this.LIZJ.LJIIJ(-0.11f, 0.17f, -0.21f, 0.34f, -0.3f, 0.52f);
        this.LIZJ.LJIIL(-0.02f, 0.03f);
        this.LIZJ.LJIIIZ(10.24f, 10.24f, true, false, 10.9f, -5.25f);
        this.LIZJ.LJII(45.55f, 4.0f);
        C40084FoG.LJ(this.LIZJ, "p", -6.21f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
