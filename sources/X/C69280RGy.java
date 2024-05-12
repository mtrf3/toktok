package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69280RGy extends Message<C69280RGy, C69308RIa> {
    public static final ProtoAdapter<C69280RGy> ADAPTER = new C69208REe();
    public Integer action_type;
    public REV icon;
    public String schema;

    public C69280RGy() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69280RGy, C69308RIa> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69280RGy, C69308RIa> newBuilder2() {
        newBuilder2();
        return null;
    }
}
