package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes16.dex */
public class EffectChannelTaskResult extends BaseTaskResult {
    public EffectChannelResponse effectChannels;
    public ExceptionResult exception;

    public EffectChannelResponse getEffectChannels() {
        return this.effectChannels;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectChannels(EffectChannelResponse effectChannelResponse) {
        this.effectChannels = effectChannelResponse;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public EffectChannelTaskResult(EffectChannelResponse effectChannelResponse, ExceptionResult exceptionResult) {
        this.effectChannels = effectChannelResponse;
        this.exception = exceptionResult;
    }
}
