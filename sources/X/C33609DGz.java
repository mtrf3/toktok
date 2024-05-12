package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33609DGz extends AbstractC39455Fe7 {
    public C33609DGz() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 24.0f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, true, true, 40.0f, 0.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, true, -4.0f, 0.0f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, true, false, -6.03f, 12.52f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.5f, 3.12f);
        this.LIZJ.LIZJ(20.0f, 20.0f, false, true, 4.0f, 24.0f);
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
