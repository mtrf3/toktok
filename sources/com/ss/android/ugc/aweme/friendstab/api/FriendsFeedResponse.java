package com.ss.android.ugc.aweme.friendstab.api;

import X.C16880lQ;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FriendsFeedResponse extends BaseResponse implements Cloneable, InterfaceC65316PkG {
    public String LJLIL;

    @InterfaceC65349Pkn("friend_feed_data")
    public List<FriendsFeed> friendFeedData;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("last_view_item_id")
    public String lastViewItemId;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("page_token")
    public String pageToken;

    @InterfaceC65349Pkn("preload")
    public int preload;

    @InterfaceC65349Pkn("source")
    public int source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FriendsFeedResponse() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r1
            r8 = r3
            r10 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFeedResponse)) {
            return false;
        }
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) obj;
        return this.source == friendsFeedResponse.source && this.hasMore == friendsFeedResponse.hasMore && o.LJ(this.friendFeedData, friendsFeedResponse.friendFeedData) && o.LJ(this.lastViewItemId, friendsFeedResponse.lastViewItemId) && o.LJ(this.pageToken, friendsFeedResponse.pageToken) && o.LJ(this.logPb, friendsFeedResponse.logPb) && this.preload == friendsFeedResponse.preload && o.LJ(this.LJLIL, friendsFeedResponse.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.source * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        List<FriendsFeed> list = this.friendFeedData;
        int hashCode = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lastViewItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode4 = (((hashCode3 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + this.preload) * 31;
        String str3 = this.LJLIL;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final FriendsFeedResponse clone() {
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse");
            return (FriendsFeedResponse) clone;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return new FriendsFeedResponse(this.source, this.hasMore, this.friendFeedData, this.lastViewItemId, this.pageToken, this.logPb, this.preload, this.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsFeedResponse(source=");
        LIZ.append(this.source);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", friendFeedData=");
        LIZ.append(this.friendFeedData);
        LIZ.append(", lastViewItemId=");
        LIZ.append(this.lastViewItemId);
        LIZ.append(", pageToken=");
        LIZ.append(this.pageToken);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", preload=");
        LIZ.append(this.preload);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.LJLIL = str;
    }

    public static FriendsFeedResponse LJI(FriendsFeedResponse friendsFeedResponse, List list, int i) {
        int i2;
        boolean z;
        String str;
        String str2;
        LogPbBean logPbBean;
        int i3;
        List list2 = list;
        if ((i & 1) != 0) {
            i2 = friendsFeedResponse.source;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z = friendsFeedResponse.hasMore;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = friendsFeedResponse.friendFeedData;
        }
        String str3 = null;
        if ((i & 8) != 0) {
            str = friendsFeedResponse.lastViewItemId;
        } else {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = friendsFeedResponse.pageToken;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            logPbBean = friendsFeedResponse.logPb;
        } else {
            logPbBean = null;
        }
        if ((i & 64) != 0) {
            i3 = friendsFeedResponse.preload;
        } else {
            i3 = 0;
        }
        if ((i & 128) != 0) {
            str3 = friendsFeedResponse.LJLIL;
        }
        return new FriendsFeedResponse(i2, z, list2, str, str2, logPbBean, i3, str3);
    }

    public FriendsFeedResponse(int i, boolean z, List<FriendsFeed> list, String str, String str2, LogPbBean logPbBean, int i2, String str3) {
        this.source = i;
        this.hasMore = z;
        this.friendFeedData = list;
        this.lastViewItemId = str;
        this.pageToken = str2;
        this.logPb = logPbBean;
        this.preload = i2;
        this.LJLIL = str3;
    }

    public /* synthetic */ FriendsFeedResponse(int i, boolean z, List list, String str, String str2, LogPbBean logPbBean, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) == 0 ? logPbBean : null, (i3 & 64) == 0 ? i2 : 0, (i3 & 128) == 0 ? str3 : "");
    }
}
