package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69462RNy extends Message<C69462RNy, C69463RNz> {
    public static final ProtoAdapter<C69462RNy> ADAPTER = new C69461RNx();
    public Integer total;

    public C69462RNy() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69462RNy, C69463RNz> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69462RNy, C69463RNz> newBuilder2() {
        newBuilder2();
        return null;
    }
}