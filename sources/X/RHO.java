package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHO extends Message<RHO, C69326RIs> {
    public static final ProtoAdapter<RHO> ADAPTER = new RFY();
    public String desc;
    public Integer rec_type;

    public RHO() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHO, C69326RIs> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHO, C69326RIs> newBuilder2() {
        newBuilder2();
        return null;
    }
}
