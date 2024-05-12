package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROD extends Message<ROD, ROC> {
    public static final ProtoAdapter<ROD> ADAPTER = new ROE();
    public Long item_id;
    public Long progress_bar_num;

    public ROD() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROD, ROC> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROD, ROC> newBuilder2() {
        newBuilder2();
        return null;
    }
}
