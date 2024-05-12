package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCZ extends AbstractC39455Fe7 {
    public DCZ() {
        C32856Cuy.vd(this.LIZJ);
        this.LIZJ.LJIIIIZZ(8.0f, 19.4f);
        this.LIZJ.LJIIJ(-0.01f, -0.15f, 0.12f, -0.39f, 0.43f, -0.39f);
        this.LIZJ.LJIIJJI(31.14f);
        this.LIZJ.LJIIJ(0.31f, 0.0f, 0.44f, 0.24f, 0.43f, 0.4f);
        this.LIZJ.LJII(38.0f, 40.65f);
        this.LIZJ.LJIIJ(-0.01f, 0.15f, -0.16f, 0.34f, -0.43f, 0.34f);
        this.LIZJ.LJI(10.42f);
        this.LIZJ.LJIIJ(-0.27f, 0.0f, -0.42f, -0.2f, -0.43f, -0.34f);
        this.LIZJ.LJII(8.0f, 19.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.0f, 6.11f);
        C32856Cuy.z2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
