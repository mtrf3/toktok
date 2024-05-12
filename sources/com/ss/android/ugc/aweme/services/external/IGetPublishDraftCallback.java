package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* loaded from: classes8.dex */
public interface IGetPublishDraftCallback {
    void onFail();

    void onSuccess(AwemeDraft awemeDraft);
}
