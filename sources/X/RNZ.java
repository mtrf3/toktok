package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNZ extends Message<RNZ, C69439RNb> {
    public static final ProtoAdapter<RNZ> ADAPTER = new RNY();
    public Integer blur_type;
    public RNX forced_visibility;

    public RNZ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNZ, C69439RNb> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNZ, C69439RNb> newBuilder2() {
        newBuilder2();
        return null;
    }
}
