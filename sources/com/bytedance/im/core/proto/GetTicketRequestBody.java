package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63506OwA;
import X.EnumC69900Rc0;
import X.InterfaceC65349Pkn;
import X.RT9;
import X.RTA;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class GetTicketRequestBody extends Message<GetTicketRequestBody, RTA> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final EnumC63506OwA conversation_type;

    @InterfaceC65349Pkn("customed_conversation_type")
    public final Integer customed_conversation_type;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("ticket_type")
    public final EnumC69900Rc0 ticket_type;

    @InterfaceC65349Pkn("to_id")
    public final Long to_id;
    public static final ProtoAdapter<GetTicketRequestBody> ADAPTER = new RT9();
    public static final EnumC69900Rc0 DEFAULT_TICKET_TYPE = EnumC69900Rc0.TICKET_TYPE_APP;
    public static final EnumC63506OwA DEFAULT_CONVERSATION_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_TO_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetTicketRequestBody, RTA> newBuilder2() {
        RTA rta = new RTA();
        rta.LIZLLL = this.ticket_type;
        rta.LJ = this.conversation_type;
        rta.LJFF = this.to_id;
        rta.LJI = this.conversation_short_id;
        rta.LJII = C63685Oz3.LIZLLL("ext", this.ext);
        rta.LJIIIIZZ = this.customed_conversation_type;
        rta.addUnknownFields(unknownFields());
        return rta;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ticket_type != null) {
            sb.append(", ticket_type=");
            sb.append(this.ticket_type);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.to_id != null) {
            sb.append(", to_id=");
            sb.append(this.to_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.customed_conversation_type != null) {
            sb.append(", customed_conversation_type=");
            sb.append(this.customed_conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetTicketRequestBody{", '}');
    }

    public GetTicketRequestBody(EnumC69900Rc0 enumC69900Rc0, EnumC63506OwA enumC63506OwA, Long l, Long l2, Map<String, String> map, Integer num) {
        this(enumC69900Rc0, enumC63506OwA, l, l2, map, num, C64537PUn.EMPTY);
    }

    public GetTicketRequestBody(EnumC69900Rc0 enumC69900Rc0, EnumC63506OwA enumC63506OwA, Long l, Long l2, Map<String, String> map, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.ticket_type = enumC69900Rc0;
        this.conversation_type = enumC63506OwA;
        this.to_id = l;
        this.conversation_short_id = l2;
        this.ext = C63685Oz3.LJI("ext", map);
        this.customed_conversation_type = num;
    }
}
