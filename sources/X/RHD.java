package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHD extends Message<RHD, C69297RHp> {
    public static final ProtoAdapter<RHD> ADAPTER = new C69237RFh();
    public Double duration;
    public Double end;
    public Double start;

    public RHD() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHD, C69297RHp> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHD, C69297RHp> newBuilder2() {
        newBuilder2();
        return null;
    }
}
