package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes15.dex */
public interface IFetchEffectChannelListener extends IEffectPlatformBaseListener<EffectChannelResponse> {
    void onFail(ExceptionResult exceptionResult);
}
