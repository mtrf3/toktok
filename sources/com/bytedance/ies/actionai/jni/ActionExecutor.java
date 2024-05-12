package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionExecutor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionExecutor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        ActionAIJniJNI.ActionExecutor_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.ActionExecutor_change_ownership(this, this.swigCPtr, true);
    }

    public ActionModel getActionModel() {
        long ActionExecutor_getActionModel = ActionAIJniJNI.ActionExecutor_getActionModel(this.swigCPtr, this);
        if (ActionExecutor_getActionModel == 0) {
            return null;
        }
        return new ActionModel(ActionExecutor_getActionModel, true);
    }

    public ActionExecutor() {
        this(ActionAIJniJNI.new_ActionExecutor(), true);
        ActionAIJniJNI.ActionExecutor_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionExecutor actionExecutor) {
        if (actionExecutor == null) {
            return 0L;
        }
        return actionExecutor.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionExecutor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void execute(ExecutionContext executionContext, String str, ActionExecuteCallback actionExecuteCallback) {
        ActionAIJniJNI.ActionExecutor_execute(this.swigCPtr, this, ExecutionContext.getCPtr(executionContext), executionContext, str, ActionExecuteCallback.getCPtr(actionExecuteCallback), actionExecuteCallback);
    }
}
