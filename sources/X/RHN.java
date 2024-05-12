package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHN extends Message<RHN, C69296RHo> {
    public static final ProtoAdapter<RHN> ADAPTER = new C69236RFg();
    public Integer begin;
    public Integer end;

    public RHN() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHN, C69296RHo> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHN, C69296RHo> newBuilder2() {
        newBuilder2();
        return null;
    }
}
