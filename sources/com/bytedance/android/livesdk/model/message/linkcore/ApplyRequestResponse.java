package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ApplyRequestResponse extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("applier_link_mic_id")
    public String applicantLinkMicId;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizApplyResponse multiGuestRespExtra;

    @InterfaceC65349Pkn("applier_ext_info")
    public RTCExtraInfo rtcInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyRequestResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final Object[] LIZ() {
        return new Object[]{this.rtcInfo, this.applicantLinkMicId, this.multiGuestRespExtra};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplyRequestResponse) {
            return C78966Uyw.LJIIIZ(((ApplyRequestResponse) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ApplyRequestResponse:%s,%s,%s", LIZ());
    }

    public ApplyRequestResponse(RTCExtraInfo rTCExtraInfo, String str, BizApplyResponse bizApplyResponse) {
        super(null, 1, null);
        this.rtcInfo = rTCExtraInfo;
        this.applicantLinkMicId = str;
        this.multiGuestRespExtra = bizApplyResponse;
    }

    public /* synthetic */ ApplyRequestResponse(RTCExtraInfo rTCExtraInfo, String str, BizApplyResponse bizApplyResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rTCExtraInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bizApplyResponse);
    }
}
