package X;

import android.view.MotionEvent;

/* loaded from: classes13.dex */
public final class SJ7 {
    public int LIZ;
    public int LIZIZ;
    public final int[] LIZJ = new int[2];
    public final float[] LIZLLL = new float[2];
    public final float[] LJ = new float[2];
    public final float[] LJFF = new float[2];
    public final float[] LJI = new float[2];
    public final float[] LJII = new float[2];
    public final float[] LJIIIIZZ = new float[2];
    public SJ5 LJIIIZ;

    public final void LIZ() {
        SJ5 sj5 = this.LJIIIZ;
        if (sj5 != null) {
            sj5.LIZ(this);
        }
        int i = 0;
        this.LIZ = 0;
        this.LIZIZ = 0;
        do {
            this.LIZJ[i] = -1;
            this.LIZLLL[i] = 0.0f;
            this.LJ[i] = 0.0f;
            this.LJFF[i] = 0.0f;
            this.LJI[i] = 0.0f;
            this.LJII[i] = 0.0f;
            this.LJIIIIZZ[i] = 0.0f;
            i++;
        } while (i < 2);
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        int i;
        motionEvent.getAction();
        this.LIZIZ = this.LIZ;
        int i2 = 0;
        this.LIZ = 0;
        do {
            int pointerCount = motionEvent.getPointerCount();
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if ((actionMasked != 1 && actionMasked != 6) || i2 < actionIndex) {
                i = i2;
            } else {
                i = i2 + 1;
            }
            if (i >= pointerCount || i == -1) {
                this.LIZJ[i2] = -1;
            } else {
                this.LIZJ[i2] = motionEvent.getPointerId(i);
                this.LJII[i2] = motionEvent.getX(i);
                float[] fArr = this.LIZLLL;
                float f = this.LJII[i2];
                fArr[i2] = f;
                this.LJFF[i2] = f;
                this.LJIIIIZZ[i2] = motionEvent.getY(i);
                float[] fArr2 = this.LJ;
                float f2 = this.LJIIIIZZ[i2];
                fArr2[i2] = f2;
                this.LJI[i2] = f2;
                this.LIZ++;
            }
            i2++;
        } while (i2 < 2);
    }
}
