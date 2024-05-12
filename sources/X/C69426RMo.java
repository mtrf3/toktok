package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69426RMo extends Message<C69426RMo, C69427RMp> {
    public static final ProtoAdapter<C69426RMo> ADAPTER = new C69425RMn();
    public Integer is_collected;
    public Integer status;

    public C69426RMo() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69426RMo, C69427RMp> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69426RMo, C69427RMp> newBuilder2() {
        newBuilder2();
        return null;
    }
}
