package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LeaveChannelParam {

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizLeaveParams bizLeaveParams;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("leave_reason")
    public int leaveReason;

    @InterfaceC65349Pkn("myself")
    public UserBean player;

    /* JADX WARN: Multi-variable type inference failed */
    public LeaveChannelParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveChannelParam)) {
            return false;
        }
        LeaveChannelParam leaveChannelParam = (LeaveChannelParam) obj;
        return o.LJ(this.common, leaveChannelParam.common) && o.LJ(this.channelId, leaveChannelParam.channelId) && o.LJ(this.player, leaveChannelParam.player) && this.leaveReason == leaveChannelParam.leaveReason && o.LJ(this.bizLeaveParams, leaveChannelParam.bizLeaveParams);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.player;
        int hashCode3 = (((hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31) + this.leaveReason) * 31;
        BizLeaveParams bizLeaveParams = this.bizLeaveParams;
        return hashCode3 + (bizLeaveParams != null ? bizLeaveParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveChannelParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", player=");
        LIZ.append(this.player);
        LIZ.append(", leaveReason=");
        LIZ.append(this.leaveReason);
        LIZ.append(", bizLeaveParams=");
        LIZ.append(this.bizLeaveParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LeaveChannelParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, int i, BizLeaveParams bizLeaveParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.player = userBean;
        this.leaveReason = i;
        this.bizLeaveParams = bizLeaveParams;
    }

    public /* synthetic */ LeaveChannelParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, int i, BizLeaveParams bizLeaveParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : linkCommonBean, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : userBean, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? bizLeaveParams : null);
    }
}
