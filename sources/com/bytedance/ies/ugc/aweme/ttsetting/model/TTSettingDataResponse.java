package com.bytedance.ies.ugc.aweme.ttsetting.model;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TTSettingDataResponse {
    public TTSettingData ttSettingData;
    public JSONObject ttSettingDataJSONObject;

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData ttSettingData, JSONObject ttSettingDataJSONObject) {
        o.LJIIIZ(ttSettingData, "ttSettingData");
        o.LJIIIZ(ttSettingDataJSONObject, "ttSettingDataJSONObject");
        this.ttSettingData = ttSettingData;
        this.ttSettingDataJSONObject = ttSettingDataJSONObject;
    }
}
