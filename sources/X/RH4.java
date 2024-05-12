package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH4 extends Message<RH4, RJ2> {
    public static final ProtoAdapter<RH4> ADAPTER = new RFM();
    public Integer follow_toast;
    public Integer original_list;
    public Integer share_toast;
    public Integer shop_toast;

    public RH4() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH4, RJ2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH4, RJ2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
