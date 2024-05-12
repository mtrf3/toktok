package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGN extends Message<RGN, RKC> {
    public static final ProtoAdapter<RGN> ADAPTER = new C69227REx();
    public Integer bit_rate;
    public String gear_name;
    public Integer is_h265;
    public C69214REk play_addr;
    public C69214REk play_addr_265;
    public C69214REk play_addr_bytevc1;
    public Integer quality_type;

    public RGN() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGN, RKC> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGN, RKC> newBuilder2() {
        newBuilder2();
        return null;
    }
}
