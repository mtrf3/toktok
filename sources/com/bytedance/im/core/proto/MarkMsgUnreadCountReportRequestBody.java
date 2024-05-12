package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69545RRd;
import X.C69546RRe;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MarkMsgUnreadCountReportRequestBody extends Message<MarkMsgUnreadCountReportRequestBody, C69546RRe> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("tag_unread_count")
    public final Map<Long, Long> tag_unread_count;

    @InterfaceC65349Pkn("total_unread_count")
    public final Long total_unread_count;
    public static final ProtoAdapter<MarkMsgUnreadCountReportRequestBody> ADAPTER = new C69545RRd();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMsgUnreadCountReportRequestBody, C69546RRe> newBuilder2() {
        C69546RRe c69546RRe = new C69546RRe();
        c69546RRe.LIZLLL = this.conversation_id;
        c69546RRe.LJ = this.conversation_type;
        c69546RRe.LJFF = this.conversation_short_id;
        c69546RRe.LJI = this.total_unread_count;
        c69546RRe.LJII = C63685Oz3.LIZLLL("tag_unread_count", this.tag_unread_count);
        c69546RRe.addUnknownFields(unknownFields());
        return c69546RRe;
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
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        Map<Long, Long> map = this.tag_unread_count;
        if (map != null && !map.isEmpty()) {
            sb.append(", tag_unread_count=");
            sb.append(this.tag_unread_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMsgUnreadCountReportRequestBody{", '}');
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l, Long l2, Map<Long, Long> map) {
        this(str, num, l, l2, map, C64537PUn.EMPTY);
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l, Long l2, Map<Long, Long> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.total_unread_count = l2;
        this.tag_unread_count = C63685Oz3.LJI("tag_unread_count", map);
    }
}
