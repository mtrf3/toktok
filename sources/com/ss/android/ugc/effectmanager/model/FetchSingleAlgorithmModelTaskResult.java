package com.ss.android.ugc.effectmanager.model;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;

/* loaded from: classes16.dex */
public final class FetchSingleAlgorithmModelTaskResult extends BaseTaskResult {
    public final ExceptionResult exceptionResult;
    public final SingleAlgorithmModelResponse response;

    public final ExceptionResult getExceptionResult() {
        return this.exceptionResult;
    }

    public final SingleAlgorithmModelResponse getResponse() {
        return this.response;
    }

    public FetchSingleAlgorithmModelTaskResult(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ExceptionResult exceptionResult) {
        this.response = singleAlgorithmModelResponse;
        this.exceptionResult = exceptionResult;
    }
}
