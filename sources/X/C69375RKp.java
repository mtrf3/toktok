package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RKp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69375RKp extends Message<C69375RKp, C69376RKq> {
    public static final ProtoAdapter<C69375RKp> ADAPTER = new C69374RKo();
    public Long card_id;
    public String card_material;
    public Integer card_type;

    public C69375RKp() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69375RKp, C69376RKq> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69375RKp, C69376RKq> newBuilder2() {
        newBuilder2();
        return null;
    }
}
