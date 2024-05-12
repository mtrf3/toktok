package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelApplyData {
    public static final Companion Companion = new Companion();
    public final BizCancelApplyParams bizCancelApplyParams;
    public final String reason;
    public final LiveRoomUser targetUser;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizCancelApplyParams bizCancelApplyParams;
        public String reason;
        public LiveRoomUser targetUser;

        public final CancelApplyData build() {
            return new CancelApplyData(this);
        }

        public final BizCancelApplyParams getBizCancelApplyParams() {
            return this.bizCancelApplyParams;
        }

        public final String getReason() {
            return this.reason;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final void setBizCancelApplyParams(BizCancelApplyParams bizCancelApplyParams) {
            this.bizCancelApplyParams = bizCancelApplyParams;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }
    }

    public /* synthetic */ CancelApplyData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ CancelApplyData copy$default(CancelApplyData cancelApplyData, String str, LiveRoomUser liveRoomUser, BizCancelApplyParams bizCancelApplyParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelApplyData.reason;
        }
        if ((i & 2) != 0) {
            liveRoomUser = cancelApplyData.targetUser;
        }
        if ((i & 4) != 0) {
            bizCancelApplyParams = cancelApplyData.bizCancelApplyParams;
        }
        return cancelApplyData.copy(str, liveRoomUser, bizCancelApplyParams);
    }

    public final CancelApplyData copy(String str, LiveRoomUser liveRoomUser, BizCancelApplyParams bizCancelApplyParams) {
        return new CancelApplyData(str, liveRoomUser, bizCancelApplyParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplyData)) {
            return false;
        }
        CancelApplyData cancelApplyData = (CancelApplyData) obj;
        return o.LJ(this.reason, cancelApplyData.reason) && o.LJ(this.targetUser, cancelApplyData.targetUser) && o.LJ(this.bizCancelApplyParams, cancelApplyData.bizCancelApplyParams);
    }

    public int hashCode() {
        String str = this.reason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LiveRoomUser liveRoomUser = this.targetUser;
        int hashCode2 = (hashCode + (liveRoomUser == null ? 0 : liveRoomUser.hashCode())) * 31;
        BizCancelApplyParams bizCancelApplyParams = this.bizCancelApplyParams;
        return hashCode2 + (bizCancelApplyParams != null ? bizCancelApplyParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelApplyData(reason=");
        LIZ.append(this.reason);
        LIZ.append(", targetUser=");
        LIZ.append(this.targetUser);
        LIZ.append(", bizCancelApplyParams=");
        LIZ.append(this.bizCancelApplyParams);
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

        public final CancelApplyData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizCancelApplyParams getBizCancelApplyParams() {
        return this.bizCancelApplyParams;
    }

    public final String getReason() {
        return this.reason;
    }

    public final LiveRoomUser getTargetUser() {
        return this.targetUser;
    }

    public CancelApplyData(Builder builder) {
        this(builder.getReason(), builder.getTargetUser(), builder.getBizCancelApplyParams());
    }

    public CancelApplyData(String str, LiveRoomUser liveRoomUser, BizCancelApplyParams bizCancelApplyParams) {
        this.reason = str;
        this.targetUser = liveRoomUser;
        this.bizCancelApplyParams = bizCancelApplyParams;
    }

    public /* synthetic */ CancelApplyData(String str, LiveRoomUser liveRoomUser, BizCancelApplyParams bizCancelApplyParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : liveRoomUser, bizCancelApplyParams);
    }
}
