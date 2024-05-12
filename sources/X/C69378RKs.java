package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RKs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69378RKs extends Message<C69378RKs, C69379RKt> {
    public static final ProtoAdapter<C69378RKs> ADAPTER = new C69377RKr();
    public Long id;
    public String name;
    public REV source_url;

    public C69378RKs() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69378RKs, C69379RKt> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69378RKs, C69379RKt> newBuilder2() {
        newBuilder2();
        return null;
    }
}
