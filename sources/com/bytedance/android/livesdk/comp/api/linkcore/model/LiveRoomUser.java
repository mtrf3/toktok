package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.F9E;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveRoomUser extends F9E {
    public static final Companion Companion = new Companion();
    public String linkMicId;
    public final long roomId;
    public final long userId;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public long roomId = -1;
        public long userId = -1;
        public String linkMicId = "";

        public final LiveRoomUser build() {
            return new LiveRoomUser(this);
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

        public final void setLinkMicId(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.linkMicId = str;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    public /* synthetic */ LiveRoomUser(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ LiveRoomUser copy$default(LiveRoomUser liveRoomUser, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = liveRoomUser.roomId;
        }
        if ((i & 2) != 0) {
            j2 = liveRoomUser.userId;
        }
        if ((i & 4) != 0) {
            str = liveRoomUser.linkMicId;
        }
        return liveRoomUser.copy(j, j2, str);
    }

    public final LiveRoomUser copy(long j, long j2, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return new LiveRoomUser(j, j2, linkMicId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), Long.valueOf(this.userId), this.linkMicId};
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LiveRoomUser build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
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

    public LiveRoomUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getLinkMicId());
    }

    public final void setLinkMicId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.linkMicId = str;
    }

    public LiveRoomUser(long j, long j2, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.roomId = j;
        this.userId = j2;
        this.linkMicId = linkMicId;
    }
}
