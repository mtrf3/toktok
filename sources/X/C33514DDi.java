package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33514DDi extends AbstractC39455Fe7 {
    public C33514DDi() {
        this.LIZJ.LJIILIIL(25.41f, 7.59f);
        this.LIZJ.LJIIL(9.3f, 9.29f);
        C32856Cuy.De(this.LIZJ);
        this.LIZJ.LJII(24.0f, 11.83f);
        C32856Cuy.E2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.41f, 40.41f);
        C32856Cuy.Un(this.LIZJ);
        this.LIZJ.LJII(24.0f, 36.17f);
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
