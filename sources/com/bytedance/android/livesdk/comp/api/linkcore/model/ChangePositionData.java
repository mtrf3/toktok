package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ChangePositionData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final OnLineMicInfo positionData;
    public final LiveRoomUser targetUser;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Map<String, String> customData;
        public OnLineMicInfo positionData;
        public LiveRoomUser targetUser;

        public final ChangePositionData build() {
            return new ChangePositionData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final OnLineMicInfo getPositionData() {
            return this.positionData;
        }

        public final LiveRoomUser getTargetUser() {
            return this.targetUser;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setPositionData(OnLineMicInfo onLineMicInfo) {
            this.positionData = onLineMicInfo;
        }

        public final void setTargetUser(LiveRoomUser liveRoomUser) {
            this.targetUser = liveRoomUser;
        }
    }

    public /* synthetic */ ChangePositionData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangePositionData copy$default(ChangePositionData changePositionData, LiveRoomUser liveRoomUser, OnLineMicInfo onLineMicInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            liveRoomUser = changePositionData.targetUser;
        }
        if ((i & 2) != 0) {
            onLineMicInfo = changePositionData.positionData;
        }
        if ((i & 4) != 0) {
            map = changePositionData.customData;
        }
        return changePositionData.copy(liveRoomUser, onLineMicInfo, map);
    }

    public final ChangePositionData copy(LiveRoomUser liveRoomUser, OnLineMicInfo onLineMicInfo, Map<String, String> map) {
        return new ChangePositionData(liveRoomUser, onLineMicInfo, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePositionData)) {
            return false;
        }
        ChangePositionData changePositionData = (ChangePositionData) obj;
        return o.LJ(this.targetUser, changePositionData.targetUser) && o.LJ(this.positionData, changePositionData.positionData) && o.LJ(this.customData, changePositionData.customData);
    }

    public int hashCode() {
        LiveRoomUser liveRoomUser = this.targetUser;
        int hashCode = (liveRoomUser == null ? 0 : liveRoomUser.hashCode()) * 31;
        OnLineMicInfo onLineMicInfo = this.positionData;
        int hashCode2 = (hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31;
        Map<String, String> map = this.customData;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangePositionData(targetUser=");
        LIZ.append(this.targetUser);
        LIZ.append(", positionData=");
        LIZ.append(this.positionData);
        LIZ.append(", customData=");
        return C15890jp.LIZ(LIZ, this.customData, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ChangePositionData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final OnLineMicInfo getPositionData() {
        return this.positionData;
    }

    public final LiveRoomUser getTargetUser() {
        return this.targetUser;
    }

    public ChangePositionData(Builder builder) {
        this(builder.getTargetUser(), builder.getPositionData(), builder.getCustomData());
    }

    public ChangePositionData(LiveRoomUser liveRoomUser, OnLineMicInfo onLineMicInfo, Map<String, String> map) {
        this.targetUser = liveRoomUser;
        this.positionData = onLineMicInfo;
        this.customData = map;
    }
}
