package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.C69591RSx;
import X.C69592RSy;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConversationMessageSearchRequestBody extends Message<ConversationMessageSearchRequestBody, C69592RSy> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("end_time")
    public final Long end_time;

    @InterfaceC65349Pkn("frag_size")
    public final Integer frag_size;

    @InterfaceC65349Pkn("scroll_id")
    public final String scroll_id;

    @InterfaceC65349Pkn("search_query")
    public final String search_query;

    @InterfaceC65349Pkn("start_time")
    public final Long start_time;
    public static final ProtoAdapter<ConversationMessageSearchRequestBody> ADAPTER = new C69591RSx();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_FRAG_SIZE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationMessageSearchRequestBody, C69592RSy> newBuilder2() {
        C69592RSy c69592RSy = new C69592RSy();
        c69592RSy.LIZLLL = this.search_query;
        c69592RSy.LJ = this.conv_short_id;
        c69592RSy.LJFF = this.start_time;
        c69592RSy.LJI = this.end_time;
        c69592RSy.LJII = this.frag_size;
        c69592RSy.LJIIIIZZ = this.scroll_id;
        c69592RSy.addUnknownFields(unknownFields());
        return c69592RSy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", search_query=");
        LIZJ.append(this.search_query);
        LIZJ.append(", conv_short_id=");
        LIZJ.append(this.conv_short_id);
        if (this.start_time != null) {
            LIZJ.append(", start_time=");
            LIZJ.append(this.start_time);
        }
        if (this.end_time != null) {
            LIZJ.append(", end_time=");
            LIZJ.append(this.end_time);
        }
        if (this.frag_size != null) {
            LIZJ.append(", frag_size=");
            LIZJ.append(this.frag_size);
        }
        if (this.scroll_id != null) {
            LIZJ.append(", scroll_id=");
            LIZJ.append(this.scroll_id);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationMessageSearchRequestBody{", '}');
    }

    public ConversationMessageSearchRequestBody(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        this(str, l, l2, l3, num, str2, C64537PUn.EMPTY);
    }

    public ConversationMessageSearchRequestBody(String str, Long l, Long l2, Long l3, Integer num, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.search_query = str;
        this.conv_short_id = l;
        this.start_time = l2;
        this.end_time = l3;
        this.frag_size = num;
        this.scroll_id = str2;
    }
}
