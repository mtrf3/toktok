package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIMonitor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIMonitor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionAIMonitor() {
        this(ActionAIJniJNI.new_ActionAIMonitor(), true);
    }

    public static ActionAIMonitor obtain() {
        long ActionAIMonitor_obtain = ActionAIJniJNI.ActionAIMonitor_obtain();
        if (ActionAIMonitor_obtain == 0) {
            return null;
        }
        return new ActionAIMonitor(ActionAIMonitor_obtain, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIMonitor actionAIMonitor) {
        if (actionAIMonitor == null) {
            return 0L;
        }
        return actionAIMonitor.swigCPtr;
    }

    public void setListener(IActionAIMonitorDelegate iActionAIMonitorDelegate) {
        ActionAIJniJNI.ActionAIMonitor_setListener(this.swigCPtr, this, IActionAIMonitorDelegate.getCPtr(iActionAIMonitorDelegate), iActionAIMonitorDelegate);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIMonitor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onEvent(String str, int i, String str2) {
        ActionAIJniJNI.ActionAIMonitor_onEvent(this.swigCPtr, this, str, i, str2);
    }

    public void onSuccessRateMonitor(String str, int i, String str2) {
        ActionAIJniJNI.ActionAIMonitor_onSuccessRateMonitor(this.swigCPtr, this, str, i, str2);
    }
}
