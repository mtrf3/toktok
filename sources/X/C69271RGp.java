package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69271RGp extends Message<C69271RGp, RKD> {
    public static final ProtoAdapter<C69271RGp> ADAPTER = new RFF();
    public Integer height;
    public C69214REk label_large;
    public C69214REk label_thumb;
    public Integer width;

    public C69271RGp() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69271RGp, RKD> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69271RGp, RKD> newBuilder2() {
        newBuilder2();
        return null;
    }
}
