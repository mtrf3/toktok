package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH9 extends Message<RH9, RI9> {
    public static final ProtoAdapter<RH9> ADAPTER = new RF4();
    public Integer label_type;
    public REV label_url;

    public RH9() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH9, RI9> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH9, RI9> newBuilder2() {
        newBuilder2();
        return null;
    }
}
