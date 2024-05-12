package com.ss.android.ugc.aweme.comment.viewerlist.model;

import X.C16880lQ;
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
public final class ViewerListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("is_auth")
    public final boolean isAuth;

    @InterfaceC65349Pkn("offset")
    public final long offset;

    @InterfaceC65349Pkn("show_entrance")
    public final boolean showEntrance;

    @InterfaceC65349Pkn("total_count")
    public final long totalCount;

    @InterfaceC65349Pkn("viewer_list")
    public final List<User> viewerList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewerListResponse() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r11 = 127(0x7f, float:1.78E-43)
            r0 = r13
            r4 = r2
            r7 = r1
            r8 = r1
            r9 = r2
            r12 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewerListResponse copy$default(ViewerListResponse viewerListResponse, boolean z, long j, long j2, List list, boolean z2, boolean z3, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = viewerListResponse.hasMore;
        }
        if ((i & 2) != 0) {
            j = viewerListResponse.cursor;
        }
        if ((i & 4) != 0) {
            j2 = viewerListResponse.offset;
        }
        if ((i & 8) != 0) {
            list = viewerListResponse.viewerList;
        }
        if ((i & 16) != 0) {
            z2 = viewerListResponse.showEntrance;
        }
        if ((i & 32) != 0) {
            z3 = viewerListResponse.isAuth;
        }
        if ((i & 64) != 0) {
            j3 = viewerListResponse.totalCount;
        }
        return viewerListResponse.copy(z, j, j2, list, z2, z3, j3);
    }

    public final ViewerListResponse copy(boolean z, long j, long j2, List<User> list, boolean z2, boolean z3, long j3) {
        return new ViewerListResponse(z, j, j2, list, z2, z3, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewerListResponse)) {
            return false;
        }
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        return this.hasMore == viewerListResponse.hasMore && this.cursor == viewerListResponse.cursor && this.offset == viewerListResponse.offset && o.LJ(this.viewerList, viewerListResponse.viewerList) && this.showEntrance == viewerListResponse.showEntrance && this.isAuth == viewerListResponse.isAuth && this.totalCount == viewerListResponse.totalCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z = this.hasMore;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.offset, JBR.LIZJ(this.cursor, r0 * 31, 31), 31);
        List<User> list = this.viewerList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        ?? r02 = this.showEntrance;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        if (!this.isAuth) {
            i = 0;
        }
        return C16880lQ.LLJIJIL(this.totalCount) + ((i4 + i) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewerListResponse(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", offset=");
        LIZ.append(this.offset);
        LIZ.append(", viewerList=");
        LIZ.append(this.viewerList);
        LIZ.append(", showEntrance=");
        LIZ.append(this.showEntrance);
        LIZ.append(", isAuth=");
        LIZ.append(this.isAuth);
        LIZ.append(", totalCount=");
        return C47135Ieh.LIZIZ(LIZ, this.totalCount, ')', LIZ);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final boolean getShowEntrance() {
        return this.showEntrance;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final List<User> getViewerList() {
        return this.viewerList;
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public ViewerListResponse(boolean z, long j, long j2, List<User> list, boolean z2, boolean z3, long j3) {
        this.hasMore = z;
        this.cursor = j;
        this.offset = j2;
        this.viewerList = list;
        this.showEntrance = z2;
        this.isAuth = z3;
        this.totalCount = j3;
    }

    public /* synthetic */ ViewerListResponse(boolean z, long j, long j2, List list, boolean z2, boolean z3, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false, (i & 64) == 0 ? j3 : 0L);
    }
}
