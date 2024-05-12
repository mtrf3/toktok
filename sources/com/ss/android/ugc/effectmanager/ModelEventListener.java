package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

/* loaded from: classes16.dex */
public interface ModelEventListener {
    void onFetchModelList(boolean z, String str, long j, String str2);

    void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc);

    void onModelDownloadStart(Effect effect, ModelInfo modelInfo);

    void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j);

    void onModelNotFound(Effect effect, Exception exc);
}
