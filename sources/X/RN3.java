package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RN3 extends Message<RN3, RN4> {
    public static final ProtoAdapter<RN3> ADAPTER = new RN2();
    public Integer game_score;
    public Integer game_type;

    public RN3() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RN3, RN4> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RN3, RN4> newBuilder2() {
        newBuilder2();
        return null;
    }
}
