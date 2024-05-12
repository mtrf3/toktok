package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C69613RTt;
import X.C69614RTu;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class MessagesCheckInfo extends Message<MessagesCheckInfo, C69614RTu> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("head_msg_index")
    public final Long head_msg_index;

    @InterfaceC65349Pkn("indexes_checksum")
    public final Integer indexes_checksum;

    @InterfaceC65349Pkn("msg_count")
    public final Integer msg_count;

    @InterfaceC65349Pkn("tail_msg_index")
    public final Long tail_msg_index;
    public static final ProtoAdapter<MessagesCheckInfo> ADAPTER = new C69613RTt();
    public static final Long DEFAULT_HEAD_MSG_INDEX = 0L;
    public static final Long DEFAULT_TAIL_MSG_INDEX = 0L;
    public static final Integer DEFAULT_MSG_COUNT = 0;
    public static final Integer DEFAULT_INDEXES_CHECKSUM = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesCheckInfo, C69614RTu> newBuilder2() {
        C69614RTu c69614RTu = new C69614RTu();
        c69614RTu.LIZLLL = this.head_msg_index;
        c69614RTu.LJ = this.tail_msg_index;
        c69614RTu.LJFF = this.msg_count;
        c69614RTu.LJI = this.indexes_checksum;
        c69614RTu.addUnknownFields(unknownFields());
        return c69614RTu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_msg_index != null) {
            sb.append(", head_msg_index=");
            sb.append(this.head_msg_index);
        }
        if (this.tail_msg_index != null) {
            sb.append(", tail_msg_index=");
            sb.append(this.tail_msg_index);
        }
        if (this.msg_count != null) {
            sb.append(", msg_count=");
            sb.append(this.msg_count);
        }
        if (this.indexes_checksum != null) {
            sb.append(", indexes_checksum=");
            sb.append(this.indexes_checksum);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesCheckInfo{", '}');
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2) {
        this(l, l2, num, num2, C64537PUn.EMPTY);
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.head_msg_index = l;
        this.tail_msg_index = l2;
        this.msg_count = num;
        this.indexes_checksum = num2;
    }
}
