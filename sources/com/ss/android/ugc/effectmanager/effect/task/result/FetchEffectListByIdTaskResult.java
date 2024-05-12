package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* loaded from: classes16.dex */
public class FetchEffectListByIdTaskResult extends BaseTaskResult {
    public ExceptionResult exception;
    public EffectListResponse response;

    public EffectListResponse getEffectResponse() {
        return this.response;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectResponse(EffectListResponse effectListResponse) {
        this.response = effectListResponse;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public FetchEffectListByIdTaskResult(EffectListResponse effectListResponse, ExceptionResult exceptionResult) {
        this.response = effectListResponse;
        this.exception = exceptionResult;
    }
}
