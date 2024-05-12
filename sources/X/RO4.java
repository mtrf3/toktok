package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RO4 extends Message<RO4, RO5> {
    public static final ProtoAdapter<RO4> ADAPTER = new RO3();
    public String text;

    public RO4() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RO4, RO5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RO4, RO5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
