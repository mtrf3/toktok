package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class JoinDirectResp extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("all_users")
    public AllListUser allUsers;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizJoinDirectResponse multiGuestRespExtra;

    @InterfaceC65349Pkn("self_pos")
    public MicPositionData position;

    @InterfaceC65349Pkn("info")
    public RTCExtraInfo rtcInfo;

    @InterfaceC65349Pkn("self_link_mic_id")
    public String selfLinkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public JoinDirectResp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final Object[] LIZ() {
        return new Object[]{this.rtcInfo, this.selfLinkMicId, this.position, this.allUsers, this.multiGuestRespExtra};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoinDirectResp) {
            return C78966Uyw.LJIIIZ(((JoinDirectResp) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("JoinDirectResp:%s,%s,%s,%s,%s", LIZ());
    }

    public JoinDirectResp(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, AllListUser allListUser, BizJoinDirectResponse bizJoinDirectResponse) {
        super(null, 1, null);
        this.rtcInfo = rTCExtraInfo;
        this.selfLinkMicId = str;
        this.position = micPositionData;
        this.allUsers = allListUser;
        this.multiGuestRespExtra = bizJoinDirectResponse;
    }

    public /* synthetic */ JoinDirectResp(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, AllListUser allListUser, BizJoinDirectResponse bizJoinDirectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rTCExtraInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : micPositionData, (i & 8) != 0 ? null : allListUser, (i & 16) == 0 ? bizJoinDirectResponse : null);
    }
}
