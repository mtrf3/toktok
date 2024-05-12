package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;

/* loaded from: classes15.dex */
public interface IModFavoriteList extends IEffectPlatformBaseListener<List<String>> {
    void onFail(ExceptionResult exceptionResult);
}
