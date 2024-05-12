package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RTN;
import X.RTO;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class BroadcastUserInfo extends Message<BroadcastUserInfo, RTO> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("counter")
    public final Integer counter;
    public static final ProtoAdapter<BroadcastUserInfo> ADAPTER = new RTN();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_COUNTER = 0;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BroadcastUserInfo, RTO> newBuilder2() {
        RTO rto = new RTO();
        rto.LIZLLL = this.conversation_short_id;
        rto.LJ = this.counter;
        rto.LJFF = this.conversation_type;
        rto.addUnknownFields(unknownFields());
        return rto;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.counter != null) {
            sb.append(", counter=");
            sb.append(this.counter);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "BroadcastUserInfo{", '}');
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2) {
        this(l, num, num2, C64537PUn.EMPTY);
    }

    public BroadcastUserInfo(Long l, Integer num, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.counter = num;
        this.conversation_type = num2;
    }
}
