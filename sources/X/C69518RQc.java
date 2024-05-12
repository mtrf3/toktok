package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69518RQc extends Message<C69518RQc, C69519RQd> {
    public static final ProtoAdapter<C69518RQc> ADAPTER = new C69517RQb();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "MarkStrangerConversationReadResponseBody{", '}');
    }

    public C69518RQc() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69518RQc, C69519RQd> newBuilder2() {
        C69519RQd c69519RQd = new C69519RQd();
        c69519RQd.addUnknownFields(unknownFields());
        return c69519RQd;
    }

    public C69518RQc(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
