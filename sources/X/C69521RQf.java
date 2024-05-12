package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69521RQf extends Message<C69521RQf, C69522RQg> {
    public static final ProtoAdapter<C69521RQf> ADAPTER = new C69520RQe();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "BlockConversationResponseBody{", '}');
    }

    public C69521RQf() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69521RQf, C69522RQg> newBuilder2() {
        C69522RQg c69522RQg = new C69522RQg();
        c69522RQg.addUnknownFields(unknownFields());
        return c69522RQg;
    }

    public C69521RQf(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
