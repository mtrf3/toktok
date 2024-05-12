package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69550RRi;
import X.C69551RRj;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MarkMsgGetUnreadCountResponseBody extends Message<MarkMsgGetUnreadCountResponseBody, C69551RRj> {
    public static final ProtoAdapter<MarkMsgGetUnreadCountResponseBody> ADAPTER = new C69550RRi();
    public static final Long DEFAULT_TOTAL_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_tag_list")
    public final List<Long> failed_tag_list;

    @InterfaceC65349Pkn("tag_unread_count")
    public final Map<Long, Long> tag_unread_count;

    @InterfaceC65349Pkn("total_count")
    public final Long total_count;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMsgGetUnreadCountResponseBody, C69551RRj> newBuilder2() {
        C69551RRj c69551RRj = new C69551RRj();
        c69551RRj.LIZLLL = this.total_count;
        c69551RRj.LJ = C63685Oz3.LIZLLL("tag_unread_count", this.tag_unread_count);
        c69551RRj.LJFF = C63685Oz3.LIZJ("failed_tag_list", this.failed_tag_list);
        c69551RRj.addUnknownFields(unknownFields());
        return c69551RRj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        Map<Long, Long> map = this.tag_unread_count;
        if (map != null && !map.isEmpty()) {
            sb.append(", tag_unread_count=");
            sb.append(this.tag_unread_count);
        }
        List<Long> list = this.failed_tag_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_tag_list=");
            sb.append(this.failed_tag_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMsgGetUnreadCountResponseBody{", '}');
    }

    public MarkMsgGetUnreadCountResponseBody(Long l, Map<Long, Long> map, List<Long> list) {
        this(l, map, list, C64537PUn.EMPTY);
    }

    public MarkMsgGetUnreadCountResponseBody(Long l, Map<Long, Long> map, List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.total_count = l;
        this.tag_unread_count = C63685Oz3.LJI("tag_unread_count", map);
        this.failed_tag_list = C63685Oz3.LJFF("failed_tag_list", list);
    }
}
