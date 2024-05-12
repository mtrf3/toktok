package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69560RRs;
import X.C69561RRt;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class InboxMessagesPerUserResponseBody extends Message<InboxMessagesPerUserResponseBody, C69561RRt> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;
    public static final ProtoAdapter<InboxMessagesPerUserResponseBody> ADAPTER = new C69560RRs();
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<InboxMessagesPerUserResponseBody, C69561RRt> newBuilder2() {
        C69561RRt c69561RRt = new C69561RRt();
        c69561RRt.LIZLLL = this.inbox_type;
        c69561RRt.LJ = this.has_more;
        c69561RRt.addUnknownFields(unknownFields());
        return c69561RRt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        return DIX.LIZLLL(sb, 0, 2, "InboxMessagesPerUserResponseBody{", '}');
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool) {
        this(num, bool, C64537PUn.EMPTY);
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.inbox_type = num;
        this.has_more = bool;
    }
}
