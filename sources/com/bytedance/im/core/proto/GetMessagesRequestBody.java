package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63450OvG;
import X.C63455OvL;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetMessagesRequestBody extends Message<GetMessagesRequestBody, C63450OvG> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("entries")
    public final List<MessageIDIndexEntry> entries;
    public static final ProtoAdapter<GetMessagesRequestBody> ADAPTER = new C63455OvL();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesRequestBody, C63450OvG> newBuilder2() {
        C63450OvG c63450OvG = new C63450OvG();
        c63450OvG.LIZLLL = this.conversation_id;
        c63450OvG.LJ = this.conversation_type;
        c63450OvG.LJFF = this.conversation_short_id;
        c63450OvG.LJI = C63685Oz3.LIZJ("entries", this.entries);
        c63450OvG.addUnknownFields(unknownFields());
        return c63450OvG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversation_id=");
        LIZJ.append(this.conversation_id);
        LIZJ.append(", conversation_type=");
        LIZJ.append(this.conversation_type);
        LIZJ.append(", conversation_short_id=");
        LIZJ.append(this.conversation_short_id);
        List<MessageIDIndexEntry> list = this.entries;
        if (list != null && !list.isEmpty()) {
            LIZJ.append(", entries=");
            LIZJ.append(this.entries);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "GetMessagesRequestBody{", '}');
    }

    public GetMessagesRequestBody(String str, Integer num, Long l, List<MessageIDIndexEntry> list) {
        this(str, num, l, list, C64537PUn.EMPTY);
    }

    public GetMessagesRequestBody(String str, Integer num, Long l, List<MessageIDIndexEntry> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.entries = C63685Oz3.LJFF("entries", list);
    }
}
