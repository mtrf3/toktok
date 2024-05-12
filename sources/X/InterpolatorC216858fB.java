package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.8fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class InterpolatorC216858fB implements Interpolator {
    public int LIZ;
    public final PointF LIZIZ = new PointF();
    public final PointF LIZJ = new PointF();

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i = this.LIZ;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (i * 1.0f) / 4096;
            if (C216908fG.LIZ(f2, this.LIZIZ.x, this.LIZJ.x) >= f) {
                this.LIZ = i;
                break;
            }
            i++;
        }
        double LIZ = C216908fG.LIZ(f2, this.LIZIZ.y, this.LIZJ.y);
        if (LIZ > 0.999d) {
            this.LIZ = 0;
            LIZ = 1.0d;
        }
        return (float) LIZ;
    }
}
