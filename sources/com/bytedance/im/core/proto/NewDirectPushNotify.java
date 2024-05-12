package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63733Ozp;
import X.C63734Ozq;
import X.C64537PUn;
import X.DIX;
import X.EnumC63735Ozr;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class NewDirectPushNotify extends Message<NewDirectPushNotify, C63734Ozq> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("create_time")
    public final Long create_time;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("message_type")
    public final Integer message_type;

    @InterfaceC65349Pkn("sec_sender")
    public final String sec_sender;

    @InterfaceC65349Pkn("send_type")
    public final EnumC63735Ozr send_type;

    @InterfaceC65349Pkn("sender")
    public final Long sender;
    public static final ProtoAdapter<NewDirectPushNotify> ADAPTER = new C63733Ozp();
    public static final EnumC63735Ozr DEFAULT_SEND_TYPE = EnumC63735Ozr.BY_CONVERSATION;
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<NewDirectPushNotify, C63734Ozq> newBuilder2() {
        C63734Ozq c63734Ozq = new C63734Ozq();
        c63734Ozq.LIZLLL = this.send_type;
        c63734Ozq.LJ = this.sender;
        c63734Ozq.LJFF = this.sec_sender;
        c63734Ozq.LJI = this.conversation_id;
        c63734Ozq.LJII = this.conversation_short_id;
        c63734Ozq.LJIIIIZZ = this.conversation_type;
        c63734Ozq.LJIIIZ = this.message_type;
        c63734Ozq.LJIIJ = this.content;
        c63734Ozq.LJIIJJI = C63685Oz3.LIZLLL("ext", this.ext);
        c63734Ozq.LJIIL = this.create_time;
        c63734Ozq.addUnknownFields(unknownFields());
        return c63734Ozq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_type != null) {
            sb.append(", send_type=");
            sb.append(this.send_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
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
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        return DIX.LIZLLL(sb, 0, 2, "NewDirectPushNotify{", '}');
    }

    public NewDirectPushNotify(EnumC63735Ozr enumC63735Ozr, Long l, String str, String str2, Long l2, Integer num, Integer num2, String str3, Map<String, String> map, Long l3) {
        this(enumC63735Ozr, l, str, str2, l2, num, num2, str3, map, l3, C64537PUn.EMPTY);
    }

    public NewDirectPushNotify(EnumC63735Ozr enumC63735Ozr, Long l, String str, String str2, Long l2, Integer num, Integer num2, String str3, Map<String, String> map, Long l3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.send_type = enumC63735Ozr;
        this.sender = l;
        this.sec_sender = str;
        this.conversation_id = str2;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.message_type = num2;
        this.content = str3;
        this.ext = C63685Oz3.LJI("ext", map);
        this.create_time = l3;
    }
}
