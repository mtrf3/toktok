package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitResponse extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("applier")
    public Player applier;

    @InterfaceC65349Pkn("applier_link_mic_id")
    public String applierLinkMicId;

    @InterfaceC65349Pkn("permiter_link_mic_id")
    public String linkMicId;

    @InterfaceC65349Pkn("applier_pos")
    public MicPositionData position;

    @InterfaceC65349Pkn("permiter_ext_info")
    public RTCExtraInfo rtcInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PermitResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final Object[] LIZ() {
        return new Object[]{this.rtcInfo, this.linkMicId, this.position, this.applier, this.applierLinkMicId};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PermitResponse) {
            return C78966Uyw.LJIIIZ(((PermitResponse) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("PermitResponse:%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermitResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, Player player, String applierLinkMicId) {
        super(null, 1, null);
        o.LJIIIZ(applierLinkMicId, "applierLinkMicId");
        this.rtcInfo = rTCExtraInfo;
        this.linkMicId = str;
        this.position = micPositionData;
        this.applier = player;
        this.applierLinkMicId = applierLinkMicId;
    }

    public /* synthetic */ PermitResponse(RTCExtraInfo rTCExtraInfo, String str, MicPositionData micPositionData, Player player, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rTCExtraInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : micPositionData, (i & 8) == 0 ? player : null, (i & 16) != 0 ? "" : str2);
    }
}
