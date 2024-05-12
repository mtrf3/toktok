package com.ss.android.ugc.aweme.feed.module;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FollowingInterestUsersResponse implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("first_vid")
    public final long firstVid;

    @InterfaceC65349Pkn("user_list")
    public final List<FollowingInterestUser> followingInterestUsers;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    @InterfaceC65349Pkn("video_num")
    public final int videoNum;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowingInterestUsersResponse() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r7 = 31
            r0 = r9
            r3 = r1
            r6 = r2
            r8 = r2
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse.<init>():void");
    }

    public final int getCode() {
        return this.code;
    }

    public final long getFirstVid() {
        return this.firstVid;
    }

    public final List<FollowingInterestUser> getFollowingInterestUsers() {
        return this.followingInterestUsers;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final int getVideoNum() {
        return this.videoNum;
    }

    public FollowingInterestUsersResponse(int i, List<FollowingInterestUser> list, int i2, long j, LogPbBean logPbBean) {
        this.code = i;
        this.followingInterestUsers = list;
        this.videoNum = i2;
        this.firstVid = j;
        this.logPbBean = logPbBean;
    }

    public /* synthetic */ FollowingInterestUsersResponse(int i, List list, int i2, long j, LogPbBean logPbBean, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? new ArrayList() : list, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? null : logPbBean);
    }
}
