package com.ss.android.ugc.aweme.benchmark;

import X.C10K;
import X.E4Q;

/* loaded from: classes2.dex */
public interface BenchmarkAPI {
    @E4Q("/aweme/v1/device/benchmark/")
    C10K<String> getBenchmarks();
}
