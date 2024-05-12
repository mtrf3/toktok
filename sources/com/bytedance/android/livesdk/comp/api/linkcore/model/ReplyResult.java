package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ReplyResult {
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final String inviteeLinkMicId;
    public final String logId;
    public final BizReplyResponse multiGuestRespExtra;

    public static /* synthetic */ ReplyResult copy$default(ReplyResult replyResult, String str, OnLineMicInfo onLineMicInfo, BizReplyResponse bizReplyResponse, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyResult.inviteeLinkMicId;
        }
        if ((i & 2) != 0) {
            onLineMicInfo = replyResult.inviteeFixedMicInfo;
        }
        if ((i & 4) != 0) {
            bizReplyResponse = replyResult.multiGuestRespExtra;
        }
        if ((i & 8) != 0) {
            str2 = replyResult.logId;
        }
        return replyResult.copy(str, onLineMicInfo, bizReplyResponse, str2);
    }

    public final String component1() {
        return this.inviteeLinkMicId;
    }

    public final OnLineMicInfo component2() {
        return this.inviteeFixedMicInfo;
    }

    public final BizReplyResponse component3() {
        return this.multiGuestRespExtra;
    }

    public final String component4() {
        return this.logId;
    }

    public final ReplyResult copy(String str, OnLineMicInfo onLineMicInfo, BizReplyResponse bizReplyResponse, String logId) {
        o.LJIIIZ(logId, "logId");
        return new ReplyResult(str, onLineMicInfo, bizReplyResponse, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyResult)) {
            return false;
        }
        ReplyResult replyResult = (ReplyResult) obj;
        return o.LJ(this.inviteeLinkMicId, replyResult.inviteeLinkMicId) && o.LJ(this.inviteeFixedMicInfo, replyResult.inviteeFixedMicInfo) && o.LJ(this.multiGuestRespExtra, replyResult.multiGuestRespExtra) && o.LJ(this.logId, replyResult.logId);
    }

    public int hashCode() {
        String str = this.inviteeLinkMicId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OnLineMicInfo onLineMicInfo = this.inviteeFixedMicInfo;
        int hashCode2 = (hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31;
        BizReplyResponse bizReplyResponse = this.multiGuestRespExtra;
        return this.logId.hashCode() + ((hashCode2 + (bizReplyResponse != null ? bizReplyResponse.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyResult(inviteeLinkMicId=");
        LIZ.append(this.inviteeLinkMicId);
        LIZ.append(", inviteeFixedMicInfo=");
        LIZ.append(this.inviteeFixedMicInfo);
        LIZ.append(", multiGuestRespExtra=");
        LIZ.append(this.multiGuestRespExtra);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public ReplyResult(String str, OnLineMicInfo onLineMicInfo, BizReplyResponse bizReplyResponse, String logId) {
        o.LJIIIZ(logId, "logId");
        this.inviteeLinkMicId = str;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.multiGuestRespExtra = bizReplyResponse;
        this.logId = logId;
    }

    public /* synthetic */ ReplyResult(String str, OnLineMicInfo onLineMicInfo, BizReplyResponse bizReplyResponse, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, onLineMicInfo, bizReplyResponse, (i & 8) != 0 ? "" : str2);
    }
}
