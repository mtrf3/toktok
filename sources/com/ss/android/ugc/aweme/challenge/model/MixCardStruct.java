package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class MixCardStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("aweme_info")
    public Aweme aweme;

    @InterfaceC65349Pkn("room_info")
    public RoomStructV2 roomInfo;

    @InterfaceC65349Pkn("type")
    public int type;

    public final boolean isLive() {
        if (this.roomInfo != null) {
            return true;
        }
        return false;
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

    public final RoomStructV2 getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setRoomInfo(RoomStructV2 roomStructV2) {
        this.roomInfo = roomStructV2;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
