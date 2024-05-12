package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.B83;
import X.C30725C4b;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerRTCMessage {

    @InterfaceC65349Pkn("index")
    public long index;

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("msg_id")
    public String msgId;

    @InterfaceC65349Pkn("os")
    public String os;

    @InterfaceC65349Pkn("param")
    public LinkLayerRTCMessageParam param;

    @InterfaceC65349Pkn("ts")
    public Long timeStamp;

    @InterfaceC65349Pkn("uid")
    public String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkLayerRTCMessage() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkLayerRTCMessage copy$default(LinkLayerRTCMessage linkLayerRTCMessage, String str, LinkLayerRTCMessageParam linkLayerRTCMessageParam, Long l, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkLayerRTCMessage.method;
        }
        if ((i & 2) != 0) {
            linkLayerRTCMessageParam = linkLayerRTCMessage.param;
        }
        if ((i & 4) != 0) {
            l = linkLayerRTCMessage.timeStamp;
        }
        if ((i & 8) != 0) {
            str2 = linkLayerRTCMessage.msgId;
        }
        if ((i & 16) != 0) {
            j = linkLayerRTCMessage.index;
        }
        if ((i & 32) != 0) {
            str3 = linkLayerRTCMessage.uid;
        }
        if ((i & 64) != 0) {
            str4 = linkLayerRTCMessage.os;
        }
        return linkLayerRTCMessage.copy(str, linkLayerRTCMessageParam, l, str2, j, str3, str4);
    }

    public final LinkLayerRTCMessage copy(String method, LinkLayerRTCMessageParam linkLayerRTCMessageParam, Long l, String str, long j, String uid, String os) {
        o.LJIIIZ(method, "method");
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(os, "os");
        return new LinkLayerRTCMessage(method, linkLayerRTCMessageParam, l, str, j, uid, os);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkLayerRTCMessage)) {
            return false;
        }
        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) obj;
        return o.LJ(this.method, linkLayerRTCMessage.method) && o.LJ(this.param, linkLayerRTCMessage.param) && o.LJ(this.timeStamp, linkLayerRTCMessage.timeStamp) && o.LJ(this.msgId, linkLayerRTCMessage.msgId) && this.index == linkLayerRTCMessage.index && o.LJ(this.uid, linkLayerRTCMessage.uid) && o.LJ(this.os, linkLayerRTCMessage.os);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.method.hashCode() * 31;
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = this.param;
        int i = 0;
        if (linkLayerRTCMessageParam == null) {
            hashCode = 0;
        } else {
            hashCode = linkLayerRTCMessageParam.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Long l = this.timeStamp;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.msgId;
        if (str != null) {
            i = str.hashCode();
        }
        return this.os.hashCode() + C79062V1e.LJ(this.uid, JBR.LIZJ(this.index, (i3 + i) * 31, 31), 31);
    }

    public final void generateId() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(B83.LIZ().LIZIZ().getCurrentUserId());
        LIZ.append('_');
        LIZ.append(this.timeStamp);
        this.msgId = X1D.LIZIZ(LIZ);
        this.os = "Android";
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkLayerRTCMessage(method=");
        LIZ.append(this.method);
        LIZ.append(", param=");
        LIZ.append(this.param);
        LIZ.append(", timeStamp=");
        LIZ.append(this.timeStamp);
        LIZ.append(", msgId=");
        LIZ.append(this.msgId);
        LIZ.append(", index=");
        LIZ.append(this.index);
        LIZ.append(", uid=");
        LIZ.append(this.uid);
        LIZ.append(", os=");
        return q.LIZIZ(LIZ, this.os, ')', LIZ);
    }

    public final long getIndex() {
        return this.index;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getOs() {
        return this.os;
    }

    public final LinkLayerRTCMessageParam getParam() {
        return this.param;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setIndex(long j) {
        this.index = j;
    }

    public final void setMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.method = str;
    }

    public final void setMsgId(String str) {
        this.msgId = str;
    }

    public final void setOs(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.os = str;
    }

    public final void setParam(LinkLayerRTCMessageParam linkLayerRTCMessageParam) {
        this.param = linkLayerRTCMessageParam;
    }

    public final void setTimeStamp(Long l) {
        this.timeStamp = l;
    }

    public final void setUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uid = str;
    }

    public LinkLayerRTCMessage(String str, LinkLayerRTCMessageParam linkLayerRTCMessageParam, Long l, String str2, long j, String str3, String str4) {
        HH1.LIZ(str, "method", str3, "uid", str4, "os");
        this.method = str;
        this.param = linkLayerRTCMessageParam;
        this.timeStamp = l;
        this.msgId = str2;
        this.index = j;
        this.uid = str3;
        this.os = str4;
    }

    public /* synthetic */ LinkLayerRTCMessage(String str, LinkLayerRTCMessageParam linkLayerRTCMessageParam, Long l, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : linkLayerRTCMessageParam, (i & 4) != 0 ? Long.valueOf(C30725C4b.LIZ()) : l, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? -1L : j, (i & 32) != 0 ? "" : str3, (i & 64) == 0 ? str4 : "");
    }
}
