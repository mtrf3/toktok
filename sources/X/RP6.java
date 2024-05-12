package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RP6 extends Message<RP6, ROI> {
    public static final ProtoAdapter<RP6> ADAPTER = new RP7();
    public String customized_info;
    public RPC key;
    public C69506RPq standard_ui;
    public RP9 tracer_info;

    public RP6() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RP6, ROI> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RP6, ROI> newBuilder2() {
        newBuilder2();
        return null;
    }
}
