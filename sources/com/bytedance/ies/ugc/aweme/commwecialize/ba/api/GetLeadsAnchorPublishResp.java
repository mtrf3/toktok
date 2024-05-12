package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GetLeadsAnchorPublishResp {

    @InterfaceC65349Pkn("anchor_status")
    public final Integer anchor_status;

    @InterfaceC65349Pkn("page_id")
    public final String pageId;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLeadsAnchorPublishResp)) {
            return false;
        }
        GetLeadsAnchorPublishResp getLeadsAnchorPublishResp = (GetLeadsAnchorPublishResp) obj;
        return this.statusCode == getLeadsAnchorPublishResp.statusCode && o.LJ(this.statusMsg, getLeadsAnchorPublishResp.statusMsg) && o.LJ(this.anchor_status, getLeadsAnchorPublishResp.anchor_status) && o.LJ(this.pageId, getLeadsAnchorPublishResp.pageId);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.anchor_status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.pageId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetLeadsAnchorPublishResp(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", anchor_status=");
        LIZ.append(this.anchor_status);
        LIZ.append(", pageId=");
        return q.LIZIZ(LIZ, this.pageId, ')', LIZ);
    }

    public GetLeadsAnchorPublishResp(int i, String str, Integer num, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.anchor_status = num;
        this.pageId = str2;
    }
}
