package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class LogMsgResponse extends MessageResponse {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                ActionAIJniJNI.delete_LogMsgResponse(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getLogAsString() {
        return ActionAIJniJNI.LogMsgResponse_getLogAsString(this.swigCPtr, this);
    }

    public LogInfo getLog_info() {
        long LogMsgResponse_log_info_get = ActionAIJniJNI.LogMsgResponse_log_info_get(this.swigCPtr, this);
        if (LogMsgResponse_log_info_get == 0) {
            return null;
        }
        return new LogInfo(LogMsgResponse_log_info_get, false);
    }

    public void printLog() {
        ActionAIJniJNI.LogMsgResponse_printLog(this.swigCPtr, this);
    }

    public LogMsgResponse() {
        this(ActionAIJniJNI.new_LogMsgResponse(), true);
    }

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public void finalize() {
        delete();
    }

    public static LogMsgResponse dynamicCast(MessageResponse messageResponse) {
        long LogMsgResponse_dynamicCast = ActionAIJniJNI.LogMsgResponse_dynamicCast(MessageResponse.getCPtr(messageResponse), messageResponse);
        if (LogMsgResponse_dynamicCast == 0) {
            return null;
        }
        return new LogMsgResponse(LogMsgResponse_dynamicCast, true);
    }

    public static long getCPtr(LogMsgResponse logMsgResponse) {
        if (logMsgResponse == null) {
            return 0L;
        }
        return logMsgResponse.swigCPtr;
    }

    public void setLog_info(LogInfo logInfo) {
        ActionAIJniJNI.LogMsgResponse_log_info_set(this.swigCPtr, this, LogInfo.getCPtr(logInfo), logInfo);
    }

    @Override // com.bytedance.ies.actionai.jni.MessageResponse, com.bytedance.ies.actionai.jni.BaseMessage
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public LogMsgResponse(long j, boolean z) {
        super(ActionAIJniJNI.LogMsgResponse_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
