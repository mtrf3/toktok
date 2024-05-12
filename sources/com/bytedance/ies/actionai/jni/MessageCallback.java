package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class MessageCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_MessageCallback(j);
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
        ActionAIJniJNI.MessageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.MessageCallback_change_ownership(this, this.swigCPtr, true);
    }

    public MessageCallback() {
        this(ActionAIJniJNI.new_MessageCallback(), true);
        ActionAIJniJNI.MessageCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MessageCallback messageCallback) {
        if (messageCallback == null) {
            return 0L;
        }
        return messageCallback.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MessageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onNotify(MessageCode messageCode, MessageResponse messageResponse) {
        ActionAIJniJNI.MessageCallback_onNotify(this.swigCPtr, this, messageCode.swigValue(), MessageResponse.getCPtr(messageResponse), messageResponse);
    }
}
