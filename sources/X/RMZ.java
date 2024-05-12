package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMZ extends Message<RMZ, C69412RMa> {
    public static final ProtoAdapter<RMZ> ADAPTER = new RMY();
    public Long topic_id;
    public String topic_text;

    public RMZ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMZ, C69412RMa> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMZ, C69412RMa> newBuilder2() {
        newBuilder2();
        return null;
    }
}
