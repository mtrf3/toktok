package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH6 extends Message<RH6, RJT> {
    public static final ProtoAdapter<RH6> ADAPTER = new C69224REu();
    public String color;
    public String color_text;
    public String text;
    public Integer type;

    public RH6() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH6, RJT> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH6, RJT> newBuilder2() {
        newBuilder2();
        return null;
    }
}
