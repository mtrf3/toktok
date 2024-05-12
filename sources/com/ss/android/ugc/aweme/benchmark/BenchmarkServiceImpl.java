package com.ss.android.ugc.aweme.benchmark;

import X.C04390Ff;
import X.C05060Hu;
import X.C05090Hx;
import X.C141335gf;
import X.C1EO;
import X.C3C5;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;

/* loaded from: classes8.dex */
public final class BenchmarkServiceImpl implements IBenchmarkService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public void stopBenchmark() {
        C1EO c1eo;
        C04390Ff c04390Ff = C04390Ff.LIZIZ;
        synchronized (c04390Ff) {
            c1eo = c04390Ff.LIZ;
        }
        if (c1eo != null) {
            c1eo.stop();
        }
    }

    public static IBenchmarkService createIBenchmarkServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBenchmarkService.class, z);
        if (LIZ != null) {
            return (IBenchmarkService) LIZ;
        }
        if (C58096Mr6.LLJJIJIIJIL == null) {
            synchronized (IBenchmarkService.class) {
                if (C58096Mr6.LLJJIJIIJIL == null) {
                    C58096Mr6.LLJJIJIIJIL = new BenchmarkServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public void startBenchmark(int i) {
        C1EO c1eo;
        C04390Ff c04390Ff = C04390Ff.LIZIZ;
        synchronized (c04390Ff) {
            c1eo = c04390Ff.LIZ;
        }
        if (c1eo != null) {
            c1eo.start(i);
        }
    }

    public float getBenchmarkOverallScore(int i, float f) {
        Object LIZ;
        try {
            LIZ = Float.valueOf(C05090Hx.LIZJ.LIZJ(i, C05060Hu.LIZJ.LIZ, f));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Float f2 = (Float) LIZ;
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }
}
