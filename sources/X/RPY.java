package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPY extends Message<RPY, RPZ> {
    public static final ProtoAdapter<RPY> ADAPTER = new RPX();
    public C69491RPb link_info;
    public Integer review_status;

    public RPY() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPY, RPZ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPY, RPZ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
