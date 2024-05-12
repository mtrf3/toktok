package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C87569YYj;
import X.C87570YYk;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class UpsertConversationSettingExtInfoResponseBody extends Message<UpsertConversationSettingExtInfoResponseBody, C87570YYk> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("check_code")
    public final Long check_code;

    @InterfaceC65349Pkn("check_message")
    public final String check_message;

    @InterfaceC65349Pkn("extra_info")
    public final String extra_info;

    @InterfaceC65349Pkn("setting_info")
    public final ConversationSettingInfo setting_info;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> ADAPTER = new C87569YYj();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpsertConversationSettingExtInfoResponseBody, C87570YYk> newBuilder2() {
        C87570YYk c87570YYk = new C87570YYk();
        c87570YYk.LIZLLL = this.setting_info;
        c87570YYk.LJ = this.status;
        c87570YYk.LJFF = this.check_code;
        c87570YYk.LJI = this.check_message;
        c87570YYk.LJII = this.extra_info;
        c87570YYk.addUnknownFields(unknownFields());
        return c87570YYk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setting_info != null) {
            sb.append(", setting_info=");
            sb.append(this.setting_info);
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
        return DIX.LIZLLL(sb, 0, 2, "UpsertConversationSettingExtInfoResponseBody{", '}');
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2) {
        this(conversationSettingInfo, num, l, str, str2, C64537PUn.EMPTY);
    }

    public UpsertConversationSettingExtInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l, String str, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
