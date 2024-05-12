package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* loaded from: classes16.dex */
public class EffectCheckUpdateResult extends BaseTaskResult {
    public ExceptionResult exception;
    public boolean isUpdate;

    public ExceptionResult getException() {
        return this.exception;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public EffectCheckUpdateResult(boolean z, ExceptionResult exceptionResult) {
        this.isUpdate = z;
        this.exception = exceptionResult;
    }
}
