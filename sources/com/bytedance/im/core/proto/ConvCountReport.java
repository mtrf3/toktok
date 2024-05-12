package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC63506OwA;
import X.InterfaceC65349Pkn;
import X.RT7;
import X.RT8;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConvCountReport extends Message<ConvCountReport, RT8> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final EnumC63506OwA conversation_type;

    @InterfaceC65349Pkn("customed_conversation_type")
    public final Integer customed_conversation_type;

    @InterfaceC65349Pkn("unread_count")
    public final Long unread_count;
    public static final ProtoAdapter<ConvCountReport> ADAPTER = new RT7();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    public static final EnumC63506OwA DEFAULT_CONVERSATION_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConvCountReport, RT8> newBuilder2() {
        RT8 rt8 = new RT8();
        rt8.LIZLLL = this.conv_short_id;
        rt8.LJ = this.unread_count;
        rt8.LJFF = this.conversation_type;
        rt8.LJI = this.customed_conversation_type;
        rt8.addUnknownFields(unknownFields());
        return rt8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.customed_conversation_type != null) {
            sb.append(", customed_conversation_type=");
            sb.append(this.customed_conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConvCountReport{", '}');
    }

    public ConvCountReport(Long l, Long l2, EnumC63506OwA enumC63506OwA, Integer num) {
        this(l, l2, enumC63506OwA, num, C64537PUn.EMPTY);
    }

    public ConvCountReport(Long l, Long l2, EnumC63506OwA enumC63506OwA, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.unread_count = l2;
        this.conversation_type = enumC63506OwA;
        this.customed_conversation_type = num;
    }
}
