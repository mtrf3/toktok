package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class StringPair {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_StringPair(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getFirst() {
        return ActionAIJniJNI.StringPair_first_get(this.swigCPtr, this);
    }

    public String getSecond() {
        return ActionAIJniJNI.StringPair_second_get(this.swigCPtr, this);
    }

    public StringPair() {
        this(ActionAIJniJNI.new_StringPair__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public StringPair(StringPair stringPair) {
        this(ActionAIJniJNI.new_StringPair__SWIG_2(getCPtr(stringPair), stringPair), true);
    }

    public static long getCPtr(StringPair stringPair) {
        if (stringPair == null) {
            return 0L;
        }
        return stringPair.swigCPtr;
    }

    public static long swigRelease(StringPair stringPair) {
        if (stringPair != null) {
            if (stringPair.swigCMemOwn) {
                long j = stringPair.swigCPtr;
                stringPair.swigCMemOwn = false;
                stringPair.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void setFirst(String str) {
        ActionAIJniJNI.StringPair_first_set(this.swigCPtr, this, str);
    }

    public void setSecond(String str) {
        ActionAIJniJNI.StringPair_second_set(this.swigCPtr, this, str);
    }

    public StringPair(String str, String str2) {
        this(ActionAIJniJNI.new_StringPair__SWIG_1(str, str2), true);
    }

    public StringPair(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
