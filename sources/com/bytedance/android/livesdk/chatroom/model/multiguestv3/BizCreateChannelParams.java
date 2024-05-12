package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BizCreateChannelParams {

    @InterfaceC65349Pkn("display_id")
    public int displayId;

    @InterfaceC65349Pkn("scene_version")
    public long sceneVersion;

    @InterfaceC65349Pkn("user_setting")
    public UserSetting userSetting;

    /* loaded from: classes14.dex */
    public static final class UserSetting {

        @InterfaceC65349Pkn("setting_allow_request_from_follower_only")
        public int settingAllowRequestFromFollowerOnly;

        @InterfaceC65349Pkn("setting_allow_request_from_user")
        public int settingAllowRequestFromUser;

        @InterfaceC65349Pkn("setting_fix_mic_num")
        public int settingFixMicNum;

        @InterfaceC65349Pkn("setting_layout")
        public int settingLayout;
    }
}
