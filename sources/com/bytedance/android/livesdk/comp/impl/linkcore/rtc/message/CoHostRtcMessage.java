package com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message;

import X.C1NE;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CoHostRtcMessage {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("linked_users")
    public List<CoHostRtcMessageLinkerInfo> linkedUsers;

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("msg_id")
    public String msgId;

    @InterfaceC65349Pkn("new_arch")
    public int newArch;

    @InterfaceC65349Pkn("os")
    public String os;

    @InterfaceC65349Pkn("param")
    public CoHostRtcMessageParam param;

    @InterfaceC65349Pkn("ts")
    public long ts;

    @InterfaceC65349Pkn("version")
    public int version;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoHostRtcMessage)) {
            return false;
        }
        CoHostRtcMessage coHostRtcMessage = (CoHostRtcMessage) obj;
        return o.LJ(this.method, coHostRtcMessage.method) && this.channelId == coHostRtcMessage.channelId && o.LJ(this.param, coHostRtcMessage.param) && o.LJ(this.os, coHostRtcMessage.os) && this.newArch == coHostRtcMessage.newArch && this.version == coHostRtcMessage.version && this.ts == coHostRtcMessage.ts && o.LJ(this.msgId, coHostRtcMessage.msgId) && o.LJ(this.linkedUsers, coHostRtcMessage.linkedUsers);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.channelId, this.method.hashCode() * 31, 31);
        CoHostRtcMessageParam coHostRtcMessageParam = this.param;
        int i = 0;
        if (coHostRtcMessageParam == null) {
            hashCode = 0;
        } else {
            hashCode = coHostRtcMessageParam.hashCode();
        }
        int LJ = C79062V1e.LJ(this.msgId, JBR.LIZJ(this.ts, (((C79062V1e.LJ(this.os, (LIZJ + hashCode) * 31, 31) + this.newArch) * 31) + this.version) * 31, 31), 31);
        List<CoHostRtcMessageLinkerInfo> list = this.linkedUsers;
        if (list != null) {
            i = list.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CoHostRtcMessage(method=");
        LIZ.append(this.method);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", param=");
        LIZ.append(this.param);
        LIZ.append(", os=");
        LIZ.append(this.os);
        LIZ.append(", newArch=");
        LIZ.append(this.newArch);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", ts=");
        LIZ.append(this.ts);
        LIZ.append(", msgId=");
        LIZ.append(this.msgId);
        LIZ.append(", linkedUsers=");
        return C1NE.LIZIZ(LIZ, this.linkedUsers, ')', LIZ);
    }

    public CoHostRtcMessage(String str, long j, CoHostRtcMessageParam coHostRtcMessageParam, String str2, int i, int i2, long j2, String str3, List<CoHostRtcMessageLinkerInfo> list) {
        HH1.LIZ(str, "method", str2, "os", str3, "msgId");
        this.method = str;
        this.channelId = j;
        this.param = coHostRtcMessageParam;
        this.os = str2;
        this.newArch = i;
        this.version = i2;
        this.ts = j2;
        this.msgId = str3;
        this.linkedUsers = list;
    }

    public /* synthetic */ CoHostRtcMessage(String str, long j, CoHostRtcMessageParam coHostRtcMessageParam, String str2, int i, int i2, long j2, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, j, (i3 & 4) != 0 ? null : coHostRtcMessageParam, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? 0L : j2, (i3 & 128) == 0 ? str3 : "", (i3 & 256) == 0 ? list : null);
    }
}
