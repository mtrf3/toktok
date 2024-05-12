package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RFH extends Message<RFH, RK1> {
    public static final ProtoAdapter<RFH> ADAPTER = new RDI();
    public String distance;
    public String ecom_rec_info;
    public C69269RGn fans_struct;
    public REV icon;
    public String rawdata;
    public C69172RCu room;
    public String tag;
    public Long tag_id;
    public Integer type;

    public RFH() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFH, RK1> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFH, RK1> newBuilder2() {
        newBuilder2();
        return null;
    }
}
