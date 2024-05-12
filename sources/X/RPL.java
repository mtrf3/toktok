package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPL extends Message<RPL, RPM> {
    public static final ProtoAdapter<RPL> ADAPTER = new RPK();
    public String impr_id;

    public RPL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPL, RPM> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPL, RPM> newBuilder2() {
        newBuilder2();
        return null;
    }
}
