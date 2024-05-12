package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowPageData {

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("follow_request")
    public final FollowRequestData followRequest;
    public long lastReadTime;

    @InterfaceC65349Pkn("notice")
    public final MusNotice notice;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowPageData() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r8 = 31
            r0 = r10
            r3 = r2
            r6 = r4
            r9 = r2
            r0.<init>(r1, r2, r3, r4, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData.<init>():void");
    }

    public static /* synthetic */ FollowPageData copy$default(FollowPageData followPageData, int i, MusNotice musNotice, FollowRequestData followRequestData, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followPageData.type;
        }
        if ((i2 & 2) != 0) {
            musNotice = followPageData.notice;
        }
        if ((i2 & 4) != 0) {
            followRequestData = followPageData.followRequest;
        }
        if ((i2 & 8) != 0) {
            j = followPageData.createTime;
        }
        if ((i2 & 16) != 0) {
            j2 = followPageData.lastReadTime;
        }
        return followPageData.copy(i, musNotice, followRequestData, j, j2);
    }

    public final FollowPageData copy(int i, MusNotice musNotice, FollowRequestData followRequestData, long j, long j2) {
        return new FollowPageData(i, musNotice, followRequestData, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageData)) {
            return false;
        }
        FollowPageData followPageData = (FollowPageData) obj;
        return this.type == followPageData.type && o.LJ(this.notice, followPageData.notice) && o.LJ(this.followRequest, followPageData.followRequest) && this.createTime == followPageData.createTime && this.lastReadTime == followPageData.lastReadTime;
    }

    public int hashCode() {
        int hashCode;
        int i = this.type * 31;
        MusNotice musNotice = this.notice;
        int i2 = 0;
        if (musNotice == null) {
            hashCode = 0;
        } else {
            hashCode = musNotice.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        FollowRequestData followRequestData = this.followRequest;
        if (followRequestData != null) {
            i2 = followRequestData.hashCode();
        }
        return C16880lQ.LLJIJIL(this.lastReadTime) + JBR.LIZJ(this.createTime, (i3 + i2) * 31, 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowPageData(type=");
        LIZ.append(this.type);
        LIZ.append(", notice=");
        LIZ.append(this.notice);
        LIZ.append(", followRequest=");
        LIZ.append(this.followRequest);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", lastReadTime=");
        return C47135Ieh.LIZIZ(LIZ, this.lastReadTime, ')', LIZ);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final FollowRequestData getFollowRequest() {
        return this.followRequest;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final MusNotice getNotice() {
        return this.notice;
    }

    public final int getType() {
        return this.type;
    }

    public final void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public FollowPageData(int i, MusNotice musNotice, FollowRequestData followRequestData, long j, long j2) {
        this.type = i;
        this.notice = musNotice;
        this.followRequest = followRequestData;
        this.createTime = j;
        this.lastReadTime = j2;
    }

    public /* synthetic */ FollowPageData(int i, MusNotice musNotice, FollowRequestData followRequestData, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : musNotice, (i2 & 4) == 0 ? followRequestData : null, (i2 & 8) != 0 ? 0L : j, (i2 & 16) == 0 ? j2 : 0L);
    }
}
