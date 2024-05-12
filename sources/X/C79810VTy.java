package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.VTy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79810VTy {
    public long LIZ;
    public final long[] LIZIZ = new long[100];
    public int LIZJ;
    public int LIZLLL;
    public double LJ;

    public final float LIZ() {
        double d = this.LJ;
        if (this.LIZJ > 0) {
            long[] jArr = this.LIZIZ;
            o.LJIIIZ(jArr, "<this>");
            long j = 0;
            for (long j2 : jArr) {
                j += j2;
            }
            d = ((this.LJ * (r2 - this.LIZJ)) + j) / this.LIZLLL;
        }
        this.LIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        float f = (float) d;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1000000000 / f;
    }
}
