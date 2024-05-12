package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionExecutionNode {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionExecutionNode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean getDrop_end_msg() {
        return ActionAIJniJNI.ActionExecutionNode_drop_end_msg_get(this.swigCPtr, this);
    }

    public StringList getExecution_record() {
        long ActionExecutionNode_execution_record_get = ActionAIJniJNI.ActionExecutionNode_execution_record_get(this.swigCPtr, this);
        if (ActionExecutionNode_execution_record_get == 0) {
            return null;
        }
        return new StringList(ActionExecutionNode_execution_record_get, false);
    }

    public String getName() {
        return ActionAIJniJNI.ActionExecutionNode_name_get(this.swigCPtr, this);
    }

    public String getNext_node_ids() {
        return ActionAIJniJNI.ActionExecutionNode_next_node_ids_get(this.swigCPtr, this);
    }

    public String getOutput() {
        return ActionAIJniJNI.ActionExecutionNode_output_get(this.swigCPtr, this);
    }

    public StringList getOutput_context() {
        long ActionExecutionNode_output_context_get = ActionAIJniJNI.ActionExecutionNode_output_context_get(this.swigCPtr, this);
        if (ActionExecutionNode_output_context_get == 0) {
            return null;
        }
        return new StringList(ActionExecutionNode_output_context_get, false);
    }

    public String getParameters() {
        return ActionAIJniJNI.ActionExecutionNode_parameters_get(this.swigCPtr, this);
    }

    public String getPrevious_node_ids() {
        return ActionAIJniJNI.ActionExecutionNode_previous_node_ids_get(this.swigCPtr, this);
    }

    public int getPriority() {
        return ActionAIJniJNI.ActionExecutionNode_priority_get(this.swigCPtr, this);
    }

    public int getType() {
        return ActionAIJniJNI.ActionExecutionNode_type_get(this.swigCPtr, this);
    }

    public ActionExecutionNode() {
        this(ActionAIJniJNI.new_ActionExecutionNode(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionExecutionNode actionExecutionNode) {
        if (actionExecutionNode == null) {
            return 0L;
        }
        return actionExecutionNode.swigCPtr;
    }

    public void setDrop_end_msg(boolean z) {
        ActionAIJniJNI.ActionExecutionNode_drop_end_msg_set(this.swigCPtr, this, z);
    }

    public void setExecution_record(StringList stringList) {
        ActionAIJniJNI.ActionExecutionNode_execution_record_set(this.swigCPtr, this, StringList.getCPtr(stringList), stringList);
    }

    public void setName(String str) {
        ActionAIJniJNI.ActionExecutionNode_name_set(this.swigCPtr, this, str);
    }

    public void setNext_node_ids(String str) {
        ActionAIJniJNI.ActionExecutionNode_next_node_ids_set(this.swigCPtr, this, str);
    }

    public void setOutput(String str) {
        ActionAIJniJNI.ActionExecutionNode_output_set(this.swigCPtr, this, str);
    }

    public void setOutput_context(StringList stringList) {
        ActionAIJniJNI.ActionExecutionNode_output_context_set(this.swigCPtr, this, StringList.getCPtr(stringList), stringList);
    }

    public void setParameters(String str) {
        ActionAIJniJNI.ActionExecutionNode_parameters_set(this.swigCPtr, this, str);
    }

    public void setPrevious_node_ids(String str) {
        ActionAIJniJNI.ActionExecutionNode_previous_node_ids_set(this.swigCPtr, this, str);
    }

    public void setPriority(int i) {
        ActionAIJniJNI.ActionExecutionNode_priority_set(this.swigCPtr, this, i);
    }

    public void setType(int i) {
        ActionAIJniJNI.ActionExecutionNode_type_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionExecutionNode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
