package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLY extends Message<RLY, RLZ> {
    public static final ProtoAdapter<RLY> ADAPTER = new RLX();
    public String external_username;
    public String hashed_phone_number;
    public String reason;

    public RLY() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLY, RLZ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLY, RLZ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
