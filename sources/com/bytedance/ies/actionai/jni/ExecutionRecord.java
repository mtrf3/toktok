package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ExecutionRecord {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ExecutionRecord(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public StringPair getRecord_value_pair() {
        long ExecutionRecord_record_value_pair_get = ActionAIJniJNI.ExecutionRecord_record_value_pair_get(this.swigCPtr, this);
        if (ExecutionRecord_record_value_pair_get == 0) {
            return null;
        }
        return new StringPair(ExecutionRecord_record_value_pair_get, false);
    }

    public ExecutionRecord() {
        this(ActionAIJniJNI.new_ExecutionRecord(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ExecutionRecord executionRecord) {
        if (executionRecord == null) {
            return 0L;
        }
        return executionRecord.swigCPtr;
    }

    public void setRecord_value_pair(StringPair stringPair) {
        ActionAIJniJNI.ExecutionRecord_record_value_pair_set(this.swigCPtr, this, StringPair.getCPtr(stringPair), stringPair);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ExecutionRecord(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
