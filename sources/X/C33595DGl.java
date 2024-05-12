package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33595DGl extends AbstractC39455Fe7 {
    public C33595DGl() {
        C32856Cuy.v8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 17.0f);
        C32856Cuy.Kl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 37.0f);
        C32856Cuy.Kl(this.LIZJ);
        C32856Cuy.I2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
