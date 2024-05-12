package com.ss.android.ugc.aweme.benchmark;

import X.C58096Mr6;
import X.EE1;
import com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService;

/* loaded from: classes2.dex */
public final class BenchmarkCollectionInitService implements IBenchmarkCollectionInitService {
    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService
    public EE1 getBenchmarkCollectionInitTask() {
        return new BenchmarkCollectionInitRequest();
    }

    public static IBenchmarkCollectionInitService createIBenchmarkCollectionInitServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBenchmarkCollectionInitService.class, z);
        if (LIZ != null) {
            return (IBenchmarkCollectionInitService) LIZ;
        }
        if (C58096Mr6.LLJJIII == null) {
            synchronized (IBenchmarkCollectionInitService.class) {
                if (C58096Mr6.LLJJIII == null) {
                    C58096Mr6.LLJJIII = new BenchmarkCollectionInitService();
                }
            }
        }
        return C58096Mr6.LLJJIII;
    }
}
