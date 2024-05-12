package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69450RNm extends Message<C69450RNm, C69451RNn> {
    public static final ProtoAdapter<C69450RNm> ADAPTER = new C69449RNl();
    public Integer ad_link;
    public Integer star_atlas_order;
    public Integer top_item;

    public C69450RNm() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69450RNm, C69451RNn> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69450RNm, C69451RNn> newBuilder2() {
        newBuilder2();
        return null;
    }
}
