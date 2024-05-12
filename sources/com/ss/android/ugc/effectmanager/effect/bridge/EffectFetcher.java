package com.ss.android.ugc.effectmanager.effect.bridge;

import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;

/* loaded from: classes16.dex */
public interface EffectFetcher {
    SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments);
}
