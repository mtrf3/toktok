package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* loaded from: classes13.dex */
public final class RQN extends Message<RQN, RQO> {
    public static final ProtoAdapter<RQN> ADAPTER = new RQM();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "MarkStrangerAllConversationReadRequestBody{", '}');
    }

    public RQN() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQN, RQO> newBuilder2() {
        RQO rqo = new RQO();
        rqo.addUnknownFields(unknownFields());
        return rqo;
    }

    public RQN(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
