package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69533RQr extends Message<C69533RQr, C69534RQs> {
    public static final ProtoAdapter<C69533RQr> ADAPTER = new C69532RQq();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "RecallMessageResponseBody{", '}');
    }

    public C69533RQr() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69533RQr, C69534RQs> newBuilder2() {
        C69534RQs c69534RQs = new C69534RQs();
        c69534RQs.addUnknownFields(unknownFields());
        return c69534RQs;
    }

    public C69533RQr(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
