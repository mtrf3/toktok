package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69524RQi extends Message<C69524RQi, C69525RQj> {
    public static final ProtoAdapter<C69524RQi> ADAPTER = new C69523RQh();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "ClientBatchACKResponseBody{", '}');
    }

    public C69524RQi() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69524RQi, C69525RQj> newBuilder2() {
        C69525RQj c69525RQj = new C69525RQj();
        c69525RQj.addUnknownFields(unknownFields());
        return c69525RQj;
    }

    public C69524RQi(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
