package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0X;
import X.P0Y;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ConversationBadgeCountInfo extends Message<ConversationBadgeCountInfo, P0Y> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_index_v2")
    public final Long conversation_index_v2;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;
    public static final ProtoAdapter<ConversationBadgeCountInfo> ADAPTER = new P0X();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_INDEX_V2 = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationBadgeCountInfo, P0Y> newBuilder2() {
        P0Y p0y = new P0Y();
        p0y.LIZLLL = this.conversation_short_id;
        p0y.LJ = this.badge_count;
        p0y.LJFF = this.conversation_index_v2;
        p0y.LJI = this.conversation_id;
        p0y.addUnknownFields(unknownFields());
        return p0y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversation_short_id=");
        LIZJ.append(this.conversation_short_id);
        LIZJ.append(", badge_count=");
        LIZJ.append(this.badge_count);
        LIZJ.append(", conversation_index_v2=");
        LIZJ.append(this.conversation_index_v2);
        LIZJ.append(", conversation_id=");
        LIZJ.append(this.conversation_id);
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationBadgeCountInfo{", '}');
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str) {
        this(l, num, l2, str, C64537PUn.EMPTY);
    }

    public ConversationBadgeCountInfo(Long l, Integer num, Long l2, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.badge_count = num;
        this.conversation_index_v2 = l2;
        this.conversation_id = str;
    }
}
