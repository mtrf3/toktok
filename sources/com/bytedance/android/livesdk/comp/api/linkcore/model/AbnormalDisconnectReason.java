package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.C79062V1e;
import X.InterfaceC88472Yns;
import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AbnormalDisconnectReason {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;
    public final String disconnectFromLinkMicId;
    public final long disconnectFromUid;
    public final String disconnectSource;
    public final int dissconnectReason;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Map<String, ? extends Object> custom;
        public String disconnectFromLinkMicId;
        public long disconnectFromUid;
        public String disconnectSource = "";
        public int dissconnectReason;

        public final AbnormalDisconnectReason build() {
            return new AbnormalDisconnectReason(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final String getDisconnectFromLinkMicId() {
            return this.disconnectFromLinkMicId;
        }

        public final long getDisconnectFromUid() {
            return this.disconnectFromUid;
        }

        public final String getDisconnectSource() {
            return this.disconnectSource;
        }

        public final int getDissconnectReason() {
            return this.dissconnectReason;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setDisconnectFromLinkMicId(String str) {
            this.disconnectFromLinkMicId = str;
        }

        public final void setDisconnectFromUid(long j) {
            this.disconnectFromUid = j;
        }

        public final void setDisconnectSource(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.disconnectSource = str;
        }

        public final void setDissconnectReason(int i) {
            this.dissconnectReason = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbnormalDisconnectReason() {
        this(0L, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AbnormalDisconnectReason(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbnormalDisconnectReason copy$default(AbnormalDisconnectReason abnormalDisconnectReason, long j, Map map, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = abnormalDisconnectReason.disconnectFromUid;
        }
        if ((i2 & 2) != 0) {
            map = abnormalDisconnectReason.custom;
        }
        if ((i2 & 4) != 0) {
            str = abnormalDisconnectReason.disconnectSource;
        }
        if ((i2 & 8) != 0) {
            i = abnormalDisconnectReason.dissconnectReason;
        }
        if ((i2 & 16) != 0) {
            str2 = abnormalDisconnectReason.disconnectFromLinkMicId;
        }
        return abnormalDisconnectReason.copy(j, map, str, i, str2);
    }

    public final AbnormalDisconnectReason copy(long j, Map<String, ? extends Object> map, String disconnectSource, int i, String str) {
        o.LJIIIZ(disconnectSource, "disconnectSource");
        return new AbnormalDisconnectReason(j, map, disconnectSource, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbnormalDisconnectReason)) {
            return false;
        }
        AbnormalDisconnectReason abnormalDisconnectReason = (AbnormalDisconnectReason) obj;
        return this.disconnectFromUid == abnormalDisconnectReason.disconnectFromUid && o.LJ(this.custom, abnormalDisconnectReason.custom) && o.LJ(this.disconnectSource, abnormalDisconnectReason.disconnectSource) && this.dissconnectReason == abnormalDisconnectReason.dissconnectReason && o.LJ(this.disconnectFromLinkMicId, abnormalDisconnectReason.disconnectFromLinkMicId);
    }

    public int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.disconnectFromUid) * 31;
        Map<String, Object> map = this.custom;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int LJ = (C79062V1e.LJ(this.disconnectSource, (LLJIJIL + hashCode) * 31, 31) + this.dissconnectReason) * 31;
        String str = this.disconnectFromLinkMicId;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbnormalDisconnectReason(disconnectFromUid=");
        LIZ.append(this.disconnectFromUid);
        LIZ.append(", custom=");
        LIZ.append(this.custom);
        LIZ.append(", disconnectSource=");
        LIZ.append(this.disconnectSource);
        LIZ.append(", dissconnectReason=");
        LIZ.append(this.dissconnectReason);
        LIZ.append(", disconnectFromLinkMicId=");
        return q.LIZIZ(LIZ, this.disconnectFromLinkMicId, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final AbnormalDisconnectReason build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final String getDisconnectFromLinkMicId() {
        return this.disconnectFromLinkMicId;
    }

    public final long getDisconnectFromUid() {
        return this.disconnectFromUid;
    }

    public final String getDisconnectSource() {
        return this.disconnectSource;
    }

    public final int getDissconnectReason() {
        return this.dissconnectReason;
    }

    public AbnormalDisconnectReason(Builder builder) {
        this(builder.getDisconnectFromUid(), builder.getCustom(), builder.getDisconnectSource(), builder.getDissconnectReason(), builder.getDisconnectFromLinkMicId());
    }

    public AbnormalDisconnectReason(long j, Map<String, ? extends Object> map, String disconnectSource, int i, String str) {
        o.LJIIIZ(disconnectSource, "disconnectSource");
        this.disconnectFromUid = j;
        this.custom = map;
        this.disconnectSource = disconnectSource;
        this.dissconnectReason = i;
        this.disconnectFromLinkMicId = str;
    }

    public /* synthetic */ AbnormalDisconnectReason(long j, Map map, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? str2 : null);
    }
}
