package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69423RMl extends Message<C69423RMl, C69424RMm> {
    public static final ProtoAdapter<C69423RMl> ADAPTER = new C69422RMk();
    public String item_param_for_pitaya;
    public Long original_item_gap;

    public C69423RMl() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69423RMl, C69424RMm> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69423RMl, C69424RMm> newBuilder2() {
        newBuilder2();
        return null;
    }
}
