package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class InputDescription extends ActionParamDescription {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_InputDescription(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public int getFrom_where() {
        return ActionAIJniJNI.InputDescription_from_where_get(this.swigCPtr, this);
    }

    public boolean getUse_end_message() {
        return ActionAIJniJNI.InputDescription_use_end_message_get(this.swigCPtr, this);
    }

    public InputDescription() {
        this(ActionAIJniJNI.new_InputDescription(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public void finalize() {
        delete();
    }

    public static long getCPtr(InputDescription inputDescription) {
        if (inputDescription == null) {
            return 0L;
        }
        return inputDescription.swigCPtr;
    }

    public void setFrom_where(int i) {
        ActionAIJniJNI.InputDescription_from_where_set(this.swigCPtr, this, i);
    }

    public void setUse_end_message(boolean z) {
        ActionAIJniJNI.InputDescription_use_end_message_set(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public InputDescription(long j, boolean z) {
        super(ActionAIJniJNI.InputDescription_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
