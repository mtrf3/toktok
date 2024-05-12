package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAILoggerListener extends ActionAILoggerFunc {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.ActionAILoggerFunc
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_ActionAILoggerListener(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        ActionAIJniJNI.ActionAILoggerListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.ActionAILoggerListener_change_ownership(this, this.swigCPtr, true);
    }

    public ActionAILoggerListener() {
        this(ActionAIJniJNI.new_ActionAILoggerListener(), true);
        ActionAIJniJNI.ActionAILoggerListener_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAILoggerFunc
    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAILoggerListener actionAILoggerListener) {
        if (actionAILoggerListener == null) {
            return 0L;
        }
        return actionAILoggerListener.swigCPtr;
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAILoggerFunc
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public ActionAILoggerListener(long j, boolean z) {
        super(ActionAIJniJNI.ActionAILoggerListener_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void onLog(LogLevel logLevel, String str) {
        ActionAIJniJNI.ActionAILoggerListener_onLog__SWIG_1(this.swigCPtr, this, logLevel.swigValue(), str);
    }

    public void onLog(LogLevel logLevel, String str, SWIGTYPE_p_va_list sWIGTYPE_p_va_list) {
        if (getClass() == ActionAILoggerListener.class) {
            ActionAIJniJNI.ActionAILoggerListener_onLog__SWIG_0(this.swigCPtr, this, logLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        } else {
            ActionAIJniJNI.ActionAILoggerListener_onLogSwigExplicitActionAILoggerListener__SWIG_0(this.swigCPtr, this, logLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        }
    }
}
