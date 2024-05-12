package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69453RNp extends Message<C69453RNp, C69454RNq> {
    public static final ProtoAdapter<C69453RNp> ADAPTER = new C69452RNo();
    public Boolean need_pull_upvote_info;

    public C69453RNp() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69453RNp, C69454RNq> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69453RNp, C69454RNq> newBuilder2() {
        newBuilder2();
        return null;
    }
}
