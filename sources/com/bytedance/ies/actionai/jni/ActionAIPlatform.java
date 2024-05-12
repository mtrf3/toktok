package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIPlatform {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIPlatform(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void cancel() {
        ActionAIJniJNI.ActionAIPlatform_cancel(this.swigCPtr, this);
    }

    public ActionAIEventObserver getObserver() {
        long ActionAIPlatform_getObserver = ActionAIJniJNI.ActionAIPlatform_getObserver(this.swigCPtr, this);
        if (ActionAIPlatform_getObserver == 0) {
            return null;
        }
        return new ActionAIEventObserver(ActionAIPlatform_getObserver, true);
    }

    public ActionAIPlatform() {
        this(ActionAIJniJNI.new_ActionAIPlatform(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIPlatform actionAIPlatform) {
        if (actionAIPlatform == null) {
            return 0L;
        }
        return actionAIPlatform.swigCPtr;
    }

    public boolean registerAction(ActionExecutor actionExecutor) {
        return ActionAIJniJNI.ActionAIPlatform_registerAction(this.swigCPtr, this, ActionExecutor.getCPtr(actionExecutor), actionExecutor);
    }

    public void releaseSession(String str) {
        ActionAIJniJNI.ActionAIPlatform_releaseSession(this.swigCPtr, this, str);
    }

    public void setObserver(ActionAIEventObserver actionAIEventObserver) {
        ActionAIJniJNI.ActionAIPlatform_setObserver(this.swigCPtr, this, ActionAIEventObserver.getCPtr(actionAIEventObserver), actionAIEventObserver);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIPlatform(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void initSession(SessionConfig sessionConfig, SessionInitCallback sessionInitCallback) {
        ActionAIJniJNI.ActionAIPlatform_initSession(this.swigCPtr, this, SessionConfig.getCPtr(sessionConfig), sessionConfig, SessionInitCallback.getCPtr(sessionInitCallback), sessionInitCallback);
    }

    public void sendMessage(MessageRequest messageRequest, MessageCallback messageCallback) {
        ActionAIJniJNI.ActionAIPlatform_sendMessage(this.swigCPtr, this, MessageRequest.getCPtr(messageRequest), messageRequest, MessageCallback.getCPtr(messageCallback), messageCallback);
    }
}
