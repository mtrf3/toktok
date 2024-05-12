package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSA;
import X.RSB;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class PreviewerGetConversationInfoListRequestBody extends Message<PreviewerGetConversationInfoListRequestBody, RSB> {
    public static final ProtoAdapter<PreviewerGetConversationInfoListRequestBody> ADAPTER = new RSA();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PreviewerGetConversationInfoListRequestBody, RSB> newBuilder2() {
        RSB rsb = new RSB();
        rsb.LIZLLL = C63685Oz3.LIZJ("conversation_info_list", this.conversation_info_list);
        rsb.addUnknownFields(unknownFields());
        return rsb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<GetConversationInfoV2RequestBody> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "PreviewerGetConversationInfoListRequestBody{", '}');
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info_list = C63685Oz3.LJFF("conversation_info_list", list);
    }
}
