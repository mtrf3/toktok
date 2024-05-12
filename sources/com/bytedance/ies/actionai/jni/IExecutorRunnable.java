package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class IExecutorRunnable {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_IExecutorRunnable(j);
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
        ActionAIJniJNI.IExecutorRunnable_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.IExecutorRunnable_change_ownership(this, this.swigCPtr, true);
    }

    public void run() {
        ActionAIJniJNI.IExecutorRunnable_run(this.swigCPtr, this);
    }

    public IExecutorRunnable() {
        this(ActionAIJniJNI.new_IExecutorRunnable(), true);
        ActionAIJniJNI.IExecutorRunnable_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IExecutorRunnable iExecutorRunnable) {
        if (iExecutorRunnable == null) {
            return 0L;
        }
        return iExecutorRunnable.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IExecutorRunnable(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
