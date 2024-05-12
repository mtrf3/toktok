package com.bytedance.im.core.proto;

import X.C63486Ovq;
import X.C63487Ovr;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessagesPerUserInitV2RequestBody extends Message<MessagesPerUserInitV2RequestBody, C63486Ovq> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("init_sub_type")
    public final Integer init_sub_type;

    @InterfaceC65349Pkn("new_user")
    public final Integer new_user;
    public static final ProtoAdapter<MessagesPerUserInitV2RequestBody> ADAPTER = new C63487Ovr();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final Integer DEFAULT_INIT_SUB_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserInitV2RequestBody, C63486Ovq> newBuilder2() {
        C63486Ovq c63486Ovq = new C63486Ovq();
        c63486Ovq.LIZLLL = this.cursor;
        c63486Ovq.LJ = this.new_user;
        c63486Ovq.LJFF = this.init_sub_type;
        c63486Ovq.addUnknownFields(unknownFields());
        return c63486Ovq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        if (this.init_sub_type != null) {
            sb.append(", init_sub_type=");
            sb.append(this.init_sub_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserInitV2RequestBody{", '}');
    }

    public MessagesPerUserInitV2RequestBody(Long l, Integer num, Integer num2) {
        this(l, num, num2, C64537PUn.EMPTY);
    }

    public MessagesPerUserInitV2RequestBody(Long l, Integer num, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.new_user = num;
        this.init_sub_type = num2;
    }
}
