package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNR extends Message<RNR, RNS> {
    public static final ProtoAdapter<RNR> ADAPTER = new RNQ();
    public String data;
    public String link;

    public RNR() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNR, RNS> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNR, RNS> newBuilder2() {
        newBuilder2();
        return null;
    }
}
