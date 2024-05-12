package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHG extends Message<RHG, RJ1> {
    public static final ProtoAdapter<RHG> ADAPTER = new RFB();
    public C69277RGv avatar;
    public String id;
    public String name;

    public RHG() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHG, RJ1> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHG, RJ1> newBuilder2() {
        newBuilder2();
        return null;
    }
}
