package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69414RMc extends Message<C69414RMc, C69415RMd> {
    public static final ProtoAdapter<C69414RMc> ADAPTER = new C69413RMb();
    public Long original_item_duetted_count;
    public String original_item_id;

    public C69414RMc() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69414RMc, C69415RMd> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69414RMc, C69415RMd> newBuilder2() {
        newBuilder2();
        return null;
    }
}
