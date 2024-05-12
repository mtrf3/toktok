package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHI extends Message<RHI, C69325RIr> {
    public static final ProtoAdapter<RHI> ADAPTER = new C69239RFj();
    public String original_author_id;
    public String original_author_name;
    public String original_item_id;
    public String original_sec_author_id;

    public RHI() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHI, C69325RIr> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHI, C69325RIr> newBuilder2() {
        newBuilder2();
        return null;
    }
}
