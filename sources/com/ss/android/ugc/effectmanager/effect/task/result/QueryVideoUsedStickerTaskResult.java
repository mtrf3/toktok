package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* loaded from: classes16.dex */
public class QueryVideoUsedStickerTaskResult extends BaseTaskResult {
    public ExceptionResult exception;
    public EffectListResponse response;

    public ExceptionResult getException() {
        return this.exception;
    }

    public EffectListResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(EffectListResponse effectListResponse) {
        this.response = effectListResponse;
    }

    public QueryVideoUsedStickerTaskResult(EffectListResponse effectListResponse, ExceptionResult exceptionResult) {
        this.response = effectListResponse;
        this.exception = exceptionResult;
    }
}
