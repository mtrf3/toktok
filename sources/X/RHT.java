package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHT extends Message<RHT, C69358RJy> {
    public static final ProtoAdapter<RHT> ADAPTER = new C69248RFs();
    public REV bitrate_image;
    public String name;

    public RHT() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHT, C69358RJy> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHT, C69358RJy> newBuilder2() {
        newBuilder2();
        return null;
    }
}
