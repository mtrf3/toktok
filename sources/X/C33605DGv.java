package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33605DGv extends AbstractC39455Fe7 {
    public C33605DGv() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 8.0f);
        p.LJIIIZ(16.0f, 16.0f, true, true, 0.0f, 32.0f);
        p.LJIIIZ(16.0f, 16.0f, false, true, 0.0f, -32.0f);
        p.LIZLLL();
        p.LJIILIIL(20.0f, 16.0f);
        p.LJIIIZ(20.0f, 20.0f, true, false, -40.0f, 0.0f);
        p.LJIIIZ(20.0f, 20.0f, false, false, 40.0f, 0.0f);
        p.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
