package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionModel {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionModel(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAddress() {
        return ActionAIJniJNI.ActionModel_address_get(this.swigCPtr, this);
    }

    public String getCategory() {
        return ActionAIJniJNI.ActionModel_category_get(this.swigCPtr, this);
    }

    public String getDescription() {
        return ActionAIJniJNI.ActionModel_description_get(this.swigCPtr, this);
    }

    public String getExample() {
        return ActionAIJniJNI.ActionModel_example_get(this.swigCPtr, this);
    }

    public InputDescList getInput_description() {
        long ActionModel_input_description_get = ActionAIJniJNI.ActionModel_input_description_get(this.swigCPtr, this);
        if (ActionModel_input_description_get == 0) {
            return null;
        }
        return new InputDescList(ActionModel_input_description_get, false);
    }

    public boolean getIs_client_defined() {
        return ActionAIJniJNI.ActionModel_is_client_defined_get(this.swigCPtr, this);
    }

    public String getName() {
        return ActionAIJniJNI.ActionModel_name_get(this.swigCPtr, this);
    }

    public OutputDescList getOutput_description() {
        long ActionModel_output_description_get = ActionAIJniJNI.ActionModel_output_description_get(this.swigCPtr, this);
        if (ActionModel_output_description_get == 0) {
            return null;
        }
        return new OutputDescList(ActionModel_output_description_get, false);
    }

    public int getPriority() {
        return ActionAIJniJNI.ActionModel_priority_get(this.swigCPtr, this);
    }

    public String getScenario() {
        return ActionAIJniJNI.ActionModel_scenario_get(this.swigCPtr, this);
    }

    public int getType() {
        return ActionAIJniJNI.ActionModel_type_get(this.swigCPtr, this);
    }

    public ActionModel() {
        this(ActionAIJniJNI.new_ActionModel(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionModel actionModel) {
        if (actionModel == null) {
            return 0L;
        }
        return actionModel.swigCPtr;
    }

    public void setAddress(String str) {
        ActionAIJniJNI.ActionModel_address_set(this.swigCPtr, this, str);
    }

    public void setCategory(String str) {
        ActionAIJniJNI.ActionModel_category_set(this.swigCPtr, this, str);
    }

    public void setDescription(String str) {
        ActionAIJniJNI.ActionModel_description_set(this.swigCPtr, this, str);
    }

    public void setExample(String str) {
        ActionAIJniJNI.ActionModel_example_set(this.swigCPtr, this, str);
    }

    public void setInput_description(InputDescList inputDescList) {
        ActionAIJniJNI.ActionModel_input_description_set(this.swigCPtr, this, InputDescList.getCPtr(inputDescList), inputDescList);
    }

    public void setIs_client_defined(boolean z) {
        ActionAIJniJNI.ActionModel_is_client_defined_set(this.swigCPtr, this, z);
    }

    public void setName(String str) {
        ActionAIJniJNI.ActionModel_name_set(this.swigCPtr, this, str);
    }

    public void setOutput_description(OutputDescList outputDescList) {
        ActionAIJniJNI.ActionModel_output_description_set(this.swigCPtr, this, OutputDescList.getCPtr(outputDescList), outputDescList);
    }

    public void setPriority(int i) {
        ActionAIJniJNI.ActionModel_priority_set(this.swigCPtr, this, i);
    }

    public void setScenario(String str) {
        ActionAIJniJNI.ActionModel_scenario_set(this.swigCPtr, this, str);
    }

    public void setType(int i) {
        ActionAIJniJNI.ActionModel_type_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ActionModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
