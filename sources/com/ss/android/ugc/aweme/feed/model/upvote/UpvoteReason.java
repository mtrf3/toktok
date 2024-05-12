package com.ss.android.ugc.aweme.feed.model.upvote;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UpvoteReason implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("middle_count")
    public Integer middleCount;

    @InterfaceC65349Pkn("middle_info")
    public long[] middleInfo;

    @InterfaceC65349Pkn("reason_type")
    public Integer reasonType;

    @InterfaceC65349Pkn("sub_type")
    public Integer subType;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    public UpvoteReason() {
    }

    public static /* synthetic */ UpvoteReason copy$default(UpvoteReason upvoteReason, Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = upvoteReason.reasonType;
        }
        if ((i & 2) != 0) {
            num2 = upvoteReason.subType;
        }
        if ((i & 4) != 0) {
            jArr = upvoteReason.middleInfo;
        }
        if ((i & 8) != 0) {
            num3 = upvoteReason.middleCount;
        }
        if ((i & 16) != 0) {
            str = upvoteReason.userId;
        }
        if ((i & 32) != 0) {
            str2 = upvoteReason.itemId;
        }
        return upvoteReason.copy(num, num2, jArr, num3, str, str2);
    }

    public final UpvoteReason copy(Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2) {
        return new UpvoteReason(num, num2, jArr, num3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteReason)) {
            return false;
        }
        UpvoteReason upvoteReason = (UpvoteReason) obj;
        return o.LJ(this.reasonType, upvoteReason.reasonType) && o.LJ(this.subType, upvoteReason.subType) && o.LJ(this.middleInfo, upvoteReason.middleInfo) && o.LJ(this.middleCount, upvoteReason.middleCount) && o.LJ(this.userId, upvoteReason.userId) && o.LJ(this.itemId, upvoteReason.itemId);
    }

    public int hashCode() {
        Integer num = this.reasonType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.subType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        long[] jArr = this.middleInfo;
        int hashCode3 = (hashCode2 + (jArr == null ? 0 : Arrays.hashCode(jArr))) * 31;
        Integer num3 = this.middleCount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.userId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteReason(reasonType=");
        LIZ.append(this.reasonType);
        LIZ.append(", subType=");
        LIZ.append(this.subType);
        LIZ.append(", middleInfo=");
        LIZ.append(Arrays.toString(this.middleInfo));
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

    public final long[] getMiddleInfo() {
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

    public UpvoteReason(Integer num, Integer num2, long[] jArr, Integer num3, String str, String str2) {
        this.reasonType = num;
        this.subType = num2;
        this.middleInfo = jArr;
        this.middleCount = num3;
        this.userId = str;
        this.itemId = str2;
    }
}
