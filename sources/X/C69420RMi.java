package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69420RMi extends Message<C69420RMi, C69421RMj> {
    public static final ProtoAdapter<C69420RMi> ADAPTER = new C69419RMh();
    public Boolean can_not_cached;
    public String event_track;

    public C69420RMi() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69420RMi, C69421RMj> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69420RMi, C69421RMj> newBuilder2() {
        newBuilder2();
        return null;
    }
}
