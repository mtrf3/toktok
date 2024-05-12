package com.bytedance.im.core.proto;

import X.C63480Ovk;
import X.C63481Ovl;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetConversationInfoV2RequestBody extends Message<GetConversationInfoV2RequestBody, C63480Ovk> {
    public static final ProtoAdapter<GetConversationInfoV2RequestBody> ADAPTER = new C63481Ovl();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationInfoV2RequestBody, C63480Ovk> newBuilder2() {
        C63480Ovk c63480Ovk = new C63480Ovk();
        c63480Ovk.LIZLLL = this.conversation_id;
        c63480Ovk.LJ = this.conversation_short_id;
        c63480Ovk.LJFF = this.conversation_type;
        c63480Ovk.addUnknownFields(unknownFields());
        return c63480Ovk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationInfoV2RequestBody{", '}');
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num) {
        this(str, l, num, C64537PUn.EMPTY);
    }

    public GetConversationInfoV2RequestBody(String str, Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
