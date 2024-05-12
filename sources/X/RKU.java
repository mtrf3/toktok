package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RKU extends Message<RKU, RKV> {
    public static final ProtoAdapter<RKU> ADAPTER = new RKT();
    public REV icon;
    public Integer index;
    public Boolean is_default_name;
    public Long item_total;
    public String mix_id;
    public String name;
    public String name_in_review;

    public RKU() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKU, RKV> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RKU, RKV> newBuilder2() {
        newBuilder2();
        return null;
    }
}
