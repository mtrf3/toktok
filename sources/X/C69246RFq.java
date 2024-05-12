package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69246RFq extends Message<C69246RFq, RKB> {
    public static final ProtoAdapter<C69246RFq> ADAPTER = new C69194RDq();
    public Double duration;
    public String fext;
    public Long img_num;
    public String img_url;
    public Long img_x_len;
    public Long img_x_size;
    public Long img_y_len;
    public Long img_y_size;
    public Double interval;
    public String uri;

    public C69246RFq() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69246RFq, RKB> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69246RFq, RKB> newBuilder2() {
        newBuilder2();
        return null;
    }
}
