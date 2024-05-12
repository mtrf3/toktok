package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RPw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69512RPw extends Message<C69512RPw, C69511RPv> {
    public static final ProtoAdapter<C69512RPw> ADAPTER = new C69513RPx();
    public Integer action_type;
    public String body;
    public String schema;
    public String text_color;

    public C69512RPw() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69512RPw, C69511RPv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69512RPw, C69511RPv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
