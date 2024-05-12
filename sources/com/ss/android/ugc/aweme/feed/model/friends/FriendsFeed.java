package com.ss.android.ugc.aweme.feed.model.friends;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeed implements Serializable, InterfaceC65316PkG {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("feed_type")
    public final int feedType;
    public String requestId;

    @InterfaceC65349Pkn("cell_room")
    public final RoomFeedCellStruct roomStruct;

    @InterfaceC65349Pkn("source")
    public int source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FriendsFeed() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r1
            r4 = r2
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed.<init>():void");
    }

    public static /* synthetic */ FriendsFeed copy$default(FriendsFeed friendsFeed, Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aweme = friendsFeed.aweme;
        }
        if ((i3 & 2) != 0) {
            i = friendsFeed.source;
        }
        if ((i3 & 4) != 0) {
            str = friendsFeed.requestId;
        }
        if ((i3 & 8) != 0) {
            i2 = friendsFeed.feedType;
        }
        if ((i3 & 16) != 0) {
            roomFeedCellStruct = friendsFeed.roomStruct;
        }
        return friendsFeed.copy(aweme, i, str, i2, roomFeedCellStruct);
    }

    public final FriendsFeed copy(Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct) {
        return new FriendsFeed(aweme, i, str, i2, roomFeedCellStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFeed)) {
            return false;
        }
        FriendsFeed friendsFeed = (FriendsFeed) obj;
        return o.LJ(this.aweme, friendsFeed.aweme) && this.source == friendsFeed.source && o.LJ(this.requestId, friendsFeed.requestId) && this.feedType == friendsFeed.feedType && o.LJ(this.roomStruct, friendsFeed.roomStruct);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int hashCode = (((aweme == null ? 0 : aweme.hashCode()) * 31) + this.source) * 31;
        String str = this.requestId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.feedType) * 31;
        RoomFeedCellStruct roomFeedCellStruct = this.roomStruct;
        return hashCode2 + (roomFeedCellStruct != null ? roomFeedCellStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsFeed(aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", requestId=");
        LIZ.append(this.requestId);
        LIZ.append(", feedType=");
        LIZ.append(this.feedType);
        LIZ.append(", roomStruct=");
        LIZ.append(this.roomStruct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getFeedType() {
        return this.feedType;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public final RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public FriendsFeed(Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct) {
        this.aweme = aweme;
        this.source = i;
        this.requestId = str;
        this.feedType = i2;
        this.roomStruct = roomFeedCellStruct;
    }

    public /* synthetic */ FriendsFeed(Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : aweme, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) == 0 ? roomFeedCellStruct : null);
    }
}
