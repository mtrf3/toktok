package com.ss.android.ugc.aweme.comment.likelist.model;

import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("is_show_limit")
    public final boolean isShowLimit;

    @InterfaceC65349Pkn("like_list")
    public final List<User> likeList;

    @InterfaceC65349Pkn("offset")
    public final long offset;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LikeListResponse() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 31
            r0 = r10
            r4 = r2
            r7 = r1
            r9 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LikeListResponse copy$default(LikeListResponse likeListResponse, boolean z, long j, long j2, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = likeListResponse.hasMore;
        }
        if ((i & 2) != 0) {
            j = likeListResponse.cursor;
        }
        if ((i & 4) != 0) {
            j2 = likeListResponse.offset;
        }
        if ((i & 8) != 0) {
            list = likeListResponse.likeList;
        }
        if ((i & 16) != 0) {
            z2 = likeListResponse.isShowLimit;
        }
        return likeListResponse.copy(z, j, j2, list, z2);
    }

    public final LikeListResponse copy(boolean z, long j, long j2, List<User> list, boolean z2) {
        return new LikeListResponse(z, j, j2, list, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeListResponse)) {
            return false;
        }
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        return this.hasMore == likeListResponse.hasMore && this.cursor == likeListResponse.cursor && this.offset == likeListResponse.offset && o.LJ(this.likeList, likeListResponse.likeList) && this.isShowLimit == likeListResponse.isShowLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        int hashCode;
        boolean z = this.hasMore;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.offset, JBR.LIZJ(this.cursor, r0 * 31, 31), 31);
        List<User> list = this.likeList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        if (!this.isShowLimit) {
            i = 0;
        }
        return i2 + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeListResponse{likeList:");
        List<User> list = this.likeList;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", hasMore:");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor:");
        return C47135Ieh.LIZIZ(LIZ, this.cursor, '}', LIZ);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final boolean isShowLimit() {
        return this.isShowLimit;
    }

    public LikeListResponse(boolean z, long j, long j2, List<User> list, boolean z2) {
        this.hasMore = z;
        this.cursor = j;
        this.offset = j2;
        this.likeList = list;
        this.isShowLimit = z2;
    }

    public /* synthetic */ LikeListResponse(boolean z, long j, long j2, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z2);
    }
}
