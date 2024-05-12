package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RO1 extends Message<RO1, RO2> {
    public static final ProtoAdapter<RO1> ADAPTER = new RO0();
    public String keyword;
    public String lang;
    public String url;

    public RO1() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RO1, RO2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RO1, RO2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
