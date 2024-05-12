package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69572RSe;
import X.C69573RSf;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class PreviewerGetConversationInfoListResponseBody extends Message<PreviewerGetConversationInfoListResponseBody, C69573RSf> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<PreviewerGetConversationInfoListResponseBody> ADAPTER = new C69572RSe();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PreviewerGetConversationInfoListResponseBody, C69573RSf> newBuilder2() {
        C69573RSf c69573RSf = new C69573RSf();
        c69573RSf.LIZLLL = C63685Oz3.LIZJ("conversation_info_list", this.conversation_info_list);
        c69573RSf.LJ = this.status;
        c69573RSf.LJFF = this.check_code;
        c69573RSf.LJI = this.check_message;
        c69573RSf.addUnknownFields(unknownFields());
        return c69573RSf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        return DIX.LIZLLL(sb, 0, 2, "PreviewerGetConversationInfoListResponseBody{", '}');
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l, String str) {
        this(list, num, l, str, C64537PUn.EMPTY);
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_info_list = C63685Oz3.LJFF("conversation_info_list", list);
        this.status = num;
        this.check_code = l;
        this.check_message = str;
    }
}
