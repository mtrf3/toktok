package com.ss.android.ugc.aweme.video.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SubOnlyVideoResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("total")
    public int total;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubOnlyVideoResponse() {
        /*
            r10 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r8 = 31
            r0 = r10
            r3 = r1
            r6 = r5
            r9 = r7
            r0.<init>(r1, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.model.SubOnlyVideoResponse.<init>():void");
    }

    public SubOnlyVideoResponse(long j, long j2, int i, int i2, List<? extends Aweme> list) {
        this.minTime = j;
        this.maxTime = j2;
        this.hasMore = i;
        this.total = i2;
        this.awemeList = list;
    }

    public /* synthetic */ SubOnlyVideoResponse(long j, long j2, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) == 0 ? j2 : 0L, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : list);
    }
}
