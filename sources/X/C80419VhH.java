package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.VhH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80419VhH {
    public final C80423VhL[] LIZ = new C80423VhL[4];
    public final Matrix[] LIZIZ = new Matrix[4];
    public final Matrix[] LIZJ = new Matrix[4];
    public final PointF LIZLLL = new PointF();
    public final Path LJ = new Path();
    public final Path LJFF = new Path();
    public final C80423VhL LJI = new C80423VhL();
    public final float[] LJII = new float[2];
    public final float[] LJIIIIZZ = new float[2];
    public final Path LJIIIZ = new Path();
    public final Path LJIIJ = new Path();
    public final boolean LJIIJJI = true;

    public C80419VhH() {
        int i = 0;
        do {
            this.LIZ[i] = new C80423VhL();
            this.LIZIZ[i] = new Matrix();
            this.LIZJ[i] = new Matrix();
            i++;
        } while (i < 4);
    }

    public final boolean LIZIZ(Path path, int i) {
        this.LJIIJ.reset();
        this.LIZ[i].LIZJ(this.LIZIZ[i], this.LJIIJ);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.LJIIJ.computeBounds(rectF, true);
        path.op(this.LJIIJ, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C80416VhE r18, float r19, android.graphics.RectF r20, X.C80433VhV r21, android.graphics.Path r22) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80419VhH.LIZ(X.VhE, float, android.graphics.RectF, X.VhV, android.graphics.Path):void");
    }
}
