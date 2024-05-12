package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.JBR;
import X.X1D;
import defpackage.b0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InviteData {
    public static final Companion Companion = new Companion();
    public final long channelId;
    public final Map<String, Object> custom;
    public final Map<String, String> customData;
    public final long expireTimeInSeconds;
    public final LiveRoomUser invitee;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int maxPosition;
    public final OnLineMicInfo onLineMicInfo;
    public final int source;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public long channelId;
        public Map<String, ? extends Object> custom;
        public Map<String, String> customData;
        public long expireTimeInSeconds;
        public final LiveRoomUser invitee;
        public LayoutDSLConfig layoutDSLConfig;
        public int maxPosition;
        public OnLineMicInfo onLineMicInfo;
        public int source;

        public final InviteData build() {
            return new InviteData(this);
        }

        public final long getChannelId() {
            return this.channelId;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final long getExpireTimeInSeconds() {
            return this.expireTimeInSeconds;
        }

        public final LiveRoomUser getInvitee() {
            return this.invitee;
        }

        public final LayoutDSLConfig getLayoutDSLConfig() {
            return this.layoutDSLConfig;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final OnLineMicInfo getOnLineMicInfo() {
            return this.onLineMicInfo;
        }

        public final int getSource() {
            return this.source;
        }

        public Builder(LiveRoomUser invitee) {
            o.LJIIIZ(invitee, "invitee");
            this.invitee = invitee;
            this.channelId = -1L;
        }

        public final void setChannelId(long j) {
            this.channelId = j;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setExpireTimeInSeconds(long j) {
            this.expireTimeInSeconds = j;
        }

        public final void setLayoutDSLConfig(LayoutDSLConfig layoutDSLConfig) {
            this.layoutDSLConfig = layoutDSLConfig;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }

        public final void setOnLineMicInfo(OnLineMicInfo onLineMicInfo) {
            this.onLineMicInfo = onLineMicInfo;
        }

        public final void setSource(int i) {
            this.source = i;
        }
    }

    public /* synthetic */ InviteData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteData copy$default(InviteData inviteData, long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map map, Map map2, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = inviteData.channelId;
        }
        if ((i3 & 2) != 0) {
            i = inviteData.maxPosition;
        }
        if ((i3 & 4) != 0) {
            j2 = inviteData.expireTimeInSeconds;
        }
        if ((i3 & 8) != 0) {
            onLineMicInfo = inviteData.onLineMicInfo;
        }
        if ((i3 & 16) != 0) {
            map = inviteData.custom;
        }
        if ((i3 & 32) != 0) {
            map2 = inviteData.customData;
        }
        if ((i3 & 64) != 0) {
            liveRoomUser = inviteData.invitee;
        }
        if ((i3 & 128) != 0) {
            layoutDSLConfig = inviteData.layoutDSLConfig;
        }
        if ((i3 & 256) != 0) {
            i2 = inviteData.source;
        }
        return inviteData.copy(j, i, j2, onLineMicInfo, map, map2, liveRoomUser, layoutDSLConfig, i2);
    }

    public final InviteData copy(long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map<String, ? extends Object> map, Map<String, String> map2, LiveRoomUser invitee, LayoutDSLConfig layoutDSLConfig, int i2) {
        o.LJIIIZ(invitee, "invitee");
        return new InviteData(j, i, j2, onLineMicInfo, map, map2, invitee, layoutDSLConfig, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteData)) {
            return false;
        }
        InviteData inviteData = (InviteData) obj;
        return this.channelId == inviteData.channelId && this.maxPosition == inviteData.maxPosition && this.expireTimeInSeconds == inviteData.expireTimeInSeconds && o.LJ(this.onLineMicInfo, inviteData.onLineMicInfo) && o.LJ(this.custom, inviteData.custom) && o.LJ(this.customData, inviteData.customData) && o.LJ(this.invitee, inviteData.invitee) && o.LJ(this.layoutDSLConfig, inviteData.layoutDSLConfig) && this.source == inviteData.source;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZJ = JBR.LIZJ(this.expireTimeInSeconds, ((C16880lQ.LLJIJIL(this.channelId) * 31) + this.maxPosition) * 31, 31);
        OnLineMicInfo onLineMicInfo = this.onLineMicInfo;
        int i = 0;
        if (onLineMicInfo == null) {
            hashCode = 0;
        } else {
            hashCode = onLineMicInfo.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Map<String, Object> map = this.custom;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, String> map2 = this.customData;
        if (map2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map2.hashCode();
        }
        int hashCode4 = (this.invitee.hashCode() + ((i3 + hashCode3) * 31)) * 31;
        LayoutDSLConfig layoutDSLConfig = this.layoutDSLConfig;
        if (layoutDSLConfig != null) {
            i = layoutDSLConfig.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.source;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteData(channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", maxPosition=");
        LIZ.append(this.maxPosition);
        LIZ.append(", expireTimeInSeconds=");
        LIZ.append(this.expireTimeInSeconds);
        LIZ.append(", onLineMicInfo=");
        LIZ.append(this.onLineMicInfo);
        LIZ.append(", custom=");
        LIZ.append(this.custom);
        LIZ.append(", customData=");
        LIZ.append(this.customData);
        LIZ.append(", invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", layoutDSLConfig=");
        LIZ.append(this.layoutDSLConfig);
        LIZ.append(", source=");
        return b0.LIZJ(LIZ, this.source, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final InviteData build(LiveRoomUser invitee, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(invitee, "invitee");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(invitee);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final long getChannelId() {
        return this.channelId;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final long getExpireTimeInSeconds() {
        return this.expireTimeInSeconds;
    }

    public final LiveRoomUser getInvitee() {
        return this.invitee;
    }

    public final LayoutDSLConfig getLayoutDSLConfig() {
        return this.layoutDSLConfig;
    }

    public final int getMaxPosition() {
        return this.maxPosition;
    }

    public final OnLineMicInfo getOnLineMicInfo() {
        return this.onLineMicInfo;
    }

    public final int getSource() {
        return this.source;
    }

    public InviteData(Builder builder) {
        this(builder.getChannelId(), builder.getMaxPosition(), builder.getExpireTimeInSeconds(), builder.getOnLineMicInfo(), builder.getCustom(), builder.getCustomData(), builder.getInvitee(), builder.getLayoutDSLConfig(), builder.getSource());
    }

    public InviteData(long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map<String, ? extends Object> map, Map<String, String> map2, LiveRoomUser invitee, LayoutDSLConfig layoutDSLConfig, int i2) {
        o.LJIIIZ(invitee, "invitee");
        this.channelId = j;
        this.maxPosition = i;
        this.expireTimeInSeconds = j2;
        this.onLineMicInfo = onLineMicInfo;
        this.custom = map;
        this.customData = map2;
        this.invitee = invitee;
        this.layoutDSLConfig = layoutDSLConfig;
        this.source = i2;
    }

    public /* synthetic */ InviteData(long j, int i, long j2, OnLineMicInfo onLineMicInfo, Map map, Map map2, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, j2, onLineMicInfo, map, map2, liveRoomUser, layoutDSLConfig, (i3 & 256) != 0 ? 0 : i2);
    }
}
