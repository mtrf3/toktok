package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69472ROi extends Message<C69472ROi, C69473ROj> {
    public static final ProtoAdapter<C69472ROi> ADAPTER = new C69471ROh();
    public Integer effect;
    public Integer type;

    public C69472ROi() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69472ROi, C69473ROj> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69472ROi, C69473ROj> newBuilder2() {
        newBuilder2();
        return null;
    }
}
