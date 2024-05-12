package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class IExecutorDelegate extends ActionAIExecutor {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_IExecutorDelegate(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        ActionAIJniJNI.IExecutorDelegate_change_ownership(this, this.swigCPtr, false);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.IExecutorDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public IExecutorDelegate() {
        this(ActionAIJniJNI.new_IExecutorDelegate(), true);
        ActionAIJniJNI.IExecutorDelegate_director_connect(this, this.swigCPtr, true, false);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public void finalize() {
        delete();
    }

    public static long getCPtr(IExecutorDelegate iExecutorDelegate) {
        if (iExecutorDelegate == null) {
            return 0L;
        }
        return iExecutorDelegate.swigCPtr;
    }

    public void postRunnable(IExecutorRunnable iExecutorRunnable) {
        ActionAIJniJNI.IExecutorDelegate_postRunnable(this.swigCPtr, this, IExecutorRunnable.getCPtr(iExecutorRunnable), iExecutorRunnable);
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public IExecutorDelegate(long j, boolean z) {
        super(ActionAIJniJNI.IExecutorDelegate_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
