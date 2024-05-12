package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH3 extends Message<RH3, RIV> {
    public static final ProtoAdapter<RH3> ADAPTER = new RFL();
    public Double audition_duration_precision;
    public Double duration_precision;
    public Double shoot_duration_precision;
    public Double video_duration_precision;

    public RH3() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH3, RIV> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH3, RIV> newBuilder2() {
        newBuilder2();
        return null;
    }
}
