package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P00;
import X.P01;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetMessagesCheckInfoV2ResponseBody extends Message<GetMessagesCheckInfoV2ResponseBody, P01> {
    public static final ProtoAdapter<GetMessagesCheckInfoV2ResponseBody> ADAPTER = new P00();
    public static final Boolean DEFAULT_HAS_MORE;
    public static final Boolean DEFAULT_IS_DEMOTED;
    public static final Long DEFAULT_NEXT_CURSOR;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("is_demoted")
    public final Boolean is_demoted;

    @InterfaceC65349Pkn("msg_list")
    public final List<MessageCheckInfoV2> msg_list;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_HAS_MORE = bool;
        DEFAULT_NEXT_CURSOR = 0L;
        DEFAULT_IS_DEMOTED = bool;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesCheckInfoV2ResponseBody, P01> newBuilder2() {
        P01 p01 = new P01();
        p01.LIZLLL = C63685Oz3.LIZJ("msg_list", this.msg_list);
        p01.LJ = this.has_more;
        p01.LJFF = this.next_cursor;
        p01.LJI = this.is_demoted;
        p01.addUnknownFields(unknownFields());
        return p01;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageCheckInfoV2> list = this.msg_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", msg_list=");
            sb.append(this.msg_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.is_demoted != null) {
            sb.append(", is_demoted=");
            sb.append(this.is_demoted);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessagesCheckInfoV2ResponseBody{", '}');
    }

    public GetMessagesCheckInfoV2ResponseBody(List<MessageCheckInfoV2> list, Boolean bool, Long l, Boolean bool2) {
        this(list, bool, l, bool2, C64537PUn.EMPTY);
    }

    public GetMessagesCheckInfoV2ResponseBody(List<MessageCheckInfoV2> list, Boolean bool, Long l, Boolean bool2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.msg_list = C63685Oz3.LJFF("msg_list", list);
        this.has_more = bool;
        this.next_cursor = l;
        this.is_demoted = bool2;
    }
}
