package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RLw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69408RLw extends Message<C69408RLw, C69409RLx> {
    public static final ProtoAdapter<C69408RLw> ADAPTER = new C69407RLv();
    public Float horizontal;
    public List<Float> vertical;

    public C69408RLw() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.vertical = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69408RLw, C69409RLx> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69408RLw, C69409RLx> newBuilder2() {
        newBuilder2();
        return null;
    }
}
