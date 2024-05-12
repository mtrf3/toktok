package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RtcUserInfo extends F9E {
    public final long channelId;
    public final boolean isOwner;
    public final String linkMicId;
    public final long roomId;
    public final long userId;

    public static /* synthetic */ RtcUserInfo copy$default(RtcUserInfo rtcUserInfo, long j, long j2, String str, boolean z, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rtcUserInfo.roomId;
        }
        if ((i & 2) != 0) {
            j2 = rtcUserInfo.userId;
        }
        if ((i & 4) != 0) {
            str = rtcUserInfo.linkMicId;
        }
        if ((i & 8) != 0) {
            z = rtcUserInfo.isOwner;
        }
        if ((i & 16) != 0) {
            j3 = rtcUserInfo.channelId;
        }
        return rtcUserInfo.copy(j, j2, str, z, j3);
    }

    public final RtcUserInfo copy(long j, long j2, String linkMicId, boolean z, long j3) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return new RtcUserInfo(j, j2, linkMicId, z, j3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), Long.valueOf(this.userId), this.linkMicId, Boolean.valueOf(this.isOwner), Long.valueOf(this.channelId)};
    }

    public final long getChannelId() {
        return this.channelId;
    }

    public final String getLinkMicId() {
        return this.linkMicId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public RtcUserInfo(long j, long j2, String linkMicId, boolean z, long j3) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.roomId = j;
        this.userId = j2;
        this.linkMicId = linkMicId;
        this.isOwner = z;
        this.channelId = j3;
    }

    public /* synthetic */ RtcUserInfo(long j, long j2, String str, boolean z, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, (i & 8) != 0 ? false : z, j3);
    }
}
