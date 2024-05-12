package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33600DGq extends AbstractC39455Fe7 {
    public C33600DGq() {
        this.LIZJ.LJIIIIZZ(24.0f, 11.18f);
        this.LIZJ.LJIIIZ(15.16f, 15.16f, true, false, 0.0f, 25.95f);
        this.LIZJ.LJIIIZ(15.16f, 15.16f, true, false, 0.0f, -25.95f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.48f, 23.06f);
        this.LIZJ.LJIIIZ(15.1f, 15.1f, false, false, 3.84f, -10.08f);
        this.LIZJ.LJIIJ(0.0f, -3.87f, -1.45f, -7.4f, -3.84f, -10.08f);
        this.LIZJ.LJIIIZ(10.98f, 10.98f, true, true, 0.0f, 20.16f);
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
