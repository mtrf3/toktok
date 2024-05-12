package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DestroyChannelParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("finish_reason")
    public Long finishReason;

    @InterfaceC65349Pkn("myself")
    public UserBean player;

    /* JADX WARN: Multi-variable type inference failed */
    public DestroyChannelParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestroyChannelParam)) {
            return false;
        }
        DestroyChannelParam destroyChannelParam = (DestroyChannelParam) obj;
        return o.LJ(this.common, destroyChannelParam.common) && o.LJ(this.player, destroyChannelParam.player) && o.LJ(this.channelId, destroyChannelParam.channelId) && o.LJ(this.finishReason, destroyChannelParam.finishReason);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        UserBean userBean = this.player;
        int hashCode2 = (hashCode + (userBean == null ? 0 : userBean.hashCode())) * 31;
        Long l = this.channelId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.finishReason;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DestroyChannelParam(common=");
        LIZ.append(this.common);
        LIZ.append(", player=");
        LIZ.append(this.player);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", finishReason=");
        return JBR.LJ(LIZ, this.finishReason, ')', LIZ);
    }

    public DestroyChannelParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, Long l2) {
        this.common = linkCommonBean;
        this.player = userBean;
        this.channelId = l;
        this.finishReason = l2;
    }

    public /* synthetic */ DestroyChannelParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : userBean, (i & 4) != 0 ? null : l, (i & 8) != 0 ? 0L : l2);
    }
}
