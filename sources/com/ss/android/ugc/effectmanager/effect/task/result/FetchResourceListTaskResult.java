package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* loaded from: classes16.dex */
public class FetchResourceListTaskResult extends BaseTaskResult {
    public ExceptionResult mException;
    public ResourceListModel result;

    public ExceptionResult getException() {
        return this.mException;
    }

    public ResourceListModel getResult() {
        return this.result;
    }

    public FetchResourceListTaskResult(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public void setResult(ResourceListModel resourceListModel) {
        this.result = resourceListModel;
    }

    public FetchResourceListTaskResult(ResourceListModel resourceListModel) {
        this.result = resourceListModel;
    }
}
