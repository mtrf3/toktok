package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class KickOutData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final LiveRoomUser guest;
    public final int kickOutReason;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Map<String, String> customData;
        public final LiveRoomUser guest;
        public int kickOutReason;

        public final KickOutData build() {
            return new KickOutData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final LiveRoomUser getGuest() {
            return this.guest;
        }

        public final int getKickOutReason() {
            return this.kickOutReason;
        }

        public Builder(LiveRoomUser guest) {
            o.LJIIIZ(guest, "guest");
            this.guest = guest;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setKickOutReason(int i) {
            this.kickOutReason = i;
        }
    }

    public /* synthetic */ KickOutData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KickOutData copy$default(KickOutData kickOutData, int i, Map map, LiveRoomUser liveRoomUser, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = kickOutData.kickOutReason;
        }
        if ((i2 & 2) != 0) {
            map = kickOutData.customData;
        }
        if ((i2 & 4) != 0) {
            liveRoomUser = kickOutData.guest;
        }
        return kickOutData.copy(i, map, liveRoomUser);
    }

    public final KickOutData copy(int i, Map<String, String> map, LiveRoomUser guest) {
        o.LJIIIZ(guest, "guest");
        return new KickOutData(i, map, guest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KickOutData)) {
            return false;
        }
        KickOutData kickOutData = (KickOutData) obj;
        return this.kickOutReason == kickOutData.kickOutReason && o.LJ(this.customData, kickOutData.customData) && o.LJ(this.guest, kickOutData.guest);
    }

    public int hashCode() {
        int i = this.kickOutReason * 31;
        Map<String, String> map = this.customData;
        return this.guest.hashCode() + ((i + (map == null ? 0 : map.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KickOutData(kickOutReason=");
        LIZ.append(this.kickOutReason);
        LIZ.append(", customData=");
        LIZ.append(this.customData);
        LIZ.append(", guest=");
        LIZ.append(this.guest);
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

        public final KickOutData build(LiveRoomUser guest, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(guest, "guest");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(guest);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final LiveRoomUser getGuest() {
        return this.guest;
    }

    public final int getKickOutReason() {
        return this.kickOutReason;
    }

    public KickOutData(Builder builder) {
        this(builder.getKickOutReason(), builder.getCustomData(), builder.getGuest());
    }

    public KickOutData(int i, Map<String, String> map, LiveRoomUser guest) {
        o.LJIIIZ(guest, "guest");
        this.kickOutReason = i;
        this.customData = map;
        this.guest = guest;
    }
}
