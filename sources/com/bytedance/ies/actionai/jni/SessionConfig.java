package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class SessionConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_SessionConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getBizId() {
        return ActionAIJniJNI.SessionConfig_getBizId(this.swigCPtr, this);
    }

    public boolean getDebugMode() {
        return ActionAIJniJNI.SessionConfig_getDebugMode(this.swigCPtr, this);
    }

    public boolean getEnableChatHistory() {
        return ActionAIJniJNI.SessionConfig_getEnableChatHistory(this.swigCPtr, this);
    }

    public boolean getEnableDynamicActionList() {
        return ActionAIJniJNI.SessionConfig_getEnableDynamicActionList(this.swigCPtr, this);
    }

    public boolean getEnableLLMCache() {
        return ActionAIJniJNI.SessionConfig_getEnableLLMCache(this.swigCPtr, this);
    }

    public String getHost() {
        return ActionAIJniJNI.SessionConfig_getHost(this.swigCPtr, this);
    }

    public String getLlmKey() {
        return ActionAIJniJNI.SessionConfig_getLlmKey(this.swigCPtr, this);
    }

    public int getLlmTimeoutSecond() {
        return ActionAIJniJNI.SessionConfig_getLlmTimeoutSecond(this.swigCPtr, this);
    }

    public String getLlmType() {
        return ActionAIJniJNI.SessionConfig_getLlmType(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(SessionConfig sessionConfig) {
        if (sessionConfig == null) {
            return 0L;
        }
        return sessionConfig.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public SessionConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
