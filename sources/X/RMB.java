package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMB extends Message<RMB, RMC> {
    public static final ProtoAdapter<RMB> ADAPTER = new RMA();
    public Integer status;

    public RMB() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMB, RMC> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMB, RMC> newBuilder2() {
        newBuilder2();
        return null;
    }
}
