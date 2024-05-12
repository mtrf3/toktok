package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ServerErrorInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ServerErrorInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getDetail() {
        return ActionAIJniJNI.ServerErrorInfo_detail_get(this.swigCPtr, this);
    }

    public String getLogId() {
        return ActionAIJniJNI.ServerErrorInfo_logId_get(this.swigCPtr, this);
    }

    public String getMessage() {
        return ActionAIJniJNI.ServerErrorInfo_message_get(this.swigCPtr, this);
    }

    public String getSearch_type() {
        return ActionAIJniJNI.ServerErrorInfo_search_type_get(this.swigCPtr, this);
    }

    public int getStatusCode() {
        return ActionAIJniJNI.ServerErrorInfo_statusCode_get(this.swigCPtr, this);
    }

    public ServerErrorInfo() {
        this(ActionAIJniJNI.new_ServerErrorInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ServerErrorInfo serverErrorInfo) {
        if (serverErrorInfo == null) {
            return 0L;
        }
        return serverErrorInfo.swigCPtr;
    }

    public void setDetail(String str) {
        ActionAIJniJNI.ServerErrorInfo_detail_set(this.swigCPtr, this, str);
    }

    public void setLogId(String str) {
        ActionAIJniJNI.ServerErrorInfo_logId_set(this.swigCPtr, this, str);
    }

    public void setMessage(String str) {
        ActionAIJniJNI.ServerErrorInfo_message_set(this.swigCPtr, this, str);
    }

    public void setSearch_type(String str) {
        ActionAIJniJNI.ServerErrorInfo_search_type_set(this.swigCPtr, this, str);
    }

    public void setStatusCode(int i) {
        ActionAIJniJNI.ServerErrorInfo_statusCode_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ServerErrorInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
