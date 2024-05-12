package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ChangePositionParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("myself")
    public UserBean operator;

    @InterfaceC65349Pkn("pos")
    public MicPositionData position;

    @InterfaceC65349Pkn("target_user")
    public UserBean targetUser;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangePositionParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePositionParam)) {
            return false;
        }
        ChangePositionParam changePositionParam = (ChangePositionParam) obj;
        return o.LJ(this.common, changePositionParam.common) && o.LJ(this.operator, changePositionParam.operator) && o.LJ(this.position, changePositionParam.position) && o.LJ(this.targetUser, changePositionParam.targetUser) && o.LJ(this.channelId, changePositionParam.channelId);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        UserBean userBean = this.operator;
        int hashCode2 = (hashCode + (userBean == null ? 0 : userBean.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int hashCode3 = (hashCode2 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        UserBean userBean2 = this.targetUser;
        int hashCode4 = (hashCode3 + (userBean2 == null ? 0 : userBean2.hashCode())) * 31;
        Long l = this.channelId;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangePositionParam(common=");
        LIZ.append(this.common);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(", targetUser=");
        LIZ.append(this.targetUser);
        LIZ.append(", channelId=");
        return JBR.LJ(LIZ, this.channelId, ')', LIZ);
    }

    public ChangePositionParam(LinkCommonBean linkCommonBean, UserBean userBean, MicPositionData micPositionData, UserBean userBean2, Long l) {
        this.common = linkCommonBean;
        this.operator = userBean;
        this.position = micPositionData;
        this.targetUser = userBean2;
        this.channelId = l;
    }

    public /* synthetic */ ChangePositionParam(LinkCommonBean linkCommonBean, UserBean userBean, MicPositionData micPositionData, UserBean userBean2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : userBean, (i & 4) != 0 ? null : micPositionData, (i & 8) != 0 ? null : userBean2, (i & 16) == 0 ? l : null);
    }
}
