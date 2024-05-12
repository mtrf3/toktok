package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNF extends Message<RNF, RNG> {
    public static final ProtoAdapter<RNF> ADAPTER = new RNE();
    public String keyword;
    public String link;

    public RNF() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNF, RNG> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNF, RNG> newBuilder2() {
        newBuilder2();
        return null;
    }
}
