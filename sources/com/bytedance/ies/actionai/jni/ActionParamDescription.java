package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionParamDescription {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionParamDescription(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getContext_key() {
        return ActionAIJniJNI.ActionParamDescription_context_key_get(this.swigCPtr, this);
    }

    public boolean getContext_visible() {
        return ActionAIJniJNI.ActionParamDescription_context_visible_get(this.swigCPtr, this);
    }

    public String getDefault_value() {
        return ActionAIJniJNI.ActionParamDescription_default_value_get(this.swigCPtr, this);
    }

    public String getDescription() {
        return ActionAIJniJNI.ActionParamDescription_description_get(this.swigCPtr, this);
    }

    public int getOptional() {
        return ActionAIJniJNI.ActionParamDescription_optional_get(this.swigCPtr, this);
    }

    public ValueType getType() {
        return ValueType.swigToEnum(ActionAIJniJNI.ActionParamDescription_type_get(this.swigCPtr, this));
    }

    public String getVar_name() {
        return ActionAIJniJNI.ActionParamDescription_var_name_get(this.swigCPtr, this);
    }

    public ActionParamDescription() {
        this(ActionAIJniJNI.new_ActionParamDescription(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionParamDescription actionParamDescription) {
        if (actionParamDescription == null) {
            return 0L;
        }
        return actionParamDescription.swigCPtr;
    }

    public void setContext_key(String str) {
        ActionAIJniJNI.ActionParamDescription_context_key_set(this.swigCPtr, this, str);
    }

    public void setContext_visible(boolean z) {
        ActionAIJniJNI.ActionParamDescription_context_visible_set(this.swigCPtr, this, z);
    }

    public void setDefault_value(String str) {
        ActionAIJniJNI.ActionParamDescription_default_value_set(this.swigCPtr, this, str);
    }

    public void setDescription(String str) {
        ActionAIJniJNI.ActionParamDescription_description_set(this.swigCPtr, this, str);
    }

    public void setOptional(int i) {
        ActionAIJniJNI.ActionParamDescription_optional_set(this.swigCPtr, this, i);
    }

    public void setType(ValueType valueType) {
        ActionAIJniJNI.ActionParamDescription_type_set(this.swigCPtr, this, valueType.swigValue());
    }

    public void setVar_name(String str) {
        ActionAIJniJNI.ActionParamDescription_var_name_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionParamDescription(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
