package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelApplyParam {

    @InterfaceC65349Pkn("applier")
    public UserBean applicant;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizCancelApplyParams bizCancelApplyParams;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelApplyParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplyParam)) {
            return false;
        }
        CancelApplyParam cancelApplyParam = (CancelApplyParam) obj;
        return o.LJ(this.common, cancelApplyParam.common) && o.LJ(this.channelId, cancelApplyParam.channelId) && o.LJ(this.applicant, cancelApplyParam.applicant) && o.LJ(this.bizCancelApplyParams, cancelApplyParam.bizCancelApplyParams);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.applicant;
        int hashCode3 = (hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31;
        BizCancelApplyParams bizCancelApplyParams = this.bizCancelApplyParams;
        return hashCode3 + (bizCancelApplyParams != null ? bizCancelApplyParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelApplyParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", applicant=");
        LIZ.append(this.applicant);
        LIZ.append(", bizCancelApplyParams=");
        LIZ.append(this.bizCancelApplyParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CancelApplyParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, BizCancelApplyParams bizCancelApplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.applicant = userBean;
        this.bizCancelApplyParams = bizCancelApplyParams;
    }

    public /* synthetic */ CancelApplyParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, BizCancelApplyParams bizCancelApplyParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommonBean, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : userBean, (i & 8) != 0 ? null : bizCancelApplyParams);
    }
}
