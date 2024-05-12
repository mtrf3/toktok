package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAILoggerFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAILoggerFunc(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAILoggerFunc actionAILoggerFunc) {
        if (actionAILoggerFunc == null) {
            return 0L;
        }
        return actionAILoggerFunc.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAILoggerFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
