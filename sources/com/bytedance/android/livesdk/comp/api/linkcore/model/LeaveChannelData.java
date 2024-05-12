package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C16880lQ;
import X.C76800UCe;
import X.C79062V1e;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LeaveChannelData {
    public static final Companion Companion = new Companion();
    public final BizLeaveParams bizLeaveParams;
    public final Map<String, Object> custom;
    public final int leaveReason;
    public final String leaveSource;
    public final String leavedLinkMicId;
    public final long notSuggestToUid;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizLeaveParams bizLeaveParams;
        public Map<String, ? extends Object> custom;
        public int leaveReason;
        public String leaveSource = "";
        public String leavedLinkMicId;
        public long notSuggestToUid;

        public final LeaveChannelData build() {
            return new LeaveChannelData(this);
        }

        public final BizLeaveParams getBizLeaveParams() {
            return this.bizLeaveParams;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final int getLeaveReason() {
            return this.leaveReason;
        }

        public final String getLeaveSource() {
            return this.leaveSource;
        }

        public final String getLeavedLinkMicId() {
            return this.leavedLinkMicId;
        }

        public final long getNotSuggestToUid() {
            return this.notSuggestToUid;
        }

        public final void setBizLeaveParams(BizLeaveParams bizLeaveParams) {
            this.bizLeaveParams = bizLeaveParams;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setLeaveReason(int i) {
            this.leaveReason = i;
        }

        public final void setLeaveSource(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.leaveSource = str;
        }

        public final void setLeavedLinkMicId(String str) {
            this.leavedLinkMicId = str;
        }

        public final void setNotSuggestToUid(long j) {
            this.notSuggestToUid = j;
        }
    }

    public /* synthetic */ LeaveChannelData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaveChannelData copy$default(LeaveChannelData leaveChannelData, long j, BizLeaveParams bizLeaveParams, Map map, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = leaveChannelData.notSuggestToUid;
        }
        if ((i2 & 2) != 0) {
            bizLeaveParams = leaveChannelData.bizLeaveParams;
        }
        if ((i2 & 4) != 0) {
            map = leaveChannelData.custom;
        }
        if ((i2 & 8) != 0) {
            str = leaveChannelData.leaveSource;
        }
        if ((i2 & 16) != 0) {
            i = leaveChannelData.leaveReason;
        }
        if ((i2 & 32) != 0) {
            str2 = leaveChannelData.leavedLinkMicId;
        }
        return leaveChannelData.copy(j, bizLeaveParams, map, str, i, str2);
    }

    public final LeaveChannelData copy(long j, BizLeaveParams bizLeaveParams, Map<String, ? extends Object> map, String leaveSource, int i, String str) {
        o.LJIIIZ(leaveSource, "leaveSource");
        return new LeaveChannelData(j, bizLeaveParams, map, leaveSource, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveChannelData)) {
            return false;
        }
        LeaveChannelData leaveChannelData = (LeaveChannelData) obj;
        return this.notSuggestToUid == leaveChannelData.notSuggestToUid && o.LJ(this.bizLeaveParams, leaveChannelData.bizLeaveParams) && o.LJ(this.custom, leaveChannelData.custom) && o.LJ(this.leaveSource, leaveChannelData.leaveSource) && this.leaveReason == leaveChannelData.leaveReason && o.LJ(this.leavedLinkMicId, leaveChannelData.leavedLinkMicId);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LLJIJIL = C16880lQ.LLJIJIL(this.notSuggestToUid) * 31;
        BizLeaveParams bizLeaveParams = this.bizLeaveParams;
        int i = 0;
        if (bizLeaveParams == null) {
            hashCode = 0;
        } else {
            hashCode = bizLeaveParams.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        Map<String, Object> map = this.custom;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int LJ = (C79062V1e.LJ(this.leaveSource, (i2 + hashCode2) * 31, 31) + this.leaveReason) * 31;
        String str = this.leavedLinkMicId;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveChannelData(notSuggestToUid=");
        LIZ.append(this.notSuggestToUid);
        LIZ.append(", bizLeaveParams=");
        LIZ.append(this.bizLeaveParams);
        LIZ.append(", custom=");
        LIZ.append(this.custom);
        LIZ.append(", leaveSource=");
        LIZ.append(this.leaveSource);
        LIZ.append(", leaveReason=");
        LIZ.append(this.leaveReason);
        LIZ.append(", leavedLinkMicId=");
        return q.LIZIZ(LIZ, this.leavedLinkMicId, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LeaveChannelData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizLeaveParams getBizLeaveParams() {
        return this.bizLeaveParams;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final int getLeaveReason() {
        return this.leaveReason;
    }

    public final String getLeaveSource() {
        return this.leaveSource;
    }

    public final String getLeavedLinkMicId() {
        return this.leavedLinkMicId;
    }

    public final long getNotSuggestToUid() {
        return this.notSuggestToUid;
    }

    public LeaveChannelData(Builder builder) {
        this(builder.getNotSuggestToUid(), builder.getBizLeaveParams(), builder.getCustom(), builder.getLeaveSource(), builder.getLeaveReason(), builder.getLeavedLinkMicId());
    }

    public LeaveChannelData(long j, BizLeaveParams bizLeaveParams, Map<String, ? extends Object> map, String leaveSource, int i, String str) {
        o.LJIIIZ(leaveSource, "leaveSource");
        this.notSuggestToUid = j;
        this.bizLeaveParams = bizLeaveParams;
        this.custom = map;
        this.leaveSource = leaveSource;
        this.leaveReason = i;
        this.leavedLinkMicId = str;
    }

    public /* synthetic */ LeaveChannelData(long j, BizLeaveParams bizLeaveParams, Map map, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : bizLeaveParams, (i2 & 4) != 0 ? null : map, str, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? str2 : null);
    }
}
