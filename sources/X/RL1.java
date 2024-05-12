package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RL1 extends Message<RL1, RL2> {
    public static final ProtoAdapter<RL1> ADAPTER = new RL0();
    public String action;
    public REV icon;
    public String text;

    public RL1() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RL1, RL2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RL1, RL2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
