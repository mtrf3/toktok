package com.bytedance.im.core.proto;

import X.C63542Owk;
import X.C63543Owl;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class SendMessageRequestBody extends Message<SendMessageRequestBody, C63542Owk> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("client_ext")
    public final Map<String, String> client_ext;

    @InterfaceC65349Pkn("client_message_id")
    public final String client_message_id;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("content_pb")
    public final C64537PUn content_pb;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("ignore_badge_count")
    public final Boolean ignore_badge_count;

    @InterfaceC65349Pkn("mentioned_users")
    public final List<Long> mentioned_users;

    @InterfaceC65349Pkn("message_type")
    public final Integer message_type;

    @InterfaceC65349Pkn("ref_msg_info")
    public final ReferencedMessageInfo ref_msg_info;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("ticket")
    public final String ticket;
    public static final ProtoAdapter<SendMessageRequestBody> ADAPTER = new C63543Owl();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Boolean DEFAULT_IGNORE_BADGE_COUNT = Boolean.FALSE;
    public static final C64537PUn DEFAULT_CONTENT_PB = C64537PUn.EMPTY;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendMessageRequestBody, C63542Owk> newBuilder2() {
        C63542Owk c63542Owk = new C63542Owk();
        c63542Owk.LIZLLL = this.conversation_id;
        c63542Owk.LJ = this.conversation_type;
        c63542Owk.LJFF = this.conversation_short_id;
        c63542Owk.LJI = this.content;
        c63542Owk.LJII = C63685Oz3.LIZLLL("ext", this.ext);
        c63542Owk.LJIIIIZZ = this.message_type;
        c63542Owk.LJIIIZ = this.ticket;
        c63542Owk.LJIIJ = this.client_message_id;
        c63542Owk.LJIIJJI = C63685Oz3.LIZJ("mentioned_users", this.mentioned_users);
        c63542Owk.LJIIL = this.ignore_badge_count;
        c63542Owk.LJIILIIL = this.ref_msg_info;
        c63542Owk.LJIILJJIL = C63685Oz3.LIZLLL("client_ext", this.client_ext);
        c63542Owk.LJIILL = this.content_pb;
        c63542Owk.LJIILLIIL = this.scene;
        c63542Owk.addUnknownFields(unknownFields());
        return c63542Owk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        List<Long> list = this.mentioned_users;
        if (list != null && !list.isEmpty()) {
            sb.append(", mentioned_users=");
            sb.append(this.mentioned_users);
        }
        if (this.ignore_badge_count != null) {
            sb.append(", ignore_badge_count=");
            sb.append(this.ignore_badge_count);
        }
        if (this.ref_msg_info != null) {
            sb.append(", ref_msg_info=");
            sb.append(this.ref_msg_info);
        }
        Map<String, String> map2 = this.client_ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", client_ext=");
            sb.append(this.client_ext);
        }
        if (this.content_pb != null) {
            sb.append(", content_pb=");
            sb.append(this.content_pb);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendMessageRequestBody{", '}');
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2, C64537PUn c64537PUn, String str5) {
        this(str, num, l, str2, map, num2, str3, str4, list, bool, referencedMessageInfo, map2, c64537PUn, str5, C64537PUn.EMPTY);
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2, C64537PUn c64537PUn, String str5, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.content = str2;
        this.ext = C63685Oz3.LJI("ext", map);
        this.message_type = num2;
        this.ticket = str3;
        this.client_message_id = str4;
        this.mentioned_users = C63685Oz3.LJFF("mentioned_users", list);
        this.ignore_badge_count = bool;
        this.ref_msg_info = referencedMessageInfo;
        this.client_ext = C63685Oz3.LJI("client_ext", map2);
        this.content_pb = c64537PUn;
        this.scene = str5;
    }
}
