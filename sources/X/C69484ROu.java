package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69484ROu extends Message<C69484ROu, C69485ROv> {
    public static final ProtoAdapter<C69484ROu> ADAPTER = new C69483ROt();
    public String aweme_id;
    public REV cover;
    public REV dynamic_cover;

    public C69484ROu() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69484ROu, C69485ROv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69484ROu, C69485ROv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
