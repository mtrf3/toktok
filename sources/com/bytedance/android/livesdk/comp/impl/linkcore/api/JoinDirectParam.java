package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class JoinDirectParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizJoinDirectParams multiGuestReqExtra;

    @InterfaceC65349Pkn("myself")
    public UserBean self;

    /* JADX WARN: Multi-variable type inference failed */
    public JoinDirectParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinDirectParam)) {
            return false;
        }
        JoinDirectParam joinDirectParam = (JoinDirectParam) obj;
        return o.LJ(this.common, joinDirectParam.common) && o.LJ(this.self, joinDirectParam.self) && o.LJ(this.channelId, joinDirectParam.channelId) && o.LJ(this.multiGuestReqExtra, joinDirectParam.multiGuestReqExtra);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        UserBean userBean = this.self;
        int hashCode2 = (hashCode + (userBean == null ? 0 : userBean.hashCode())) * 31;
        Long l = this.channelId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        BizJoinDirectParams bizJoinDirectParams = this.multiGuestReqExtra;
        return hashCode3 + (bizJoinDirectParams != null ? bizJoinDirectParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinDirectParam(common=");
        LIZ.append(this.common);
        LIZ.append(", self=");
        LIZ.append(this.self);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", multiGuestReqExtra=");
        LIZ.append(this.multiGuestReqExtra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JoinDirectParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, BizJoinDirectParams bizJoinDirectParams) {
        this.common = linkCommonBean;
        this.self = userBean;
        this.channelId = l;
        this.multiGuestReqExtra = bizJoinDirectParams;
    }

    public /* synthetic */ JoinDirectParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, BizJoinDirectParams bizJoinDirectParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : userBean, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : bizJoinDirectParams);
    }
}
