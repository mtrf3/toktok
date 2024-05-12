package com.bytedance.im.core.proto;

import X.C120454o5;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQL;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BatchGetConversationParticipantsReadIndexRequestBody extends Message<BatchGetConversationParticipantsReadIndexRequestBody, C120454o5> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody> ADAPTER = new RQL();
    public static final Boolean DEFAULT_MIN_INDEX_REQUIRED = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final List<String> conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final List<Long> conversation_short_id;

    @InterfaceC65349Pkn("min_index_required")
    public final Boolean min_index_required;

    @InterfaceC65349Pkn("request_from")
    public final String request_from;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetConversationParticipantsReadIndexRequestBody, C120454o5> newBuilder2() {
        C120454o5 c120454o5 = new C120454o5();
        c120454o5.LIZLLL = C63685Oz3.LIZJ("conversation_id", this.conversation_id);
        c120454o5.LJ = C63685Oz3.LIZJ("conversation_short_id", this.conversation_short_id);
        c120454o5.LJFF = this.request_from;
        c120454o5.LJI = this.min_index_required;
        c120454o5.addUnknownFields(unknownFields());
        return c120454o5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.conversation_id;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        List<Long> list2 = this.conversation_short_id;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.request_from != null) {
            sb.append(", request_from=");
            sb.append(this.request_from);
        }
        if (this.min_index_required != null) {
            sb.append(", min_index_required=");
            sb.append(this.min_index_required);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetConversationParticipantsReadIndexRequestBody{", '}');
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool) {
        this(list, list2, str, bool, C64537PUn.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = C63685Oz3.LJFF("conversation_id", list);
        this.conversation_short_id = C63685Oz3.LJFF("conversation_short_id", list2);
        this.request_from = str;
        this.min_index_required = bool;
    }
}
