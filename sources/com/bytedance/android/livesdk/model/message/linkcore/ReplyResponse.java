package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReplyResponse extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizReplyResponse multiGuestRespExtra;

    @InterfaceC65349Pkn("invitee_pos")
    public MicPositionData position;

    @InterfaceC65349Pkn("invitee_ext_info")
    public RTCExtraInfo rtcInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final Object[] LIZ() {
        return new Object[]{this.rtcInfo, this.inviteeLinkMicId, this.position, this.multiGuestRespExtra};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReplyResponse) {
            return C78966Uyw.LJIIIZ(((ReplyResponse) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ReplyResponse:%s,%s,%s,%s", LIZ());
    }

    public ReplyResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, BizReplyResponse bizReplyResponse) {
        super(null, 1, null);
        this.rtcInfo = rTCExtraInfo;
        this.inviteeLinkMicId = str;
        this.position = micPositionData;
        this.multiGuestRespExtra = bizReplyResponse;
    }

    public /* synthetic */ ReplyResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, BizReplyResponse bizReplyResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rTCExtraInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : micPositionData, (i & 8) != 0 ? null : bizReplyResponse);
    }
}
