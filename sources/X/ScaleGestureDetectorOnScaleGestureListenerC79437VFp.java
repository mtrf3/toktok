package X;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* renamed from: X.VFp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC79437VFp implements ScaleGestureDetector.OnScaleGestureListener {
    public float LJLIL = 4.0f;
    public float LJLILLLLZI = 0.2f;
    public Matrix LJLJI = new Matrix();
    public final float[] LJLJJI = new float[9];
    public final int LJLJJL;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC79437VFp(int i) {
        this.LJLJJL = -1;
        this.LJLJJL = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r5 > 1.0f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r4 > r1) goto L14;
     */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            float r5 = r7.getScaleFactor()
            android.graphics.Matrix r1 = r6.LJLJI
            float[] r0 = r6.LJLJJI
            r1.getValues(r0)
            float[] r1 = r6.LJLJJI
            r0 = 0
            r4 = r1[r0]
            float r3 = r6.LJLIL
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L2e
        L1c:
            float r1 = r6.LJLILLLLZI
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L26
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L2e
        L26:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3b
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
        L2e:
            android.graphics.Matrix r2 = r6.LJLJI
            float r1 = r7.getFocusX()
            float r0 = r7.getFocusY()
            r2.postScale(r5, r5, r1, r0)
        L3b:
            int r3 = r6.LJLJJL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "scaleFactor:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ",curScale:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r1 = 2
            java.lang.String r0 = "TR_TouchScaler"
            X.C48284IxE.LIZ(r1, r3, r0, r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC79437VFp.onScale(android.view.ScaleGestureDetector):boolean");
    }
}
