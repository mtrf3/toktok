package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;

/* loaded from: classes16.dex */
public class HotEffectTaskResult extends BaseTaskResult {
    public ExceptionResult exception;
    public FetchHotEffectResponse response;

    public ExceptionResult getException() {
        return this.exception;
    }

    public FetchHotEffectResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(FetchHotEffectResponse fetchHotEffectResponse) {
        this.response = fetchHotEffectResponse;
    }

    public HotEffectTaskResult(FetchHotEffectResponse fetchHotEffectResponse, ExceptionResult exceptionResult) {
        this.response = fetchHotEffectResponse;
        this.exception = exceptionResult;
    }
}
