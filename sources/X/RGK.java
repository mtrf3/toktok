package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGK extends Message<RGK, RIC> {
    public static final ProtoAdapter<RGK> ADAPTER = new REI();
    public String content;
    public Boolean notice;
    public Boolean risk_sink;
    public Integer type;
    public String url;
    public Boolean vote;
    public Boolean warn;

    public RGK() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGK, RIC> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGK, RIC> newBuilder2() {
        newBuilder2();
        return null;
    }
}
