package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RP0 extends Message<RP0, RP1> {
    public static final ProtoAdapter<RP0> ADAPTER = new C69489ROz();
    public Integer edition_no;
    public Long end_time;
    public Long start_time;
    public String uid;

    public RP0() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RP0, RP1> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RP0, RP1> newBuilder2() {
        newBuilder2();
        return null;
    }
}
