package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHQ extends Message<RHQ, RJQ> {
    public static final ProtoAdapter<RHQ> ADAPTER = new RFE();
    public REV avatar_medium;
    public String nickname;
    public String sec_uid;

    public RHQ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHQ, RJQ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHQ, RJQ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
