package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveBubbleData implements Serializable {

    @InterfaceC65349Pkn("bubble_title")
    public String bubbleTitle;

    @InterfaceC65349Pkn("room_data")
    public Room roomData;

    @InterfaceC65349Pkn("show_head")
    public boolean showHead;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveBubbleData() {
        this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LiveBubbleData copy$default(LiveBubbleData liveBubbleData, Room room, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            room = liveBubbleData.roomData;
        }
        if ((i & 2) != 0) {
            z = liveBubbleData.showHead;
        }
        if ((i & 4) != 0) {
            str = liveBubbleData.bubbleTitle;
        }
        return liveBubbleData.copy(room, z, str);
    }

    public final LiveBubbleData copy(Room room, boolean z, String bubbleTitle) {
        o.LJIIIZ(bubbleTitle, "bubbleTitle");
        return new LiveBubbleData(room, z, bubbleTitle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveBubbleData)) {
            return false;
        }
        LiveBubbleData liveBubbleData = (LiveBubbleData) obj;
        return o.LJ(this.roomData, liveBubbleData.roomData) && this.showHead == liveBubbleData.showHead && o.LJ(this.bubbleTitle, liveBubbleData.bubbleTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Room room = this.roomData;
        int hashCode = (room == null ? 0 : room.hashCode()) * 31;
        boolean z = this.showHead;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.bubbleTitle.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveBubbleData(roomData=");
        LIZ.append(this.roomData);
        LIZ.append(", showHead=");
        LIZ.append(this.showHead);
        LIZ.append(", bubbleTitle=");
        return q.LIZIZ(LIZ, this.bubbleTitle, ')', LIZ);
    }

    public final String getBubbleTitle() {
        return this.bubbleTitle;
    }

    public final Room getRoomData() {
        return this.roomData;
    }

    public final boolean getShowHead() {
        return this.showHead;
    }

    public final void setBubbleTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bubbleTitle = str;
    }

    public final void setRoomData(Room room) {
        this.roomData = room;
    }

    public final void setShowHead(boolean z) {
        this.showHead = z;
    }

    public LiveBubbleData(Room room, boolean z, String bubbleTitle) {
        o.LJIIIZ(bubbleTitle, "bubbleTitle");
        this.roomData = room;
        this.showHead = z;
        this.bubbleTitle = bubbleTitle;
    }

    public /* synthetic */ LiveBubbleData(Room room, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : room, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str);
    }
}
