package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class Setting extends F9E {

    @InterfaceC65349Pkn("allow_request_from_follower_only")
    public int allowRequestFromFollowerOnly;

    @InterfaceC65349Pkn("allow_request_from_user")
    public int allowRequestFromUser;

    @InterfaceC65349Pkn("applier_gift_score_threshold")
    public long applierGiftScoreThreshold;

    @InterfaceC65349Pkn("applier_sort_setting")
    public int applierSortSetting;

    @InterfaceC65349Pkn("background_sticker_id")
    public String backgroundStickerId = "";

    @InterfaceC65349Pkn("fix_mic_num")
    public int fixMicNum;

    @InterfaceC65349Pkn("layout")
    public int layout;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.layout), Integer.valueOf(this.fixMicNum), Integer.valueOf(this.allowRequestFromUser), Integer.valueOf(this.allowRequestFromFollowerOnly)};
    }
}
