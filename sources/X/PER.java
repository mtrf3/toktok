package X;

import android.os.Build;
import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* loaded from: classes12.dex */
public final class PER {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final long LIZ() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1L;
        }
        long parseLong = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j = parseLong - this.LIZJ;
        this.LIZJ = parseLong;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("blockingGcCount:");
            LIZ.append(this.LIZJ);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        return j;
    }

    public final long LIZIZ() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1L;
        }
        long parseLong = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j = parseLong - this.LIZLLL;
        this.LIZLLL = parseLong;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("blockingGcTime:");
            LIZ.append(this.LIZLLL);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        return j;
    }

    public final long LIZJ() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1L;
        }
        long parseLong = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j = parseLong - this.LIZ;
        this.LIZ = parseLong;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("gcCount:");
            LIZ.append(parseLong);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        return j;
    }

    public final long LIZLLL() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1L;
        }
        long parseLong = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j = parseLong - this.LIZIZ;
        this.LIZIZ = parseLong;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("gcTime:");
            LIZ.append(this.LIZIZ);
            C64028PAy.LIZ("APM-Memory", X1D.LIZIZ(LIZ));
        }
        return j;
    }
}
