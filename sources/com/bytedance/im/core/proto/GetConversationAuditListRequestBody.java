package com.bytedance.im.core.proto;

import X.C120484o8;
import X.C63741Ozx;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetConversationAuditListRequestBody extends Message<GetConversationAuditListRequestBody, C120484o8> {
    public static final ProtoAdapter<GetConversationAuditListRequestBody> ADAPTER;
    public static final Long DEFAULT_CONV_SHORT_ID;
    public static final Long DEFAULT_CURSOR;
    public static final Integer DEFAULT_LIMIT;
    public static final Boolean DEFAULT_NO_CLEAR_UNREAD;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @InterfaceC65349Pkn("no_clear_unread")
    public final Boolean no_clear_unread;

    static {
        C63741Ozx c63741Ozx = new C63741Ozx();
        ADAPTER = c63741Ozx;
        DEFAULT_CURSOR = 0L;
        DEFAULT_LIMIT = 0;
        DEFAULT_CONV_SHORT_ID = 0L;
        DEFAULT_NO_CLEAR_UNREAD = Boolean.FALSE;
        C89451Z8t.LJ.put(2027, c63741Ozx);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2027, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationAuditListRequestBody, C120484o8> newBuilder2() {
        C120484o8 c120484o8 = new C120484o8();
        c120484o8.LIZLLL = this.cursor;
        c120484o8.LJ = this.limit;
        c120484o8.LJFF = this.conv_short_id;
        c120484o8.LJI = this.no_clear_unread;
        c120484o8.addUnknownFields(unknownFields());
        return c120484o8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.no_clear_unread != null) {
            sb.append(", no_clear_unread=");
            sb.append(this.no_clear_unread);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationAuditListRequestBody{", '}');
    }

    public GetConversationAuditListRequestBody(Long l, Integer num, Long l2, Boolean bool) {
        this(l, num, l2, bool, C64537PUn.EMPTY);
    }

    public GetConversationAuditListRequestBody(Long l, Integer num, Long l2, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.limit = num;
        this.conv_short_id = l2;
        this.no_clear_unread = bool;
    }
}
