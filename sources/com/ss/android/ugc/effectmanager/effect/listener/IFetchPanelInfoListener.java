package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* loaded from: classes15.dex */
public interface IFetchPanelInfoListener extends IEffectPlatformBaseListener<PanelInfoModel> {
    void onFail(ExceptionResult exceptionResult);
}
