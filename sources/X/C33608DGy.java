package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33608DGy extends AbstractC39455Fe7 {
    public C33608DGy() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 24.0f);
        C32856Cuy.LLJZIJLIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(19.0f, 24.0f);
        C32856Cuy.LLJZIJLIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(39.0f, 19.0f);
        C32856Cuy.Gd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
