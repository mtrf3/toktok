package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNO extends Message<RNO, RNP> {
    public static final ProtoAdapter<RNO> ADAPTER = new RNN();
    public String body;
    public String title;

    public RNO() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNO, RNP> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNO, RNP> newBuilder2() {
        newBuilder2();
        return null;
    }
}
