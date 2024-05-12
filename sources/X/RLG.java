package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLG extends Message<RLG, RLH> {
    public static final ProtoAdapter<RLG> ADAPTER = new RLF();
    public String hashtag_id;
    public String hashtag_name;
    public Integer status;

    public RLG() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLG, RLH> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLG, RLH> newBuilder2() {
        newBuilder2();
        return null;
    }
}
