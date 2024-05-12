package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHH extends Message<RHH, RJD> {
    public static final ProtoAdapter<RHH> ADAPTER = new RFC();
    public Boolean full_synced;
    public String nickname;
    public String platform_name;

    public RHH() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHH, RJD> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHH, RJD> newBuilder2() {
        newBuilder2();
        return null;
    }
}
