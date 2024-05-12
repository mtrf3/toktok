package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FriendPostBean implements Serializable {
    public boolean allRead;

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> aweme;
    public int priority;

    @InterfaceC65349Pkn("user_id")
    public final Long uid;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendPostBean copy$default(FriendPostBean friendPostBean, Long l, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = friendPostBean.uid;
        }
        if ((i2 & 2) != 0) {
            list = friendPostBean.aweme;
        }
        if ((i2 & 4) != 0) {
            z = friendPostBean.allRead;
        }
        if ((i2 & 8) != 0) {
            i = friendPostBean.priority;
        }
        return friendPostBean.copy(l, list, z, i);
    }

    public final FriendPostBean copy(Long l, List<? extends Aweme> list, boolean z, int i) {
        return new FriendPostBean(l, list, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendPostBean)) {
            return false;
        }
        FriendPostBean friendPostBean = (FriendPostBean) obj;
        return o.LJ(this.uid, friendPostBean.uid) && o.LJ(this.aweme, friendPostBean.aweme) && this.allRead == friendPostBean.allRead && this.priority == friendPostBean.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Long l = this.uid;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Aweme> list = this.aweme;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.allRead;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.priority;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendPostBean(uid=");
        LIZ.append(this.uid);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", allRead=");
        LIZ.append(this.allRead);
        LIZ.append(", priority=");
        return b0.LIZJ(LIZ, this.priority, ')', LIZ);
    }

    public final boolean getAllRead() {
        return this.allRead;
    }

    public final List<Aweme> getAweme() {
        return this.aweme;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Long getUid() {
        return this.uid;
    }

    public final void setAllRead(boolean z) {
        this.allRead = z;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendPostBean(Long l, List<? extends Aweme> list, boolean z, int i) {
        this.uid = l;
        this.aweme = list;
        this.allRead = z;
        this.priority = i;
    }

    public /* synthetic */ FriendPostBean(Long l, List list, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 10000 : i);
    }
}
