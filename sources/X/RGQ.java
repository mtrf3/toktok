package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RGQ extends Message<RGQ, C69294RHm> {
    public static final ProtoAdapter<RGQ> ADAPTER = new C69233RFd();
    public List<C69232RFc> followers;
    public Integer sprint;

    public RGQ() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.followers = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGQ, C69294RHm> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGQ, C69294RHm> newBuilder2() {
        newBuilder2();
        return null;
    }
}
