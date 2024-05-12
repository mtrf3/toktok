package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33574DFq extends AbstractC39455Fe7 {
    public C33574DFq() {
        this.LIZJ.LJIILIIL(7.08f, 44.29f);
        this.LIZJ.LJIIL(7.39f, -36.93f);
        this.LIZJ.LJIIIZ(2.74f, 2.74f, false, true, 4.55f, -1.47f);
        this.LIZJ.LJIIL(7.55f, 6.97f);
        this.LIZJ.LJII(35.61f, 1.3f);
        this.LIZJ.LJ(37.35f, -0.9f, 40.9f, 0.6f, 40.5f, 3.4f);
        this.LIZJ.LJII(35.0f, 40.5f);
        this.LIZJ.LJIIIZ(2.74f, 2.74f, false, true, -4.5f, 1.68f);
        this.LIZJ.LJIIL(-8.22f, -7.05f);
        this.LIZJ.LJII(11.8f, 46.67f);
        this.LIZJ.LJIIJ(-1.87f, 2.06f, -5.26f, 0.35f, -4.72f, -2.38f);
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
