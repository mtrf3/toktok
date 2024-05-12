package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC87558YXy;
import X.InterfaceC65349Pkn;
import X.YY7;
import X.YY8;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class MarkMessageRequestBody extends Message<MarkMessageRequestBody, YY8> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("action_type")
    public final EnumC87558YXy action_type;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("do_action")
    public final Boolean do_action;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("sort_time")
    public final Long sort_time;

    @InterfaceC65349Pkn("tag")
    public final Long tag;
    public static final ProtoAdapter<MarkMessageRequestBody> ADAPTER = new YY7();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Boolean DEFAULT_DO_ACTION = Boolean.FALSE;
    public static final EnumC87558YXy DEFAULT_ACTION_TYPE = EnumC87558YXy.UNKNOWN_ACTION;
    public static final Long DEFAULT_SORT_TIME = 0L;
    public static final Long DEFAULT_TAG = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMessageRequestBody, YY8> newBuilder2() {
        YY8 yy8 = new YY8();
        yy8.LIZLLL = this.conversation_id;
        yy8.LJ = this.conversation_type;
        yy8.LJFF = this.conversation_short_id;
        yy8.LJI = this.server_message_id;
        yy8.LJII = this.do_action;
        yy8.LJIIIIZZ = this.action_type;
        yy8.LJIIIZ = this.sort_time;
        yy8.LJIIJ = this.tag;
        yy8.addUnknownFields(unknownFields());
        return yy8;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.do_action != null) {
            sb.append(", do_action=");
            sb.append(this.do_action);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.sort_time != null) {
            sb.append(", sort_time=");
            sb.append(this.sort_time);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMessageRequestBody{", '}');
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, EnumC87558YXy enumC87558YXy, Long l3, Long l4) {
        this(str, num, l, l2, bool, enumC87558YXy, l3, l4, C64537PUn.EMPTY);
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, EnumC87558YXy enumC87558YXy, Long l3, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.do_action = bool;
        this.action_type = enumC87558YXy;
        this.sort_time = l3;
        this.tag = l4;
    }
}
