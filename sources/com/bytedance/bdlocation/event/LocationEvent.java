package com.bytedance.bdlocation.event;

import com.bytedance.bdlocation.client.BDLocationConfig;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class LocationEvent {
    public static IEventManager sEventManager;

    public static void onRequestPermission() {
        onEventV3("bdug_location_when_in_use");
    }

    public static void onEventV3(String str) {
        onEventV3(str, null);
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        if (sEventManager == null) {
            sEventManager = BDLocationConfig.getEventManager();
        }
        IEventManager iEventManager = sEventManager;
        if (iEventManager != null) {
            iEventManager.onEventV3(str, jSONObject);
        }
    }
}
