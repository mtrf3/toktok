package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROT extends Message<ROT, ROU> {
    public static final ProtoAdapter<ROT> ADAPTER = new ROS();
    public Boolean show_review_tab;

    public ROT() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROT, ROU> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROT, ROU> newBuilder2() {
        newBuilder2();
        return null;
    }
}
