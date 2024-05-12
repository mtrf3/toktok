package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRC;
import X.RRD;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConversationMessagePreViewRequestBody extends Message<ConversationMessagePreViewRequestBody, RRD> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_index")
    public final Long conversation_index;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("message_id")
    public final Long message_id;
    public static final ProtoAdapter<ConversationMessagePreViewRequestBody> ADAPTER = new RRC();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_INDEX = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationMessagePreViewRequestBody, RRD> newBuilder2() {
        RRD rrd = new RRD();
        rrd.LIZLLL = this.conv_short_id;
        rrd.LJ = this.message_id;
        rrd.LJFF = this.conversation_index;
        rrd.LJI = this.inbox_type;
        rrd.addUnknownFields(unknownFields());
        return rrd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conv_short_id=");
        LIZJ.append(this.conv_short_id);
        LIZJ.append(", message_id=");
        LIZJ.append(this.message_id);
        LIZJ.append(", conversation_index=");
        LIZJ.append(this.conversation_index);
        LIZJ.append(", inbox_type=");
        LIZJ.append(this.inbox_type);
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationMessagePreViewRequestBody{", '}');
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num) {
        this(l, l2, l3, num, C64537PUn.EMPTY);
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.message_id = l2;
        this.conversation_index = l3;
        this.inbox_type = num;
    }
}
