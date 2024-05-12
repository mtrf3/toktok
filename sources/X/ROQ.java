package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROQ extends Message<ROQ, ROR> {
    public static final ProtoAdapter<ROQ> ADAPTER = new ROP();
    public Integer is_visible;

    public ROQ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROQ, ROR> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROQ, ROR> newBuilder2() {
        newBuilder2();
        return null;
    }
}
