package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIExecutor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIExecutor(j);
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
        ActionAIJniJNI.ActionAIExecutor_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.ActionAIExecutor_change_ownership(this, this.swigCPtr, true);
    }

    public void release() {
        ActionAIJniJNI.ActionAIExecutor_release__SWIG_1(this.swigCPtr, this);
    }

    public void start() {
        ActionAIJniJNI.ActionAIExecutor_start(this.swigCPtr, this);
    }

    public ActionAIExecutor() {
        this(ActionAIJniJNI.new_ActionAIExecutor(), true);
        ActionAIJniJNI.ActionAIExecutor_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIExecutor actionAIExecutor) {
        if (actionAIExecutor == null) {
            return 0L;
        }
        return actionAIExecutor.swigCPtr;
    }

    public void release(boolean z) {
        ActionAIJniJNI.ActionAIExecutor_release__SWIG_0(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIExecutor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
