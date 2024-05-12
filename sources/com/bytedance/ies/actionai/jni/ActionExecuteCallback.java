package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionExecuteCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionExecuteCallback(j);
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
        ActionAIJniJNI.ActionExecuteCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.ActionExecuteCallback_change_ownership(this, this.swigCPtr, true);
    }

    public ActionExecuteCallback() {
        this(ActionAIJniJNI.new_ActionExecuteCallback(), true);
        ActionAIJniJNI.ActionExecuteCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionExecuteCallback actionExecuteCallback) {
        if (actionExecuteCallback == null) {
            return 0L;
        }
        return actionExecuteCallback.swigCPtr;
    }

    public void onExecuteStep(ExecutionRecord executionRecord) {
        ActionAIJniJNI.ActionExecuteCallback_onExecuteStep(this.swigCPtr, this, ExecutionRecord.getCPtr(executionRecord), executionRecord);
    }

    public void onExecuteSuccess(ActionResult actionResult) {
        ActionAIJniJNI.ActionExecuteCallback_onExecuteSuccess(this.swigCPtr, this, ActionResult.getCPtr(actionResult), actionResult);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionExecuteCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onExecuteError(ActionAIErrorCode actionAIErrorCode, String str, ServerErrorInfo serverErrorInfo) {
        ActionAIJniJNI.ActionExecuteCallback_onExecuteError(this.swigCPtr, this, actionAIErrorCode.swigValue(), str, ServerErrorInfo.getCPtr(serverErrorInfo), serverErrorInfo);
    }
}
