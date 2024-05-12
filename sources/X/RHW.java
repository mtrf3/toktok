package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHW extends Message<RHW, C69313RIf> {
    public static final ProtoAdapter<RHW> ADAPTER = new RHX();
    public String quick_shop_name;
    public String quick_shop_url;
    public RLS second_floor_info;
    public Boolean with_text_entry;

    public RHW() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHW, C69313RIf> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHW, C69313RIf> newBuilder2() {
        newBuilder2();
        return null;
    }
}
