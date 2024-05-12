package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33544DEm extends AbstractC39455Fe7 {
    public C33544DEm() {
        this.LIZJ.LJIILIIL(25.41f, 22.41f);
        this.LIZJ.LJIIL(9.3f, -9.29f);
        C32856Cuy.mc(this.LIZJ);
        this.LIZJ.LJII(24.0f, 18.17f);
        C32856Cuy.hj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.41f, 37.41f);
        C32856Cuy.Un(this.LIZJ);
        this.LIZJ.LJII(24.0f, 33.17f);
        C32856Cuy.hj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
