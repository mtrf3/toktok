package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* renamed from: X.RQl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69527RQl extends Message<C69527RQl, C69528RQm> {
    public static final ProtoAdapter<C69527RQl> ADAPTER = new C69526RQk();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "DeleteStrangerAllConversationResponseBody{", '}');
    }

    public C69527RQl() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69527RQl, C69528RQm> newBuilder2() {
        C69528RQm c69528RQm = new C69528RQm();
        c69528RQm.addUnknownFields(unknownFields());
        return c69528RQm;
    }

    public C69527RQl(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
