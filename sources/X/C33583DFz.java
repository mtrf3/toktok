package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33583DFz extends AbstractC39455Fe7 {
    public C33583DFz() {
        C32856Cuy.jf(this.LIZJ);
        this.LIZJ.LJIILIIL(0.52f, 6.17f);
        this.LIZJ.LJIIL(6.05f, 6.05f);
        this.LIZJ.LJIIL(-8.41f, 11.33f);
        this.LIZJ.LJIIIZ(3.96f, 3.96f, false, false, -0.16f, 4.48f);
        this.LIZJ.LJIIL(0.78f, 1.23f);
        this.LIZJ.LJIIIZ(5.99f, 5.99f, false, true, -0.55f, 7.15f);
        this.LIZJ.LJIIL(-21.9f, -21.9f);
        this.LIZJ.LJIIIZ(5.99f, 5.99f, false, true, 7.15f, -0.55f);
        this.LIZJ.LJIIL(1.22f, 0.78f);
        this.LIZJ.LJIIJ(1.39f, 0.88f, 3.17f, 0.81f, 4.49f, -0.16f);
        this.LIZJ.LJIIL(11.33f, -8.41f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
