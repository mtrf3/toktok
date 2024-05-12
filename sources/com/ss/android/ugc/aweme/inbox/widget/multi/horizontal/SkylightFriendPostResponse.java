package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightFriendPostResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("viewed_list")
    public final List<FriendPostBean> allReadUserBlock;

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("unview_list")
    public final List<FriendPostBean> unReadBlock;

    /* JADX WARN: Multi-variable type inference failed */
    public SkylightFriendPostResponse() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkylightFriendPostResponse copy$default(SkylightFriendPostResponse skylightFriendPostResponse, Integer num, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = skylightFriendPostResponse.cursor;
        }
        if ((i & 2) != 0) {
            z = skylightFriendPostResponse.hasMore;
        }
        if ((i & 4) != 0) {
            list = skylightFriendPostResponse.unReadBlock;
        }
        if ((i & 8) != 0) {
            list2 = skylightFriendPostResponse.allReadUserBlock;
        }
        return skylightFriendPostResponse.copy(num, z, list, list2);
    }

    public final SkylightFriendPostResponse copy(Integer num, boolean z, List<FriendPostBean> list, List<FriendPostBean> list2) {
        return new SkylightFriendPostResponse(num, z, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightFriendPostResponse)) {
            return false;
        }
        SkylightFriendPostResponse skylightFriendPostResponse = (SkylightFriendPostResponse) obj;
        return o.LJ(this.cursor, skylightFriendPostResponse.cursor) && this.hasMore == skylightFriendPostResponse.hasMore && o.LJ(this.unReadBlock, skylightFriendPostResponse.unReadBlock) && o.LJ(this.allReadUserBlock, skylightFriendPostResponse.allReadUserBlock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.cursor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        List<FriendPostBean> list = this.unReadBlock;
        int hashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        List<FriendPostBean> list2 = this.allReadUserBlock;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightFriendPostResponse(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", unReadBlock=");
        LIZ.append(this.unReadBlock);
        LIZ.append(", allReadUserBlock=");
        return C1NE.LIZIZ(LIZ, this.allReadUserBlock, ')', LIZ);
    }

    public final List<FriendPostBean> getAllReadUserBlock() {
        return this.allReadUserBlock;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<FriendPostBean> getUnReadBlock() {
        return this.unReadBlock;
    }

    public SkylightFriendPostResponse(Integer num, boolean z, List<FriendPostBean> list, List<FriendPostBean> list2) {
        this.cursor = num;
        this.hasMore = z;
        this.unReadBlock = list;
        this.allReadUserBlock = list2;
    }

    public /* synthetic */ SkylightFriendPostResponse(Integer num, boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
