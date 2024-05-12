package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RMN extends Message<RMN, RMO> {
    public static final ProtoAdapter<RMN> ADAPTER = new RMM();
    public Integer boost_type;
    public String color;
    public String color_text;
    public String label;

    public RMN() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMN, RMO> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMN, RMO> newBuilder2() {
        newBuilder2();
        return null;
    }
}
