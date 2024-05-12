package com.ss.android.ugc.aweme.notification.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LinkMic {

    @InterfaceC65349Pkn("audience_id_list")
    public final List<Long> audienceIdList;

    @InterfaceC65349Pkn("followed_count")
    public final int followedCount;

    @InterfaceC65349Pkn("show_user_list")
    public final List<LiveUser> followedList;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkMic() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkMic copy$default(LinkMic linkMic, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = linkMic.followedList;
        }
        if ((i2 & 2) != 0) {
            list2 = linkMic.audienceIdList;
        }
        if ((i2 & 4) != 0) {
            i = linkMic.followedCount;
        }
        return linkMic.copy(list, list2, i);
    }

    public final LinkMic copy(List<LiveUser> list, List<Long> list2, int i) {
        return new LinkMic(list, list2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkMic)) {
            return false;
        }
        LinkMic linkMic = (LinkMic) obj;
        return o.LJ(this.followedList, linkMic.followedList) && o.LJ(this.audienceIdList, linkMic.audienceIdList) && this.followedCount == linkMic.followedCount;
    }

    public int hashCode() {
        List<LiveUser> list = this.followedList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Long> list2 = this.audienceIdList;
        return ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.followedCount;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMic(followedList=");
        LIZ.append(this.followedList);
        LIZ.append(", audienceIdList=");
        LIZ.append(this.audienceIdList);
        LIZ.append(", followedCount=");
        return b0.LIZJ(LIZ, this.followedCount, ')', LIZ);
    }

    public LinkMic(List<LiveUser> list, List<Long> list2, int i) {
        this.followedList = list;
        this.audienceIdList = list2;
        this.followedCount = i;
    }

    public /* synthetic */ LinkMic(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? 0 : i);
    }
}
