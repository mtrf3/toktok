package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69576RSi;
import X.C69577RSj;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class PreviewerMessagesInConversationResponseBody extends Message<PreviewerMessagesInConversationResponseBody, C69577RSj> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<PreviewerMessagesInConversationResponseBody> ADAPTER = new C69576RSi();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PreviewerMessagesInConversationResponseBody, C69577RSj> newBuilder2() {
        C69577RSj c69577RSj = new C69577RSj();
        c69577RSj.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c69577RSj.LJ = this.next_cursor;
        c69577RSj.LJFF = this.has_more;
        c69577RSj.LJI = this.status;
        c69577RSj.LJII = this.check_code;
        c69577RSj.LJIIIIZZ = this.check_message;
        c69577RSj.addUnknownFields(unknownFields());
        return c69577RSj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
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
        return DIX.LIZLLL(sb, 0, 2, "PreviewerMessagesInConversationResponseBody{", '}');
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str) {
        this(list, l, bool, num, l2, str, C64537PUn.EMPTY);
    }

    public PreviewerMessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, Integer num, Long l2, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
