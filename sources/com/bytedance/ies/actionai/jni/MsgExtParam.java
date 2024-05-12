package com.bytedance.ies.actionai.jni;

/* loaded from: classes16.dex */
public class MsgExtParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_MsgExtParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionAIHttpType getEHttpType() {
        return ActionAIHttpType.swigToEnum(ActionAIJniJNI.MsgExtParam_eHttpType_get(this.swigCPtr, this));
    }

    public int getErrorCode() {
        return ActionAIJniJNI.MsgExtParam_errorCode_get(this.swigCPtr, this);
    }

    public String getErrorMsg() {
        return ActionAIJniJNI.MsgExtParam_errorMsg_get(this.swigCPtr, this);
    }

    public long getUiReqId() {
        return ActionAIJniJNI.MsgExtParam_uiReqId_get(this.swigCPtr, this);
    }

    public MsgExtParam() {
        this(ActionAIJniJNI.new_MsgExtParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MsgExtParam msgExtParam) {
        if (msgExtParam == null) {
            return 0L;
        }
        return msgExtParam.swigCPtr;
    }

    public static long swigRelease(MsgExtParam msgExtParam) {
        if (msgExtParam != null) {
            if (msgExtParam.swigCMemOwn) {
                long j = msgExtParam.swigCPtr;
                msgExtParam.swigCMemOwn = false;
                msgExtParam.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void setEHttpType(ActionAIHttpType actionAIHttpType) {
        ActionAIJniJNI.MsgExtParam_eHttpType_set(this.swigCPtr, this, actionAIHttpType.swigValue());
    }

    public void setErrorCode(int i) {
        ActionAIJniJNI.MsgExtParam_errorCode_set(this.swigCPtr, this, i);
    }

    public void setErrorMsg(String str) {
        ActionAIJniJNI.MsgExtParam_errorMsg_set(this.swigCPtr, this, str);
    }

    public void setUiReqId(long j) {
        ActionAIJniJNI.MsgExtParam_uiReqId_set(this.swigCPtr, this, j);
    }

    public MsgExtParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
