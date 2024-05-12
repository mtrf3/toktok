package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFQ extends Message<RFQ, RI4> {
    public static final ProtoAdapter<RFQ> ADAPTER = new C69201RDx();
    public C69247RFr image_post_cover;
    public List<C69247RFr> images;
    public Float music_volume;
    public String photomode_image_quality_info;
    public String post_extra;
    public String title;

    public RFQ() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.images = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFQ, RI4> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFQ, RI4> newBuilder2() {
        newBuilder2();
        return null;
    }
}
