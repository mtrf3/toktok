package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69432RMu extends Message<C69432RMu, C69433RMv> {
    public static final ProtoAdapter<C69432RMu> ADAPTER = new C69431RMt();
    public Boolean life_story_block;
    public Boolean life_story_blocked;

    public C69432RMu() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69432RMu, C69433RMv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69432RMu, C69433RMv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
