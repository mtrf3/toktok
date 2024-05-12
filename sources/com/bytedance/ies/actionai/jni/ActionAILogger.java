package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAILogger {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAILogger(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionAILogger() {
        this(ActionAIJniJNI.new_ActionAILogger(), true);
    }

    public static ActionAILogger obtain() {
        long ActionAILogger_obtain = ActionAIJniJNI.ActionAILogger_obtain();
        if (ActionAILogger_obtain == 0) {
            return null;
        }
        return new ActionAILogger(ActionAILogger_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAILogger actionAILogger) {
        if (actionAILogger == null) {
            return 0L;
        }
        return actionAILogger.swigCPtr;
    }

    public static long swigRelease(ActionAILogger actionAILogger) {
        if (actionAILogger != null) {
            if (actionAILogger.swigCMemOwn) {
                long j = actionAILogger.swigCPtr;
                actionAILogger.swigCMemOwn = false;
                actionAILogger.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void d(String str) {
        ActionAIJniJNI.ActionAILogger_d(this.swigCPtr, this, str);
    }

    public void e(String str) {
        ActionAIJniJNI.ActionAILogger_e(this.swigCPtr, this, str);
    }

    public void i(String str) {
        ActionAIJniJNI.ActionAILogger_i(this.swigCPtr, this, str);
    }

    public void setDelegate(ActionAILoggerFunc actionAILoggerFunc) {
        ActionAIJniJNI.ActionAILogger_setDelegate(this.swigCPtr, this, ActionAILoggerFunc.getCPtr(actionAILoggerFunc), actionAILoggerFunc);
    }

    public void setLogLevel(LogLevel logLevel) {
        ActionAIJniJNI.ActionAILogger_setLogLevel(this.swigCPtr, this, logLevel.swigValue());
    }

    public void v(String str) {
        ActionAIJniJNI.ActionAILogger_v(this.swigCPtr, this, str);
    }

    public void w(String str) {
        ActionAIJniJNI.ActionAILogger_w(this.swigCPtr, this, str);
    }

    public void wtf(String str) {
        ActionAIJniJNI.ActionAILogger_wtf(this.swigCPtr, this, str);
    }

    public ActionAILogger(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
