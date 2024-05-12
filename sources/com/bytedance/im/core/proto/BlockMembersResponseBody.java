package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RR4;
import X.RR5;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BlockMembersResponseBody extends Message<BlockMembersResponseBody, RR5> {
    public static final ProtoAdapter<BlockMembersResponseBody> ADAPTER = new RR4();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_members")
    public final List<Long> failed_members;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BlockMembersResponseBody, RR5> newBuilder2() {
        RR5 rr5 = new RR5();
        rr5.LIZLLL = C63685Oz3.LIZJ("failed_members", this.failed_members);
        rr5.addUnknownFields(unknownFields());
        return rr5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_members;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_members=");
            sb.append(this.failed_members);
        }
        return DIX.LIZLLL(sb, 0, 2, "BlockMembersResponseBody{", '}');
    }

    public BlockMembersResponseBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BlockMembersResponseBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_members = C63685Oz3.LJFF("failed_members", list);
    }
}
