package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33599DGp extends AbstractC39455Fe7 {
    public C33599DGp() {
        this.LIZJ.LJIIIIZZ(22.19f, 4.92f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 3.63f, 0.0f);
        this.LIZJ.LJIIL(14.95f, 32.26f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.63f, 2.67f);
        this.LIZJ.LJII(24.0f, 33.59f);
        this.LIZJ.LJII(9.86f, 39.85f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.63f, -2.67f);
        this.LIZJ.LJII(22.2f, 4.92f);
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
