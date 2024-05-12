package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class ApplyResult {

    @InterfaceC65349Pkn("auto_join")
    public Boolean autoJoin;

    @InterfaceC65349Pkn("weight_decay_type")
    public int decayType;

    @InterfaceC65349Pkn("linkmic_id")
    public int linkMicId;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkMicIdStr;

    @InterfaceC65349Pkn("prompts")
    public String prompts;

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    @InterfaceC65349Pkn("vendor")
    public int vendor;

    @InterfaceC65349Pkn("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission = 0;
}
