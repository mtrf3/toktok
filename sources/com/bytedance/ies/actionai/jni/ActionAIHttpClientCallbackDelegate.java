package com.bytedance.ies.actionai.jni;

/* loaded from: classes16.dex */
public class ActionAIHttpClientCallbackDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionAIHttpClientCallbackDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate) {
        if (actionAIHttpClientCallbackDelegate == null) {
            return 0L;
        }
        return actionAIHttpClientCallbackDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionAIHttpClientCallbackDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCallback(SWIGTYPE_p_void sWIGTYPE_p_void, ActionAIHttpClientCallbackAction actionAIHttpClientCallbackAction, byte[] bArr, long j, MsgExtParam msgExtParam) {
        ActionAIJniJNI.ActionAIHttpClientCallbackDelegate_onCallback(this.swigCPtr, this, SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), actionAIHttpClientCallbackAction.swigValue(), bArr, j, MsgExtParam.getCPtr(msgExtParam), msgExtParam);
    }
}
