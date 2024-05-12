package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RJX extends Message<RJX, RJY> {
    public static final ProtoAdapter<RJX> ADAPTER = new RJW();
    public C69252RFw question;

    public RJX() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RJX, RJY> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RJX, RJY> newBuilder2() {
        newBuilder2();
        return null;
    }
}
