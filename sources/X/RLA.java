package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLA extends Message<RLA, RLB> {
    public static final ProtoAdapter<RLA> ADAPTER = new RL9();
    public Long ad_id;
    public Long creative_id;
    public String log_extra;

    public RLA() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLA, RLB> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLA, RLB> newBuilder2() {
        newBuilder2();
        return null;
    }
}
