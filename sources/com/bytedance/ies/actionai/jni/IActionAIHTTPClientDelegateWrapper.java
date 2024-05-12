package com.bytedance.ies.actionai.jni;

/* loaded from: classes16.dex */
public class IActionAIHTTPClientDelegateWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_IActionAIHTTPClientDelegateWrapper(j);
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
        ActionAIJniJNI.IActionAIHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.IActionAIHTTPClientDelegateWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public IActionAIHTTPClientDelegateWrapper() {
        this(ActionAIJniJNI.new_IActionAIHTTPClientDelegateWrapper(), true);
        ActionAIJniJNI.IActionAIHTTPClientDelegateWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper) {
        if (iActionAIHTTPClientDelegateWrapper == null) {
            return 0L;
        }
        return iActionAIHTTPClientDelegateWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IActionAIHTTPClientDelegateWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean requestNet(String str, ActionAIHttpType actionAIHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate) {
        return ActionAIJniJNI.IActionAIHTTPClientDelegateWrapper_requestNet(this.swigCPtr, this, str, actionAIHttpType.swigValue(), j, UnorderedMapStrStr.getCPtr(unorderedMapStrStr), unorderedMapStrStr, UnorderedMapStrStr.getCPtr(unorderedMapStrStr2), unorderedMapStrStr2, str2, bArr, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), ActionAIHttpClientCallbackDelegate.getCPtr(actionAIHttpClientCallbackDelegate), actionAIHttpClientCallbackDelegate);
    }
}
