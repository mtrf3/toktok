package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class UpdateSettingParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("live_id")
    public Long liveId;

    @InterfaceC65349Pkn("new_allow_request_from_follower_only")
    public int newAllowRequestFromFollowerOnly;

    @InterfaceC65349Pkn("new_allow_request_from_user")
    public int newAllowRequestFromUser;

    @InterfaceC65349Pkn("new_applier_sort_gift_score_threshold")
    public long newApplierSortGiftScoreThreshold;

    @InterfaceC65349Pkn("new_applier_sort_setting")
    public int newApplierSortSetting;

    @InterfaceC65349Pkn("new_fix_mic_num")
    public int newFixMicNum;

    @InterfaceC65349Pkn("new_layout")
    public int newLayout;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("update_scene")
    public int updateScene;

    @InterfaceC65349Pkn("new_layout_id")
    public String newLayoutId = "";

    @InterfaceC65349Pkn("background_sticker_id")
    public String backgroundStickerId = "";

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.roomId;
        Long l3 = this.liveId;
        return new Object[]{Integer.valueOf(this.newLayout), Integer.valueOf(this.newFixMicNum), Integer.valueOf(this.newAllowRequestFromUser), Integer.valueOf(this.newAllowRequestFromFollowerOnly), l, l, l2, l2, l3, l3};
    }
}
