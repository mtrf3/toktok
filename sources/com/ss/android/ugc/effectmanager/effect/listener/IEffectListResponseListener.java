package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* loaded from: classes16.dex */
public interface IEffectListResponseListener extends IEffectPlatformBaseListener<EffectListResponse> {
    void onFail(ExceptionResult exceptionResult);
}
