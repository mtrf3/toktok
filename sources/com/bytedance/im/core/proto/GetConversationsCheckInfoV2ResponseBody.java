package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63710OzS;
import X.C63711OzT;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetConversationsCheckInfoV2ResponseBody extends Message<GetConversationsCheckInfoV2ResponseBody, C63711OzT> {
    public static final ProtoAdapter<GetConversationsCheckInfoV2ResponseBody> ADAPTER = new C63710OzS();
    public static final Boolean DEFAULT_IS_DEMOTED;
    public static final Boolean DEFAULT_IS_PINNED_INCLUDED;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_list")
    public final List<ConversationCheckInfoV2> conv_list;

    @InterfaceC65349Pkn("is_demoted")
    public final Boolean is_demoted;

    @InterfaceC65349Pkn("is_pinned_included")
    public final Boolean is_pinned_included;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_DEMOTED = bool;
        DEFAULT_IS_PINNED_INCLUDED = bool;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationsCheckInfoV2ResponseBody, C63711OzT> newBuilder2() {
        C63711OzT c63711OzT = new C63711OzT();
        c63711OzT.LIZLLL = C63685Oz3.LIZJ("conv_list", this.conv_list);
        c63711OzT.LJ = this.is_demoted;
        c63711OzT.LJFF = this.is_pinned_included;
        c63711OzT.addUnknownFields(unknownFields());
        return c63711OzT;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationCheckInfoV2> list = this.conv_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conv_list=");
            sb.append(this.conv_list);
        }
        if (this.is_demoted != null) {
            sb.append(", is_demoted=");
            sb.append(this.is_demoted);
        }
        if (this.is_pinned_included != null) {
            sb.append(", is_pinned_included=");
            sb.append(this.is_pinned_included);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationsCheckInfoV2ResponseBody{", '}');
    }

    public GetConversationsCheckInfoV2ResponseBody(List<ConversationCheckInfoV2> list, Boolean bool, Boolean bool2) {
        this(list, bool, bool2, C64537PUn.EMPTY);
    }

    public GetConversationsCheckInfoV2ResponseBody(List<ConversationCheckInfoV2> list, Boolean bool, Boolean bool2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_list = C63685Oz3.LJFF("conv_list", list);
        this.is_demoted = bool;
        this.is_pinned_included = bool2;
    }
}
