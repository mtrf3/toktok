package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHC extends Message<RHC, C69291RHj> {
    public static final ProtoAdapter<RHC> ADAPTER = new RF5();
    public String name;
    public Integer priority;
    public Integer type;

    public RHC() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHC, C69291RHj> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHC, C69291RHj> newBuilder2() {
        newBuilder2();
        return null;
    }
}
