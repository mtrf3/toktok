package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69277RGv extends Message<C69277RGv, C69319RIl> {
    public static final ProtoAdapter<C69277RGv> ADAPTER = new RFA();
    public REV hd;
    public REV large;
    public REV medium;
    public REV thumb;
    public REV thumbnail;

    public C69277RGv() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69277RGv, C69319RIl> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69277RGv, C69319RIl> newBuilder2() {
        newBuilder2();
        return null;
    }
}
