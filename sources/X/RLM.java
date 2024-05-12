package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLM extends Message<RLM, RLN> {
    public static final ProtoAdapter<RLM> ADAPTER = new RLL();
    public REV play_addr;

    public RLM() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLM, RLN> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLM, RLN> newBuilder2() {
        newBuilder2();
        return null;
    }
}
