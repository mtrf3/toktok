package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C87563YYd;
import X.C87564YYe;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class SetConversationCoreInfoResponseBody extends Message<SetConversationCoreInfoResponseBody, C87564YYe> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("conversation_core_info")
    public final ConversationCoreInfo conversation_core_info;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<SetConversationCoreInfoResponseBody> ADAPTER = new C87563YYd();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SetConversationCoreInfoResponseBody, C87564YYe> newBuilder2() {
        C87564YYe c87564YYe = new C87564YYe();
        c87564YYe.LIZLLL = this.conversation_core_info;
        c87564YYe.LJ = this.status;
        c87564YYe.LJFF = this.extra_info;
        c87564YYe.LJI = this.check_code;
        c87564YYe.LJII = this.check_message;
        c87564YYe.addUnknownFields(unknownFields());
        return c87564YYe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        return DIX.LIZLLL(sb, 0, 2, "SetConversationCoreInfoResponseBody{", '}');
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2) {
        this(conversationCoreInfo, num, str, l, str2, C64537PUn.EMPTY);
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_core_info = conversationCoreInfo;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
