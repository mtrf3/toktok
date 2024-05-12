package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RKO extends Message<RKO, RKR> {
    public static final ProtoAdapter<RKO> ADAPTER = new RKN();
    public Integer biz_status;
    public Integer biz_type;

    public RKO() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKO, RKR> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RKO, RKR> newBuilder2() {
        newBuilder2();
        return null;
    }
}
