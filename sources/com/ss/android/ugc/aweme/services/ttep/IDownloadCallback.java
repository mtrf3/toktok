package com.ss.android.ugc.aweme.services.ttep;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes16.dex */
public interface IDownloadCallback {
    void onFail(int i, String str, Exception exc);

    void onSuccess(Effect effect);
}
