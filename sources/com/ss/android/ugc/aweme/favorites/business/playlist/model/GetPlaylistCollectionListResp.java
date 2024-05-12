package com.ss.android.ugc.aweme.favorites.business.playlist.model;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetPlaylistCollectionListResp extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("mix_info_list")
    public final List<MixInfo> mixInfoList;

    public GetPlaylistCollectionListResp() {
        this(null, 0, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPlaylistCollectionListResp) {
            return C78966Uyw.LJIIIZ(((GetPlaylistCollectionListResp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.mixInfoList, Integer.valueOf(this.cursor), Boolean.valueOf(this.hasMore)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("GetPlaylistCollectionListResp:%s,%s,%s", getObjects());
    }

    public GetPlaylistCollectionListResp(List<MixInfo> mixInfoList, int i, boolean z) {
        o.LJIIIZ(mixInfoList, "mixInfoList");
        this.mixInfoList = mixInfoList;
        this.cursor = i;
        this.hasMore = z;
    }

    public GetPlaylistCollectionListResp(List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C61878OQg.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
