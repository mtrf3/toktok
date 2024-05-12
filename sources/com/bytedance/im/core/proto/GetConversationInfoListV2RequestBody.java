package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63718Oza;
import X.C63719Ozb;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetConversationInfoListV2RequestBody extends Message<GetConversationInfoListV2RequestBody, C63719Ozb> {
    public static final ProtoAdapter<GetConversationInfoListV2RequestBody> ADAPTER = new C63718Oza();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationInfoListV2RequestBody, C63719Ozb> newBuilder2() {
        C63719Ozb c63719Ozb = new C63719Ozb();
        c63719Ozb.LIZLLL = C63685Oz3.LIZJ("conversation_info_list", this.conversation_info_list);
        c63719Ozb.addUnknownFields(unknownFields());
        return c63719Ozb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<GetConversationInfoV2RequestBody> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationInfoListV2RequestBody{", '}');
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info_list = C63685Oz3.LJFF("conversation_info_list", list);
    }
}
