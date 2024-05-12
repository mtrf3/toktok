package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69267RGl extends Message<C69267RGl, RIA> {
    public static final ProtoAdapter<C69267RGl> ADAPTER = new C69207REd();
    public Integer height;
    public REV label_large;
    public REV label_thumb;
    public Integer width;

    public C69267RGl() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69267RGl, RIA> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69267RGl, RIA> newBuilder2() {
        newBuilder2();
        return null;
    }
}
