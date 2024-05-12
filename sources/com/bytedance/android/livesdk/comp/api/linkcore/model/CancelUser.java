package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelUser {
    public static final Companion Companion = new Companion();
    public Long actionId;
    public Long channelId;
    public int playType;
    public final long roomId;
    public final long userId;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Long actionId;
        public Long channelId;
        public int playType;
        public long roomId;
        public long userId;

        public final CancelUser build() {
            return new CancelUser(this);
        }

        public final Long getActionId() {
            return this.actionId;
        }

        public final Long getChannelId() {
            return this.channelId;
        }

        public final int getPlayType() {
            return this.playType;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setActionId(Long l) {
            this.actionId = l;
        }

        public final void setChannelId(Long l) {
            this.channelId = l;
        }

        public final void setPlayType(int i) {
            this.playType = i;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    public /* synthetic */ CancelUser(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ CancelUser copy$default(CancelUser cancelUser, long j, long j2, int i, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = cancelUser.roomId;
        }
        if ((i2 & 2) != 0) {
            j2 = cancelUser.userId;
        }
        if ((i2 & 4) != 0) {
            i = cancelUser.playType;
        }
        if ((i2 & 8) != 0) {
            l = cancelUser.channelId;
        }
        if ((i2 & 16) != 0) {
            l2 = cancelUser.actionId;
        }
        return cancelUser.copy(j, j2, i, l, l2);
    }

    public final CancelUser copy(long j, long j2, int i, Long l, Long l2) {
        return new CancelUser(j, j2, i, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelUser)) {
            return false;
        }
        CancelUser cancelUser = (CancelUser) obj;
        return this.roomId == cancelUser.roomId && this.userId == cancelUser.userId && this.playType == cancelUser.playType && o.LJ(this.channelId, cancelUser.channelId) && o.LJ(this.actionId, cancelUser.actionId);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = (JBR.LIZJ(this.userId, C16880lQ.LLJIJIL(this.roomId) * 31, 31) + this.playType) * 31;
        Long l = this.channelId;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Long l2 = this.actionId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelUser(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", playType=");
        LIZ.append(this.playType);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", actionId=");
        return JBR.LJ(LIZ, this.actionId, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CancelUser build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Long getActionId() {
        return this.actionId;
    }

    public final Long getChannelId() {
        return this.channelId;
    }

    public final int getPlayType() {
        return this.playType;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public CancelUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getPlayType(), builder.getChannelId(), builder.getActionId());
    }

    public final void setActionId(Long l) {
        this.actionId = l;
    }

    public final void setChannelId(Long l) {
        this.channelId = l;
    }

    public final void setPlayType(int i) {
        this.playType = i;
    }

    public CancelUser(long j, long j2, int i, Long l, Long l2) {
        this.roomId = j;
        this.userId = j2;
        this.playType = i;
        this.channelId = l;
        this.actionId = l2;
    }
}
