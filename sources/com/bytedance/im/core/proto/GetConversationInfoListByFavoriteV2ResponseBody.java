package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RS6;
import X.RS7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationInfoListByFavoriteV2ResponseBody extends Message<GetConversationInfoListByFavoriteV2ResponseBody, RS7> {
    public static final ProtoAdapter<GetConversationInfoListByFavoriteV2ResponseBody> ADAPTER = new RS6();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationInfoListByFavoriteV2ResponseBody, RS7> newBuilder2() {
        RS7 rs7 = new RS7();
        rs7.LIZLLL = C63685Oz3.LIZJ("conversation_info_list", this.conversation_info_list);
        rs7.LJ = this.has_more;
        rs7.LJFF = this.next_cursor;
        rs7.addUnknownFields(unknownFields());
        return rs7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationInfoListByFavoriteV2ResponseBody{", '}');
    }

    public GetConversationInfoListByFavoriteV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, C64537PUn.EMPTY);
    }

    public GetConversationInfoListByFavoriteV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info_list = C63685Oz3.LJFF("conversation_info_list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
