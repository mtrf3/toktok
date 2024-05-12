package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RN6 extends Message<RN6, RN7> {
    public static final ProtoAdapter<RN6> ADAPTER = new RN5();
    public String color;
    public String label;

    public RN6() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RN6, RN7> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RN6, RN7> newBuilder2() {
        newBuilder2();
        return null;
    }
}
