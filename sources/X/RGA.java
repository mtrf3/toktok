package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGA extends Message<RGA, RI7> {
    public static final ProtoAdapter<RGA> ADAPTER = new C69186RDi();
    public Integer bit_rate;
    public String lang;
    public String language_code;
    public Long language_id;
    public REV play_addr;
    public String voice_type;
    public String volume_info;

    public RGA() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGA, RI7> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGA, RI7> newBuilder2() {
        newBuilder2();
        return null;
    }
}
