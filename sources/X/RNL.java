package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RNL extends Message<RNL, RNM> {
    public static final ProtoAdapter<RNL> ADAPTER = new RNK();
    public String file_type;
    public String material_url;

    public RNL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RNL, RNM> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RNL, RNM> newBuilder2() {
        newBuilder2();
        return null;
    }
}
