package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHU extends Message<RHU, RIZ> {
    public static final ProtoAdapter<RHU> ADAPTER = new C69238RFi();
    public String info;
    public String word;
    public String word_id;

    public RHU() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHU, RIZ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHU, RIZ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
