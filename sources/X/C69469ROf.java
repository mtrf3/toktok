package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69469ROf extends Message<C69469ROf, C69470ROg> {
    public static final ProtoAdapter<C69469ROf> ADAPTER = new C69468ROe();
    public String reason;
    public Integer status;

    public C69469ROf() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69469ROf, C69470ROg> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69469ROf, C69470ROg> newBuilder2() {
        newBuilder2();
        return null;
    }
}
