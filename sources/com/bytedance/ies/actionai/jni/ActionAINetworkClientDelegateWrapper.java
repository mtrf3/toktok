package com.bytedance.ies.actionai.jni;

/* loaded from: classes16.dex */
public class ActionAINetworkClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAINetworkClientDelegateWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionAINetworkClientDelegateWrapper() {
        this(ActionAIJniJNI.new_ActionAINetworkClientDelegateWrapper(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAINetworkClientDelegateWrapper actionAINetworkClientDelegateWrapper) {
        if (actionAINetworkClientDelegateWrapper == null) {
            return 0L;
        }
        return actionAINetworkClientDelegateWrapper.swigCPtr;
    }

    public static void setHttpClientWrapper(IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper) {
        ActionAIJniJNI.ActionAINetworkClientDelegateWrapper_setHttpClientWrapper(IActionAIHTTPClientDelegateWrapper.getCPtr(iActionAIHTTPClientDelegateWrapper), iActionAIHTTPClientDelegateWrapper);
    }

    public static long swigRelease(ActionAINetworkClientDelegateWrapper actionAINetworkClientDelegateWrapper) {
        if (actionAINetworkClientDelegateWrapper != null) {
            if (actionAINetworkClientDelegateWrapper.swigCMemOwn) {
                long j = actionAINetworkClientDelegateWrapper.swigCPtr;
                actionAINetworkClientDelegateWrapper.swigCMemOwn = false;
                actionAINetworkClientDelegateWrapper.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public ActionAINetworkClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
