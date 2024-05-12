package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHA extends Message<RHA, RI8> {
    public static final ProtoAdapter<RHA> ADAPTER = new RF3();
    public Long uid;
    public REV user_avatar;

    public RHA() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHA, RI8> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHA, RI8> newBuilder2() {
        newBuilder2();
        return null;
    }
}
