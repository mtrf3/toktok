package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLV extends Message<RLV, RLW> {
    public static final ProtoAdapter<RLV> ADAPTER = new RLU();
    public String download_url;
    public String schema;
    public String token;

    public RLV() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLV, RLW> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLV, RLW> newBuilder2() {
        newBuilder2();
        return null;
    }
}
