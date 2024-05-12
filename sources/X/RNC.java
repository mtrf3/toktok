package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNC extends Message<RNC, RND> {
    public static final ProtoAdapter<RNC> ADAPTER = new RNB();
    public String content;
    public String title;

    public RNC() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNC, RND> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNC, RND> newBuilder2() {
        newBuilder2();
        return null;
    }
}
