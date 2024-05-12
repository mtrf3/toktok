package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;

/* loaded from: classes16.dex */
public interface IFetchHotEffectListener extends IEffectPlatformBaseListener<FetchHotEffectResponse> {
    void onFailed(ExceptionResult exceptionResult);
}
