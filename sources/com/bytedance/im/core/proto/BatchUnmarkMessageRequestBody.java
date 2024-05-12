package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC87558YXy;
import X.InterfaceC65349Pkn;
import X.YY3;
import X.YY4;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public final class BatchUnmarkMessageRequestBody extends Message<BatchUnmarkMessageRequestBody, YY4> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("action_type")
    public final EnumC87558YXy action_type;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("server_message_ids")
    public final List<Long> server_message_ids;

    @InterfaceC65349Pkn("tag")
    public final Long tag;
    public static final ProtoAdapter<BatchUnmarkMessageRequestBody> ADAPTER = new YY3();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC87558YXy DEFAULT_ACTION_TYPE = EnumC87558YXy.UNKNOWN_ACTION;
    public static final Long DEFAULT_TAG = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchUnmarkMessageRequestBody, YY4> newBuilder2() {
        YY4 yy4 = new YY4();
        yy4.LIZLLL = this.conversation_id;
        yy4.LJ = this.conversation_type;
        yy4.LJFF = this.conversation_short_id;
        yy4.LJI = C63685Oz3.LIZJ("server_message_ids", this.server_message_ids);
        yy4.LJII = this.action_type;
        yy4.LJIIIIZZ = this.tag;
        yy4.addUnknownFields(unknownFields());
        return yy4;
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
        List<Long> list = this.server_message_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", server_message_ids=");
            sb.append(this.server_message_ids);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchUnmarkMessageRequestBody{", '}');
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, EnumC87558YXy enumC87558YXy, Long l2) {
        this(str, num, l, list, enumC87558YXy, l2, C64537PUn.EMPTY);
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, EnumC87558YXy enumC87558YXy, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_ids = C63685Oz3.LJFF("server_message_ids", list);
        this.action_type = enumC87558YXy;
        this.tag = l2;
    }
}
