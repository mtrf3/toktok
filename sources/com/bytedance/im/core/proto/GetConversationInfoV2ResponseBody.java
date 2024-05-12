package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSC;
import X.RSD;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetConversationInfoV2ResponseBody extends Message<GetConversationInfoV2ResponseBody, RSD> {
    public static final ProtoAdapter<GetConversationInfoV2ResponseBody> ADAPTER = new RSC();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_info")
    public final ConversationInfoV2 conversation_info;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationInfoV2ResponseBody, RSD> newBuilder2() {
        RSD rsd = new RSD();
        rsd.LIZLLL = this.conversation_info;
        rsd.addUnknownFields(unknownFields());
        return rsd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_info != null) {
            sb.append(", conversation_info=");
            sb.append(this.conversation_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationInfoV2ResponseBody{", '}');
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2) {
        this(conversationInfoV2, C64537PUn.EMPTY);
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info = conversationInfoV2;
    }
}
