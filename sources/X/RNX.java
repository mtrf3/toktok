package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNX extends Message<RNX, C69438RNa> {
    public static final ProtoAdapter<RNX> ADAPTER = new RNW();
    public String message;
    public Integer state;

    public RNX() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNX, C69438RNa> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNX, C69438RNa> newBuilder2() {
        newBuilder2();
        return null;
    }
}
