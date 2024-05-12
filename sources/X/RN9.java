package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RN9 extends Message<RN9, RNA> {
    public static final ProtoAdapter<RN9> ADAPTER = new RN8();
    public String title;
    public String web_url;

    public RN9() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RN9, RNA> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RN9, RNA> newBuilder2() {
        newBuilder2();
        return null;
    }
}
