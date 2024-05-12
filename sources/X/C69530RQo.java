package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69530RQo extends Message<C69530RQo, C69531RQp> {
    public static final ProtoAdapter<C69530RQo> ADAPTER = new C69529RQn();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "DeleteStrangerConversationResponseBody{", '}');
    }

    public C69530RQo() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69530RQo, C69531RQp> newBuilder2() {
        C69531RQp c69531RQp = new C69531RQp();
        c69531RQp.addUnknownFields(unknownFields());
        return c69531RQp;
    }

    public C69530RQo(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
