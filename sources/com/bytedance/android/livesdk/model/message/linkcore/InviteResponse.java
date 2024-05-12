package com.bytedance.android.livesdk.model.message.linkcore;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class InviteResponse extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("invite_seq_id")
    public long inviteSeqId;

    @InterfaceC65349Pkn("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @InterfaceC65349Pkn("invitor_link_mic_id")
    public String inviterLinkMicId;

    @InterfaceC65349Pkn("invitor_ext_info")
    public RTCExtraInfo rtcInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InviteResponse() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 31
            r0 = r10
            r4 = r3
            r5 = r3
            r6 = r1
            r9 = r3
            r0.<init>(r1, r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.InviteResponse.<init>():void");
    }

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.channelId), this.rtcInfo, this.inviterLinkMicId, this.inviteeLinkMicId, Long.valueOf(this.inviteSeqId)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InviteResponse) {
            return C78966Uyw.LJIIIZ(((InviteResponse) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("InviteResponse:%s,%s,%s,%s,%s", LIZ());
    }

    public InviteResponse(long j, RTCExtraInfo rTCExtraInfo, String str, String str2, long j2) {
        super(null, 1, null);
        this.channelId = j;
        this.rtcInfo = rTCExtraInfo;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.inviteSeqId = j2;
    }

    public /* synthetic */ InviteResponse(long j, RTCExtraInfo rTCExtraInfo, String str, String str2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : rTCExtraInfo, (i & 4) != 0 ? null : str, (i & 8) == 0 ? str2 : null, (i & 16) != 0 ? 0L : j2);
    }
}
