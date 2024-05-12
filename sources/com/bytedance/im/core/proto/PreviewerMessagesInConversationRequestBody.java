package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC63513OwH;
import X.InterfaceC65349Pkn;
import X.YYD;
import X.YYE;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class PreviewerMessagesInConversationRequestBody extends Message<PreviewerMessagesInConversationRequestBody, YYE> {
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
    public static final ProtoAdapter<PreviewerMessagesInConversationRequestBody> ADAPTER = new YYD();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC63513OwH DEFAULT_DIRECTION = EnumC63513OwH.OLDER;
    public static final Long DEFAULT_ANCHOR_INDEX = 0L;
    public static final Integer DEFAULT_LIMIT = 50;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PreviewerMessagesInConversationRequestBody, YYE> newBuilder2() {
        YYE yye = new YYE();
        yye.LIZLLL = this.conversation_id;
        yye.LJ = this.conversation_type;
        yye.LJFF = this.conversation_short_id;
        yye.LJI = this.direction;
        yye.LJII = this.anchor_index;
        yye.LJIIIIZZ = this.limit;
        yye.addUnknownFields(unknownFields());
        return yye;
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
        return DIX.LIZLLL(sb, 0, 2, "PreviewerMessagesInConversationRequestBody{", '}');
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l, EnumC63513OwH enumC63513OwH, Long l2, Integer num2) {
        this(str, num, l, enumC63513OwH, l2, num2, C64537PUn.EMPTY);
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l, EnumC63513OwH enumC63513OwH, Long l2, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.direction = enumC63513OwH;
        this.anchor_index = l2;
        this.limit = num2;
    }
}
