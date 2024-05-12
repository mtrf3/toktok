package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69435RMx extends Message<C69435RMx, C69436RMy> {
    public static final ProtoAdapter<C69435RMx> ADAPTER = new C69434RMw();
    public Integer auth_status;
    public Integer auth_type;

    public C69435RMx() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69435RMx, C69436RMy> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69435RMx, C69436RMy> newBuilder2() {
        newBuilder2();
        return null;
    }
}
