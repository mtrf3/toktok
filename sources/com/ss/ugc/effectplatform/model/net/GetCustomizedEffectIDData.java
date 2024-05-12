package com.ss.ugc.effectplatform.model.net;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public class GetCustomizedEffectIDData {
    public String effect_id;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCustomizedEffectIDData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public GetCustomizedEffectIDData(String str) {
        this.effect_id = str;
    }

    public void setEffect_id(String str) {
        this.effect_id = str;
    }

    public /* synthetic */ GetCustomizedEffectIDData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
