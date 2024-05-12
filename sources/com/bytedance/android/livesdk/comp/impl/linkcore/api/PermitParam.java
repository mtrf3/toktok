package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitParam {

    @InterfaceC65349Pkn("applier")
    public UserBean applicant;

    @InterfaceC65349Pkn("permiter")
    public UserBean approver;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizPermitParams bizPermitParams;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("dsl")
    public DSLConfig dsl;

    @InterfaceC65349Pkn("operator")
    public UserBean operator;

    @InterfaceC65349Pkn("reply_status")
    public int permitStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public PermitParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitParam)) {
            return false;
        }
        PermitParam permitParam = (PermitParam) obj;
        return o.LJ(this.common, permitParam.common) && o.LJ(this.channelId, permitParam.channelId) && o.LJ(this.approver, permitParam.approver) && o.LJ(this.applicant, permitParam.applicant) && o.LJ(this.operator, permitParam.operator) && this.permitStatus == permitParam.permitStatus && o.LJ(this.dsl, permitParam.dsl) && o.LJ(this.bizPermitParams, permitParam.bizPermitParams);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.approver;
        int hashCode3 = (hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31;
        UserBean userBean2 = this.applicant;
        int hashCode4 = (hashCode3 + (userBean2 == null ? 0 : userBean2.hashCode())) * 31;
        UserBean userBean3 = this.operator;
        int hashCode5 = (((hashCode4 + (userBean3 == null ? 0 : userBean3.hashCode())) * 31) + this.permitStatus) * 31;
        DSLConfig dSLConfig = this.dsl;
        int hashCode6 = (hashCode5 + (dSLConfig == null ? 0 : dSLConfig.hashCode())) * 31;
        BizPermitParams bizPermitParams = this.bizPermitParams;
        return hashCode6 + (bizPermitParams != null ? bizPermitParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", approver=");
        LIZ.append(this.approver);
        LIZ.append(", applicant=");
        LIZ.append(this.applicant);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(", permitStatus=");
        LIZ.append(this.permitStatus);
        LIZ.append(", dsl=");
        LIZ.append(this.dsl);
        LIZ.append(", bizPermitParams=");
        LIZ.append(this.bizPermitParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PermitParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, DSLConfig dSLConfig, BizPermitParams bizPermitParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.approver = userBean;
        this.applicant = userBean2;
        this.operator = userBean3;
        this.permitStatus = i;
        this.dsl = dSLConfig;
        this.bizPermitParams = bizPermitParams;
    }

    public /* synthetic */ PermitParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, DSLConfig dSLConfig, BizPermitParams bizPermitParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : linkCommonBean, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : userBean, (i2 & 8) != 0 ? null : userBean2, (i2 & 16) != 0 ? null : userBean3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : dSLConfig, (i2 & 128) == 0 ? bizPermitParams : null);
    }
}
