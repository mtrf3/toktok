package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69253RFx extends Message<C69253RFx, C69328RIu> {
    public static final ProtoAdapter<C69253RFx> ADAPTER = new RDO();
    public Integer alignment;
    public String bg_color;
    public Long end_time;
    public Double source_height;
    public Double source_width;
    public Long start_time;
    public String text;
    public String text_color;
    public Integer text_size;

    public C69253RFx() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69253RFx, C69328RIu> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69253RFx, C69328RIu> newBuilder2() {
        newBuilder2();
        return null;
    }
}
