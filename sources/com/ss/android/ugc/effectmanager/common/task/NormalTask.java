package com.ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class NormalTask implements ITask {
    public final Handler handler;
    public boolean isCanceled;
    public String taskId;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void cancel() {
        this.isCanceled = true;
    }

    public final String getTaskId() {
        String str = this.taskId;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    public NormalTask(Handler handler, String str) {
        this.handler = handler;
        this.taskId = str;
    }

    public final void sendMessage(int i, BaseTaskResult result) {
        Message obtainMessage;
        o.LJIIJ(result, "result");
        result.setTaskID(this.taskId);
        Handler handler = this.handler;
        if (handler != null && (obtainMessage = handler.obtainMessage(i)) != null) {
            obtainMessage.obj = result;
            obtainMessage.sendToTarget();
        }
    }
}
