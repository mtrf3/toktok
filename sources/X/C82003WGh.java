package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.WGh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82003WGh {
    public final C82000WGe LIZIZ;
    public final RectF LIZJ;
    public final float[] LJ;
    public float LJFF;
    public float LJI;
    public final Matrix LIZ = new Matrix();
    public final RectF LIZLLL = new RectF();

    public final void LIZ() {
        this.LIZ.setValues(this.LJ);
        this.LIZ.mapRect(this.LIZLLL, this.LIZJ);
        this.LIZ.postTranslate(this.LJFF - this.LIZLLL.centerX(), this.LJI - this.LIZLLL.centerY());
        this.LIZIZ.setImageMatrix(new Matrix(this.LIZ));
    }

    public C82003WGh(C82000WGe c82000WGe, float[] fArr) {
        this.LIZIZ = c82000WGe;
        this.LIZJ = new RectF(c82000WGe.getBaseOriginDisplayRect());
        this.LJ = (float[]) fArr.clone();
        LIZ();
    }
}
