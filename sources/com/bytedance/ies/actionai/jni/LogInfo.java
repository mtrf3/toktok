package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class LogInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_LogInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAction_name() {
        return ActionAIJniJNI.LogInfo_action_name_get(this.swigCPtr, this);
    }

    public String getInputJson() {
        return ActionAIJniJNI.LogInfo_inputJson_get(this.swigCPtr, this);
    }

    public String getOutputJson() {
        return ActionAIJniJNI.LogInfo_outputJson_get(this.swigCPtr, this);
    }

    public LogInfo() {
        this(ActionAIJniJNI.new_LogInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(LogInfo logInfo) {
        if (logInfo == null) {
            return 0L;
        }
        return logInfo.swigCPtr;
    }

    public static long swigRelease(LogInfo logInfo) {
        if (logInfo != null) {
            if (logInfo.swigCMemOwn) {
                long j = logInfo.swigCPtr;
                logInfo.swigCMemOwn = false;
                logInfo.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void setAction_name(String str) {
        ActionAIJniJNI.LogInfo_action_name_set(this.swigCPtr, this, str);
    }

    public void setInputJson(String str) {
        ActionAIJniJNI.LogInfo_inputJson_set(this.swigCPtr, this, str);
    }

    public void setOutputJson(String str) {
        ActionAIJniJNI.LogInfo_outputJson_set(this.swigCPtr, this, str);
    }

    public LogInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
