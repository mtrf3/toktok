package com.bytedance.im.core.proto;

import X.C63671Oyp;
import X.C63672Oyq;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetConversationsCheckInfoV2RequestBody extends Message<GetConversationsCheckInfoV2RequestBody, C63671Oyp> {
    public static final ProtoAdapter<GetConversationsCheckInfoV2RequestBody> ADAPTER = new C63672Oyq();
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationsCheckInfoV2RequestBody, C63671Oyp> newBuilder2() {
        C63671Oyp c63671Oyp = new C63671Oyp();
        c63671Oyp.LIZLLL = this.limit;
        c63671Oyp.addUnknownFields(unknownFields());
        return c63671Oyp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationsCheckInfoV2RequestBody{", '}');
    }

    public GetConversationsCheckInfoV2RequestBody(Integer num) {
        this(num, C64537PUn.EMPTY);
    }

    public GetConversationsCheckInfoV2RequestBody(Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.limit = num;
    }
}
