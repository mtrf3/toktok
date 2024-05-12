package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DirectJoinData {
    public static final Companion Companion = new Companion();
    public final BizJoinDirectParams bizJoinDirectParams;
    public final long channelId;
    public final LiveRoomUser self;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizJoinDirectParams bizJoinDirectParams;
        public long channelId;
        public final LiveRoomUser self;

        public final DirectJoinData build() {
            return new DirectJoinData(this);
        }

        public final BizJoinDirectParams getBizJoinDirectParams() {
            return this.bizJoinDirectParams;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final LiveRoomUser getSelf() {
            return this.self;
        }

        public Builder(LiveRoomUser self) {
            o.LJIIIZ(self, "self");
            this.self = self;
        }

        public final void setBizJoinDirectParams(BizJoinDirectParams bizJoinDirectParams) {
            this.bizJoinDirectParams = bizJoinDirectParams;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }
    }

    public /* synthetic */ DirectJoinData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ DirectJoinData copy$default(DirectJoinData directJoinData, long j, LiveRoomUser liveRoomUser, BizJoinDirectParams bizJoinDirectParams, int i, Object obj) {
        if ((i & 1) != 0) {
            j = directJoinData.channelId;
        }
        if ((i & 2) != 0) {
            liveRoomUser = directJoinData.self;
        }
        if ((i & 4) != 0) {
            bizJoinDirectParams = directJoinData.bizJoinDirectParams;
        }
        return directJoinData.copy(j, liveRoomUser, bizJoinDirectParams);
    }

    public final DirectJoinData copy(long j, LiveRoomUser self, BizJoinDirectParams bizJoinDirectParams) {
        o.LJIIIZ(self, "self");
        return new DirectJoinData(j, self, bizJoinDirectParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectJoinData)) {
            return false;
        }
        DirectJoinData directJoinData = (DirectJoinData) obj;
        return this.channelId == directJoinData.channelId && o.LJ(this.self, directJoinData.self) && o.LJ(this.bizJoinDirectParams, directJoinData.bizJoinDirectParams);
    }

    public int hashCode() {
        int hashCode = (this.self.hashCode() + (C16880lQ.LLJIJIL(this.channelId) * 31)) * 31;
        BizJoinDirectParams bizJoinDirectParams = this.bizJoinDirectParams;
        return hashCode + (bizJoinDirectParams == null ? 0 : bizJoinDirectParams.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DirectJoinData(channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", self=");
        LIZ.append(this.self);
        LIZ.append(", bizJoinDirectParams=");
        LIZ.append(this.bizJoinDirectParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final DirectJoinData build(LiveRoomUser guest, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(guest, "guest");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(guest);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizJoinDirectParams getBizJoinDirectParams() {
        return this.bizJoinDirectParams;
    }

    public final long getChannelId() {
        return this.channelId;
    }

    public final LiveRoomUser getSelf() {
        return this.self;
    }

    public DirectJoinData(Builder builder) {
        this(builder.getChannelId(), builder.getSelf(), builder.getBizJoinDirectParams());
    }

    public DirectJoinData(long j, LiveRoomUser self, BizJoinDirectParams bizJoinDirectParams) {
        o.LJIIIZ(self, "self");
        this.channelId = j;
        this.self = self;
        this.bizJoinDirectParams = bizJoinDirectParams;
    }

    public /* synthetic */ DirectJoinData(long j, LiveRoomUser liveRoomUser, BizJoinDirectParams bizJoinDirectParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, liveRoomUser, (i & 4) != 0 ? null : bizJoinDirectParams);
    }
}
