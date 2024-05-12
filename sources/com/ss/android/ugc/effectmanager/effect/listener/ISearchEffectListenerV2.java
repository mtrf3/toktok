package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;

/* loaded from: classes13.dex */
public interface ISearchEffectListenerV2 extends IEffectPlatformBaseListener<SearchEffectResponseV2> {
    void onFail(ExceptionResult exceptionResult);
}
