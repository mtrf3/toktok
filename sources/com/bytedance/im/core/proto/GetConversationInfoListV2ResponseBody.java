package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RS4;
import X.RS5;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationInfoListV2ResponseBody extends Message<GetConversationInfoListV2ResponseBody, RS5> {
    public static final ProtoAdapter<GetConversationInfoListV2ResponseBody> ADAPTER = new RS4();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationInfoListV2ResponseBody, RS5> newBuilder2() {
        RS5 rs5 = new RS5();
        rs5.LIZLLL = C63685Oz3.LIZJ("conversation_info_list", this.conversation_info_list);
        rs5.addUnknownFields(unknownFields());
        return rs5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationInfoListV2ResponseBody{", '}');
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info_list = C63685Oz3.LJFF("conversation_info_list", list);
    }
}
