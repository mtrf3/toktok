package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class KickOutParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("kick_player")
    public UserBean guest;

    @InterfaceC65349Pkn("kickout_reason")
    public int kickOutReason;

    @InterfaceC65349Pkn("operator")
    public UserBean operator;

    @InterfaceC65349Pkn("myself")
    public UserBean owner;

    /* JADX WARN: Multi-variable type inference failed */
    public KickOutParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KickOutParam)) {
            return false;
        }
        KickOutParam kickOutParam = (KickOutParam) obj;
        return o.LJ(this.common, kickOutParam.common) && o.LJ(this.owner, kickOutParam.owner) && o.LJ(this.guest, kickOutParam.guest) && o.LJ(this.operator, kickOutParam.operator) && o.LJ(this.channelId, kickOutParam.channelId) && this.kickOutReason == kickOutParam.kickOutReason;
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        UserBean userBean = this.owner;
        int hashCode2 = (hashCode + (userBean == null ? 0 : userBean.hashCode())) * 31;
        UserBean userBean2 = this.guest;
        int hashCode3 = (hashCode2 + (userBean2 == null ? 0 : userBean2.hashCode())) * 31;
        UserBean userBean3 = this.operator;
        int hashCode4 = (hashCode3 + (userBean3 == null ? 0 : userBean3.hashCode())) * 31;
        Long l = this.channelId;
        return ((hashCode4 + (l != null ? l.hashCode() : 0)) * 31) + this.kickOutReason;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KickOutParam(common=");
        LIZ.append(this.common);
        LIZ.append(", owner=");
        LIZ.append(this.owner);
        LIZ.append(", guest=");
        LIZ.append(this.guest);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", kickOutReason=");
        return b0.LIZJ(LIZ, this.kickOutReason, ')', LIZ);
    }

    public KickOutParam(LinkCommonBean linkCommonBean, UserBean userBean, UserBean userBean2, UserBean userBean3, Long l, int i) {
        this.common = linkCommonBean;
        this.owner = userBean;
        this.guest = userBean2;
        this.operator = userBean3;
        this.channelId = l;
        this.kickOutReason = i;
    }

    public /* synthetic */ KickOutParam(LinkCommonBean linkCommonBean, UserBean userBean, UserBean userBean2, UserBean userBean3, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : linkCommonBean, (i2 & 2) != 0 ? null : userBean, (i2 & 4) != 0 ? null : userBean2, (i2 & 8) != 0 ? null : userBean3, (i2 & 16) == 0 ? l : null, (i2 & 32) != 0 ? 0 : i);
    }
}
