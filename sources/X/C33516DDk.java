package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33516DDk extends AbstractC39455Fe7 {
    public C33516DDk() {
        this.LIZJ.LJIILIIL(24.0f, 20.24f);
        this.LIZJ.LJIIL(13.17f, 13.17f);
        C32856Cuy.Ud(this.LIZJ);
        this.LIZJ.LJII(25.06f, 12.82f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.12f, 0.0f);
        this.LIZJ.LJII(6.59f, 29.17f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJII(9.4f, 33.4f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 20.24f);
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
