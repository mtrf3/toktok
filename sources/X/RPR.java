package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPR extends Message<RPR, RPS> {
    public static final ProtoAdapter<RPR> ADAPTER = new RPQ();
    public RPU nature_species_info;

    public RPR() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPR, RPS> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPR, RPS> newBuilder2() {
        newBuilder2();
        return null;
    }
}
