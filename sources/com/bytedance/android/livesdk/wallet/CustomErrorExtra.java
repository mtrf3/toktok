package com.bytedance.android.livesdk.wallet;

import X.BNS;
import X.C09650Zl;
import X.C29401Dk;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.s;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class CustomErrorExtra extends Extra {
    public static int DISMISS_ACTION_OPEN_RECHARGE = 3;
    public static int PROMPT_TYPE_FE = 3;

    @InterfaceC65349Pkn("content_replace")
    public Map<String, PopContentReplace> contentReplace;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public BNS extraMap;

    @InterfaceC65349Pkn("penalty_warning_skip")
    public String penaltyWarningSkip;

    @InterfaceC65349Pkn("pop_up_content")
    public String popUpContent;

    @InterfaceC65349Pkn("pop_up_dismiss")
    public String popUpDismiss;

    @InterfaceC65349Pkn("pop_up_dismiss_action")
    public Integer popUpDismissAction;

    @InterfaceC65349Pkn("pop_up_primary_action")
    public Integer popUpPrimaryAction;

    @InterfaceC65349Pkn("pop_up_primary_CTA")
    public String popUpPrimaryCTA;

    @InterfaceC65349Pkn("pop_up_primary_CTA_schema")
    public String popUpPrimaryCTASchema;

    @InterfaceC65349Pkn("pop_up_style")
    public int popUpStyle;

    @InterfaceC65349Pkn("pop_up_title")
    public String popUpTitle;

    @InterfaceC65349Pkn("prompt_type")
    public int promptType;
    public String rowJson;

    @InterfaceC65349Pkn("toast_content")
    public String toastContent;

    public ExtraEntity getExtraEntity() {
        try {
            return (ExtraEntity) C09650Zl.LIZIZ.LJI(this.extra, ExtraEntity.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getPenaltyWarningSkip() {
        String str = this.penaltyWarningSkip;
        if (str != null) {
            return str;
        }
        return "";
    }

    public Integer getPopUpDismissAction() {
        int i;
        Integer num = this.popUpDismissAction;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public Integer getPopUpPrimaryAction() {
        int i;
        Integer num = this.popUpPrimaryAction;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        toJSONObject(jSONObject);
        return jSONObject;
    }

    public boolean isContinuable() {
        if (getPopUpPrimaryAction().intValue() == 2 || getPopUpDismissAction().intValue() == 2) {
            return true;
        }
        return false;
    }

    public Map<String, PopContentReplace> getContentReplace() {
        return this.contentReplace;
    }

    public String getPopUpContent() {
        return this.popUpContent;
    }

    public String getPopUpDismiss() {
        return this.popUpDismiss;
    }

    public String getPopUpPrimaryCTA() {
        return this.popUpPrimaryCTA;
    }

    public String getPopUpPrimaryCTASchema() {
        return this.popUpPrimaryCTASchema;
    }

    public int getPopUpStyle() {
        return this.popUpStyle;
    }

    public String getPopUpTitle() {
        return this.popUpTitle;
    }

    public int getPromptType() {
        return this.promptType;
    }

    public String getRawJson() {
        return this.rowJson;
    }

    public String getToastContent() {
        return this.toastContent;
    }

    /* loaded from: classes14.dex */
    public class ExtraEntity {

        @InterfaceC65349Pkn("error_code")
        public String error_code;

        @InterfaceC65349Pkn("link_to_jump")
        public String linkToJump;

        public ExtraEntity(CustomErrorExtra customErrorExtra) {
        }
    }

    /* loaded from: classes14.dex */
    public class PopContentReplace {

        @InterfaceC65349Pkn("replace_value")
        public String replaceValue;

        @InterfaceC65349Pkn("value_schema")
        public String valueSchema;

        public PopContentReplace(CustomErrorExtra customErrorExtra) {
        }
    }

    public static CustomErrorExtra getCustomErrorExtra(Exception exc) {
        if (exc instanceof C29401Dk) {
            String extra = ((C29401Dk) exc).getExtra();
            try {
                JSONObject jSONObject = new JSONObject(extra);
                if (jSONObject.has("custom_error")) {
                    extra = JSONObjectProtectorUtils.getJSONObject(jSONObject, "custom_error").toString();
                }
                CustomErrorExtra customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, extra, CustomErrorExtra.class);
                if (customErrorExtra != null) {
                    try {
                        String str = customErrorExtra.extra;
                        if (str != null) {
                            customErrorExtra.extraMap = new BNS(str);
                        }
                    } catch (s | JSONException unused) {
                        if (customErrorExtra == null) {
                            return customErrorExtra;
                        }
                    }
                }
                customErrorExtra.rowJson = extra;
                if (customErrorExtra.promptType == 0) {
                    return null;
                }
                return customErrorExtra;
            } catch (s | JSONException unused2) {
            }
        }
        return null;
    }

    public JSONObject toJSONObject(JSONObject jSONObject) {
        jSONObject.put("prompt_type", this.promptType);
        jSONObject.put("toast_content", this.toastContent);
        jSONObject.put("pop_up_title", this.popUpTitle);
        jSONObject.put("pop_up_content", this.popUpContent);
        jSONObject.put("content_replace", (Object) null);
        if (this.contentReplace != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, PopContentReplace> entry : this.contentReplace.entrySet()) {
                String key = entry.getKey();
                PopContentReplace value = entry.getValue();
                value.getClass();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("replace_value", value.replaceValue);
                jSONObject3.put("value_schema", value.valueSchema);
                jSONObject2.put(key, jSONObject3);
            }
            jSONObject.put("content_replace", jSONObject2);
        }
        jSONObject.put("pop_up_dismiss", this.popUpDismiss);
        jSONObject.put("pop_up_dismiss_action", this.popUpDismissAction);
        jSONObject.put("pop_up_primary_action", this.popUpPrimaryAction);
        jSONObject.put("penalty_warning_skip", this.penaltyWarningSkip);
        jSONObject.put("pop_up_primary_CTA", this.popUpPrimaryCTA);
        jSONObject.put("pop_up_primary_CTA_schema", this.popUpPrimaryCTASchema);
        jSONObject.put("pop_up_style", this.popUpStyle);
        Object obj = this.extra;
        if (obj != null) {
            jSONObject.put("extra", obj);
        }
        return jSONObject;
    }

    public static CustomErrorExtra getCustomErrorExtra(Map map) {
        j jsonTree;
        try {
            Gson gson = new Gson();
            if (map.containsKey("custom_error")) {
                jsonTree = GsonProtectorUtils.toJsonTree(gson, map.get("custom_error"));
            } else {
                jsonTree = GsonProtectorUtils.toJsonTree(gson, map);
            }
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, jsonTree, CustomErrorExtra.class);
            if (customErrorExtra != null) {
                if (jsonTree != null) {
                    try {
                        customErrorExtra.rowJson = jsonTree.toString();
                    } catch (s unused) {
                        if (customErrorExtra == null) {
                            return customErrorExtra;
                        }
                    }
                }
                if (customErrorExtra.promptType == 0) {
                    return null;
                }
                return customErrorExtra;
            }
            return customErrorExtra;
        } catch (s unused2) {
            return null;
        }
    }
}
