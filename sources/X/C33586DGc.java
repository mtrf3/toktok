package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33586DGc extends AbstractC39455Fe7 {
    public C33586DGc() {
        this.LIZJ.LJIIIIZZ(7.26f, 8.24f);
        this.LIZJ.LJIIJ(3.06f, -0.26f, 8.88f, -1.53f, 15.35f, -7.0f);
        this.LIZJ.LJIIJ(0.8f, -0.68f, 1.98f, -0.68f, 2.78f, 0.0f);
        this.LIZJ.LJIIJ(6.47f, 5.47f, 12.3f, 6.74f, 15.35f, 7.0f);
        this.LIZJ.LJIIJ(1.2f, 0.1f, 2.26f, 1.08f, 2.26f, 2.28f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(23.2f);
        this.LIZJ.LJIIJ(0.0f, 14.16f, -14.76f, 21.85f, -18.26f, 23.47f);
        this.LIZJ.LJIIJ(-0.48f, 0.22f, -1.0f, 0.22f, -1.48f, 0.0f);
        this.LIZJ.LJ(19.76f, 45.05f, 5.0f, 37.37f, 5.0f, 23.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(10.53f);
        this.LIZJ.LJIIJ(0.0f, -1.2f, 1.06f, -2.19f, 2.26f, -2.29f);
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
