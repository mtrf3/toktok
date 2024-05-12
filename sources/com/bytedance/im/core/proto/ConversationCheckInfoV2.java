package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63708OzQ;
import X.C63709OzR;
import X.C64537PUn;
import X.DIX;
import X.EnumC63506OwA;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ConversationCheckInfoV2 extends Message<ConversationCheckInfoV2, C63709OzR> {
    public static final ProtoAdapter<ConversationCheckInfoV2> ADAPTER = new C63708OzQ();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final EnumC63506OwA DEFAULT_CONV_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final Boolean DEFAULT_IS_PINNED = Boolean.FALSE;
    public static final Long DEFAULT_MIN_INDEX = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_id")
    public final String conv_id;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conv_type")
    public final EnumC63506OwA conv_type;

    @InterfaceC65349Pkn("is_pinned")
    public final Boolean is_pinned;

    @InterfaceC65349Pkn("min_index")
    public final Long min_index;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationCheckInfoV2, C63709OzR> newBuilder2() {
        C63709OzR c63709OzR = new C63709OzR();
        c63709OzR.LIZLLL = this.conv_short_id;
        c63709OzR.LJ = this.conv_id;
        c63709OzR.LJFF = this.conv_type;
        c63709OzR.LJI = this.is_pinned;
        c63709OzR.LJII = this.min_index;
        c63709OzR.addUnknownFields(unknownFields());
        return c63709OzR;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conv_short_id=");
        LIZJ.append(this.conv_short_id);
        if (this.conv_id != null) {
            LIZJ.append(", conv_id=");
            LIZJ.append(this.conv_id);
        }
        LIZJ.append(", conv_type=");
        LIZJ.append(this.conv_type);
        if (this.is_pinned != null) {
            LIZJ.append(", is_pinned=");
            LIZJ.append(this.is_pinned);
        }
        if (this.min_index != null) {
            LIZJ.append(", min_index=");
            LIZJ.append(this.min_index);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationCheckInfoV2{", '}');
    }

    public ConversationCheckInfoV2(Long l, String str, EnumC63506OwA enumC63506OwA, Boolean bool, Long l2) {
        this(l, str, enumC63506OwA, bool, l2, C64537PUn.EMPTY);
    }

    public ConversationCheckInfoV2(Long l, String str, EnumC63506OwA enumC63506OwA, Boolean bool, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.conv_id = str;
        this.conv_type = enumC63506OwA;
        this.is_pinned = bool;
        this.min_index = l2;
    }
}
