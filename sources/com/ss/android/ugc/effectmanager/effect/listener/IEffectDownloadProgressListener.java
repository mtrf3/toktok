package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public interface IEffectDownloadProgressListener extends IFetchEffectListener {
    void onProgress(Effect effect, int i, long j);
}
