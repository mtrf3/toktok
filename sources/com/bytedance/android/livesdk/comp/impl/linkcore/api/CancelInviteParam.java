package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelInviteParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("invitee")
    public UserBean invitee;

    @InterfaceC65349Pkn("invitor")
    public UserBean inviter;

    @InterfaceC65349Pkn("operator")
    public UserBean operator;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelInviteParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelInviteParam)) {
            return false;
        }
        CancelInviteParam cancelInviteParam = (CancelInviteParam) obj;
        return o.LJ(this.common, cancelInviteParam.common) && o.LJ(this.channelId, cancelInviteParam.channelId) && o.LJ(this.inviter, cancelInviteParam.inviter) && o.LJ(this.invitee, cancelInviteParam.invitee) && o.LJ(this.operator, cancelInviteParam.operator);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.inviter;
        int hashCode3 = (hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31;
        UserBean userBean2 = this.invitee;
        int hashCode4 = (hashCode3 + (userBean2 == null ? 0 : userBean2.hashCode())) * 31;
        UserBean userBean3 = this.operator;
        return hashCode4 + (userBean3 != null ? userBean3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelInviteParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", inviter=");
        LIZ.append(this.inviter);
        LIZ.append(", invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CancelInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.inviter = userBean;
        this.invitee = userBean2;
        this.operator = userBean3;
    }

    public /* synthetic */ CancelInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : userBean, (i & 8) != 0 ? null : userBean2, (i & 16) == 0 ? userBean3 : null);
    }
}
