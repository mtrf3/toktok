package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* loaded from: classes16.dex */
public class WriteTagTaskResult extends BaseTaskResult {
    public ExceptionResult mException;
    public String mId;

    public ExceptionResult getException() {
        return this.mException;
    }

    public String getId() {
        return this.mId;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public WriteTagTaskResult(String str, ExceptionResult exceptionResult) {
        this.mId = str;
        this.mException = exceptionResult;
    }
}
