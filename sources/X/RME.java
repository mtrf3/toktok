package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RME extends Message<RME, RMF> {
    public static final ProtoAdapter<RME> ADAPTER = new RMD();
    public String impr_id;

    public RME() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RME, RMF> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RME, RMF> newBuilder2() {
        newBuilder2();
        return null;
    }
}
