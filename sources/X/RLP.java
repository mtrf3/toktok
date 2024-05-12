package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLP extends Message<RLP, RLQ> {
    public static final ProtoAdapter<RLP> ADAPTER = new RLO();
    public String desc;
    public String open_url;
    public String web_url;

    public RLP() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLP, RLQ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLP, RLQ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
