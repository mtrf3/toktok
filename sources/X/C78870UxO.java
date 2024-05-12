package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.UxO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78870UxO {
    public final InterfaceC88472Yns<Matrix, C76800UCe> LIZ;
    public final RectF LIZJ;
    public final float[] LJ;
    public float LJFF;
    public float LJI;
    public final Matrix LIZIZ = new Matrix();
    public final RectF LIZLLL = new RectF();

    public final void LIZ() {
        Matrix matrix = this.LIZIZ;
        matrix.setValues(this.LJ);
        matrix.mapRect(this.LIZLLL, this.LIZJ);
        matrix.postTranslate(this.LJFF - this.LIZLLL.centerX(), this.LJI - this.LIZLLL.centerY());
        this.LIZ.invoke(matrix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78870UxO(Rect rect, float[] fArr, InterfaceC88472Yns<? super Matrix, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZJ = new RectF(rect);
        this.LJ = (float[]) fArr.clone();
        LIZ();
    }
}
