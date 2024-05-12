package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelInviteData {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;
    public final Map<String, String> customData;
    public final LiveRoomUser invitee;
    public final String reason;
    public final long timeOutInterval;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Map<String, ? extends Object> custom;
        public Map<String, String> customData;
        public final LiveRoomUser invitee;
        public String reason;
        public final long timeOutInterval;

        public final CancelInviteData build() {
            return new CancelInviteData(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final LiveRoomUser getInvitee() {
            return this.invitee;
        }

        public final String getReason() {
            return this.reason;
        }

        public final long getTimeOutInterval() {
            return this.timeOutInterval;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public Builder(LiveRoomUser invitee, long j) {
            o.LJIIIZ(invitee, "invitee");
            this.invitee = invitee;
            this.timeOutInterval = j;
        }
    }

    public /* synthetic */ CancelInviteData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelInviteData copy$default(CancelInviteData cancelInviteData, Map map, LiveRoomUser liveRoomUser, Map map2, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cancelInviteData.customData;
        }
        if ((i & 2) != 0) {
            liveRoomUser = cancelInviteData.invitee;
        }
        if ((i & 4) != 0) {
            map2 = cancelInviteData.custom;
        }
        if ((i & 8) != 0) {
            str = cancelInviteData.reason;
        }
        if ((i & 16) != 0) {
            j = cancelInviteData.timeOutInterval;
        }
        return cancelInviteData.copy(map, liveRoomUser, map2, str, j);
    }

    public final CancelInviteData copy(Map<String, String> map, LiveRoomUser invitee, Map<String, ? extends Object> map2, String str, long j) {
        o.LJIIIZ(invitee, "invitee");
        return new CancelInviteData(map, invitee, map2, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelInviteData)) {
            return false;
        }
        CancelInviteData cancelInviteData = (CancelInviteData) obj;
        return o.LJ(this.customData, cancelInviteData.customData) && o.LJ(this.invitee, cancelInviteData.invitee) && o.LJ(this.custom, cancelInviteData.custom) && o.LJ(this.reason, cancelInviteData.reason) && this.timeOutInterval == cancelInviteData.timeOutInterval;
    }

    public int hashCode() {
        Map<String, String> map = this.customData;
        int hashCode = (this.invitee.hashCode() + ((map == null ? 0 : map.hashCode()) * 31)) * 31;
        Map<String, Object> map2 = this.custom;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.reason;
        return C16880lQ.LLJIJIL(this.timeOutInterval) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelInviteData(customData=");
        LIZ.append(this.customData);
        LIZ.append(", invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", custom=");
        LIZ.append(this.custom);
        LIZ.append(", reason=");
        LIZ.append(this.reason);
        LIZ.append(", timeOutInterval=");
        return C47135Ieh.LIZIZ(LIZ, this.timeOutInterval, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CancelInviteData build(LiveRoomUser invitee, long j, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(invitee, "invitee");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(invitee, j);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final LiveRoomUser getInvitee() {
        return this.invitee;
    }

    public final String getReason() {
        return this.reason;
    }

    public final long getTimeOutInterval() {
        return this.timeOutInterval;
    }

    public CancelInviteData(Builder builder) {
        this(builder.getCustomData(), builder.getInvitee(), builder.getCustom(), builder.getReason(), builder.getTimeOutInterval());
    }

    public CancelInviteData(Map<String, String> map, LiveRoomUser invitee, Map<String, ? extends Object> map2, String str, long j) {
        o.LJIIIZ(invitee, "invitee");
        this.customData = map;
        this.invitee = invitee;
        this.custom = map2;
        this.reason = str;
        this.timeOutInterval = j;
    }
}
