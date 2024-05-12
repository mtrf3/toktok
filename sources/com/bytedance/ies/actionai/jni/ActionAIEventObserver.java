package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIEventObserver {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIEventObserver(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void onActionReadyStart() {
        ActionAIJniJNI.ActionAIEventObserver_onActionReadyStart(this.swigCPtr, this);
    }

    public void onActionRegisterFail() {
        ActionAIJniJNI.ActionAIEventObserver_onActionRegisterFail(this.swigCPtr, this);
    }

    public void onActionRegisterSuccess() {
        ActionAIJniJNI.ActionAIEventObserver_onActionRegisterSuccess(this.swigCPtr, this);
    }

    public void onCancelFail() {
        ActionAIJniJNI.ActionAIEventObserver_onCancelFail(this.swigCPtr, this);
    }

    public void onCancelSuccess() {
        ActionAIJniJNI.ActionAIEventObserver_onCancelSuccess(this.swigCPtr, this);
    }

    public void onSessionReleaseFail() {
        ActionAIJniJNI.ActionAIEventObserver_onSessionReleaseFail(this.swigCPtr, this);
    }

    public void onSessionReleaseSuccess() {
        ActionAIJniJNI.ActionAIEventObserver_onSessionReleaseSuccess(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIEventObserver actionAIEventObserver) {
        if (actionAIEventObserver == null) {
            return 0L;
        }
        return actionAIEventObserver.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIEventObserver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onActionFinished(MessageRequest messageRequest, MessageResponse messageResponse) {
        ActionAIJniJNI.ActionAIEventObserver_onActionFinished(this.swigCPtr, this, MessageRequest.getCPtr(messageRequest), messageRequest, MessageResponse.getCPtr(messageResponse), messageResponse);
    }
}
