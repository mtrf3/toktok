package com.bytedance.pitaya.thirdcomponent.featureevent;

import com.bytedance.pitaya.thirdcomponent.stddelegate.CallbackRegister;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public interface FeatureEventProducer extends CallbackRegister<Long, FeatureEventCallback> {
    String getSessionId();

    void newEvent(String str, JSONObject jSONObject);
}
