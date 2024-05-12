package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMQ extends Message<RMQ, RMR> {
    public static final ProtoAdapter<RMQ> ADAPTER = new RMP();
    public String aweme_id;
    public Long digg_count;
    public Integer lose_count;
    public Long play_count;

    public RMQ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMQ, RMR> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMQ, RMR> newBuilder2() {
        newBuilder2();
        return null;
    }
}
