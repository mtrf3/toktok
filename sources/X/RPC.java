package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPC extends Message<RPC, RPD> {
    public static final ProtoAdapter<RPC> ADAPTER = new RPB();
    public String business_id;
    public String component_key;

    public RPC() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPC, RPD> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPC, RPD> newBuilder2() {
        newBuilder2();
        return null;
    }
}
