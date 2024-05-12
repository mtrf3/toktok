package com.ss.ugc.effectplatform.model.net;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class CustomizedEffectsResponse {
    public List<? extends Effect> custom_effects;
    public String message;
    public int status_code;
    public List<? extends Effect> template_effects;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomizedEffectsResponse() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public List<Effect> getCustom_effects() {
        return this.custom_effects;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<Effect> getTemplate_effects() {
        return this.template_effects;
    }

    public void setCustom_effects(List<? extends Effect> list) {
        this.custom_effects = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setTemplate_effects(List<? extends Effect> list) {
        this.template_effects = list;
    }

    public CustomizedEffectsResponse(int i, String str, List<? extends Effect> list, List<? extends Effect> list2) {
        this.status_code = i;
        this.message = str;
        this.custom_effects = list;
        this.template_effects = list2;
    }

    public /* synthetic */ CustomizedEffectsResponse(int i, String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2);
    }
}
