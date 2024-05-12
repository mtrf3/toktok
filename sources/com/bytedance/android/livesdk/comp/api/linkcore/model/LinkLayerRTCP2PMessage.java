package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.B83;
import X.C30725C4b;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerRTCP2PMessage {

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("msg_id")
    public String msgId;

    @InterfaceC65349Pkn("param")
    public LinkLayerRTCMessageP2PParam param;

    @InterfaceC65349Pkn("ts")
    public Long timeStamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkLayerRTCP2PMessage() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkLayerRTCP2PMessage copy$default(LinkLayerRTCP2PMessage linkLayerRTCP2PMessage, String str, LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkLayerRTCP2PMessage.method;
        }
        if ((i & 2) != 0) {
            linkLayerRTCMessageP2PParam = linkLayerRTCP2PMessage.param;
        }
        if ((i & 4) != 0) {
            l = linkLayerRTCP2PMessage.timeStamp;
        }
        if ((i & 8) != 0) {
            str2 = linkLayerRTCP2PMessage.msgId;
        }
        return linkLayerRTCP2PMessage.copy(str, linkLayerRTCMessageP2PParam, l, str2);
    }

    public final LinkLayerRTCP2PMessage copy(String method, LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, Long l, String str) {
        o.LJIIIZ(method, "method");
        return new LinkLayerRTCP2PMessage(method, linkLayerRTCMessageP2PParam, l, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkLayerRTCP2PMessage)) {
            return false;
        }
        LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = (LinkLayerRTCP2PMessage) obj;
        return o.LJ(this.method, linkLayerRTCP2PMessage.method) && o.LJ(this.param, linkLayerRTCP2PMessage.param) && o.LJ(this.timeStamp, linkLayerRTCP2PMessage.timeStamp) && o.LJ(this.msgId, linkLayerRTCP2PMessage.msgId);
    }

    public int hashCode() {
        int hashCode = this.method.hashCode() * 31;
        LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam = this.param;
        int hashCode2 = (hashCode + (linkLayerRTCMessageP2PParam == null ? 0 : linkLayerRTCMessageP2PParam.hashCode())) * 31;
        Long l = this.timeStamp;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.msgId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void generateId() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(B83.LIZ().LIZIZ().getCurrentUserId());
        LIZ.append('_');
        LIZ.append(this.timeStamp);
        this.msgId = X1D.LIZIZ(LIZ);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkLayerRTCP2PMessage(method=");
        LIZ.append(this.method);
        LIZ.append(", param=");
        LIZ.append(this.param);
        LIZ.append(", timeStamp=");
        LIZ.append(this.timeStamp);
        LIZ.append(", msgId=");
        return q.LIZIZ(LIZ, this.msgId, ')', LIZ);
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final LinkLayerRTCMessageP2PParam getParam() {
        return this.param;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.method = str;
    }

    public final void setMsgId(String str) {
        this.msgId = str;
    }

    public final void setParam(LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam) {
        this.param = linkLayerRTCMessageP2PParam;
    }

    public final void setTimeStamp(Long l) {
        this.timeStamp = l;
    }

    public LinkLayerRTCP2PMessage(String method, LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, Long l, String str) {
        o.LJIIIZ(method, "method");
        this.method = method;
        this.param = linkLayerRTCMessageP2PParam;
        this.timeStamp = l;
        this.msgId = str;
    }

    public /* synthetic */ LinkLayerRTCP2PMessage(String str, LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : linkLayerRTCMessageP2PParam, (i & 4) != 0 ? Long.valueOf(C30725C4b.LIZ()) : l, (i & 8) != 0 ? "" : str2);
    }
}
