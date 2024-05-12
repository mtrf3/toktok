package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROA extends Message<ROA, ROB> {
    public static final ProtoAdapter<ROA> ADAPTER = new RO9();
    public String impr_id;

    public ROA() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROA, ROB> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROA, ROB> newBuilder2() {
        newBuilder2();
        return null;
    }
}
