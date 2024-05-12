package com.ss.android.ugc.aweme.compliance.business.hideaccount;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class HiddenAccountsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("hide_items")
    public final List<HiddenItem> hiddenItems;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenAccountsResponse() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HiddenAccountsResponse copy$default(HiddenAccountsResponse hiddenAccountsResponse, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hiddenAccountsResponse.hasMore;
        }
        if ((i & 2) != 0) {
            list = hiddenAccountsResponse.hiddenItems;
        }
        if ((i & 4) != 0) {
            str = hiddenAccountsResponse.nextPageToken;
        }
        return hiddenAccountsResponse.copy(z, list, str);
    }

    public final HiddenAccountsResponse copy(boolean z, List<HiddenItem> list, String nextPageToken) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        return new HiddenAccountsResponse(z, list, nextPageToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenAccountsResponse)) {
            return false;
        }
        HiddenAccountsResponse hiddenAccountsResponse = (HiddenAccountsResponse) obj;
        return this.hasMore == hiddenAccountsResponse.hasMore && o.LJ(this.hiddenItems, hiddenAccountsResponse.hiddenItems) && o.LJ(this.nextPageToken, hiddenAccountsResponse.nextPageToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.hasMore;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<HiddenItem> list = this.hiddenItems;
        return this.nextPageToken.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HiddenAccountsResponse(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", hiddenItems=");
        LIZ.append(this.hiddenItems);
        LIZ.append(", nextPageToken=");
        return q.LIZIZ(LIZ, this.nextPageToken, ')', LIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<HiddenItem> getHiddenItems() {
        return this.hiddenItems;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public HiddenAccountsResponse(boolean z, List<HiddenItem> list, String nextPageToken) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        this.hasMore = z;
        this.hiddenItems = list;
        this.nextPageToken = nextPageToken;
    }

    public /* synthetic */ HiddenAccountsResponse(boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str);
    }
}
