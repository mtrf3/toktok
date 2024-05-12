package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69390RLe extends Message<C69390RLe, C69391RLf> {
    public static final ProtoAdapter<C69390RLe> ADAPTER = new C69389RLd();
    public String color;
    public String size;
    public String text;

    public C69390RLe() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69390RLe, C69391RLf> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69390RLe, C69391RLf> newBuilder2() {
        newBuilder2();
        return null;
    }
}
