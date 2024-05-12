package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Error {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_Error(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static Error makeSuccess() {
        return new Error(EffectCreatorJniJNI.Error_makeSuccess(), true);
    }

    public String getMessage() {
        return EffectCreatorJniJNI.Error_message_get(this.swigCPtr, this);
    }

    public ErrorType getType() {
        return ErrorType.swigToEnum(EffectCreatorJniJNI.Error_type_get(this.swigCPtr, this));
    }

    public boolean isSuccess() {
        return EffectCreatorJniJNI.Error_isSuccess(this.swigCPtr, this);
    }

    public void log() {
        EffectCreatorJniJNI.Error_log(this.swigCPtr, this);
    }

    public Error() {
        this(EffectCreatorJniJNI.new_Error(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(Error error) {
        if (error == null) {
            return 0L;
        }
        return error.swigCPtr;
    }

    public static Error make(ErrorType errorType) {
        return new Error(EffectCreatorJniJNI.Error_make__SWIG_2(errorType.swigValue()), true);
    }

    public void setMessage(String str) {
        EffectCreatorJniJNI.Error_message_set(this.swigCPtr, this, str);
    }

    public void setType(ErrorType errorType) {
        EffectCreatorJniJNI.Error_type_set(this.swigCPtr, this, errorType.swigValue());
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public Error(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static Error make(ErrorType errorType, String str) {
        return new Error(EffectCreatorJniJNI.Error_make__SWIG_1(errorType.swigValue(), str), true);
    }

    public static Error make(ErrorType errorType, String str, boolean z) {
        return new Error(EffectCreatorJniJNI.Error_make__SWIG_0(errorType.swigValue(), str, z), true);
    }
}
