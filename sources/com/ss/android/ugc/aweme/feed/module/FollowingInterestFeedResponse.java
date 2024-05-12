package com.ss.android.ugc.aweme.feed.module;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingInterestFeedResponse implements Serializable {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("next_cursor")
    public final int nextCursor;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowingInterestFeedResponse() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r1
            r5 = r1
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.module.FollowingInterestFeedResponse.<init>():void");
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public FollowingInterestFeedResponse(int i, String msg, List<Aweme> awemeList, int i2, boolean z) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(awemeList, "awemeList");
        this.code = i;
        this.msg = msg;
        this.awemeList = awemeList;
        this.nextCursor = i2;
        this.hasMore = z;
    }

    public /* synthetic */ FollowingInterestFeedResponse(int i, String str, List list, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? true : z);
    }
}
