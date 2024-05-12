package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPF extends Message<RPF, RPG> {
    public static final ProtoAdapter<RPF> ADAPTER = new RPE();
    public String impr_id;

    public RPF() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPF, RPG> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPF, RPG> newBuilder2() {
        newBuilder2();
        return null;
    }
}
