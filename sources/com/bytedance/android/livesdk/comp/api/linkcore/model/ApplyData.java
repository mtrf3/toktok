package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ApplyData {
    public static final Companion Companion = new Companion();
    public final BizApplyParams bizApplyParams;
    public final long channelId;
    public final Map<String, Object> custom;
    public final long expireTimeInSeconds;
    public final OnLineMicInfo onLineMicInfo;
    public final LiveRoomUser targetUser;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizApplyParams bizApplyParams;
        public long channelId = -1;
        public Map<String, ? extends Object> custom;
        public long expireTimeInSeconds;
        public OnLineMicInfo onLineMicInfo;
        public LiveRoomUser targetUser;

        public final ApplyData build() {
            return new ApplyData(this);
        }

        public final BizApplyParams getBizApplyParams() {
            return this.bizApplyParams;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final long getExpireTimeInSeconds() {
            return this.expireTimeInSeconds;
        }

        public final OnLineMicInfo getOnLineMicInfo() {
            return this.onLineMicInfo;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final void setBizApplyParams(BizApplyParams bizApplyParams) {
            this.bizApplyParams = bizApplyParams;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setExpireTimeInSeconds(long j) {
            this.expireTimeInSeconds = j;
        }

        public final void setOnLineMicInfo(OnLineMicInfo onLineMicInfo) {
            this.onLineMicInfo = onLineMicInfo;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }
    }

    public /* synthetic */ ApplyData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplyData copy$default(ApplyData applyData, long j, OnLineMicInfo onLineMicInfo, BizApplyParams bizApplyParams, Map map, long j2, LiveRoomUser liveRoomUser, int i, Object obj) {
        if ((i & 1) != 0) {
            j = applyData.channelId;
        }
        if ((i & 2) != 0) {
            onLineMicInfo = applyData.onLineMicInfo;
        }
        if ((i & 4) != 0) {
            bizApplyParams = applyData.bizApplyParams;
        }
        if ((i & 8) != 0) {
            map = applyData.custom;
        }
        if ((i & 16) != 0) {
            j2 = applyData.expireTimeInSeconds;
        }
        if ((i & 32) != 0) {
            liveRoomUser = applyData.targetUser;
        }
        return applyData.copy(j, onLineMicInfo, bizApplyParams, map, j2, liveRoomUser);
    }

    public final ApplyData copy(long j, OnLineMicInfo onLineMicInfo, BizApplyParams bizApplyParams, Map<String, ? extends Object> map, long j2, LiveRoomUser liveRoomUser) {
        return new ApplyData(j, onLineMicInfo, bizApplyParams, map, j2, liveRoomUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyData)) {
            return false;
        }
        ApplyData applyData = (ApplyData) obj;
        return this.channelId == applyData.channelId && o.LJ(this.onLineMicInfo, applyData.onLineMicInfo) && o.LJ(this.bizApplyParams, applyData.bizApplyParams) && o.LJ(this.custom, applyData.custom) && this.expireTimeInSeconds == applyData.expireTimeInSeconds && o.LJ(this.targetUser, applyData.targetUser);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyData(channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", onLineMicInfo=");
        LIZ.append(this.onLineMicInfo);
        LIZ.append(", bizApplyParams=");
        LIZ.append(this.bizApplyParams);
        LIZ.append(", custom=");
        LIZ.append(this.custom);
        LIZ.append(", expireTimeInSeconds=");
        LIZ.append(this.expireTimeInSeconds);
        LIZ.append(", targetUser=");
        LIZ.append(this.targetUser);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LLJIJIL = C16880lQ.LLJIJIL(this.channelId) * 31;
        OnLineMicInfo onLineMicInfo = this.onLineMicInfo;
        int i = 0;
        if (onLineMicInfo == null) {
            hashCode = 0;
        } else {
            hashCode = onLineMicInfo.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        BizApplyParams bizApplyParams = this.bizApplyParams;
        if (bizApplyParams == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bizApplyParams.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, Object> map = this.custom;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.expireTimeInSeconds, (i3 + hashCode3) * 31, 31);
        LiveRoomUser liveRoomUser = this.targetUser;
        if (liveRoomUser != null) {
            i = liveRoomUser.hashCode();
        }
        return LIZJ + i;
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ApplyData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizApplyParams getBizApplyParams() {
        return this.bizApplyParams;
    }

    public final long getChannelId() {
        return this.channelId;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final long getExpireTimeInSeconds() {
        return this.expireTimeInSeconds;
    }

    public final OnLineMicInfo getOnLineMicInfo() {
        return this.onLineMicInfo;
    }

    public final LiveRoomUser getTargetUser() {
        return this.targetUser;
    }

    public ApplyData(Builder builder) {
        this(builder.getChannelId(), builder.getOnLineMicInfo(), builder.getBizApplyParams(), builder.getCustom(), builder.getExpireTimeInSeconds(), builder.getTargetUser());
    }

    public ApplyData(long j, OnLineMicInfo onLineMicInfo, BizApplyParams bizApplyParams, Map<String, ? extends Object> map, long j2, LiveRoomUser liveRoomUser) {
        this.channelId = j;
        this.onLineMicInfo = onLineMicInfo;
        this.bizApplyParams = bizApplyParams;
        this.custom = map;
        this.expireTimeInSeconds = j2;
        this.targetUser = liveRoomUser;
    }

    public /* synthetic */ ApplyData(long j, OnLineMicInfo onLineMicInfo, BizApplyParams bizApplyParams, Map map, long j2, LiveRoomUser liveRoomUser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, onLineMicInfo, (i & 4) != 0 ? null : bizApplyParams, map, j2, liveRoomUser);
    }
}
