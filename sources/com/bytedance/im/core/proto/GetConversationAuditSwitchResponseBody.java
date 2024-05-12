package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C89452Z8u;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQW;
import X.RQX;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetConversationAuditSwitchResponseBody extends Message<GetConversationAuditSwitchResponseBody, RQX> {
    public static final ProtoAdapter<GetConversationAuditSwitchResponseBody> ADAPTER;
    public static final Boolean DEFAULT_SWITCH_STATUS;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("switch_status")
    public final Boolean switch_status;

    static {
        RQW rqw = new RQW();
        ADAPTER = rqw;
        DEFAULT_SWITCH_STATUS = Boolean.FALSE;
        C89452Z8u.LJ.put(2022, rqw);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2022, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationAuditSwitchResponseBody, RQX> newBuilder2() {
        RQX rqx = new RQX();
        rqx.LIZLLL = this.switch_status;
        rqx.addUnknownFields(unknownFields());
        return rqx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.switch_status != null) {
            sb.append(", switch_status=");
            sb.append(this.switch_status);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationAuditSwitchResponseBody{", '}');
    }

    public GetConversationAuditSwitchResponseBody(Boolean bool) {
        this(bool, C64537PUn.EMPTY);
    }

    public GetConversationAuditSwitchResponseBody(Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.switch_status = bool;
    }
}
