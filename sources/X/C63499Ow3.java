package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.Ow3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63499Ow3 extends Message<C63499Ow3, C63498Ow2> {
    public static final ProtoAdapter<C63499Ow3> ADAPTER = new C63500Ow4();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "GetConfigsRequestBody{", '}');
    }

    public C63499Ow3() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C63499Ow3, C63498Ow2> newBuilder2() {
        C63498Ow2 c63498Ow2 = new C63498Ow2();
        c63498Ow2.addUnknownFields(unknownFields());
        return c63498Ow2;
    }

    public C63499Ow3(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
