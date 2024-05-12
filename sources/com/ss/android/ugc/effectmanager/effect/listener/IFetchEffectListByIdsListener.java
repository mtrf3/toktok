package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* loaded from: classes8.dex */
public interface IFetchEffectListByIdsListener extends IEffectPlatformBaseListener<EffectListResponse> {
    void onFail(ExceptionResult exceptionResult);
}
