package com.ss.android.ugc.aweme.benchmark;

import X.C58096Mr6;
import X.EE1;
import com.ss.android.ugc.aweme.bl.IBenchmarkInitService;

/* loaded from: classes7.dex */
public final class BenchmarkInitService implements IBenchmarkInitService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkInitService
    public EE1 getBenchmarkInitTask() {
        return new BenchmarkInitRequest();
    }

    public static IBenchmarkInitService createIBenchmarkInitServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBenchmarkInitService.class, z);
        if (LIZ != null) {
            return (IBenchmarkInitService) LIZ;
        }
        if (C58096Mr6.LLJJIJI == null) {
            synchronized (IBenchmarkInitService.class) {
                if (C58096Mr6.LLJJIJI == null) {
                    C58096Mr6.LLJJIJI = new BenchmarkInitService();
                }
            }
        }
        return C58096Mr6.LLJJIJI;
    }
}
