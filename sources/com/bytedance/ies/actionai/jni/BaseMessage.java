package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class BaseMessage {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_BaseMessage(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getEndTimeMills() {
        return ActionAIJniJNI.BaseMessage_endTimeMills_get(this.swigCPtr, this);
    }

    public String getMessageId() {
        return ActionAIJniJNI.BaseMessage_messageId_get(this.swigCPtr, this);
    }

    public long getStartTimeMills() {
        return ActionAIJniJNI.BaseMessage_startTimeMills_get(this.swigCPtr, this);
    }

    public BaseMessage() {
        this(ActionAIJniJNI.new_BaseMessage(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(BaseMessage baseMessage) {
        if (baseMessage == null) {
            return 0L;
        }
        return baseMessage.swigCPtr;
    }

    public void setEndTimeMills(long j) {
        ActionAIJniJNI.BaseMessage_endTimeMills_set(this.swigCPtr, this, j);
    }

    public void setMessageId(String str) {
        ActionAIJniJNI.BaseMessage_messageId_set(this.swigCPtr, this, str);
    }

    public void setStartTimeMills(long j) {
        ActionAIJniJNI.BaseMessage_startTimeMills_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public BaseMessage(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
