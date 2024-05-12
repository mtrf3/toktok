package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* loaded from: classes13.dex */
public final class RQU extends Message<RQU, RQV> {
    public static final ProtoAdapter<RQU> ADAPTER;
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "BatchAckMessageResponseBody{", '}');
    }

    static {
        RQT rqt = new RQT();
        ADAPTER = rqt;
        C89452Z8u.LJ.put(2059, rqt);
    }

    public RQU() {
        this(C64537PUn.EMPTY);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2059, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQU, RQV> newBuilder2() {
        RQV rqv = new RQV();
        rqv.addUnknownFields(unknownFields());
        return rqv;
    }

    public RQU(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
