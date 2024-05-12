package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;

/* loaded from: classes16.dex */
public interface IRewardEffectsListener extends IEffectPlatformBaseListener<QueryRewardEffectsResponse> {
    void onFailed(ExceptionResult exceptionResult);
}
