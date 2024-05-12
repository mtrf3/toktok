package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHP extends Message<RHP, C69329RIv> {
    public static final ProtoAdapter<RHP> ADAPTER = new RG7();
    public String emoji;
    public Integer score;

    public RHP() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHP, C69329RIv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHP, C69329RIv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
