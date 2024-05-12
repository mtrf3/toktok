package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RFr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69247RFr extends Message<C69247RFr, RID> {
    public static final ProtoAdapter<C69247RFr> ADAPTER = new REE();
    public List<RHT> bitrate_images;
    public REV display_image;
    public REV owner_watermark_image;
    public REV thumbnail;
    public REV user_watermark_image;

    public C69247RFr() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.bitrate_images = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69247RFr, RID> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69247RFr, RID> newBuilder2() {
        newBuilder2();
        return null;
    }
}
