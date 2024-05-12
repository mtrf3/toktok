package com.bytedance.android.live.liveinteract.cohost.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RtcMessage {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("params")
    public String content;

    @InterfaceC65349Pkn("method")
    public String method;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtcMessage)) {
            return false;
        }
        RtcMessage rtcMessage = (RtcMessage) obj;
        return o.LJ(this.method, rtcMessage.method) && this.channelId == rtcMessage.channelId && o.LJ(this.content, rtcMessage.content);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.channelId, this.method.hashCode() * 31, 31);
        String str = this.content;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RtcMessage(method=");
        LIZ.append(this.method);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", content=");
        return q.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public RtcMessage(String method, long j, String str) {
        o.LJIIIZ(method, "method");
        this.method = method;
        this.channelId = j;
        this.content = str;
    }

    public /* synthetic */ RtcMessage(String str, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, j, (i & 4) != 0 ? null : str2);
    }
}
