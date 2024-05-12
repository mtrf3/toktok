package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class MessageRequest extends BaseMessage {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_MessageRequest(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getInput() {
        return ActionAIJniJNI.MessageRequest_input_get(this.swigCPtr, this);
    }

    public boolean getIs_canceled() {
        return ActionAIJniJNI.MessageRequest_is_canceled_get(this.swigCPtr, this);
    }

    public MessageRequest() {
        this(ActionAIJniJNI.new_MessageRequest(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public void finalize() {
        delete();
    }

    public static long getCPtr(MessageRequest messageRequest) {
        if (messageRequest == null) {
            return 0L;
        }
        return messageRequest.swigCPtr;
    }

    public void setInput(String str) {
        ActionAIJniJNI.MessageRequest_input_set(this.swigCPtr, this, str);
    }

    public void setIs_canceled(boolean z) {
        ActionAIJniJNI.MessageRequest_is_canceled_set(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.actionai.jni.BaseMessage
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public MessageRequest(long j, boolean z) {
        super(ActionAIJniJNI.MessageRequest_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
