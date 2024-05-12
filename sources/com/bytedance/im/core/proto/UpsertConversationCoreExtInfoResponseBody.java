package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C87561YYb;
import X.C87562YYc;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class UpsertConversationCoreExtInfoResponseBody extends Message<UpsertConversationCoreExtInfoResponseBody, C87562YYc> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("core_info")
    public final ConversationCoreInfo core_info;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> ADAPTER = new C87561YYb();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpsertConversationCoreExtInfoResponseBody, C87562YYc> newBuilder2() {
        C87562YYc c87562YYc = new C87562YYc();
        c87562YYc.LIZLLL = this.core_info;
        c87562YYc.LJ = this.status;
        c87562YYc.LJFF = this.check_code;
        c87562YYc.LJI = this.check_message;
        c87562YYc.LJII = this.extra_info;
        c87562YYc.addUnknownFields(unknownFields());
        return c87562YYc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.core_info != null) {
            sb.append(", core_info=");
            sb.append(this.core_info);
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
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpsertConversationCoreExtInfoResponseBody{", '}');
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, C64537PUn.EMPTY);
    }

    public UpsertConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
