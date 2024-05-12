package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69536RQu extends Message<C69536RQu, C69537RQv> {
    public static final ProtoAdapter<C69536RQu> ADAPTER = new C69535RQt();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "DeleteStrangerMessageResponseBody{", '}');
    }

    public C69536RQu() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69536RQu, C69537RQv> newBuilder2() {
        C69537RQv c69537RQv = new C69537RQv();
        c69537RQv.addUnknownFields(unknownFields());
        return c69537RQv;
    }

    public C69536RQu(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
