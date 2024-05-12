package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.HashMap;

/* loaded from: classes16.dex */
public interface IReadUpdateTagListener extends IEffectPlatformBaseListener<HashMap<String, String>> {
    void onFailed(ExceptionResult exceptionResult);
}
