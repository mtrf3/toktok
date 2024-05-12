package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33601DGr extends AbstractC39455Fe7 {
    public C33601DGr() {
        this.LIZJ.LJIIIIZZ(9.03f, 11.84f);
        this.LIZJ.LJIIJ(4.13f, -4.07f, 10.55f, -4.17f, 14.97f, 0.0f);
        this.LIZJ.LJIIJ(4.42f, -4.17f, 10.84f, -4.07f, 14.97f, 0.0f);
        this.LIZJ.LJIIIZ(10.9f, 10.9f, false, true, 0.0f, 15.58f);
        this.LIZJ.LJII(25.57f, 40.6f);
        this.LIZJ.LJIIJ(-0.87f, 0.87f, -2.27f, 0.87f, -3.15f, 0.0f);
        this.LIZJ.LJII(9.02f, 27.42f);
        this.LIZJ.LJIIIZ(10.9f, 10.9f, false, true, 0.0f, -15.58f);
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
