package com.ss.android.ugc.aweme.inbox.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxLiveNotice {

    @InterfaceC65349Pkn("is_fresh")
    public final boolean isFresh;
    public final LiveRoomStruct liveRoomStruct;
    public int priority;

    @InterfaceC65349Pkn("room_info")
    public final SlimRoom roomInfo;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("owner")
    public final User user;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxLiveNotice() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r2
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice.<init>():void");
    }

    public static /* synthetic */ InboxLiveNotice copy$default(InboxLiveNotice inboxLiveNotice, User user, int i, SlimRoom slimRoom, boolean z, LiveRoomStruct liveRoomStruct, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            user = inboxLiveNotice.user;
        }
        if ((i3 & 2) != 0) {
            i = inboxLiveNotice.type;
        }
        if ((i3 & 4) != 0) {
            slimRoom = inboxLiveNotice.roomInfo;
        }
        if ((i3 & 8) != 0) {
            z = inboxLiveNotice.isFresh;
        }
        if ((i3 & 16) != 0) {
            liveRoomStruct = inboxLiveNotice.liveRoomStruct;
        }
        if ((i3 & 32) != 0) {
            i2 = inboxLiveNotice.priority;
        }
        return inboxLiveNotice.copy(user, i, slimRoom, z, liveRoomStruct, i2);
    }

    public final InboxLiveNotice copy(User user, int i, SlimRoom slimRoom, boolean z, LiveRoomStruct liveRoomStruct, int i2) {
        return new InboxLiveNotice(user, i, slimRoom, z, liveRoomStruct, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxLiveNotice)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = (InboxLiveNotice) obj;
        return o.LJ(this.user, inboxLiveNotice.user) && this.type == inboxLiveNotice.type && o.LJ(this.roomInfo, inboxLiveNotice.roomInfo) && this.isFresh == inboxLiveNotice.isFresh && o.LJ(this.liveRoomStruct, inboxLiveNotice.liveRoomStruct) && this.priority == inboxLiveNotice.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        User user = this.user;
        int hashCode = (((user == null ? 0 : user.hashCode()) * 31) + this.type) * 31;
        SlimRoom slimRoom = this.roomInfo;
        int hashCode2 = (hashCode + (slimRoom == null ? 0 : slimRoom.hashCode())) * 31;
        boolean z = this.isFresh;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        LiveRoomStruct liveRoomStruct = this.liveRoomStruct;
        return ((i2 + (liveRoomStruct != null ? liveRoomStruct.hashCode() : 0)) * 31) + this.priority;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxLiveNotice(user=");
        LIZ.append(this.user);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", roomInfo=");
        LIZ.append(this.roomInfo);
        LIZ.append(", isFresh=");
        LIZ.append(this.isFresh);
        LIZ.append(", liveRoomStruct=");
        LIZ.append(this.liveRoomStruct);
        LIZ.append(", priority=");
        return b0.LIZJ(LIZ, this.priority, ')', LIZ);
    }

    public final LiveRoomStruct getLiveRoomStruct() {
        return this.liveRoomStruct;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final SlimRoom getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isFresh() {
        return this.isFresh;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public InboxLiveNotice(User user, int i, SlimRoom slimRoom, boolean z, LiveRoomStruct liveRoomStruct, int i2) {
        this.user = user;
        this.type = i;
        this.roomInfo = slimRoom;
        this.isFresh = z;
        this.liveRoomStruct = liveRoomStruct;
        this.priority = i2;
    }

    public /* synthetic */ InboxLiveNotice(User user, int i, SlimRoom slimRoom, boolean z, LiveRoomStruct liveRoomStruct, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : user, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : slimRoom, (i3 & 8) != 0 ? false : z, (i3 & 16) == 0 ? liveRoomStruct : null, (i3 & 32) != 0 ? 0 : i2);
    }
}
