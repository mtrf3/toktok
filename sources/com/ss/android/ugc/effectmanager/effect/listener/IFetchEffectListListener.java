package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes13.dex */
public interface IFetchEffectListListener extends IEffectPlatformBaseListener<List<Effect>> {
    void onFail(ExceptionResult exceptionResult);
}
