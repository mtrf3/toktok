package com.ss.android.ugc.effectmanager.common.task;

import X.C16880lQ;
import android.os.Handler;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseNetWorkTask<T, F extends BaseNetResponse> extends NewNormalTask<T> {
    public final IJsonConverter jsonConverter;
    public final EffectNetWorkerWrapper netWorkerWrapper;

    public abstract EffectRequest builRequest();

    public int getFailCode() {
        return 10002;
    }

    public abstract Class<F> getRealNetResponseClass();

    public int getRetryCount() {
        return 1;
    }

    public abstract void onFail(ExceptionResult exceptionResult);

    public abstract void onSuccess(F f);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.effectmanager.common.task.NewNormalTask
    public void execute() {
        BaseNetResponse execute;
        int retryCount = getRetryCount();
        while (true) {
            int i = retryCount - 1;
            if (retryCount != 0) {
                try {
                } catch (Exception e) {
                    if (i == 0 || (e instanceof StatusCodeException)) {
                        onFail(new ExceptionResult(e));
                        C16880lQ.LLLLIIL(e);
                    }
                }
                if (!isCanceled()) {
                    EffectRequest builRequest = builRequest();
                    EffectNetWorkerWrapper effectNetWorkerWrapper = this.netWorkerWrapper;
                    if (effectNetWorkerWrapper != null && (execute = effectNetWorkerWrapper.execute(builRequest, this.jsonConverter, getRealNetResponseClass())) != null && execute.checkValue()) {
                        onSuccess(execute);
                    } else if (i == 0) {
                        onFail(new ExceptionResult(getFailCode()));
                    } else {
                        continue;
                        retryCount = i;
                    }
                    return;
                }
                return;
            }
            return;
        }
        onFail(new ExceptionResult(e));
        C16880lQ.LLLLIIL(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNetWorkTask(EffectNetWorkerWrapper effectNetWorkerWrapper, IJsonConverter jsonConverter, Handler handler, String taskId) {
        super(handler, taskId);
        o.LJIIJ(jsonConverter, "jsonConverter");
        o.LJIIJ(taskId, "taskId");
        this.netWorkerWrapper = effectNetWorkerWrapper;
        this.jsonConverter = jsonConverter;
    }
}
