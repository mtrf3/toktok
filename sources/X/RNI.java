package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNI extends Message<RNI, RNJ> {
    public static final ProtoAdapter<RNI> ADAPTER = new RNH();
    public String keyword;
    public String url;

    public RNI() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNI, RNJ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNI, RNJ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
