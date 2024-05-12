package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.C69582RSo;
import X.C69583RSp;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetMessageByKeyError extends Message<GetMessageByKeyError, C69583RSp> {
    public static final ProtoAdapter<GetMessageByKeyError> ADAPTER = new C69582RSo();
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("key")
    public final MessageKey key;

    @InterfaceC65349Pkn("status_code")
    public final Integer status_code;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageByKeyError, C69583RSp> newBuilder2() {
        C69583RSp c69583RSp = new C69583RSp();
        c69583RSp.LIZLLL = this.key;
        c69583RSp.LJ = this.status_code;
        c69583RSp.addUnknownFields(unknownFields());
        return c69583RSp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", key=");
        LIZJ.append(this.key);
        LIZJ.append(", status_code=");
        LIZJ.append(this.status_code);
        return DIX.LIZLLL(LIZJ, 0, 2, "GetMessageByKeyError{", '}');
    }

    public GetMessageByKeyError(MessageKey messageKey, Integer num) {
        this(messageKey, num, C64537PUn.EMPTY);
    }

    public GetMessageByKeyError(MessageKey messageKey, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.key = messageKey;
        this.status_code = num;
    }
}
