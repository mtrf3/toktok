package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33593DGj extends AbstractC39455Fe7 {
    public C33593DGj() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(40.0f, 0.0f);
        this.LIZJ.LJIIJ(-8.62f, 0.0f, -11.66f, 12.0f, -16.0f, 12.0f);
        this.LIZJ.LJIILLIIL(16.62f, 0.0f, 8.0f, 0.0f, true);
        C40084FoG.LJ(this.LIZJ, "p", 32.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 12.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
