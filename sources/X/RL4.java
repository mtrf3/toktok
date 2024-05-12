package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RL4 extends Message<RL4, RL5> {
    public static final ProtoAdapter<RL4> ADAPTER = new RL3();
    public REV icon;
    public String keyword;
    public String link;

    public RL4() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RL4, RL5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RL4, RL5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
