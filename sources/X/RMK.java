package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMK extends Message<RMK, RML> {
    public static final ProtoAdapter<RMK> ADAPTER = new RMJ();
    public Long latest_unread_video_created_time;
    public Integer unread_count;

    public RMK() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMK, RML> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMK, RML> newBuilder2() {
        newBuilder2();
        return null;
    }
}
