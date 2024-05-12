package com.ss.android.ugc.aweme.notification.bean;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RoomInfo {

    @InterfaceC65349Pkn("link_mic")
    public final LinkMic linkMic;

    @InterfaceC65349Pkn("live_type_screenshot")
    public final Boolean liveTypeScreenshot;

    @InterfaceC65349Pkn("live_type_social_live")
    public final Boolean liveTypeSocialLive;

    @InterfaceC65349Pkn("owner_user_id")
    public final Long ownerUserId;

    @InterfaceC65349Pkn("room_id")
    public final long roomId;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomInfo() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roomInfo.roomId;
        }
        if ((i & 2) != 0) {
            str = roomInfo.title;
        }
        if ((i & 4) != 0) {
            num = roomInfo.type;
        }
        if ((i & 8) != 0) {
            bool = roomInfo.liveTypeSocialLive;
        }
        if ((i & 16) != 0) {
            bool2 = roomInfo.liveTypeScreenshot;
        }
        if ((i & 32) != 0) {
            linkMic = roomInfo.linkMic;
        }
        if ((i & 64) != 0) {
            l = roomInfo.ownerUserId;
        }
        return roomInfo.copy(j, str, num, bool, bool2, linkMic, l);
    }

    public final RoomInfo copy(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic, Long l) {
        return new RoomInfo(j, str, num, bool, bool2, linkMic, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) obj;
        return this.roomId == roomInfo.roomId && o.LJ(this.title, roomInfo.title) && o.LJ(this.type, roomInfo.type) && o.LJ(this.liveTypeSocialLive, roomInfo.liveTypeSocialLive) && o.LJ(this.liveTypeScreenshot, roomInfo.liveTypeScreenshot) && o.LJ(this.linkMic, roomInfo.linkMic) && o.LJ(this.ownerUserId, roomInfo.ownerUserId);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.roomId) * 31;
        String str = this.title;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.liveTypeSocialLive;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.liveTypeScreenshot;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        LinkMic linkMic = this.linkMic;
        int hashCode5 = (hashCode4 + (linkMic == null ? 0 : linkMic.hashCode())) * 31;
        Long l = this.ownerUserId;
        return hashCode5 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RoomInfo(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", liveTypeSocialLive=");
        LIZ.append(this.liveTypeSocialLive);
        LIZ.append(", liveTypeScreenshot=");
        LIZ.append(this.liveTypeScreenshot);
        LIZ.append(", linkMic=");
        LIZ.append(this.linkMic);
        LIZ.append(", ownerUserId=");
        return JBR.LJ(LIZ, this.ownerUserId, ')', LIZ);
    }

    public RoomInfo(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic, Long l) {
        this.roomId = j;
        this.title = str;
        this.type = num;
        this.liveTypeSocialLive = bool;
        this.liveTypeScreenshot = bool2;
        this.linkMic = linkMic;
        this.ownerUserId = l;
    }

    public /* synthetic */ RoomInfo(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) == 0 ? linkMic : null, (i & 64) != 0 ? 0L : l);
    }
}
