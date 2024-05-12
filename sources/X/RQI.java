package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.t1;

/* loaded from: classes13.dex */
public final class RQI extends Message<RQI, C120564oG> {
    public static final ProtoAdapter<RQI> ADAPTER = new RQH();
    public static final long serialVersionUID = 0;

    @Override // com.squareup.wire.Message
    public String toString() {
        return t1.LIZIZ(0, 2, "DeleteStrangerAllConversationRequestBody{", '}');
    }

    public RQI() {
        this(C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQI, C120564oG> newBuilder2() {
        C120564oG c120564oG = new C120564oG();
        c120564oG.addUnknownFields(unknownFields());
        return c120564oG;
    }

    public RQI(C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
    }
}
