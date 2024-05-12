package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class IActionAIExecutorCreator {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_IActionAIExecutorCreator(j);
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
        ActionAIJniJNI.IActionAIExecutorCreator_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.IActionAIExecutorCreator_change_ownership(this, this.swigCPtr, true);
    }

    public IActionAIExecutorCreator() {
        this(ActionAIJniJNI.new_IActionAIExecutorCreator(), true);
        ActionAIJniJNI.IActionAIExecutorCreator_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IActionAIExecutorCreator iActionAIExecutorCreator) {
        if (iActionAIExecutorCreator == null) {
            return 0L;
        }
        return iActionAIExecutorCreator.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IActionAIExecutorCreator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ActionAIExecutor createExecutor(String str, ActionAIExecutorType actionAIExecutorType) {
        long IActionAIExecutorCreator_createExecutor = ActionAIJniJNI.IActionAIExecutorCreator_createExecutor(this.swigCPtr, this, str, actionAIExecutorType.swigValue());
        if (IActionAIExecutorCreator_createExecutor == 0) {
            return null;
        }
        return new ActionAIExecutor(IActionAIExecutorCreator_createExecutor, true);
    }
}
