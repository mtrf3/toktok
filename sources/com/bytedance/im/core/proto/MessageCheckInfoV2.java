package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63742Ozy;
import X.C63743Ozz;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessageCheckInfoV2 extends Message<MessageCheckInfoV2, C63743Ozz> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("index_in_conv")
    public final Long index_in_conv;

    @InterfaceC65349Pkn("msg_id")
    public final Long msg_id;
    public static final ProtoAdapter<MessageCheckInfoV2> ADAPTER = new C63742Ozy();
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONV = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageCheckInfoV2, C63743Ozz> newBuilder2() {
        C63743Ozz c63743Ozz = new C63743Ozz();
        c63743Ozz.LIZLLL = this.msg_id;
        c63743Ozz.LJ = this.index_in_conv;
        c63743Ozz.addUnknownFields(unknownFields());
        return c63743Ozz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", msg_id=");
        LIZJ.append(this.msg_id);
        LIZJ.append(", index_in_conv=");
        LIZJ.append(this.index_in_conv);
        return DIX.LIZLLL(LIZJ, 0, 2, "MessageCheckInfoV2{", '}');
    }

    public MessageCheckInfoV2(Long l, Long l2) {
        this(l, l2, C64537PUn.EMPTY);
    }

    public MessageCheckInfoV2(Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.msg_id = l;
        this.index_in_conv = l2;
    }
}
