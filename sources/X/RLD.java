package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLD extends Message<RLD, RLE> {
    public static final ProtoAdapter<RLD> ADAPTER = new RLC();
    public String disable_toast;
    public String interaction_text;
    public Integer status;

    public RLD() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLD, RLE> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLD, RLE> newBuilder2() {
        newBuilder2();
        return null;
    }
}
