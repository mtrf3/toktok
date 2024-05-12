package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHL extends Message<RHL, RK6> {
    public static final ProtoAdapter<RHL> ADAPTER = new RHM();
    public String activity_id;
    public C69390RLe content;
    public RN6 primary_btn;
    public String schema_url;
    public Long show_delay_time;

    public RHL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHL, RK6> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHL, RK6> newBuilder2() {
        newBuilder2();
        return null;
    }
}
