package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ApplyRequestParam {

    @InterfaceC65349Pkn("applier")
    public UserBean applicant;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizApplyParams bizApplyParams;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("applier_pos")
    public MicPositionData position;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyRequestParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyRequestParam)) {
            return false;
        }
        ApplyRequestParam applyRequestParam = (ApplyRequestParam) obj;
        return o.LJ(this.common, applyRequestParam.common) && o.LJ(this.channelId, applyRequestParam.channelId) && o.LJ(this.applicant, applyRequestParam.applicant) && o.LJ(this.position, applyRequestParam.position) && o.LJ(this.bizApplyParams, applyRequestParam.bizApplyParams);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.applicant;
        int hashCode3 = (hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31;
        MicPositionData micPositionData = this.position;
        int hashCode4 = (hashCode3 + (micPositionData == null ? 0 : micPositionData.hashCode())) * 31;
        BizApplyParams bizApplyParams = this.bizApplyParams;
        return hashCode4 + (bizApplyParams != null ? bizApplyParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyRequestParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", applicant=");
        LIZ.append(this.applicant);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(", bizApplyParams=");
        LIZ.append(this.bizApplyParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ApplyRequestParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, MicPositionData micPositionData, BizApplyParams bizApplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.applicant = userBean;
        this.position = micPositionData;
        this.bizApplyParams = bizApplyParams;
    }

    public /* synthetic */ ApplyRequestParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, MicPositionData micPositionData, BizApplyParams bizApplyParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : userBean, (i & 8) != 0 ? null : micPositionData, (i & 16) == 0 ? bizApplyParams : null);
    }
}
