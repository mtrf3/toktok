package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33570DFm extends AbstractC39455Fe7 {
    public C33570DFm() {
        this.LIZJ.LJIIIIZZ(20.3f, 6.38f);
        this.LIZJ.LJIIJ(1.42f, -0.3f, 2.66f, 0.79f, 2.7f, 2.13f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, false, 39.39f, 21.8f);
        this.LIZJ.LIZJ(2.24f, 2.24f, false, true, 42.0f, 24.0f);
        this.LIZJ.LIZJ(18.0f, 18.0f, true, true, 20.3f, 6.38f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.08f, 4.46f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, true, false, 18.64f, 15.14f);
        this.LIZJ.LJII(37.0f, 26.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, -17.78f, -15.16f);
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
