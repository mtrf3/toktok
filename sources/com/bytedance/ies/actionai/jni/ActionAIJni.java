package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class ActionAIJni {
    public static ValueType str_to_type(String str) {
        return ValueType.swigToEnum(ActionAIJniJNI.str_to_type(str));
    }

    public static String type_to_str(ValueType valueType) {
        return ActionAIJniJNI.type_to_str(valueType.swigValue());
    }

    public static void from_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, ActionModel actionModel) {
        ActionAIJniJNI.from_json__SWIG_2(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), ActionModel.getCPtr(actionModel), actionModel);
    }

    public static void to_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, ActionModel actionModel) {
        ActionAIJniJNI.to_json__SWIG_2(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), ActionModel.getCPtr(actionModel), actionModel);
    }

    public static void from_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, InputDescription inputDescription) {
        ActionAIJniJNI.from_json__SWIG_0(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), InputDescription.getCPtr(inputDescription), inputDescription);
    }

    public static void to_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, InputDescription inputDescription) {
        ActionAIJniJNI.to_json__SWIG_0(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), InputDescription.getCPtr(inputDescription), inputDescription);
    }

    public static void from_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, OutputDescription outputDescription) {
        ActionAIJniJNI.from_json__SWIG_1(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), OutputDescription.getCPtr(outputDescription), outputDescription);
    }

    public static void to_json(SWIGTYPE_p_nlohmann__json sWIGTYPE_p_nlohmann__json, OutputDescription outputDescription) {
        ActionAIJniJNI.to_json__SWIG_1(SWIGTYPE_p_nlohmann__json.getCPtr(sWIGTYPE_p_nlohmann__json), OutputDescription.getCPtr(outputDescription), outputDescription);
    }
}
