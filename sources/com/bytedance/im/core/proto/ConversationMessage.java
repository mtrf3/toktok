package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RS2;
import X.RS3;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class ConversationMessage extends Message<ConversationMessage, RS3> {
    public static final ProtoAdapter<ConversationMessage> ADAPTER = new RS2();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversations")
    public final ConversationInfoV2 conversations;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationMessage, RS3> newBuilder2() {
        RS3 rs3 = new RS3();
        rs3.LIZLLL = this.conversations;
        rs3.LJ = C63685Oz3.LIZJ("messages", this.messages);
        rs3.addUnknownFields(unknownFields());
        return rs3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversations=");
        LIZJ.append(this.conversations);
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            LIZJ.append(", messages=");
            LIZJ.append(this.messages);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationMessage{", '}');
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list) {
        this(conversationInfoV2, list, C64537PUn.EMPTY);
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversations = conversationInfoV2;
        this.messages = C63685Oz3.LJFF("messages", list);
    }
}
