package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableInstantCpuRateSetting;
import java.io.File;

/* renamed from: X.0gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14100gw {
    public C14110gx LIZ;
    public final int LIZIZ;
    public double LIZJ = -1.0d;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public double LJI = -1.0d;
    public final boolean LJII;

    public C14100gw() {
        boolean z;
        File file = new File("/proc/stat");
        if (file.exists() && file.canRead()) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        this.LIZIZ = LiveMtEnableInstantCpuRateSetting.INSTANCE.getValue();
    }

    public final void LIZ(long j, double d, double d2, long j2, long j3) {
        long j4;
        if (this.LJFF > -1) {
            C14110gx c14110gx = this.LIZ;
            if (c14110gx == null) {
                this.LIZ = new C14110gx(j, d, d, d2, d2);
                j4 = 0;
            } else {
                if (c14110gx.LIZ == 0) {
                    j4 = 0;
                    c14110gx.LIZ = j;
                } else {
                    j4 = 0;
                }
                c14110gx.LIZIZ++;
                c14110gx.LIZLLL += d;
                if (c14110gx.LIZJ < d) {
                    c14110gx.LIZJ = d;
                }
                c14110gx.LJFF += d2;
                if (c14110gx.LJ < d2) {
                    c14110gx.LJ = d2;
                }
            }
            C14110gx c14110gx2 = this.LIZ;
            if (j - c14110gx2.LIZ > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                double d3 = c14110gx2.LIZLLL;
                double d4 = c14110gx2.LIZIZ;
                float f = (float) (d3 / d4);
                float f2 = (float) c14110gx2.LIZJ;
                float f3 = (float) (c14110gx2.LJFF / d4);
                float f4 = (float) c14110gx2.LJ;
                if (f > -1.0f && f2 > -1.0f && this.LJII && C0NB.LIZJ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("app_usage_rate=");
                    LIZ.append(f);
                    C0NB.LIZIZ("MonitorCpu", X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("app_max_usage_rate=");
                    LIZ2.append(f2);
                    C0NB.LIZIZ("MonitorCpu", X1D.LIZIZ(LIZ2));
                }
                if (C0NB.LIZJ()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("app_stat_speed=");
                    LIZ3.append(f3);
                    C0NB.LIZIZ("MonitorCpu", X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("app_max_stat_speed=");
                    LIZ4.append(f4);
                    C0NB.LIZIZ("MonitorCpu", X1D.LIZIZ(LIZ4));
                }
                C14110gx c14110gx3 = this.LIZ;
                c14110gx3.LIZ = j4;
                c14110gx3.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c14110gx3.LIZIZ = j4;
                c14110gx3.LIZLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c14110gx3.LJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c14110gx3.LJFF = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
        }
        this.LIZLLL = j3;
        this.LJ = j2;
        this.LIZJ = d;
        this.LJFF = j;
        this.LJI = d2;
    }
}
