package com.ss.android.ugc.tiktok.addyours.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddYoursNoticeVideosResp extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("videos")
    public final List<Aweme> videos;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursNoticeVideosResp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursNoticeVideosResp)) {
            return false;
        }
        AddYoursNoticeVideosResp addYoursNoticeVideosResp = (AddYoursNoticeVideosResp) obj;
        return o.LJ(this.videos, addYoursNoticeVideosResp.videos) && o.LJ(this.hasMore, addYoursNoticeVideosResp.hasMore) && o.LJ(this.cursor, addYoursNoticeVideosResp.cursor);
    }

    public final int hashCode() {
        List<Aweme> list = this.videos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.cursor;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursNoticeVideosResp(videos=");
        LIZ.append(this.videos);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        return s0.LIZJ(LIZ, this.cursor, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursNoticeVideosResp(List<? extends Aweme> list, Boolean bool, Integer num) {
        this.videos = list;
        this.hasMore = bool;
        this.cursor = num;
    }

    public /* synthetic */ AddYoursNoticeVideosResp(List list, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num);
    }
}
