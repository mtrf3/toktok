package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class CreateChannelResponse extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("is_resume")
    public Integer isResume;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizCreateChannelResponse multiGuestRespExtra;

    @InterfaceC65349Pkn("info")
    public RTCExtraInfo rtcInfo;

    @InterfaceC65349Pkn("self_link_mic_id")
    public String selfLinkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateChannelResponse() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.channelId), this.rtcInfo, this.selfLinkMicId, this.isResume, this.multiGuestRespExtra};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateChannelResponse) {
            return C78966Uyw.LJIIIZ(((CreateChannelResponse) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CreateChannelResponse:%s,%s,%s,%s,%s", LIZ());
    }

    public CreateChannelResponse(long j, RTCExtraInfo rTCExtraInfo, String str, Integer num, BizCreateChannelResponse bizCreateChannelResponse) {
        super(null, 1, null);
        this.channelId = j;
        this.rtcInfo = rTCExtraInfo;
        this.selfLinkMicId = str;
        this.isResume = num;
        this.multiGuestRespExtra = bizCreateChannelResponse;
    }

    public /* synthetic */ CreateChannelResponse(long j, RTCExtraInfo rTCExtraInfo, String str, Integer num, BizCreateChannelResponse bizCreateChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : rTCExtraInfo, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) == 0 ? bizCreateChannelResponse : null);
    }
}
