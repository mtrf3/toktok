package com.bytedance.im.core.proto;

import X.C4YY;
import X.C63704OzM;
import X.C63705OzN;
import X.C64537PUn;
import X.DIX;
import X.EnumC1045048g;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class SendMessageResponseBody extends Message<SendMessageResponseBody, C63705OzN> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("client_message_id")
    public final String client_message_id;

    @InterfaceC65349Pkn("conversation")
    public final ConversationInfoV2 conversation;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("filter_reason")
    public final EnumC1045048g filter_reason;

    @InterfaceC65349Pkn("filtered_content")
    public final String filtered_content;

    @InterfaceC65349Pkn("inboxPageCategory")
    public final C4YY inboxPageCategory;

    @InterfaceC65349Pkn("is_async_send")
    public final Boolean is_async_send;

    @InterfaceC65349Pkn("new_ticket")
    public final String new_ticket;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<SendMessageResponseBody> ADAPTER = new C63704OzM();
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Boolean DEFAULT_IS_ASYNC_SEND = Boolean.FALSE;
    public static final C4YY DEFAULT_INBOXPAGECATEGORY = C4YY.NormalUserInbox;
    public static final EnumC1045048g DEFAULT_FILTER_REASON = EnumC1045048g.FilteredReasonNone;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendMessageResponseBody, C63705OzN> newBuilder2() {
        C63705OzN c63705OzN = new C63705OzN();
        c63705OzN.LIZLLL = this.server_message_id;
        c63705OzN.LJ = this.extra_info;
        c63705OzN.LJFF = this.status;
        c63705OzN.LJI = this.client_message_id;
        c63705OzN.LJII = this.check_code;
        c63705OzN.LJIIIIZZ = this.check_message;
        c63705OzN.LJIIIZ = this.filtered_content;
        c63705OzN.LJIIJ = this.is_async_send;
        c63705OzN.LJIIJJI = this.new_ticket;
        c63705OzN.LJIIL = this.conversation;
        c63705OzN.LJIILIIL = this.inboxPageCategory;
        c63705OzN.LJIILJJIL = this.filter_reason;
        c63705OzN.addUnknownFields(unknownFields());
        return c63705OzN;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.filtered_content != null) {
            sb.append(", filtered_content=");
            sb.append(this.filtered_content);
        }
        if (this.is_async_send != null) {
            sb.append(", is_async_send=");
            sb.append(this.is_async_send);
        }
        if (this.new_ticket != null) {
            sb.append(", new_ticket=");
            sb.append(this.new_ticket);
        }
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
        }
        if (this.inboxPageCategory != null) {
            sb.append(", inboxPageCategory=");
            sb.append(this.inboxPageCategory);
        }
        if (this.filter_reason != null) {
            sb.append(", filter_reason=");
            sb.append(this.filter_reason);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendMessageResponseBody{", '}');
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2, C4YY c4yy, EnumC1045048g enumC1045048g) {
        this(l, str, num, str2, l2, str3, str4, bool, str5, conversationInfoV2, c4yy, enumC1045048g, C64537PUn.EMPTY);
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2, C4YY c4yy, EnumC1045048g enumC1045048g, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.server_message_id = l;
        this.extra_info = str;
        this.status = num;
        this.client_message_id = str2;
        this.check_code = l2;
        this.check_message = str3;
        this.filtered_content = str4;
        this.is_async_send = bool;
        this.new_ticket = str5;
        this.conversation = conversationInfoV2;
        this.inboxPageCategory = c4yy;
        this.filter_reason = enumC1045048g;
    }
}
