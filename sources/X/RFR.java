package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFR extends Message<RFR, RIG> {
    public static final ProtoAdapter<RFR> ADAPTER = new C69202RDy();
    public Long item_id;
    public Integer middle_count;
    public List<Long> middle_info;
    public Integer reason_type;
    public Integer sub_type;
    public Long user_id;

    public RFR() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.middle_info = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFR, RIG> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFR, RIG> newBuilder2() {
        newBuilder2();
        return null;
    }
}
