package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69447RNj extends Message<C69447RNj, C69448RNk> {
    public static final ProtoAdapter<C69447RNj> ADAPTER = new C69446RNi();
    public REV badge_thumb;
    public Integer honor_level;
    public Long honor_score;

    public C69447RNj() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69447RNj, C69448RNk> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69447RNj, C69448RNk> newBuilder2() {
        newBuilder2();
        return null;
    }
}
