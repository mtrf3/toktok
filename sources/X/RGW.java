package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGW extends Message<RGW, C69300RHs> {
    public static final ProtoAdapter<RGW> ADAPTER = new RE6();
    public String background_color;
    public REV image;
    public Integer label_type;
    public String ref_url;
    public String text;
    public String text_color;

    public RGW() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGW, C69300RHs> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGW, C69300RHs> newBuilder2() {
        newBuilder2();
        return null;
    }
}
