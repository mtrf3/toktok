package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69568RSa;
import X.C69569RSb;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConversationCheckInfo extends Message<ConversationCheckInfo, C69569RSb> {
    public static final ProtoAdapter<ConversationCheckInfo> ADAPTER = new C69568RSa();
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
    public Message.Builder<ConversationCheckInfo, C69569RSb> newBuilder2() {
        C69569RSb c69569RSb = new C69569RSb();
        c69569RSb.LIZLLL = this.conversation_short_id;
        c69569RSb.LJ = this.conversation_id;
        c69569RSb.LJFF = this.conversation_type;
        c69569RSb.addUnknownFields(unknownFields());
        return c69569RSb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationCheckInfo{", '}');
    }

    public ConversationCheckInfo(Long l, String str, Integer num) {
        this(l, str, num, C64537PUn.EMPTY);
    }

    public ConversationCheckInfo(Long l, String str, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
    }
}
