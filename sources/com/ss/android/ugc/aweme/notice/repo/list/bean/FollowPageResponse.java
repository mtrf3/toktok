package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowPageResponse extends BaseResponse {

    @InterfaceC65349Pkn("follow_page_list")
    public final List<FollowPageData> data;

    @InterfaceC65349Pkn("follow_req_offset")
    public final long followReqOffset;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("noticeLastReadTime")
    public final long noticeLastReadTime;

    @InterfaceC65349Pkn("notice_max_time")
    public final long noticeMaxTime;

    @InterfaceC65349Pkn("notice_min_time")
    public final long noticeMinTime;

    @InterfaceC65349Pkn("total")
    public final int total;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowPageResponse() {
        /*
            r14 = this;
            r1 = 0
            r3 = 0
            r11 = 0
            r12 = 127(0x7f, float:1.78E-43)
            r0 = r14
            r2 = r1
            r5 = r3
            r7 = r3
            r9 = r3
            r13 = r11
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowPageResponse copy$default(FollowPageResponse followPageResponse, int i, boolean z, long j, long j2, long j3, long j4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followPageResponse.total;
        }
        if ((i2 & 2) != 0) {
            z = followPageResponse.hasMore;
        }
        if ((i2 & 4) != 0) {
            j = followPageResponse.followReqOffset;
        }
        if ((i2 & 8) != 0) {
            j2 = followPageResponse.noticeMaxTime;
        }
        if ((i2 & 16) != 0) {
            j3 = followPageResponse.noticeMinTime;
        }
        if ((i2 & 32) != 0) {
            j4 = followPageResponse.noticeLastReadTime;
        }
        if ((i2 & 64) != 0) {
            list = followPageResponse.data;
        }
        return followPageResponse.copy(i, z, j, j2, j3, j4, list);
    }

    public final FollowPageResponse copy(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list) {
        return new FollowPageResponse(i, z, j, j2, j3, j4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageResponse)) {
            return false;
        }
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        return this.total == followPageResponse.total && this.hasMore == followPageResponse.hasMore && this.followReqOffset == followPageResponse.followReqOffset && this.noticeMaxTime == followPageResponse.noticeMaxTime && this.noticeMinTime == followPageResponse.noticeMinTime && this.noticeLastReadTime == followPageResponse.noticeLastReadTime && o.LJ(this.data, followPageResponse.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int i = this.total * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZJ = JBR.LIZJ(this.noticeLastReadTime, JBR.LIZJ(this.noticeMinTime, JBR.LIZJ(this.noticeMaxTime, JBR.LIZJ(this.followReqOffset, (i + i2) * 31, 31), 31), 31), 31);
        List<FollowPageData> list = this.data;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZJ + hashCode;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowPageResponse(total=");
        LIZ.append(this.total);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", followReqOffset=");
        LIZ.append(this.followReqOffset);
        LIZ.append(", noticeMaxTime=");
        LIZ.append(this.noticeMaxTime);
        LIZ.append(", noticeMinTime=");
        LIZ.append(this.noticeMinTime);
        LIZ.append(", noticeLastReadTime=");
        LIZ.append(this.noticeLastReadTime);
        LIZ.append(", data=");
        return C1NE.LIZIZ(LIZ, this.data, ')', LIZ);
    }

    public final List<FollowPageData> getData() {
        return this.data;
    }

    public final long getFollowReqOffset() {
        return this.followReqOffset;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNoticeLastReadTime() {
        return this.noticeLastReadTime;
    }

    public final long getNoticeMaxTime() {
        return this.noticeMaxTime;
    }

    public final long getNoticeMinTime() {
        return this.noticeMinTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public FollowPageResponse(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list) {
        this.total = i;
        this.hasMore = z;
        this.followReqOffset = j;
        this.noticeMaxTime = j2;
        this.noticeMinTime = j3;
        this.noticeLastReadTime = j4;
        this.data = list;
    }

    public /* synthetic */ FollowPageResponse(int i, boolean z, long j, long j2, long j3, long j4, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) == 0 ? z : false, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) == 0 ? j4 : 0L, (i2 & 64) != 0 ? null : list);
    }
}
