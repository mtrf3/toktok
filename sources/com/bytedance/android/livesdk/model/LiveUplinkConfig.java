package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final class LiveUplinkConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("uplink_strategy")
    public int uplinkStrategy = 1;

    @InterfaceC65349Pkn("ws_uplink_wait_timeout")
    public long wsUplinkWaitTimeout = LivePlayEnforceIntervalSetting.DEFAULT;

    @InterfaceC65349Pkn("uplink_api_allowed_list")
    public Map<String, ? extends Map<String, Long>> uplinkApiAllowedList = new HashMap();

    @InterfaceC65349Pkn("uplink_api_alternative_service_id_list")
    public Map<String, ? extends Map<String, Long>> uplinkApiAlternativeServiceIdList = new HashMap();

    @InterfaceC65349Pkn("ws_fail_fallback_to_http")
    public boolean wsFailFallbackToHttp = true;
}
