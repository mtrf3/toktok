package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class IActionAIMonitorDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_IActionAIMonitorDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        ActionAIJniJNI.IActionAIMonitorDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.IActionAIMonitorDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public IActionAIMonitorDelegate() {
        this(ActionAIJniJNI.new_IActionAIMonitorDelegate(), true);
        ActionAIJniJNI.IActionAIMonitorDelegate_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IActionAIMonitorDelegate iActionAIMonitorDelegate) {
        if (iActionAIMonitorDelegate == null) {
            return 0L;
        }
        return iActionAIMonitorDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IActionAIMonitorDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onEvent(String str, int i, String str2) {
        ActionAIJniJNI.IActionAIMonitorDelegate_onEvent(this.swigCPtr, this, str, i, str2);
    }

    public void onSuccessRateMonitor(String str, int i, String str2) {
        ActionAIJniJNI.IActionAIMonitorDelegate_onSuccessRateMonitor(this.swigCPtr, this, str, i, str2);
    }
}
