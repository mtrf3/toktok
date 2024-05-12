package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG4 extends Message<RG4, C69322RIo> {
    public static final ProtoAdapter<RG4> ADAPTER = new C69197RDt();
    public String anchor_id;
    public RDH anchor_info;
    public Integer business_type;
    public RNI shop_link;
    public Integer show_type;
    public RO1 wikipedia_info;

    public RG4() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG4, C69322RIo> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG4, C69322RIo> newBuilder2() {
        newBuilder2();
        return null;
    }
}
