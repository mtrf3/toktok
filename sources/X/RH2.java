package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH2 extends Message<RH2, C69305RHx> {
    public static final ProtoAdapter<RH2> ADAPTER = new RFK();
    public Boolean can_comment;
    public Boolean can_forward;
    public Boolean can_share;
    public Boolean can_show_comment;

    public RH2() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH2, C69305RHx> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH2, C69305RHx> newBuilder2() {
        newBuilder2();
        return null;
    }
}
