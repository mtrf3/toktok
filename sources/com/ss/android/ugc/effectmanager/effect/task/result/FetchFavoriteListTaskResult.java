package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

/* loaded from: classes16.dex */
public class FetchFavoriteListTaskResult extends BaseTaskResult {
    public ExceptionResult mException;
    public FetchFavoriteListResponse result;

    public ExceptionResult getException() {
        return this.mException;
    }

    public FetchFavoriteListResponse getResult() {
        return this.result;
    }

    public FetchFavoriteListTaskResult(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public void setResult(FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.result = fetchFavoriteListResponse;
    }

    public FetchFavoriteListTaskResult(FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.result = fetchFavoriteListResponse;
    }
}
