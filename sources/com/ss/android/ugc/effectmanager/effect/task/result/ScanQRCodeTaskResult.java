package com.ss.android.ugc.effectmanager.effect.task.result;

import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes16.dex */
public class ScanQRCodeTaskResult extends BaseTaskResult {
    public final Effect effect;
    public final ExceptionResult exception;

    public ScanQRCodeTaskResult(Effect effect, ExceptionResult exceptionResult) {
        this.effect = effect;
        this.exception = exceptionResult;
    }
}
