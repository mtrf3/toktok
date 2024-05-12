package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes16.dex */
public class EffectTaskResult extends BaseTaskResult {
    public Effect effect;
    public ExceptionResult exception;
    public int progress;
    public long totalSize;

    public Effect getEffect() {
        return this.effect;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public int getProgress() {
        return this.progress;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public EffectTaskResult setProgress(int i) {
        this.progress = i;
        return this;
    }

    public EffectTaskResult setTotalSize(long j) {
        this.totalSize = j;
        return this;
    }

    public EffectTaskResult(Effect effect, ExceptionResult exceptionResult) {
        this.effect = effect;
        this.exception = exceptionResult;
    }
}
