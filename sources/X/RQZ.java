package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* loaded from: classes13.dex */
public final class RQZ extends Message<RQZ, C69516RQa> {
    public static final ProtoAdapter<RQZ> ADAPTER = new RQY();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "MarkStrangerAllConversationReadResponseBody{", '}');
    }

    public RQZ() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQZ, C69516RQa> newBuilder2() {
        C69516RQa c69516RQa = new C69516RQa();
        c69516RQa.addUnknownFields(unknownFields());
        return c69516RQa;
    }

    public RQZ(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
