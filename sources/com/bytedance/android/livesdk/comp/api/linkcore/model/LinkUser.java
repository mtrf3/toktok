package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkUser {
    public static final Companion Companion = new Companion();
    public String appVersion;
    public Long channelId;
    public final Long channelOwnerJoinTime;
    public final Long channelOwnerLinkedTime;
    public Object extra;
    public String linkMicId;
    public final Long ownerChannelId;
    public final Long ownerRoomId;
    public final Long ownerUid;
    public OnLineMicInfo position;
    public final Long roomId;
    public final Long userId;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public String appVersion;
        public Long channelId;
        public Long channelOwnerJoinTime;
        public Long channelOwnerLinkedTime;
        public Object extra;
        public String linkMicId;
        public OnLineMicInfo micPositionData;
        public Long ownerChannelId;
        public Long ownerRoomId;
        public Long ownerUid;
        public Long roomId;
        public Long userId;

        public final LinkUser build() {
            return new LinkUser(this);
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final Long getChannelId() {
            return this.channelId;
        }

        public final Long getChannelOwnerJoinTime() {
            return this.channelOwnerJoinTime;
        }

        public final Long getChannelOwnerLinkedTime() {
            return this.channelOwnerLinkedTime;
        }

        public final Object getExtra() {
            return this.extra;
        }

        public final String getLinkMicId() {
            return this.linkMicId;
        }

        public final OnLineMicInfo getMicPositionData() {
            return this.micPositionData;
        }

        public final Long getOwnerChannelId() {
            return this.ownerChannelId;
        }

        public final Long getOwnerRoomId() {
            return this.ownerRoomId;
        }

        public final Long getOwnerUid() {
            return this.ownerUid;
        }

        public final Long getRoomId() {
            return this.roomId;
        }

        public final Long getUserId() {
            return this.userId;
        }

        public final void setAppVersion(String str) {
            this.appVersion = str;
        }

        public final void setChannelId(Long l) {
            this.channelId = l;
        }

        public final void setChannelOwnerJoinTime(Long l) {
            this.channelOwnerJoinTime = l;
        }

        public final void setChannelOwnerLinkedTime(Long l) {
            this.channelOwnerLinkedTime = l;
        }

        public final void setExtra(Object obj) {
            this.extra = obj;
        }

        public final void setLinkMicId(String str) {
            this.linkMicId = str;
        }

        public final void setMicPositionData(OnLineMicInfo onLineMicInfo) {
            this.micPositionData = onLineMicInfo;
        }

        public final void setOwnerChannelId(Long l) {
            this.ownerChannelId = l;
        }

        public final void setOwnerRoomId(Long l) {
            this.ownerRoomId = l;
        }

        public final void setOwnerUid(Long l) {
            this.ownerUid = l;
        }

        public final void setRoomId(Long l) {
            this.roomId = l;
        }

        public final void setUserId(Long l) {
            this.userId = l;
        }
    }

    public /* synthetic */ LinkUser(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ LinkUser copy$default(LinkUser linkUser, Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, String str2, Long l4, Long l5, Long l6, Long l7, Long l8, int i, Object obj2) {
        if ((i & 1) != 0) {
            l = linkUser.roomId;
        }
        if ((i & 2) != 0) {
            l2 = linkUser.userId;
        }
        if ((i & 4) != 0) {
            l3 = linkUser.channelId;
        }
        if ((i & 8) != 0) {
            str = linkUser.linkMicId;
        }
        if ((i & 16) != 0) {
            onLineMicInfo = linkUser.position;
        }
        if ((i & 32) != 0) {
            obj = linkUser.extra;
        }
        if ((i & 64) != 0) {
            str2 = linkUser.appVersion;
        }
        if ((i & 128) != 0) {
            l4 = linkUser.channelOwnerJoinTime;
        }
        if ((i & 256) != 0) {
            l5 = linkUser.channelOwnerLinkedTime;
        }
        if ((i & 512) != 0) {
            l6 = linkUser.ownerUid;
        }
        if ((i & 1024) != 0) {
            l7 = linkUser.ownerRoomId;
        }
        if ((i & 2048) != 0) {
            l8 = linkUser.ownerChannelId;
        }
        return linkUser.copy(l, l2, l3, str, onLineMicInfo, obj, str2, l4, l5, l6, l7, l8);
    }

    public final LinkUser copy(Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, String str2, Long l4, Long l5, Long l6, Long l7, Long l8) {
        return new LinkUser(l, l2, l3, str, onLineMicInfo, obj, str2, l4, l5, l6, l7, l8);
    }

    public String toString() {
        return "LinkUser(roomId=" + this.roomId + ", userId=" + this.userId + ", channelId=" + this.channelId + ", linkMicId=" + this.linkMicId + ", position=" + this.position + ", extra=" + this.extra + ", appVersion=" + this.appVersion + ", channelOwnerJoinTime=" + this.channelOwnerJoinTime + ", channelOwnerLinkedTime=" + this.channelOwnerLinkedTime + ", ownerUid=" + this.ownerUid + ", ownerRoomId=" + this.ownerRoomId + ", ownerChannelId=" + this.ownerChannelId + ')';
    }

    public final String getActualLinkMicId() {
        String str = this.linkMicId;
        if (str != null) {
            o.LJI(str);
            return str;
        }
        Long l = this.userId;
        o.LJI(l);
        return String.valueOf(l.longValue());
    }

    public int hashCode() {
        int i;
        Long l = this.roomId;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Long l2 = this.userId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i3 + i2;
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LinkUser build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Long getChannelId() {
        return this.channelId;
    }

    public final Long getChannelOwnerJoinTime() {
        return this.channelOwnerJoinTime;
    }

    public final Long getChannelOwnerLinkedTime() {
        return this.channelOwnerLinkedTime;
    }

    public final Object getExtra() {
        return this.extra;
    }

    public final String getLinkMicId() {
        return this.linkMicId;
    }

    public final Long getOwnerChannelId() {
        return this.ownerChannelId;
    }

    public final Long getOwnerRoomId() {
        return this.ownerRoomId;
    }

    public final Long getOwnerUid() {
        return this.ownerUid;
    }

    public final OnLineMicInfo getPosition() {
        return this.position;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public LinkUser(Builder builder) {
        this(builder.getRoomId(), builder.getUserId(), builder.getChannelId(), builder.getLinkMicId(), builder.getMicPositionData(), builder.getExtra(), builder.getAppVersion(), builder.getChannelOwnerJoinTime(), builder.getChannelOwnerLinkedTime(), builder.getOwnerUid(), builder.getOwnerRoomId(), builder.getOwnerChannelId());
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(LinkUser.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser");
        LinkUser linkUser = (LinkUser) obj;
        if (!o.LJ(this.roomId, linkUser.roomId) || !o.LJ(this.userId, linkUser.userId)) {
            return false;
        }
        if (!MtCoHostCrossRoomPushSDKSetting.isEnable() || (o.LJ(this.channelId, linkUser.channelId) && o.LJ(this.linkMicId, linkUser.linkMicId) && o.LJ(this.position, linkUser.position) && o.LJ(this.extra, linkUser.extra) && o.LJ(this.appVersion, linkUser.appVersion) && o.LJ(this.channelOwnerJoinTime, linkUser.channelOwnerJoinTime) && o.LJ(this.channelOwnerLinkedTime, linkUser.channelOwnerLinkedTime) && o.LJ(this.ownerUid, linkUser.ownerUid) && o.LJ(this.ownerRoomId, linkUser.ownerRoomId) && o.LJ(this.ownerChannelId, linkUser.ownerChannelId))) {
            return true;
        }
        return false;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setChannelId(Long l) {
        this.channelId = l;
    }

    public final void setExtra(Object obj) {
        this.extra = obj;
    }

    public final void setLinkMicId(String str) {
        this.linkMicId = str;
    }

    public final void setPosition(OnLineMicInfo onLineMicInfo) {
        this.position = onLineMicInfo;
    }

    public LinkUser(Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, String str2, Long l4, Long l5, Long l6, Long l7, Long l8) {
        this.roomId = l;
        this.userId = l2;
        this.channelId = l3;
        this.linkMicId = str;
        this.position = onLineMicInfo;
        this.extra = obj;
        this.appVersion = str2;
        this.channelOwnerJoinTime = l4;
        this.channelOwnerLinkedTime = l5;
        this.ownerUid = l6;
        this.ownerRoomId = l7;
        this.ownerChannelId = l8;
    }

    public /* synthetic */ LinkUser(Long l, Long l2, Long l3, String str, OnLineMicInfo onLineMicInfo, Object obj, String str2, Long l4, Long l5, Long l6, Long l7, Long l8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, str, onLineMicInfo, obj, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : l5, (i & 512) != 0 ? null : l6, (i & 1024) != 0 ? null : l7, (i & 2048) == 0 ? l8 : null);
    }
}
