package com.ss.android.ugc.aweme.now.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ItemLikeListPreview implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public final String aid;

    @InterfaceC65349Pkn("has_comment")
    public final boolean hasComment;

    @InterfaceC65349Pkn("total_count")
    public final long totalCount;

    @InterfaceC65349Pkn("user")
    public final List<User> users;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemLikeListPreview copy$default(ItemLikeListPreview itemLikeListPreview, String str, List list, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemLikeListPreview.aid;
        }
        if ((i & 2) != 0) {
            list = itemLikeListPreview.users;
        }
        if ((i & 4) != 0) {
            j = itemLikeListPreview.totalCount;
        }
        if ((i & 8) != 0) {
            z = itemLikeListPreview.hasComment;
        }
        return itemLikeListPreview.copy(str, list, j, z);
    }

    public final ItemLikeListPreview copy(String aid, List<? extends User> list, long j, boolean z) {
        o.LJIIIZ(aid, "aid");
        return new ItemLikeListPreview(aid, list, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemLikeListPreview)) {
            return false;
        }
        ItemLikeListPreview itemLikeListPreview = (ItemLikeListPreview) obj;
        return o.LJ(this.aid, itemLikeListPreview.aid) && o.LJ(this.users, itemLikeListPreview.users) && this.totalCount == itemLikeListPreview.totalCount && this.hasComment == itemLikeListPreview.hasComment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.aid.hashCode() * 31;
        List<User> list = this.users;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.totalCount, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.hasComment;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemLikeListPreview(aid=");
        LIZ.append(this.aid);
        LIZ.append(", users=");
        LIZ.append(this.users);
        LIZ.append(", totalCount=");
        LIZ.append(this.totalCount);
        LIZ.append(", hasComment=");
        return C48339Iy7.LIZJ(LIZ, this.hasComment, ')', LIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final boolean getHasComment() {
        return this.hasComment;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemLikeListPreview(String aid, List<? extends User> list, long j, boolean z) {
        o.LJIIIZ(aid, "aid");
        this.aid = aid;
        this.users = list;
        this.totalCount = j;
        this.hasComment = z;
    }
}
