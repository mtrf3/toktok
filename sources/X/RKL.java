package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RKL extends Message<RKL, RKM> {
    public static final ProtoAdapter<RKL> ADAPTER = new RKK();
    public Integer bottom;
    public Integer leading;
    public Integer top;
    public Integer trailing;

    public RKL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKL, RKM> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RKL, RKM> newBuilder2() {
        newBuilder2();
        return null;
    }
}
