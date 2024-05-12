package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHY extends Message<RHY, C69336RJc> {
    public static final ProtoAdapter<RHY> ADAPTER = new RHZ();
    public String data;
    public RNL item_like_egg;
    public Integer priority;
    public Integer type;

    public RHY() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHY, C69336RJc> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHY, C69336RJc> newBuilder2() {
        newBuilder2();
        return null;
    }
}
