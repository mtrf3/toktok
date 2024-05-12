package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionResult {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getDropEndMsg() {
        return ActionAIJniJNI.ActionResult_dropEndMsg_get(this.swigCPtr, this);
    }

    public String getOutputJsonStr() {
        return ActionAIJniJNI.ActionResult_outputJsonStr_get(this.swigCPtr, this);
    }

    public ActionResult() {
        this(ActionAIJniJNI.new_ActionResult(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionResult actionResult) {
        if (actionResult == null) {
            return 0L;
        }
        return actionResult.swigCPtr;
    }

    public void setDropEndMsg(boolean z) {
        ActionAIJniJNI.ActionResult_dropEndMsg_set(this.swigCPtr, this, z);
    }

    public void setOutputJsonStr(String str) {
        ActionAIJniJNI.ActionResult_outputJsonStr_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
