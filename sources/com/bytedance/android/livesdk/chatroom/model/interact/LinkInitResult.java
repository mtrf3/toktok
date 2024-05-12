package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class LinkInitResult {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("app_id")
    public String appId;

    @InterfaceC65349Pkn("app_sign")
    public String appSign;

    @InterfaceC65349Pkn("linkmic_id")
    public int linkMicId;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkMicIdStr;

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    @InterfaceC65349Pkn("vendor")
    public int vendor;

    @InterfaceC65349Pkn("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @InterfaceC65349Pkn("user_multi_live_enum")
    public int abTestInfo = 0;

    @InterfaceC65349Pkn("user_setting_info")
    public MultiLiveAnchorPanelSettings panelSettings = null;
}
