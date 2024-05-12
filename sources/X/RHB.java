package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHB extends Message<RHB, RIP> {
    public static final ProtoAdapter<RHB> ADAPTER = new C69217REn();
    public Long card_id;
    public Integer card_insert_status;
    public Integer card_type;

    public RHB() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHB, RIP> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHB, RIP> newBuilder2() {
        newBuilder2();
        return null;
    }
}
