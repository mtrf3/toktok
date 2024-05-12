package com.bytedance.im.core.proto;

import X.C120504oA;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RPW;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class UpdateConversationAuditSwitchRequestBody extends Message<UpdateConversationAuditSwitchRequestBody, C120504oA> {
    public static final ProtoAdapter<UpdateConversationAuditSwitchRequestBody> ADAPTER;
    public static final Integer DEFAULT_CONVERSATION_TYPE;
    public static final Long DEFAULT_CONV_SHORT_ID;
    public static final Boolean DEFAULT_SWITCH_STATUS;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("switch_status")
    public final Boolean switch_status;

    static {
        RPW rpw = new RPW();
        ADAPTER = rpw;
        DEFAULT_CONV_SHORT_ID = 0L;
        DEFAULT_CONVERSATION_TYPE = 0;
        DEFAULT_SWITCH_STATUS = Boolean.FALSE;
        C89451Z8t.LJ.put(2023, rpw);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2023, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpdateConversationAuditSwitchRequestBody, C120504oA> newBuilder2() {
        C120504oA c120504oA = new C120504oA();
        c120504oA.LIZLLL = this.conv_short_id;
        c120504oA.LJ = this.conversation_type;
        c120504oA.LJFF = this.switch_status;
        c120504oA.addUnknownFields(unknownFields());
        return c120504oA;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.switch_status != null) {
            sb.append(", switch_status=");
            sb.append(this.switch_status);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpdateConversationAuditSwitchRequestBody{", '}');
    }

    public UpdateConversationAuditSwitchRequestBody(Long l, Integer num, Boolean bool) {
        this(l, num, bool, C64537PUn.EMPTY);
    }

    public UpdateConversationAuditSwitchRequestBody(Long l, Integer num, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.conversation_type = num;
        this.switch_status = bool;
    }
}
