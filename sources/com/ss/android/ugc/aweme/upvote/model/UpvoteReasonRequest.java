package com.ss.android.ugc.aweme.upvote.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UpvoteReasonRequest implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("middle_count")
    public final Integer middleCount;

    @InterfaceC65349Pkn("middle_info")
    public final List<String> middleInfo;

    @InterfaceC65349Pkn("reason_type")
    public final Integer reasonType;

    @InterfaceC65349Pkn("sub_type")
    public final Integer subType;

    @InterfaceC65349Pkn("user_id")
    public final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpvoteReasonRequest copy$default(UpvoteReasonRequest upvoteReasonRequest, Integer num, Integer num2, List list, Integer num3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = upvoteReasonRequest.reasonType;
        }
        if ((i & 2) != 0) {
            num2 = upvoteReasonRequest.subType;
        }
        if ((i & 4) != 0) {
            list = upvoteReasonRequest.middleInfo;
        }
        if ((i & 8) != 0) {
            num3 = upvoteReasonRequest.middleCount;
        }
        if ((i & 16) != 0) {
            str = upvoteReasonRequest.userId;
        }
        if ((i & 32) != 0) {
            str2 = upvoteReasonRequest.itemId;
        }
        return upvoteReasonRequest.copy(num, num2, list, num3, str, str2);
    }

    public final UpvoteReasonRequest copy(Integer num, Integer num2, List<String> list, Integer num3, String str, String str2) {
        return new UpvoteReasonRequest(num, num2, list, num3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteReasonRequest)) {
            return false;
        }
        UpvoteReasonRequest upvoteReasonRequest = (UpvoteReasonRequest) obj;
        return o.LJ(this.reasonType, upvoteReasonRequest.reasonType) && o.LJ(this.subType, upvoteReasonRequest.subType) && o.LJ(this.middleInfo, upvoteReasonRequest.middleInfo) && o.LJ(this.middleCount, upvoteReasonRequest.middleCount) && o.LJ(this.userId, upvoteReasonRequest.userId) && o.LJ(this.itemId, upvoteReasonRequest.itemId);
    }

    public int hashCode() {
        Integer num = this.reasonType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.subType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.middleInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.middleCount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.userId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteReasonRequest(reasonType=");
        LIZ.append(this.reasonType);
        LIZ.append(", subType=");
        LIZ.append(this.subType);
        LIZ.append(", middleInfo=");
        LIZ.append(this.middleInfo);
        LIZ.append(", middleCount=");
        LIZ.append(this.middleCount);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", itemId=");
        return q.LIZIZ(LIZ, this.itemId, ')', LIZ);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getMiddleCount() {
        return this.middleCount;
    }

    public final List<String> getMiddleInfo() {
        return this.middleInfo;
    }

    public final Integer getReasonType() {
        return this.reasonType;
    }

    public final Integer getSubType() {
        return this.subType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public UpvoteReasonRequest(Integer num, Integer num2, List<String> list, Integer num3, String str, String str2) {
        this.reasonType = num;
        this.subType = num2;
        this.middleInfo = list;
        this.middleCount = num3;
        this.userId = str;
        this.itemId = str2;
    }
}
