package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* loaded from: classes13.dex */
public final class RR0 extends Message<RR0, RR1> {
    public static final ProtoAdapter<RR0> ADAPTER = new C69541RQz();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "SendUserActionResponseBody{", '}');
    }

    public RR0() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RR0, RR1> newBuilder2() {
        RR1 rr1 = new RR1();
        rr1.addUnknownFields(unknownFields());
        return rr1;
    }

    public RR0(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
