package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMH extends Message<RMH, RMI> {
    public static final ProtoAdapter<RMH> ADAPTER = new RMG();
    public Long group_release_date;
    public Boolean is_new_release_song;

    public RMH() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMH, RMI> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMH, RMI> newBuilder2() {
        newBuilder2();
        return null;
    }
}
