package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public interface PTYMessageHandler extends ReflectionCall {
    JSONObject onMessage(JSONObject jSONObject);
}
