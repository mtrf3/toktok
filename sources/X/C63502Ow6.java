package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.Ow6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63502Ow6 extends Message<C63502Ow6, C63501Ow5> {
    public static final ProtoAdapter<C63502Ow6> ADAPTER = new C63503Ow7();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "GetConversationsCheckInfoRequestBody{", '}');
    }

    public C63502Ow6() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C63502Ow6, C63501Ow5> newBuilder2() {
        C63501Ow5 c63501Ow5 = new C63501Ow5();
        c63501Ow5.addUnknownFields(unknownFields());
        return c63501Ow5;
    }

    public C63502Ow6(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
