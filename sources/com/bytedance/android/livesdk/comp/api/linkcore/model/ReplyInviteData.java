package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ReplyInviteData {
    public static final Companion Companion = new Companion();
    public final BizReplyParams bizReplyParams;
    public final Map<String, Object> coHostData;
    public final long inviteOperatorUid;
    public final LiveRoomUser inviter;
    public final int replyStatus;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizReplyParams bizReplyParams;
        public Map<String, ? extends Object> coHostData;
        public long inviteOperatorUid;
        public final LiveRoomUser inviter;
        public int replyStatus;

        public final ReplyInviteData build() {
            return new ReplyInviteData(this);
        }

        public final BizReplyParams getBizReplyParams() {
            return this.bizReplyParams;
        }

        public final Map<String, Object> getCoHostData() {
            return this.coHostData;
        }

        public final long getInviteOperatorUid() {
            return this.inviteOperatorUid;
        }

        public final LiveRoomUser getInviter() {
            return this.inviter;
        }

        public final int getReplyStatus() {
            return this.replyStatus;
        }

        public Builder(LiveRoomUser inviter) {
            o.LJIIIZ(inviter, "inviter");
            this.inviter = inviter;
        }

        public final void setBizReplyParams(BizReplyParams bizReplyParams) {
            this.bizReplyParams = bizReplyParams;
        }

        public final void setCoHostData(Map<String, ? extends Object> map) {
            this.coHostData = map;
        }

        public final void setInviteOperatorUid(long j) {
            this.inviteOperatorUid = j;
        }

        public final void setReplyStatus(int i) {
            this.replyStatus = i;
        }
    }

    public /* synthetic */ ReplyInviteData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReplyInviteData copy$default(ReplyInviteData replyInviteData, int i, BizReplyParams bizReplyParams, Map map, LiveRoomUser liveRoomUser, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = replyInviteData.replyStatus;
        }
        if ((i2 & 2) != 0) {
            bizReplyParams = replyInviteData.bizReplyParams;
        }
        if ((i2 & 4) != 0) {
            map = replyInviteData.coHostData;
        }
        if ((i2 & 8) != 0) {
            liveRoomUser = replyInviteData.inviter;
        }
        if ((i2 & 16) != 0) {
            j = replyInviteData.inviteOperatorUid;
        }
        return replyInviteData.copy(i, bizReplyParams, map, liveRoomUser, j);
    }

    public final ReplyInviteData copy(int i, BizReplyParams bizReplyParams, Map<String, ? extends Object> map, LiveRoomUser inviter, long j) {
        o.LJIIIZ(inviter, "inviter");
        return new ReplyInviteData(i, bizReplyParams, map, inviter, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyInviteData)) {
            return false;
        }
        ReplyInviteData replyInviteData = (ReplyInviteData) obj;
        return this.replyStatus == replyInviteData.replyStatus && o.LJ(this.bizReplyParams, replyInviteData.bizReplyParams) && o.LJ(this.coHostData, replyInviteData.coHostData) && o.LJ(this.inviter, replyInviteData.inviter) && this.inviteOperatorUid == replyInviteData.inviteOperatorUid;
    }

    public int hashCode() {
        int i = this.replyStatus * 31;
        BizReplyParams bizReplyParams = this.bizReplyParams;
        int hashCode = (i + (bizReplyParams == null ? 0 : bizReplyParams.hashCode())) * 31;
        Map<String, Object> map = this.coHostData;
        return C16880lQ.LLJIJIL(this.inviteOperatorUid) + ((this.inviter.hashCode() + ((hashCode + (map != null ? map.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyInviteData(replyStatus=");
        LIZ.append(this.replyStatus);
        LIZ.append(", bizReplyParams=");
        LIZ.append(this.bizReplyParams);
        LIZ.append(", coHostData=");
        LIZ.append(this.coHostData);
        LIZ.append(", inviter=");
        LIZ.append(this.inviter);
        LIZ.append(", inviteOperatorUid=");
        return C47135Ieh.LIZIZ(LIZ, this.inviteOperatorUid, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ReplyInviteData build(LiveRoomUser inviter, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(inviter, "inviter");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(inviter);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizReplyParams getBizReplyParams() {
        return this.bizReplyParams;
    }

    public final Map<String, Object> getCoHostData() {
        return this.coHostData;
    }

    public final long getInviteOperatorUid() {
        return this.inviteOperatorUid;
    }

    public final LiveRoomUser getInviter() {
        return this.inviter;
    }

    public final int getReplyStatus() {
        return this.replyStatus;
    }

    public ReplyInviteData(Builder builder) {
        this(builder.getReplyStatus(), builder.getBizReplyParams(), builder.getCoHostData(), builder.getInviter(), builder.getInviteOperatorUid());
    }

    public ReplyInviteData(int i, BizReplyParams bizReplyParams, Map<String, ? extends Object> map, LiveRoomUser inviter, long j) {
        o.LJIIIZ(inviter, "inviter");
        this.replyStatus = i;
        this.bizReplyParams = bizReplyParams;
        this.coHostData = map;
        this.inviter = inviter;
        this.inviteOperatorUid = j;
    }

    public /* synthetic */ ReplyInviteData(int i, BizReplyParams bizReplyParams, Map map, LiveRoomUser liveRoomUser, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bizReplyParams, map, liveRoomUser, (i2 & 16) != 0 ? 0L : j);
    }
}
