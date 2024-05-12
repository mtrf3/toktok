package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHF extends Message<RHF, RIQ> {
    public static final ProtoAdapter<RHF> ADAPTER = new RF8();
    public Long end_time;
    public String region;
    public Long target_vv;

    public RHF() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHF, RIQ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHF, RIQ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
