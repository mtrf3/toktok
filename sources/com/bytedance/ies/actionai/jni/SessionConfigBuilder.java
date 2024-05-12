package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class SessionConfigBuilder {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_SessionConfigBuilder(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public SessionConfig build() {
        return new SessionConfig(ActionAIJniJNI.SessionConfigBuilder_build(this.swigCPtr, this), true);
    }

    public SessionConfigBuilder() {
        this(ActionAIJniJNI.new_SessionConfigBuilder(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(SessionConfigBuilder sessionConfigBuilder) {
        if (sessionConfigBuilder == null) {
            return 0L;
        }
        return sessionConfigBuilder.swigCPtr;
    }

    public static long swigRelease(SessionConfigBuilder sessionConfigBuilder) {
        if (sessionConfigBuilder != null) {
            if (sessionConfigBuilder.swigCMemOwn) {
                long j = sessionConfigBuilder.swigCPtr;
                sessionConfigBuilder.swigCMemOwn = false;
                sessionConfigBuilder.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public SessionConfigBuilder setBizId(String str) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setBizId(this.swigCPtr, this, str), false);
    }

    public SessionConfigBuilder setDebugMode(boolean z) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setDebugMode(this.swigCPtr, this, z), false);
    }

    public SessionConfigBuilder setEnableChatHistory(boolean z) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setEnableChatHistory(this.swigCPtr, this, z), false);
    }

    public SessionConfigBuilder setEnableDynamicActionList(boolean z) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setEnableDynamicActionList(this.swigCPtr, this, z), false);
    }

    public SessionConfigBuilder setEnableLLMCache(boolean z) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setEnableLLMCache(this.swigCPtr, this, z), false);
    }

    public SessionConfigBuilder setHost(String str) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setHost(this.swigCPtr, this, str), false);
    }

    public SessionConfigBuilder setLlmKey(String str) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setLlmKey(this.swigCPtr, this, str), false);
    }

    public SessionConfigBuilder setLlmTimeoutSecond(int i) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setLlmTimeoutSecond(this.swigCPtr, this, i), false);
    }

    public SessionConfigBuilder setLlmType(String str) {
        return new SessionConfigBuilder(ActionAIJniJNI.SessionConfigBuilder_setLlmType(this.swigCPtr, this, str), false);
    }

    public SessionConfigBuilder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
