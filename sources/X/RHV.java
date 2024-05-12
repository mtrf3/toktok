package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHV extends Message<RHV, RJ9> {
    public static final ProtoAdapter<RHV> ADAPTER = new C69240RFk();
    public String info;
    public String word;
    public String word_id;

    public RHV() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHV, RJ9> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHV, RJ9> newBuilder2() {
        newBuilder2();
        return null;
    }
}
