package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69398RLm extends Message<C69398RLm, C69400RLo> {
    public static final ProtoAdapter<C69398RLm> ADAPTER = new C69399RLn();
    public String explain;
    public Integer reason;
    public RNU resolution_button;

    public C69398RLm() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69398RLm, C69400RLo> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69398RLm, C69400RLo> newBuilder2() {
        newBuilder2();
        return null;
    }
}
