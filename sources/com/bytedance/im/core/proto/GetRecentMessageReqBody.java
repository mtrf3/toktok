package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63466OvW;
import X.C63467OvX;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetRecentMessageReqBody extends Message<GetRecentMessageReqBody, C63466OvW> {
    public static final ProtoAdapter<GetRecentMessageReqBody> ADAPTER = new C63467OvX();
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_version")
    public final Long conversation_version;

    @InterfaceC65349Pkn("new_user")
    public final Integer new_user;

    @InterfaceC65349Pkn("source")
    public final String source;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetRecentMessageReqBody, C63466OvW> newBuilder2() {
        C63466OvW c63466OvW = new C63466OvW();
        c63466OvW.LIZLLL = this.conversation_version;
        c63466OvW.LJ = this.source;
        c63466OvW.LJFF = this.new_user;
        c63466OvW.addUnknownFields(unknownFields());
        return c63466OvW;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversation_version=");
        LIZJ.append(this.conversation_version);
        LIZJ.append(", source=");
        LIZJ.append(this.source);
        if (this.new_user != null) {
            LIZJ.append(", new_user=");
            LIZJ.append(this.new_user);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "GetRecentMessageReqBody{", '}');
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, C64537PUn.EMPTY);
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_version = l;
        this.source = str;
        this.new_user = num;
    }
}
