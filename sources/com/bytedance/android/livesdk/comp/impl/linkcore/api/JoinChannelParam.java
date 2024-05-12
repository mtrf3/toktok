package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class JoinChannelParam {

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizJoinChannelParams bizJoinChannelParams;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("myself")
    public UserBean operater;

    /* JADX WARN: Multi-variable type inference failed */
    public JoinChannelParam() {
        this(null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinChannelParam)) {
            return false;
        }
        JoinChannelParam joinChannelParam = (JoinChannelParam) obj;
        return o.LJ(this.common, joinChannelParam.common) && this.channelId == joinChannelParam.channelId && o.LJ(this.operater, joinChannelParam.operater) && o.LJ(this.bizJoinChannelParams, joinChannelParam.bizJoinChannelParams);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinChannelParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", operater=");
        LIZ.append(this.operater);
        LIZ.append(", bizJoinChannelParams=");
        LIZ.append(this.bizJoinChannelParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        LinkCommonBean linkCommonBean = this.common;
        int i = 0;
        if (linkCommonBean == null) {
            hashCode = 0;
        } else {
            hashCode = linkCommonBean.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.channelId, hashCode * 31, 31);
        UserBean userBean = this.operater;
        if (userBean == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = userBean.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        BizJoinChannelParams bizJoinChannelParams = this.bizJoinChannelParams;
        if (bizJoinChannelParams != null) {
            i = bizJoinChannelParams.hashCode();
        }
        return i2 + i;
    }

    public JoinChannelParam(LinkCommonBean linkCommonBean, long j, UserBean userBean, BizJoinChannelParams bizJoinChannelParams) {
        this.common = linkCommonBean;
        this.channelId = j;
        this.operater = userBean;
        this.bizJoinChannelParams = bizJoinChannelParams;
    }

    public /* synthetic */ JoinChannelParam(LinkCommonBean linkCommonBean, long j, UserBean userBean, BizJoinChannelParams bizJoinChannelParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : userBean, (i & 8) == 0 ? bizJoinChannelParams : null);
    }
}
