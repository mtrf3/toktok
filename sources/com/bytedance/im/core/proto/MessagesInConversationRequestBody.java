package com.bytedance.im.core.proto;

import X.C63469OvZ;
import X.C63470Ova;
import X.C64537PUn;
import X.DIX;
import X.EnumC63513OwH;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessagesInConversationRequestBody extends Message<MessagesInConversationRequestBody, C63469OvZ> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("anchor_index")
    public final Long anchor_index;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("direction")
    public final EnumC63513OwH direction;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;
    public static final ProtoAdapter<MessagesInConversationRequestBody> ADAPTER = new C63470Ova();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC63513OwH DEFAULT_DIRECTION = EnumC63513OwH.OLDER;
    public static final Long DEFAULT_ANCHOR_INDEX = 0L;
    public static final Integer DEFAULT_LIMIT = 50;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesInConversationRequestBody, C63469OvZ> newBuilder2() {
        C63469OvZ c63469OvZ = new C63469OvZ();
        c63469OvZ.LIZLLL = this.conversation_id;
        c63469OvZ.LJ = this.conversation_type;
        c63469OvZ.LJFF = this.conversation_short_id;
        c63469OvZ.LJI = this.direction;
        c63469OvZ.LJII = this.anchor_index;
        c63469OvZ.LJIIIIZZ = this.limit;
        c63469OvZ.addUnknownFields(unknownFields());
        return c63469OvZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        if (this.anchor_index != null) {
            sb.append(", anchor_index=");
            sb.append(this.anchor_index);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesInConversationRequestBody{", '}');
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, EnumC63513OwH enumC63513OwH, Long l2, Integer num2) {
        this(str, num, l, enumC63513OwH, l2, num2, C64537PUn.EMPTY);
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, EnumC63513OwH enumC63513OwH, Long l2, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.direction = enumC63513OwH;
        this.anchor_index = l2;
        this.limit = num2;
    }
}
