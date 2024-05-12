package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizInviteParams;

/* loaded from: classes14.dex */
public final class InviteParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("config")
    public InitConfig config;

    @InterfaceC65349Pkn("dsl")
    public DSLConfig dsl;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizInviteParams extra;

    @InterfaceC65349Pkn("invitee")
    public UserBean invitee;

    @InterfaceC65349Pkn("invitor")
    public UserBean inviter;

    @InterfaceC65349Pkn("operator")
    public UserBean operator;

    @InterfaceC65349Pkn("invitee_pos")
    public MicPositionData position;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteParam)) {
            return false;
        }
        InviteParam inviteParam = (InviteParam) obj;
        return o.LJ(this.common, inviteParam.common) && o.LJ(this.channelId, inviteParam.channelId) && o.LJ(this.inviter, inviteParam.inviter) && o.LJ(this.invitee, inviteParam.invitee) && o.LJ(this.operator, inviteParam.operator) && o.LJ(this.position, inviteParam.position) && o.LJ(this.config, inviteParam.config) && o.LJ(this.dsl, inviteParam.dsl) && o.LJ(this.extra, inviteParam.extra);
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
        int hashCode5 = (hashCode4 + (userBean3 == null ? 0 : userBean3.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int hashCode6 = (hashCode5 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        InitConfig initConfig = this.config;
        int hashCode7 = (hashCode6 + (initConfig == null ? 0 : initConfig.hashCode())) * 31;
        DSLConfig dSLConfig = this.dsl;
        int hashCode8 = (hashCode7 + (dSLConfig == null ? 0 : dSLConfig.hashCode())) * 31;
        BizInviteParams bizInviteParams = this.extra;
        return hashCode8 + (bizInviteParams != null ? bizInviteParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", inviter=");
        LIZ.append(this.inviter);
        LIZ.append(", invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(", config=");
        LIZ.append(this.config);
        LIZ.append(", dsl=");
        LIZ.append(this.dsl);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, MicPositionData micPositionData, InitConfig initConfig, DSLConfig dSLConfig, BizInviteParams bizInviteParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.inviter = userBean;
        this.invitee = userBean2;
        this.operator = userBean3;
        this.position = micPositionData;
        this.config = initConfig;
        this.dsl = dSLConfig;
        this.extra = bizInviteParams;
    }

    public /* synthetic */ InviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, MicPositionData micPositionData, InitConfig initConfig, DSLConfig dSLConfig, BizInviteParams bizInviteParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : userBean, (i & 8) != 0 ? null : userBean2, (i & 16) != 0 ? null : userBean3, (i & 32) != 0 ? null : micPositionData, (i & 64) != 0 ? null : initConfig, (i & 128) != 0 ? null : dSLConfig, (i & 256) == 0 ? bizInviteParams : null);
    }
}
