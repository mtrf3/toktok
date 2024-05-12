package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes17.dex */
public final class Portal extends F9E {

    @InterfaceC65349Pkn("anchor")
    public User anchor;

    @InterfaceC65349Pkn("cover")
    public ImageModel cover;

    @InterfaceC65349Pkn("enter_count")
    public Long enterCount;

    @InterfaceC65349Pkn("invitee_count")
    public Long inviteeCount;

    @InterfaceC65349Pkn("portal_id")
    public Long portalId;

    @InterfaceC65349Pkn("reward_duration")
    public Long rewardDuration;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sugar_daddy")
    public User sugarDaddy;

    @InterfaceC65349Pkn("total_amount")
    public Long totalAmount;

    @InterfaceC65349Pkn("user_type")
    public int userType;

    @InterfaceC65349Pkn("wait_duration")
    public Long waitDuration;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.startTime;
        Long l2 = this.enterCount;
        User user = this.sugarDaddy;
        Long l3 = this.roomId;
        User user2 = this.anchor;
        Long l4 = this.portalId;
        Long l5 = this.inviteeCount;
        Long l6 = this.waitDuration;
        Long l7 = this.rewardDuration;
        Long l8 = this.totalAmount;
        ImageModel imageModel = this.cover;
        return new Object[]{l, l, l2, l2, user, user, l3, l3, user2, user2, l4, l4, Integer.valueOf(this.userType), l5, l5, Integer.valueOf(this.status), l6, l6, l7, l7, l8, l8, imageModel, imageModel};
    }
}
