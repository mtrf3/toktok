package com.bytedance.im.core.proto;

import X.C63730Ozm;
import X.C63731Ozn;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class CreateConversationV2ResponseBody extends Message<CreateConversationV2ResponseBody, C63731Ozn> {
    public static final ProtoAdapter<CreateConversationV2ResponseBody> ADAPTER = new C63730Ozm();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("conversation")
    public final ConversationInfoV2 conversation;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<CreateConversationV2ResponseBody, C63731Ozn> newBuilder2() {
        C63731Ozn c63731Ozn = new C63731Ozn();
        c63731Ozn.LIZLLL = this.conversation;
        c63731Ozn.LJ = this.check_code;
        c63731Ozn.LJFF = this.check_message;
        c63731Ozn.LJI = this.extra_info;
        c63731Ozn.LJII = this.status;
        c63731Ozn.addUnknownFields(unknownFields());
        return c63731Ozn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation != null) {
            sb.append(", conversation=");
            sb.append(this.conversation);
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
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        return DIX.LIZLLL(sb, 0, 2, "CreateConversationV2ResponseBody{", '}');
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num) {
        this(conversationInfoV2, l, str, str2, num, C64537PUn.EMPTY);
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l, String str, String str2, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation = conversationInfoV2;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
        this.status = num;
    }
}
