package com.ss.android.ugc.aweme.models;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserPublishInfo implements Serializable {

    @InterfaceC65349Pkn("display_image")
    public final UrlModel displayImage;

    @InterfaceC65349Pkn("first_created_at_sec")
    public final long firstCreatedAtSec;

    @InterfaceC65349Pkn("has_created_today")
    public final boolean hasCreatedToday;

    @InterfaceC65349Pkn("has_post")
    public final boolean hasPost;

    @InterfaceC65349Pkn("next_push_at_sec")
    public final long nextPushAtSec;

    @InterfaceC65349Pkn("today_aids")
    public final List<String> todayAids;

    @InterfaceC65349Pkn("valid_aids")
    public final List<String> validAids;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserPublishInfo copy$default(UserPublishInfo userPublishInfo, boolean z, long j, boolean z2, UrlModel urlModel, long j2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userPublishInfo.hasCreatedToday;
        }
        if ((i & 2) != 0) {
            j = userPublishInfo.firstCreatedAtSec;
        }
        if ((i & 4) != 0) {
            z2 = userPublishInfo.hasPost;
        }
        if ((i & 8) != 0) {
            urlModel = userPublishInfo.displayImage;
        }
        if ((i & 16) != 0) {
            j2 = userPublishInfo.nextPushAtSec;
        }
        if ((i & 32) != 0) {
            list = userPublishInfo.validAids;
        }
        if ((i & 64) != 0) {
            list2 = userPublishInfo.todayAids;
        }
        return userPublishInfo.copy(z, j, z2, urlModel, j2, list, list2);
    }

    public final UserPublishInfo copy(boolean z, long j, boolean z2, UrlModel urlModel, long j2, List<String> list, List<String> list2) {
        return new UserPublishInfo(z, j, z2, urlModel, j2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPublishInfo)) {
            return false;
        }
        UserPublishInfo userPublishInfo = (UserPublishInfo) obj;
        return this.hasCreatedToday == userPublishInfo.hasCreatedToday && this.firstCreatedAtSec == userPublishInfo.firstCreatedAtSec && this.hasPost == userPublishInfo.hasPost && o.LJ(this.displayImage, userPublishInfo.displayImage) && this.nextPushAtSec == userPublishInfo.nextPushAtSec && o.LJ(this.validAids, userPublishInfo.validAids) && o.LJ(this.todayAids, userPublishInfo.todayAids);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.hasCreatedToday;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.firstCreatedAtSec, r0 * 31, 31);
        if (!this.hasPost) {
            i = 0;
        }
        int i2 = (LIZJ + i) * 31;
        UrlModel urlModel = this.displayImage;
        int i3 = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.nextPushAtSec, (i2 + hashCode) * 31, 31);
        List<String> list = this.validAids;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i4 = (LIZJ2 + hashCode2) * 31;
        List<String> list2 = this.todayAids;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserPublishInfo(hasCreatedToday=");
        LIZ.append(this.hasCreatedToday);
        LIZ.append(", firstCreatedAtSec=");
        LIZ.append(this.firstCreatedAtSec);
        LIZ.append(", hasPost=");
        LIZ.append(this.hasPost);
        LIZ.append(", displayImage=");
        LIZ.append(this.displayImage);
        LIZ.append(", nextPushAtSec=");
        LIZ.append(this.nextPushAtSec);
        LIZ.append(", validAids=");
        LIZ.append(this.validAids);
        LIZ.append(", todayAids=");
        return C1NE.LIZIZ(LIZ, this.todayAids, ')', LIZ);
    }

    public final UrlModel getDisplayImage() {
        return this.displayImage;
    }

    public final long getFirstCreatedAtSec() {
        return this.firstCreatedAtSec;
    }

    public final boolean getHasCreatedToday() {
        return this.hasCreatedToday;
    }

    public final boolean getHasPost() {
        return this.hasPost;
    }

    public final long getNextPushAtSec() {
        return this.nextPushAtSec;
    }

    public final List<String> getTodayAids() {
        return this.todayAids;
    }

    public final List<String> getValidAids() {
        return this.validAids;
    }

    public UserPublishInfo(boolean z, long j, boolean z2, UrlModel urlModel, long j2, List<String> list, List<String> list2) {
        this.hasCreatedToday = z;
        this.firstCreatedAtSec = j;
        this.hasPost = z2;
        this.displayImage = urlModel;
        this.nextPushAtSec = j2;
        this.validAids = list;
        this.todayAids = list2;
    }
}
