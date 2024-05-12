package com.bytedance.pitaya.thirdcomponent.monitor;

import android.content.Context;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public interface Monitor extends ReflectionCall {
    void init(PTYSetupInfo pTYSetupInfo, String str, String str2, Context context, String str3, String str4, String str5);

    boolean isAllowedEvent(String str);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void threadException(String str, String str2, String str3, int i);
}
