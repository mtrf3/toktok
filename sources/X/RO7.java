package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RO7 extends Message<RO7, RO8> {
    public static final ProtoAdapter<RO7> ADAPTER = new RO6();
    public String poi_id;

    public RO7() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RO7, RO8> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RO7, RO8> newBuilder2() {
        newBuilder2();
        return null;
    }
}
