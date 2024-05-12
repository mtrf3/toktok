package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ExecutionContext {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ExecutionContext(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ActionNodeList getActionDAG() {
        long ExecutionContext_actionDAG_get = ActionAIJniJNI.ExecutionContext_actionDAG_get(this.swigCPtr, this);
        if (ExecutionContext_actionDAG_get == 0) {
            return null;
        }
        return new ActionNodeList(ExecutionContext_actionDAG_get, false);
    }

    public String getConversationId() {
        return ActionAIJniJNI.ExecutionContext_conversationId_get(this.swigCPtr, this);
    }

    public String getMessageId() {
        return ActionAIJniJNI.ExecutionContext_messageId_get(this.swigCPtr, this);
    }

    public ExecutionContext() {
        this(ActionAIJniJNI.new_ExecutionContext(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ExecutionContext executionContext) {
        if (executionContext == null) {
            return 0L;
        }
        return executionContext.swigCPtr;
    }

    public void setActionDAG(ActionNodeList actionNodeList) {
        ActionAIJniJNI.ExecutionContext_actionDAG_set(this.swigCPtr, this, ActionNodeList.getCPtr(actionNodeList), actionNodeList);
    }

    public void setConversationId(String str) {
        ActionAIJniJNI.ExecutionContext_conversationId_set(this.swigCPtr, this, str);
    }

    public void setMessageId(String str) {
        ActionAIJniJNI.ExecutionContext_messageId_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ExecutionContext(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
