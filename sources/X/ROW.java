package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROW extends Message<ROW, ROX> {
    public static final ProtoAdapter<ROW> ADAPTER = new ROV();
    public Boolean banner_enabled;

    public ROW() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROW, ROX> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROW, ROX> newBuilder2() {
        newBuilder2();
        return null;
    }
}
