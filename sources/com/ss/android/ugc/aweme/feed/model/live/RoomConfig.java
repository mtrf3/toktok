package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RoomConfig implements Serializable {

    @InterfaceC65349Pkn("enable_emoji")
    public int enableEmoji;

    @InterfaceC65349Pkn("enable_fans_club")
    public int enableFansClub;

    @InterfaceC65349Pkn("enable_hourly_list")
    public int enableHourRank;

    @InterfaceC65349Pkn("enable_send_barrage")
    public int enableSendBarrage;

    @InterfaceC65349Pkn("enable_send_comment")
    public int enableSendComment;

    @InterfaceC65349Pkn("enable_send_gift")
    public int enableSendGift;

    @InterfaceC65349Pkn("enable_send_gift_guide")
    public int enableSendGiftGuide;

    @InterfaceC65349Pkn("enable_send_shortcut_gift")
    public int enableSendShortcutGift;

    @InterfaceC65349Pkn("enable_share")
    public int enableShare;

    private boolean calc(int i, int i2) {
        int i3 = i2 == 0 ? 1 : 2;
        return (i & i3) == i3;
    }

    public boolean enableHourRank(int i) {
        return calc(this.enableHourRank, i);
    }

    public boolean isEnableEmoji(int i) {
        return calc(this.enableEmoji, i);
    }

    public boolean isEnableFansClub(int i) {
        return calc(this.enableFansClub, i);
    }

    public boolean isEnableSendBarrage(int i) {
        return calc(this.enableSendBarrage, i);
    }

    public boolean isEnableSendComment(int i) {
        return calc(this.enableSendComment, i);
    }

    public boolean isEnableSendGift(int i) {
        return calc(this.enableSendGift, i);
    }

    public boolean isEnableSendGiftGuide(int i) {
        return calc(this.enableSendGiftGuide, i);
    }

    public boolean isEnableShare(int i) {
        return calc(this.enableShare, i);
    }

    public boolean isEnableShortcutGift(int i) {
        return calc(this.enableSendShortcutGift, i);
    }
}
