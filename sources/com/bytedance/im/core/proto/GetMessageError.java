package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63725Ozh;
import X.C63726Ozi;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetMessageError extends Message<GetMessageError, C63726Ozi> {
    public static final ProtoAdapter<GetMessageError> ADAPTER = new C63725Ozh();
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("entry")
    public final MessageIDIndexEntry entry;

    @InterfaceC65349Pkn("status_code")
    public final Integer status_code;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageError, C63726Ozi> newBuilder2() {
        C63726Ozi c63726Ozi = new C63726Ozi();
        c63726Ozi.LIZLLL = this.entry;
        c63726Ozi.LJ = this.status_code;
        c63726Ozi.addUnknownFields(unknownFields());
        return c63726Ozi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", entry=");
        LIZJ.append(this.entry);
        LIZJ.append(", status_code=");
        LIZJ.append(this.status_code);
        return DIX.LIZLLL(LIZJ, 0, 2, "GetMessageError{", '}');
    }

    public GetMessageError(MessageIDIndexEntry messageIDIndexEntry, Integer num) {
        this(messageIDIndexEntry, num, C64537PUn.EMPTY);
    }

    public GetMessageError(MessageIDIndexEntry messageIDIndexEntry, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.entry = messageIDIndexEntry;
        this.status_code = num;
    }
}
