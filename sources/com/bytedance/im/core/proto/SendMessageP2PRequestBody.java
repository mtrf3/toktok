package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63735Ozr;
import X.InterfaceC65349Pkn;
import X.P0T;
import X.P0U;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class SendMessageP2PRequestBody extends Message<SendMessageP2PRequestBody, P0U> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("client_message_id")
    public final String client_message_id;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("invisible_user")
    public final List<Long> invisible_user;

    @InterfaceC65349Pkn("message_type")
    public final Integer message_type;

    @InterfaceC65349Pkn("send_type")
    public final EnumC63735Ozr send_type;

    @InterfaceC65349Pkn("visible_user")
    public final List<Long> visible_user;
    public static final ProtoAdapter<SendMessageP2PRequestBody> ADAPTER = new P0T();
    public static final EnumC63735Ozr DEFAULT_SEND_TYPE = EnumC63735Ozr.BY_CONVERSATION;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendMessageP2PRequestBody, P0U> newBuilder2() {
        P0U p0u = new P0U();
        p0u.LIZLLL = this.send_type;
        p0u.LJ = this.conversation_id;
        p0u.LJFF = this.conversation_type;
        p0u.LJI = this.conversation_short_id;
        p0u.LJII = C63685Oz3.LIZJ("visible_user", this.visible_user);
        p0u.LJIIIIZZ = C63685Oz3.LIZJ("invisible_user", this.invisible_user);
        p0u.LJIIIZ = this.message_type;
        p0u.LJIIJ = this.content;
        p0u.LJIIJJI = C63685Oz3.LIZLLL("ext", this.ext);
        p0u.LJIIL = this.client_message_id;
        p0u.addUnknownFields(unknownFields());
        return p0u;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_type != null) {
            sb.append(", send_type=");
            sb.append(this.send_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        List<Long> list = this.visible_user;
        if (list != null && !list.isEmpty()) {
            sb.append(", visible_user=");
            sb.append(this.visible_user);
        }
        List<Long> list2 = this.invisible_user;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", invisible_user=");
            sb.append(this.invisible_user);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendMessageP2PRequestBody{", '}');
    }

    public SendMessageP2PRequestBody(EnumC63735Ozr enumC63735Ozr, String str, Integer num, Long l, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3) {
        this(enumC63735Ozr, str, num, l, list, list2, num2, str2, map, str3, C64537PUn.EMPTY);
    }

    public SendMessageP2PRequestBody(EnumC63735Ozr enumC63735Ozr, String str, Integer num, Long l, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.send_type = enumC63735Ozr;
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.visible_user = C63685Oz3.LJFF("visible_user", list);
        this.invisible_user = C63685Oz3.LJFF("invisible_user", list2);
        this.message_type = num2;
        this.content = str2;
        this.ext = C63685Oz3.LJI("ext", map);
        this.client_message_id = str3;
    }
}
