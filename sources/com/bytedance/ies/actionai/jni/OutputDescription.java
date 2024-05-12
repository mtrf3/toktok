package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class OutputDescription extends ActionParamDescription {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_OutputDescription(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public int getTo_where() {
        return ActionAIJniJNI.OutputDescription_to_where_get(this.swigCPtr, this);
    }

    public OutputDescription() {
        this(ActionAIJniJNI.new_OutputDescription(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public void finalize() {
        delete();
    }

    public static long getCPtr(OutputDescription outputDescription) {
        if (outputDescription == null) {
            return 0L;
        }
        return outputDescription.swigCPtr;
    }

    public void setTo_where(int i) {
        ActionAIJniJNI.OutputDescription_to_where_set(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionParamDescription
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public OutputDescription(long j, boolean z) {
        super(ActionAIJniJNI.OutputDescription_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
