package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC87558YXy;
import X.InterfaceC65349Pkn;
import X.YY5;
import X.YY6;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class PullMarkMessageRequestBody extends Message<PullMarkMessageRequestBody, YY6> {
    public static final EnumC87558YXy DEFAULT_ACTION_TYPE;
    public static final Boolean DEFAULT_ASC;
    public static final Boolean DEFAULT_CLEAR_UNREAD_COUNT;
    public static final Long DEFAULT_TAG;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("action_type")
    public final EnumC87558YXy action_type;

    @InterfaceC65349Pkn("asc")
    public final Boolean asc;

    @InterfaceC65349Pkn("clear_unread_count")
    public final Boolean clear_unread_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Long limit;

    @InterfaceC65349Pkn("tag")
    public final Long tag;
    public static final ProtoAdapter<PullMarkMessageRequestBody> ADAPTER = new YY5();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_LIMIT = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_ASC = bool;
        DEFAULT_ACTION_TYPE = EnumC87558YXy.UNKNOWN_ACTION;
        DEFAULT_TAG = 0L;
        DEFAULT_CLEAR_UNREAD_COUNT = bool;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PullMarkMessageRequestBody, YY6> newBuilder2() {
        YY6 yy6 = new YY6();
        yy6.LIZLLL = this.conversation_id;
        yy6.LJ = this.conversation_type;
        yy6.LJFF = this.conversation_short_id;
        yy6.LJI = this.cursor;
        yy6.LJII = this.limit;
        yy6.LJIIIIZZ = this.asc;
        yy6.LJIIIZ = this.action_type;
        yy6.LJIIJ = this.tag;
        yy6.LJIIJJI = this.clear_unread_count;
        yy6.addUnknownFields(unknownFields());
        return yy6;
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.asc != null) {
            sb.append(", asc=");
            sb.append(this.asc);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.clear_unread_count != null) {
            sb.append(", clear_unread_count=");
            sb.append(this.clear_unread_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "PullMarkMessageRequestBody{", '}');
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l, Long l2, Long l3, Boolean bool, EnumC87558YXy enumC87558YXy, Long l4, Boolean bool2) {
        this(str, num, l, l2, l3, bool, enumC87558YXy, l4, bool2, C64537PUn.EMPTY);
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l, Long l2, Long l3, Boolean bool, EnumC87558YXy enumC87558YXy, Long l4, Boolean bool2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.cursor = l2;
        this.limit = l3;
        this.asc = bool;
        this.action_type = enumC87558YXy;
        this.tag = l4;
        this.clear_unread_count = bool2;
    }
}
