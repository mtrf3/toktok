package com.ss.android.ugc.aweme.profile.viewer.api;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileViewerResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("is_authorized")
    public final boolean isAuthorized;

    @InterfaceC65349Pkn("next_cursor")
    public final String nextCursor;

    @InterfaceC65349Pkn("unread_count")
    public final int unreadCount;

    @InterfaceC65349Pkn("viewer_list")
    public final List<ProfileViewerInfo> viewerList;

    public ProfileViewerResponse() {
        this(0, null, false, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileViewerResponse copy$default(ProfileViewerResponse profileViewerResponse, int i, String str, boolean z, boolean z2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = profileViewerResponse.unreadCount;
        }
        if ((i2 & 2) != 0) {
            str = profileViewerResponse.nextCursor;
        }
        if ((i2 & 4) != 0) {
            z = profileViewerResponse.hasMore;
        }
        if ((i2 & 8) != 0) {
            z2 = profileViewerResponse.isAuthorized;
        }
        if ((i2 & 16) != 0) {
            list = profileViewerResponse.viewerList;
        }
        return profileViewerResponse.copy(i, str, z, z2, list);
    }

    public final ProfileViewerResponse copy(int i, String nextCursor, boolean z, boolean z2, List<ProfileViewerInfo> viewerList) {
        o.LJIIIZ(nextCursor, "nextCursor");
        o.LJIIIZ(viewerList, "viewerList");
        return new ProfileViewerResponse(i, nextCursor, z, z2, viewerList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileViewerResponse) {
            return C78966Uyw.LJIIIZ(((ProfileViewerResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.unreadCount), this.nextCursor, Boolean.valueOf(this.hasMore), Boolean.valueOf(this.isAuthorized), this.viewerList};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("ProfileViewerResponse:%s,%s,%s,%s,%s", getObjects());
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final List<ProfileViewerInfo> getViewerList() {
        return this.viewerList;
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public ProfileViewerResponse(int i, String nextCursor, boolean z, boolean z2, List<ProfileViewerInfo> viewerList) {
        o.LJIIIZ(nextCursor, "nextCursor");
        o.LJIIIZ(viewerList, "viewerList");
        this.unreadCount = i;
        this.nextCursor = nextCursor;
        this.hasMore = z;
        this.isAuthorized = z2;
        this.viewerList = viewerList;
    }

    public ProfileViewerResponse(int i, String str, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) == 0 ? z2 : false, (i2 & 16) != 0 ? C61878OQg.INSTANCE : list);
    }
}
