package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69570RSc;
import X.C69571RSd;
import X.C89452Z8u;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class AckConversationApplyResponseBody extends Message<AckConversationApplyResponseBody, C69571RSd> {
    public static final ProtoAdapter<AckConversationApplyResponseBody> ADAPTER;
    public static final Long DEFAULT_CHECK_CODE;
    public static final Integer DEFAULT_STATUS;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("apply_info")
    public final ConversationApplyInfo apply_info;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    static {
        C69570RSc c69570RSc = new C69570RSc();
        ADAPTER = c69570RSc;
        DEFAULT_STATUS = 0;
        DEFAULT_CHECK_CODE = 0L;
        C89452Z8u.LJ.put(2025, c69570RSc);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2025, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<AckConversationApplyResponseBody, C69571RSd> newBuilder2() {
        C69571RSd c69571RSd = new C69571RSd();
        c69571RSd.LIZLLL = this.apply_info;
        c69571RSd.LJ = this.status;
        c69571RSd.LJFF = this.check_code;
        c69571RSd.LJI = this.check_message;
        c69571RSd.addUnknownFields(unknownFields());
        return c69571RSd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.apply_info != null) {
            sb.append(", apply_info=");
            sb.append(this.apply_info);
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
        return DIX.LIZLLL(sb, 0, 2, "AckConversationApplyResponseBody{", '}');
    }

    public AckConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo, Integer num, Long l, String str) {
        this(conversationApplyInfo, num, l, str, C64537PUn.EMPTY);
    }

    public AckConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo, Integer num, Long l, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.apply_info = conversationApplyInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
    }
}
