package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69429RMr extends Message<C69429RMr, C69430RMs> {
    public static final ProtoAdapter<C69429RMr> ADAPTER = new C69428RMq();
    public Long duration_ms;
    public Long start_ms;

    public C69429RMr() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69429RMr, C69430RMs> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69429RMr, C69430RMs> newBuilder2() {
        newBuilder2();
        return null;
    }
}
