package com.bytedance.android.live.broadcast.model;

import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes.dex */
public class LivePermissionApplyResponse {

    @InterfaceC65349Pkn("permission_info")
    public Map<String, PermissionApplyInfo> permissionInfo;

    /* loaded from: classes.dex */
    public class PermissionApplyInfo {

        @InterfaceC65349Pkn("anchor_fans_num")
        public int mAnchorFansNum;

        @InterfaceC65349Pkn("apply_invalid_time")
        public int mApplyInvalidTime;

        @InterfaceC65349Pkn("apply_need_fans_num")
        public int mApplyNeedFansNum;

        @InterfaceC65349Pkn("apply_source")
        public int mApplySource;

        @InterfaceC65349Pkn("apply_status")
        public int mApplyStatus;

        @InterfaceC65349Pkn("forbidden_apply_countdown")
        public int mForbiddenApplyCountdown;

        @InterfaceC65349Pkn("forbidden_apply_days")
        public int mForbiddenApplyDays;

        @InterfaceC65349Pkn("need_live_time")
        public int mNeedLiveTime;

        @InterfaceC65349Pkn("target_live_time")
        public int mTargetLiveTime;

        public PermissionApplyInfo(LivePermissionApplyResponse livePermissionApplyResponse) {
        }
    }
}
