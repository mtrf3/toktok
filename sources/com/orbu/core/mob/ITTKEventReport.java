package com.orbu.core.mob;

import com.orbu.core.api.ITTKOrbuRequest;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface ITTKEventReport {
    void onEvent(String str, JSONObject jSONObject);

    void onTTKRequest(ITTKOrbuRequest<?> iTTKOrbuRequest, boolean z);
}
